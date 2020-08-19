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

WebUI.delay(5)

'navigates to personal information'
WebUI.click(findTestObject('Demo Workflows/Session functionality/Patient file/Personal Information in session'))

WebUI.delay(2)

'gathers phone number'
PhoneNum = WebUI.getText(findTestObject('Demo Workflows/Session functionality/Patient file/Phone number (click to edit)'))

String NewPhoneNum

'changes phone number between 123-123-1234 and 555-555-5555'
if (PhoneNum.contains('(123) 123-1234')) {
    NewPhoneNum = '(555) 555-5555'
} else {
    NewPhoneNum = '(123) 123-1234'
}

WebUI.click(findTestObject('Demo Workflows/Session functionality/Patient file/Phone number (click to edit)'))

'Sets new phone number'
WebUI.setText(findTestObject('Demo Workflows/Session functionality/Patient file/Phone number input'), NewPhoneNum)

WebUI.click(findTestObject('Demo Workflows/Session functionality/Patient file/Save changes'))

WebUI.delay(10)

WebUI.click(findTestObject('Demo Workflows/Session functionality/Patient file/Personal Information in session'))

WebUI.delay(2)

'checks if the phone number has been changed'
CheckPhoneNum = WebUI.getText(findTestObject('Demo Workflows/Session functionality/Patient file/Phone number (click to edit)'))

if (CheckPhoneNum.contains(NewPhoneNum)) {
} else {
    KeywordUtil.markFailedAndStop()
}

