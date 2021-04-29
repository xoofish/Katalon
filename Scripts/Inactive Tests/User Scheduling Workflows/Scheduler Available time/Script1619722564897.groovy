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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test-pp.wecounsel.com/users/sign_in')

'Autoscheduler account '
WebUI.setText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_useremail'), 'nickbiz060+AutoScheduler@gmail.com')

'Password123\r\n'
WebUI.setEncryptedText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_userpassword'), 'p4y+y39Ir5PJb2ispxT0Ew==')

WebUI.click(findTestObject('Page_User Login  WeCounsel/button_Log in'))

not_run: WebUI.click(findTestObject('Demo Workflows/Scheduler/a_My Schedule'))

'Navigates to user management'
WebUI.click(findTestObject('Demo Workflows/Scheduler/User Management button'))

WebUI.click(findTestObject('Demo Workflows/Scheduler/Providers button'))

'searches for autoprovider test'
WebUI.sendKeys(findTestObject('Demo Workflows/Scheduler/Provider Search bar'), 'AutoProvider Test')

WebUI.sendKeys(findTestObject('Demo Workflows/Scheduler/Provider Search bar'), Keys.chord(Keys.ENTER))

String Text = WebUI.getText(findTestObject('Demo Workflows/Scheduler/AutoProvider Email'), FailureHandling.STOP_ON_FAILURE)

'checks to see if gathered emil matches expected email'
if (Text.contains('nickbiz060+autoprovider')) {
} else {
    KeywordUtil.markFailedAndStop()
}

WebUI.click(findTestObject('Demo Workflows/Scheduler/AutoProvider elipses dropdown'))

'selects shcedule in autoprovider options'
WebUI.click(findTestObject('Demo Workflows/Scheduler/View Schedule button in dropdown'))

'navigates to next week\r\n'
WebUI.click(findTestObject('Demo Workflows/Scheduler/next week arrow'))

not_run: WebUI.click(findTestObject('Demo Workflows/Scheduler/next week arrow'))

'selects thursday 5:00-6:00pm'
WebUI.click(findTestObject('Demo Workflows/Scheduler/Thursday 500 - 600'))

not_run: WebUI.rightClick(findTestObject('Object Repository/Page_WeCounsel/a_Edit Availability'))

'Schedule session button'
not_run: WebUI.click(findTestObject('Object Repository/Page_WeCounsel/a_Schedule Session'))

WebUI.click(findTestObject('Demo Workflows/Scheduler/Attendees dropdown scheduling facilitator'))

'Selects autoclient test'
WebUI.click(findTestObject('Page_WeCounsel/click auto client test in dropdown'))

'add second attendee'
WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/a_Invite from Client List'))

WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/span_Attendees 2'))

'adds client 2 test'
WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/li_Client 2 Test'))

WebUI.click(findTestObject('Object Repository/Page_WeCounsel/form_Schedule Calendar EventSchedule Video _9cb003'))

WebUI.click(findTestObject('Object Repository/Page_WeCounsel/a_Invite Guest by Email'))

'Selects wcpp coffee'
WebUI.click(findTestObject('Object Repository/Page_WeCounsel/span_WC PP Coffee_faux-selection-arrow'))

WebUI.click(findTestObject('Page_WeCounsel/Type of session select from dropdown'))

Date today = new Date()

Date tomorrow = today.next()

String formattedDate = tomorrow.format('MM/dd/yyyy')

WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/span_500pm'))

'Sets time of appointment to 3:00pm'
WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/li_300pm'))

WebUI.click(findTestObject('Page_WeCounsel/button_Save'))

WebUI.delay(12)

WebUI.click(findTestObject('Demo Workflows/Scheduler/next week arrow'))

not_run: WebUI.click(findTestObject('Demo Workflows/Scheduler/next week arrow'))

'clicks on newly created 3:00pm appointment'
WebUI.click(findTestObject('Demo Workflows/Scheduler/Check 3 pm appointment'))

String member1 = WebUI.getText(findTestObject('Page_WeCounsel/AvailableTime/Checker/a_Auto Client Test'))

'checks autoclient attendee'
if (member1.contains('AutoClient Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

String member2 = WebUI.getText(findTestObject('Page_WeCounsel/AvailableTime/Checker/a_AutoProvider Test'))

'checks autoprovider attendee'
if (member2.contains('AutoProvider Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

String member3 = WebUI.getText(findTestObject('Page_WeCounsel/AvailableTime/Checker/a_Client 2 Test'))

'checks client 2 attendee'
if (member3.contains('Client 2 Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

String eventType = WebUI.getText(findTestObject('Page_WeCounsel/AvailableTime/Checker/a_WC PP Coffee'))

'checks service type'
if (eventType.contains('WC PP Coffee')) {
} else {
    KeywordUtil.markFailedAndStop()
}

'checks video session'
WebUI.verifyElementPresent(findTestObject('Page_WeCounsel/AvailableTime/Checker/i_Edit Attendees_fa fa-video-camera fa-fw'), 
    0)

String dateTime = WebUI.getText(findTestObject('Page_WeCounsel/AvailableTime/Checker/a_6-05-2020 at 200 pm'))

'checks time of appointment'
if (dateTime.contains('3:00 pm')) {
} else {
    KeywordUtil.markFailedAndStop()
}

WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/Checker/close appt box'))

