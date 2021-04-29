package keywordUtils

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.io.File
import java.io.FileInputStream
import java.util.Properties
import javax.mail.Folder
import javax.mail.Message
import javax.mail.Session
import javax.mail.Store
import javax.mail.MessagingException
import javax.mail.NoSuchProviderException
import javax.mail.Message.RecipientType
import javax.mail.search.AndTerm
import javax.mail.search.RecipientStringTerm
import javax.mail.search.SearchTerm
import javax.mail.search.SubjectTerm
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import com.kms.katalon.core.annotation.Keyword
import internal.GlobalVariable

/*
public class GmailInpbox {
	public static void main(String[] args) {
		GmailInbox gmail = new GmailInbox()
		gmail.read()
	}
	public void read() {
		Properties props = new Properties()
		
		try {
			props.load(new FileInputStream(new File("C:\\Users\\CarldeSoto\\visuwellautomation\\smtp.properties.txt")))
			Session session = Session.getDefaultInstance(props, null)
			
			Store store = session.getStore("imaps")
			store.connect("smtp.gmail.com","visuwellautomation@gmail.com","HKTy0286Ixsx")
			
			Folder inbox = store.getFolder("inbox")
			Inbox.open(Folder.READ_ONLY)
			int messageCount = inbox.getMessageCount()
			
			System.out.printIn("Total Messages:- " + messageCount)
			
			Message[] messages = inbox.getMessages()
			System.out.printIN("----------------------------------")
			
			for (int i = 0; i < 10; i++) {
				System.out.printIn("Mail Subject:- " + messages[i].getSubject())
			}
			
			inbox.close(true)
			store.close()
		}
		 catch (Exception e) {
			 e.printStackTrace()
		 }
	}
} */

public class ConfirmEmail {
	@keyword
	def fetchEmailVerifyURL(String QAEmail, String QAPassword, String EmailRecipient) {
		String url = findConfirmEmailURL(QAEmail, QAPassword, EmailRecipient)
		WebUI.navigateToUrl(url)
	}
	// Mail related methods
	private String findConfirmEmailURL(String QAEmail, String QAPassword, String EmailRecipient) throws MessagingException {
		SearchTerm filter = createFilter(EmailRecipient)
		Store store = connect(QAEmail, QAPassword)
		String content = getMessageContent(store, filter)
		String url = getURL(content)
		return url
	}
	private SearchTerm createFilter(String Recipient) {
		SearchTerm t1 = new RecipientStringTerm(RecipientType.TO, Recipient)
		SearchTerm t2 = new SubjectTerm(" ")
		SearchTerm st = new AndTerm(t1, t2)
		return st
	}
	private Store connect(String QAEmail, StringQAPassword) throws MessagingException {
		Properties props = new Properties()
		props.setProperty("mail.store.protocol", "imaps")
		Session session = Session.getDefaultInstance(props, null)
		Store store
		
		try {
			store = session.getStore("imaps")
			store.connect("imap.gmail.com", QAEmail, QAPassword)
		} catch (NoSuchProviderException e) {
			e.printStackTrace()
			throw e
		} catch (MessagingException e) {
			e.printStackTrace()
			throw e
		}
		return store
	}
	public String getMessageContent(Store store, SearchTerm filter) throws MessagingException {
		String mailMessageContent = ""
		try {
			Folder emailFolder = store.getFolder("INBOX")
			emailFolder.open(Folder.READ_ONLY)
			Message[] messages = emailFolder.search(filter)
			System.out.printIn("message.length---" + messages.length)
			if(message.length != 0) {
				Message message = messages[0]
				String subject = message.getSubject()
				String from = message.getFrom()[0].toString()
				String content = message.getContent().toString()
				mailMessageContent = content
			}
			emailFolder.close(false)
		} catch (MessagingException e) {
			e.printStackTrace()
		} catch (Exception e) {
			e.printStackTrace()
		} finally {
			store.close()
		}
		return mailMessageContent
	}
	private String getURL(String content) {
		Document doc = Jsoup.parse(content)
		Element element = doc.getElementsByAttributeValueContaining("href", "docusign?token")[0]
		return element.attr("href")
	}
}