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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://test-visuwell.wecounsel.com/users/sign_in')

WebUI.maximizeWindow()

WebUI.enableSmartWait()

'Auto Org Admin Acct'
WebUI.setText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_useremail'), 'visuwellautomation+orgadmin@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_userpassword'), 'n/qdZPZskVxU+Rv/aUDKXw==')

WebUI.click(findTestObject('Page_User Login  WeCounsel/button_Log in'))

WebUI.click(findTestObject('Demo Workflows/Scheduler/User Management button'))

WebUI.click(findTestObject('Demo Workflows/Scheduler/Providers button'))

WebUI.click(findTestObject('legend_Filter Users'))

WebUI.selectOptionByLabel(findTestObject('select_NoYesAll'), 'All', false)

WebUI.sendKeys(findTestObject('Demo Workflows/Scheduler/Provider Search bar'), 'Auto Provider Test')

WebUI.sendKeys(findTestObject('Demo Workflows/Scheduler/Provider Search bar'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('legend_Filter Users'), FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('a_Actions'))

WebUI.click(findTestObject('a_View Schedule'))

'navigates to next week'
WebUI.click(findTestObject('Demo Workflows/Scheduler/next week arrow'))

'Selects thursday 5:00-6:00pm slot'
WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/span_1200 - 100'))

'Schedule session button'
WebUI.click(findTestObject('Object Repository/Page_WeCounsel/a_Schedule Session'))

WebUI.click(findTestObject('Add User Available Time'))

WebUI.click(findTestObject('Demo Workflows/Scheduler/Attendees dropdown scheduling facilitator'))

WebUI.click(findTestObject('Auto Patient Test Schedule'))

WebUI.click(findTestObject('Add User Available Time'))

WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/span_Attendees 2'))

WebUI.click(findTestObject('Test Patient Facilitator Schedule'))

'selects wcpp cofvefe'
WebUI.click(findTestObject('Page_WeCounsel/Service dropdown'))

WebUI.click(findTestObject('Page_WeCounsel/Service Medicine dropdown select'))

Date today = new Date()

Date tomorrow = today.next()

String formattedDate = tomorrow.format('MM/dd/yyyy')

WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/span_500pm'))

'selects appointment time as 1:00pm'
WebUI.click(findTestObject('Demo Workflows/Scheduler/li_100pm'))

WebUI.click(findTestObject('Demo Workflows/Scheduler/button_Save - org admin'))

WebUI.delay(5)

'clicks on newly created 1:00pm appointment'
WebUI.click(findTestObject('Demo Workflows/Scheduler/Check 1pm appt'))

String member1 = WebUI.getText(findTestObject('Facilitator Dr Auto Provider Test Check'))

'checks autoprovider test member'
if (member1.contains('Dr Auto Provider Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

String member2 = WebUI.getText(findTestObject('Facilitator Test Patient Check'))

'checks second test member'
if (member2.contains('Test Patient')) {
} else {
    KeywordUtil.markFailedAndStop()
}

String member3 = WebUI.getText(findTestObject('Facilitator Auto Patient Test Check'))

'checks auto patient test member'
if (member3.contains('Auto Patient Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

String eventType = WebUI.getText(findTestObject('Page_WeCounsel/AvailableTime/Checker/Session Service Check'))

'checks session type'
if (eventType.contains('Medicine')) {
} else {
    KeywordUtil.markFailedAndStop()
}

WebUI.click(findTestObject('a_Cancel Appt'))

WebUI.enhancedClick(findTestObject('a_Cancel Appt Confirm'))

not_run: WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/Checker/close appt box'))

