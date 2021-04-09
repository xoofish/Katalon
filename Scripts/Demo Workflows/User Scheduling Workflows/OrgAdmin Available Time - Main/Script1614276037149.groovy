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
WebUI.setText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_useremail'), 'alexc+autoorgadmin@visuwell.net')

'Telehealth321'
WebUI.setEncryptedText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_userpassword'), 'LCsxB9VPamtRlQlpiLe+cw==')

WebUI.click(findTestObject('Page_User Login  WeCounsel/button_Log in'))

WebUI.click(findTestObject('Demo Workflows/Scheduler/a_My Schedule'))

WebUI.click(findTestObject('Demo Workflows/Scheduler/User Management button'))

WebUI.click(findTestObject('Demo Workflows/Scheduler/Providers button'))

WebUI.click(findTestObject('legend_Filter Users'))

WebUI.selectOptionByLabel(findTestObject('select_NoYesAll'), 'All', false)

WebUI.sendKeys(findTestObject('Demo Workflows/Scheduler/Provider Search bar'), 'Auto Provider Test')

WebUI.sendKeys(findTestObject('Demo Workflows/Scheduler/Provider Search bar'), Keys.chord(Keys.ENTER))

'Selects schedule in autoprovider options'
not_run: WebUI.click(findTestObject('Demo Workflows/Session functionality/span_View Schedule_fa fa-calendar we-mr-1'))

'Delay to view schedule of provider'
WebUI.delay(5)

WebUI.click(findTestObject('legend_Filter Users'), FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('a_Actions'))

WebUI.click(findTestObject('a_View Schedule'))

WebUI.delay(10)

'navigates to next week'
WebUI.click(findTestObject('Demo Workflows/Scheduler/next week arrow'))

'Selects thursday 5:00-6:00pm slot'
WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/span_1200 - 100'))

not_run: WebUI.rightClick(findTestObject('Object Repository/Page_WeCounsel/a_Edit Availability'))

'Schedule session button'
WebUI.click(findTestObject('Object Repository/Page_WeCounsel/a_Schedule Session'))

WebUI.delay(2)

WebUI.click(findTestObject('Add User Available Time'))

not_run: WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/span_Attendees'))

'Selects Auto Client Test'
not_run: WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/li_Auto Client Test'))

'adds second attendee'
not_run: WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/a_Invite from Client List'))

not_run: WebUI.click(findTestObject('Demo Workflows/Scheduler/span_Attendees 2 - org admin'))

'selects client 2 test'
not_run: WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/li_Client Two Test'))

WebUI.click(findTestObject('Demo Workflows/Scheduler/Attendees dropdown scheduling facilitator'))

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Page_WeCounsel/AvailableTime/select_AttendeesClientsAkibasav.jon971patie_ec5010'), 
    '18528', true)

WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/li_Auto Client Test'))

WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/a_Invite from Client List'))

WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/span_Attendees 2'))

WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/li_Client Two Test'))

'selects video session'
not_run: WebUI.click(findTestObject('Object Repository/Page_WeCounsel/form_Schedule Calendar EventSchedule Video _9cb003'))

not_run: WebUI.click(findTestObject('Object Repository/Page_WeCounsel/AvailableTime/form_Available Time1. Who are you meeting w_ed1679'))

not_run: WebUI.click(findTestObject('Object Repository/Page_WeCounsel/a_Invite Guest by Email'))

'selects wcpp cofvefe'
WebUI.click(findTestObject('Object Repository/Page_WeCounsel/span_WC PP Coffee_faux-selection-arrow'))

WebUI.click(findTestObject('Page_WeCounsel/Type of session select from dropdown'))

Date today = new Date()

Date tomorrow = today.next()

String formattedDate = tomorrow.format('MM/dd/yyyy')

WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/span_500pm'))

'selects appointment time as 1:00pm'
WebUI.click(findTestObject('Demo Workflows/Scheduler/li_100pm'))

WebUI.click(findTestObject('Demo Workflows/Scheduler/button_Save - org admin'))

not_run: WebUI.refresh()

WebUI.delay(12)

not_run: WebUI.click(findTestObject('Demo Workflows/Scheduler/next week arrow'))

not_run: WebUI.click(findTestObject('Demo Workflows/Scheduler/next week arrow'))

'clicks on newly created 1:00pm appointment'
WebUI.click(findTestObject('Demo Workflows/Scheduler/Check 1pm appt'))

String member1 = WebUI.getText(findTestObject('Page_WeCounsel/AvailableTime/a_Auto Client Test'))

'checks autoclient test member'
if (member1.contains('Auto Client Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

String member2 = WebUI.getText(findTestObject('Page_WeCounsel/AvailableTime/a_Dr. Auto Provider Test'))

'checks autoprovider test member'
if (member2.contains('Dr. Auto Provider Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

String member3 = WebUI.getText(findTestObject('Page_WeCounsel/AvailableTime/a_Client Two Test'))

'checks client 2 test member'
if (member3.contains('Client Two Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

String eventType = WebUI.getText(findTestObject('Page_WeCounsel/AvailableTime/Checker/a_WC PP Coffee'))

'checks session type'
if (eventType.contains('WC PP Coffee')) {
} else {
    KeywordUtil.markFailedAndStop()
}

'verifies session is a video session'
WebUI.verifyElementPresent(findTestObject('Page_WeCounsel/AvailableTime/Checker/i_Edit Attendees_fa fa-video-camera fa-fw'), 
    0)

String dateTime = WebUI.getText(findTestObject('Page_WeCounsel/AvailableTime/Checker/a_6-05-2020 at 200 pm'))

'checks time of session'
if (dateTime.contains('1:00 pm')) {
} else {
    KeywordUtil.markFailedAndStop()
}

WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/Checker/close appt box'))

