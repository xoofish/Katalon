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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.openBrowser('https://test-visuwell.wecounsel.com/users/sign_in')

WebUI.maximizeWindow()

WebUI.enableSmartWait()

'Email used for all wecounsel provider testing\r\n'
WebUI.setText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_useremail'), 'alexc+autoprovider@visuwell.net')

'Telehealth321'
WebUI.setEncryptedText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_userpassword'), 'LCsxB9VPamtRlQlpiLe+cw==')

WebUI.click(findTestObject('Page_User Login  WeCounsel/button_Log in'))

'Navigates to messaging center'
WebUI.click(findTestObject('Page_WeCounsel/a_Messaging Center0'))

'Clicks compose'
WebUI.click(findTestObject('Page_WeCounsel/a_Compose'))

WebUI.click(findTestObject('Page_WeCounsel/span_Recipients'))

'Selects provider test'
WebUI.click(findTestObject('Page_WeCounsel/li_Auto Client Test_New_Message'))

'Sets subject'
WebUI.setText(findTestObject('li_Auto Client Test Message Save Subject'), 'Moby Dick Save Test')

WebUI.setText(findTestObject('Test Message Save Body'), 'Test message content')

WebUI.click(findTestObject('Page_WeCounsel/button_Save_Message'))

WebUI.click(findTestObject('Page_WeCounsel/a_Messaging Center0'))

'Opens drafts'
WebUI.click(findTestObject('Object Repository/Page_WeCounsel/a_Drafts'))

'opens saved message'
WebUI.click(findTestObject('Object Repository/Page_WeCounsel/a_Moby dick save test'))

'Gets text of message content'
def text = WebUI.getText(findTestObject('Page_WeCounsel/Moby Dick Paragraph'))

'checks gathered text against expected text'
if (text.contains('Test message content')) {
} else {
    KeywordUtil.markFailedAndStop()
}

