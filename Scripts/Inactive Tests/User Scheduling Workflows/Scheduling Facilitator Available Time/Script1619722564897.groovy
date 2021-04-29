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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://test-pp.wecounsel.com/users/sign_in')

'Scheduling facilitator account'
WebUI.setText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_useremail'), 'alexc+autoschedulingfacilitator@visuwell.net')

'Telehealth321'
WebUI.setEncryptedText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_userpassword'), 'LCsxB9VPamtRlQlpiLe+cw==')

WebUI.click(findTestObject('Page_User Login  WeCounsel/button_Log in'))

'Navigates to my schedule'
WebUI.click(findTestObject('Demo Workflows/Scheduler/a_My Schedule'))

'next week'
WebUI.click(findTestObject('Object Repository/Page_WeCounsel/span_May 10  16 2020_fc-icon fc-icon-right-_16bf18'))

'clicks filters button'
WebUI.click(findTestObject('Demo Workflows/Scheduler/Filters Button'))

WebUI.click(findTestObject('Demo Workflows/Scheduler/Select organization dropdown'))

'selects wecounsel private practice for org'
WebUI.click(findTestObject('Demo Workflows/Scheduler/Wecounsel Private Practice in dropdown'))

WebUI.delay(5)

WebUI.click(findTestObject('Demo Workflows/Scheduler/Select provider dropdown'))

'selects autoprovider test'
WebUI.click(findTestObject('Demo Workflows/Scheduler/AutoProvider Test in dropdown'))

WebUI.click(findTestObject('Demo Workflows/Scheduler/Filters Button'))

WebUI.delay(5)

'this is for a workaround to reopen the filters tab after closing'
WebUI.mouseOver(findTestObject('Demo Workflows/Scheduler/Filters Button'))

WebUI.click(findTestObject('Demo Workflows/Scheduler/Filter Apply'))

WebUI.delay(10)

WebUI.click(findTestObject('Demo Workflows/Scheduler/next week arrow'))

'clicks 5:00-6:00pm'
WebUI.click(findTestObject('Demo Workflows/Scheduler/Thursday 500 - 600'))

WebUI.click(findTestObject('Demo Workflows/Scheduler/Attendees dropdown scheduling facilitator'))

'selects autoclient test'
WebUI.click(findTestObject('Page_WeCounsel/click auto client test in dropdown'))

WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/a_Invite from Client List'))

WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/span_Attendees 2'))

'selects client two test'
WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/li_Client 2 Test'))

WebUI.click(findTestObject('Object Repository/Page_WeCounsel/form_Schedule Calendar EventSchedule Video _9cb003'))

WebUI.click(findTestObject('Object Repository/Page_WeCounsel/a_Invite Guest by Email'))

'selects WCPP coffee'
WebUI.click(findTestObject('Object Repository/Page_WeCounsel/span_WC PP Coffee_faux-selection-arrow'))

WebUI.click(findTestObject('Page_WeCounsel/Type of session select from dropdown'))

WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/span_500pm'))

'sets appointment time as 2:00pm'
WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/li_200pm'))

WebUI.click(findTestObject('Demo Workflows/Scheduler/button_Save'))

WebUI.delay(12)

WebUI.click(findTestObject('Demo Workflows/Scheduler/next week arrow'))

WebUI.delay(2)

'clicks on newly created appointment'
WebUI.click(findTestObject('Demo Workflows/Scheduler/Check 2pm appointment-rev'))

WebUI.delay(3)

String member1 = WebUI.getText(findTestObject('Page_WeCounsel/AvailableTime/Checker/a_Auto Client Test'))

'checks autoclient test attendee'
if (member1.contains('AutoClient Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

String member2 = WebUI.getText(findTestObject('Page_WeCounsel/AvailableTime/Checker/a_AutoProvider Test'))

'checks autoprovider test attendee'
if (member2.contains('AutoProvider Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

String member3 = WebUI.getText(findTestObject('Page_WeCounsel/AvailableTime/Checker/a_Client 2 Test'))

'checks client 2 test attendee'
if (member3.contains('Client 2 Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

String eventType = WebUI.getText(findTestObject('Page_WeCounsel/AvailableTime/Checker/a_WC PP Coffee'))

'checks session type'
if (eventType.contains('WC PP Coffee')) {
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

WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/Checker/close appt box'))

