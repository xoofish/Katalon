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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

'Waits for email to send'
WebUI.delay(10)

'Checks manager mailbox for most recent email'
String emailCont = CustomKeywords.'com.testwithhari.katalon.plugins.Gmail.readLatestEMailBodyContent'('alexuamsqa@gmail.com', 
    'Welcomeac!', 'Inbox')

println(emailCont)

'Checks email content against expected'
if (emailCont.contains('Hello UAMS Manager Auto Test')) {
} else if (emailCont.contains('Hello UAMS - Provider Auto Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

'Checks email content against expected'
if (emailCont.contains('UAMS - Client A. has requested to meet now. Please login to view the case and claim.')) {
} else {
    KeywordUtil.markFailedAndStop()
}

'Checks email content against expected'
if (emailCont.contains('University of Arkansas for Medical Sciences')) {
} else {
    KeywordUtil.markFailedAndStop()
}

