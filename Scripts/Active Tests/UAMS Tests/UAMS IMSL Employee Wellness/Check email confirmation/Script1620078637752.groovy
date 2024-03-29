  
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Waits for email to send'
WebUI.delay(20)

'Checks unauthenticated user mailbox for email'
String mailcontent = CustomKeywords.'com.testwithhari.katalon.plugins.Gmail.readLatestEMailBodyContent'('alexuamsqa@gmail.com', 
    'Welcomeac!', 'Inbox')

//println(text)
'Checks contents of email against expected'
if (text.contains('john has scheduled a video session with you for')) {
} else {
    KeywordUtil.markFailedAndStop()
}

'Checks contents of email against expected'
if (text.contains('You will receive an email notification one hour before your session with a link to join at the appropriate time.')) {
} else {
    KeywordUtil.markFailedAndStop()
}

'Checks contents of email against expected'
if (text.contains('University of Arkansas for Medical Sciences')) {
} else {
    KeywordUtil.markFailedAndStop()
}

