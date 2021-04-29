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

'auto org admin account'
WebUI.setText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_useremail'), 'alexc+autoorgadmin@visuwell.net')

'Telehealth321'
WebUI.setEncryptedText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_userpassword'), 'LCsxB9VPamtRlQlpiLe+cw==')

WebUI.click(findTestObject('Page_User Login  WeCounsel/button_Log in'))

'navigates to session list'
WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/Sessions list button'))

WebUI.mouseOver(findTestObject('Demo Workflows/Org admin checkin as patient/span_Schedule in sessions list'))

WebUI.delay(1)

'selects session'
WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/Session in schedule dropdown'))

WebUI.delay(7, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/button_Next_NEWSCHED'))

'includes org admin in session'
WebUI.click(findTestObject('Testing/Page_WeCounsel/Page_WeCounsel/i_Include me_toggle'))

WebUI.delay(2)

WebUI.setText(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/Page_WeCounsel/input_Add Patients_scheduler-patients-search-field'), 
    'Auto Client Test')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/Page_WeCounsel/input_Add Patients_scheduler-patients-search-field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/button_Next'))

WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/button_Next'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_WeCounsel/schedule check/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_WeCounsel/schedule check/button_Finish'))

WebUI.delay(10)

'searches for autoclient test'
WebUI.sendKeys(findTestObject('Demo Workflows/Org admin checkin as patient/User search bar'), 'Auto Client Test')

WebUI.sendKeys(findTestObject('Demo Workflows/Org admin checkin as patient/User search bar'), Keys.chord(Keys.ENTER))

'filters session'
WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/Filter Sessions'))

'filter'
WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/option_Wecounsel Private Practice'))

'filter'
WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/option_WeCounsel Private Practice - Location 2'))

WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/Apply filters button'))

String checkClient = WebUI.getText(findTestObject('Page_WeCounsel/AvailableTime/Checker/a_Auto Client Test'))

'checks session attendee'
if (checkClient.contains('Auto Client Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

'checks into session'
WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/Check In button 2'))

WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/Yes button for permission to check in'))

WebUI.delay(3)

'starts session'
WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/a_Start Session_PEXIP'), 0)

