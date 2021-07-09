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

WebUI.openBrowser('https://test-visuwell.wecounsel.com/users/sign_in')

WebUI.maximizeWindow()

WebUI.enableSmartWait()

'Scheduling facilitator account'
WebUI.setText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_useremail'), 'visuwellautomation+facilitator@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_userpassword'), 'n/qdZPZskVxU+Rv/aUDKXw==')

WebUI.click(findTestObject('Page_User Login  WeCounsel/button_Log in'))

'Navigates to my schedule'
WebUI.click(findTestObject('Demo Workflows/Scheduler/a_My Schedule'))

'clicks filters button'
WebUI.click(findTestObject('Demo Workflows/Scheduler/Filters Button'))

WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/span_Wecounsel Private Practice_faux-selection-indicator'))

'selects visuwell private practice for org'
WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/li_Visuwell Private Practice'))

WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/span_ P2B_faux-selection-indicator'))

'selects autoprovider test'
WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/li_Dr. Auto Provider Test'))

WebUI.click(findTestObject('Demo Workflows/Scheduler/Filters Button'))

'this is for a workaround to reopen the filters tab after closing'
WebUI.mouseOver(findTestObject('Demo Workflows/Scheduler/Filters Button'))

WebUI.click(findTestObject('Demo Workflows/Scheduler/Filter Apply'))

WebUI.click(findTestObject('Demo Workflows/Scheduler/next week arrow'))

WebUI.click(findTestObject('Page_WeCounsel/div_500 - 600'))

WebUI.click(findTestObject('Schedule Session button'))

WebUI.click(findTestObject('Add a User dropdown'))

WebUI.click(findTestObject('Demo Workflows/Scheduler/Attendees dropdown scheduling facilitator'))

'selects auto patient test'
WebUI.click(findTestObject('Page_WeCounsel/click auto client test in dropdown'))

WebUI.click(findTestObject('Add a User dropdown'))

WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/span_Attendees 2'))

'selects client two test'
WebUI.click(findTestObject('Test Patient Facilitator Schedule'))

not_run: WebUI.click(findTestObject('Object Repository/Page_WeCounsel/form_Schedule Calendar EventSchedule Video _9cb003'))

not_run: WebUI.click(findTestObject('Object Repository/Page_WeCounsel/a_Invite Guest by Email'))

'selects Medicine service'
WebUI.click(findTestObject('Page_WeCounsel/Service dropdown'))

WebUI.click(findTestObject('Page_WeCounsel/Service Medicine dropdown select'))

WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/span_500pm'))

'sets appointment time as 2:00pm'
WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/li_200pm'))

WebUI.click(findTestObject('Demo Workflows/Scheduler/button_Save'))

WebUI.waitForElementClickable(findTestObject('Demo Workflows/Scheduler/Check 2pm appointment-debugged'), 15)

not_run: WebUI.click(findTestObject('Demo Workflows/Scheduler/next week arrow'))

not_run: WebUI.delay(2)

'clicks on newly created appointment'
WebUI.enhancedClick(findTestObject('Demo Workflows/Scheduler/Check 2pm appointment-debugged'))

WebUI.delay(3)

String member1 = WebUI.getText(findTestObject('Facilitator Dr Auto Provider Test Check'))

'checks autoprovider test attendee'
if (member1.contains('Dr Auto Provider Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

String member2 = WebUI.getText(findTestObject('Facilitator Test Patient Check'))

'checks client 2 test attendee'
if (member2.contains('Test Patient')) {
} else {
    KeywordUtil.markFailedAndStop()
}

String member3 = WebUI.getText(findTestObject('Facilitator Auto Patient Test Check'))

'checks autoclient test attendee'
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

'checks video session'
WebUI.verifyElementPresent(findTestObject('Page_WeCounsel/AvailableTime/Checker/i_Edit Attendees_fa fa-video-camera fa-fw'), 
    0)

String dateTime = WebUI.getText(findTestObject('Page_WeCounsel/AvailableTime/Checker/a_7-16-2020 at 200 pm'))

'checks session time'
if (dateTime.contains('2:00 pm')) {
} else {
    KeywordUtil.markFailedAndStop()
}

WebUI.click(findTestObject('a_Cancel Appt'))

WebUI.enhancedClick(findTestObject('a_Cancel Appt Confirm'))

not_run: WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/Checker/close appt box'))

