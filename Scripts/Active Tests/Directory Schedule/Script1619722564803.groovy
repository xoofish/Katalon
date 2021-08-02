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
import java.text.SimpleDateFormat as SimpleDateFormat

WebUI.openBrowser('https://test-skytherapist.wecounsel.com/users/sign_in')

WebUI.maximizeWindow()

WebUI.enableSmartWait()

WebUI.setText(findTestObject('Object Repository/Page_SkyTherapist/input_Please Log In_useremail'), 'visuwellautomation+skypatient@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_SkyTherapist/input_Please Log In_userpassword'), 'n/qdZPZskVxU+Rv/aUDKXw==')

WebUI.click(findTestObject('Object Repository/Page_SkyTherapist/button_Log in'))

WebUI.click(findTestObject('Page_SkyTherapist/TopBar Directory'))

WebUI.click(findTestObject('Object Repository/Page_SkyTherapist/span_Select State'))

'Selects alabama as the state'
WebUI.click(findTestObject('Page_SkyTherapist/Select Alabama'))

'Clicks skytherapist provider'
WebUI.click(findTestObject('Object Repository/Page_SkyTherapist/a_SkyTherapist Provider'))

'Clicks schedule session'
WebUI.click(findTestObject('Object Repository/Page_SkyTherapist/a_Schedule a Session'))

WebUI.click(findTestObject('Object Repository/Page_SkyTherapist/button_month'))

'Clicks available time'
WebUI.click(findTestObject('Object Repository/Page_SkyTherapist/span_Available Time'))

WebUI.click(findTestObject('Page_SkyTherapist/span_Session Request (Pending) - 0 (50 min)_faux-selection-indicator'))

'Selects session type'
WebUI.click(findTestObject('Page_SkyTherapist/Select Session in Dropdown'))

WebUI.click(findTestObject('Object Repository/Page_SkyTherapist/button_Request Session'))

WebUI.closeBrowser()

WebUI.openBrowser('https://test-skytherapist.wecounsel.com/users/sign_in')

WebUI.maximizeWindow()

'Logs into skytherapist provider'
WebUI.setText(findTestObject('Page_SkyTherapist/input_Please Log In_useremail'), 'visuwellautomation+skyadmin@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_SkyTherapist/input_Please Log In_userpassword'), 'n/qdZPZskVxU+Rv/aUDKXw==')

WebUI.click(findTestObject('Page_SkyTherapist/button_Log in'))

'Navigates to session list'
WebUI.click(findTestObject('Object Repository/Page_SkyTherapist/a_Sessions List 10'))

'Pre-scheduled requests'
WebUI.click(findTestObject('Object Repository/Page_SkyTherapist/span_Pre-Scheduled Requests'))

'Gathers text of client in most recently scheduled session'
def clientName = WebUI.getText(findTestObject('Object Repository/Page_SkyTherapist/Client Name check'))

'Compares gathered client name to expected'
if (clientName.contains('Auto SkyTherapist Patient Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

WebUI.click(findTestObject('sky_Decline'))

WebUI.acceptAlert()

