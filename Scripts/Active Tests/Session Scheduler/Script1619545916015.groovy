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

'Email used for all wecounsel provider testing\r\n'
WebUI.setText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_useremail'), 'alexc+autoprovider@visuwell.net')

WebUI.setEncryptedText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_userpassword'), 'n/qdZPZskVxU+Rv/aUDKXw==')

WebUI.click(findTestObject('Page_User Login  WeCounsel/button_Log in'))

'Navigates to manage schedule'
WebUI.click(findTestObject('Page_WeCounsel/a_Manage Schedule'))

'goes to next week\r\n'
WebUI.click(findTestObject('Object Repository/Page_WeCounsel/span_May 10  16 2020_fc-icon fc-icon-right-_16bf18'))

'Selects available time in 5:00-6:00 slot'
WebUI.click(findTestObject('Object Repository/Page_WeCounsel/div_500 - 600'))

'Clicks schedule session'
WebUI.click(findTestObject('Object Repository/Page_WeCounsel/a_Schedule Session'))

WebUI.click(findTestObject('Object Repository/Page_WeCounsel/span_Attendees'))

'Selects autoclient test'
WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/li_Auto Client Test'))

'adds second guest'
WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/a_Invite from Client List'))

WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/span_Attendees 2'))

'Selects client 2 test'
WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/li_Client Two Test'))

WebUI.click(findTestObject('Object Repository/Page_WeCounsel/form_Schedule Calendar EventSchedule Video _9cb003'))

'Adds guest via email\r\n'
WebUI.click(findTestObject('Object Repository/Page_WeCounsel/a_Invite Guest by Email'))

'first name'
WebUI.setText(findTestObject('Object Repository/Page_WeCounsel/input_First Name_eventguest_users_attribute_245197'), 'Delete John')

'last name'
WebUI.setText(findTestObject('Object Repository/Page_WeCounsel/input_Last Name_eventguest_users_attributes_b75a7b'), 'Doe')

String GuestSingle = ('carld+SINGLE' + System.nanoTime()) + '@visuwell.net'

'Sets email to carld+SINGLE(timestamp)@visuwell.net'
WebUI.sendKeys(findTestObject('Page_WeCounsel/input_Guest email_eventguest_users_attribut_e27ab3'), GuestSingle)

WebUI.click(findTestObject('Object Repository/Page_WeCounsel/span_WC PP Coffee_faux-selection-arrow'))

'Selects type of session'
WebUI.click(findTestObject('Page_WeCounsel/Type of session select from dropdown'))

Date today = new Date()

Date tomorrow = today.next()

String formattedDate = tomorrow.format('MM/dd/yyyy')

WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/span_500pm'))

'Selects time as 3:00 pm'
WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/li_300pm'))

WebUI.click(findTestObject('Page_WeCounsel/button_Save'))

WebUI.delay(12)

'Clicks on newly scheduled 3:00 pm appointment'
WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/Checker/Check 3pm appt'))

String member1 = WebUI.getText(findTestObject('Page_WeCounsel/AvailableTime/Checker/a_Auto Client Test'))

if (member1.contains('Auto Client Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

String member2 = WebUI.getText(findTestObject('Page_WeCounsel/AvailableTime/a_Dr. Auto Provider Test'))

if (member2.contains('Dr. Auto Provider Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

String member3 = WebUI.getText(findTestObject('Page_WeCounsel/AvailableTime/a_Client Two Test'))

if (member3.contains('Client Two Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

String member4 = WebUI.getText(findTestObject('Page_WeCounsel/AvailableTime/Checker/a_Delete John Doe'))

if (member4.contains('Delete John Doe')) {
} else {
    KeywordUtil.markFailedAndStop()
}

String eventTypeSingle = WebUI.getText(findTestObject('Page_WeCounsel/AvailableTime/Checker/a_WC PP Coffee'))

if (eventTypeSingle.contains('WC PP Coffee')) {
} else {
    KeywordUtil.markFailedAndStop()
}

WebUI.verifyElementPresent(findTestObject('Page_WeCounsel/AvailableTime/Checker/i_Edit Attendees_fa fa-video-camera fa-fw'), 
    0)

String dateTimeSingle = WebUI.getText(findTestObject('Page_WeCounsel/AvailableTime/Checker/a_6-05-2020 at 200 pm'))

if (dateTimeSingle.contains('3:00 pm')) {
} else {
    KeywordUtil.markFailedAndStop()
}

WebUI.click(findTestObject('a_Cancel Appt'))

WebUI.enhancedClick(findTestObject('a_Cancel Appt Confirm'))

'Navigates to manage schedule'
WebUI.click(findTestObject('Page_WeCounsel/a_Manage Schedule'))

'goes to next week\r\n'
WebUI.click(findTestObject('Object Repository/Page_WeCounsel/span_May 10  16 2020_fc-icon fc-icon-right-_16bf18'))

String day = WebUI.getText(findTestObject('Page_WeCounsel/AvailableTime/Checker/span_Fri 65'))

String scheduleDay = day.split(' ')[1]

'Gets date of friday'
Date date = Date.parse('M/d', scheduleDay)

date.format('MM/dd/yyyy')

println(date)

'Selects available time in 5:00-6:00 slot'
WebUI.click(findTestObject('Object Repository/Page_WeCounsel/div_500 - 600'))

'Clicks schedule session'
WebUI.click(findTestObject('Object Repository/Page_WeCounsel/a_Schedule Session'))

WebUI.click(findTestObject('Object Repository/Page_WeCounsel/span_Attendees'))

'Selects autoclient test'
WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/li_Auto Client Test'))

'adds second guest'
WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/a_Invite from Client List'))

WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/span_Attendees 2'))

'Selects client 2 test'
WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/li_Client Two Test'))

WebUI.click(findTestObject('Object Repository/Page_WeCounsel/form_Schedule Calendar EventSchedule Video _9cb003'))

'Adds guest via email\r\n'
WebUI.click(findTestObject('Object Repository/Page_WeCounsel/a_Invite Guest by Email'))

'first name'
WebUI.setText(findTestObject('Object Repository/Page_WeCounsel/input_First Name_eventguest_users_attribute_245197'), 'Delete John')

'last name'
WebUI.setText(findTestObject('Object Repository/Page_WeCounsel/input_Last Name_eventguest_users_attributes_b75a7b'), 'Doe')

String GuestRepeat = ('carld+REPEAT' + System.nanoTime()) + '@visuwell.net'

'Sets email to carld+REPEAT(timestamp)@visuwell.net'
WebUI.sendKeys(findTestObject('Page_WeCounsel/input_Guest email_eventguest_users_attribut_e27ab3'), GuestRepeat)

WebUI.click(findTestObject('Object Repository/Page_WeCounsel/span_WC PP Coffee_faux-selection-arrow'))

'Selects type of session'
WebUI.click(findTestObject('Page_WeCounsel/Type of session select from dropdown'))

WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/span_500pm'))

'Selects time as 2:00 pm'
WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/li_200pm'))

WebUI.click(findTestObject('Object Repository/Page_WeCounsel/span_Repeat'))

'Clicks repeat'
WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/span_On'))

WebUI.click(findTestObject('Page_WeCounsel/button_Save'))

WebUI.delay(12)

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/Page_WeCounsel/span_May 10  16 2020_fc-icon fc-icon-right-_16bf18'))

'Clicks on newly scheduled 2:00 pm appointment'
WebUI.click(findTestObject('Page_WeCounsel/AvailableTime/Checker/Check 2 pm appt'))

String member5 = WebUI.getText(findTestObject('Page_WeCounsel/AvailableTime/a_Auto Client Test'))

if (member5.contains('Auto Client Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

String member6 = WebUI.getText(findTestObject('Page_WeCounsel/AvailableTime/a_Dr. Auto Provider Test'))

if (member6.contains('Dr. Auto Provider Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

String member7 = WebUI.getText(findTestObject('Page_WeCounsel/AvailableTime/a_Client Two Test'))

if (member7.contains('Client Two Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

String member8 = WebUI.getText(findTestObject('Page_WeCounsel/AvailableTime/Checker/a_Delete John Doe'))

if (member8.contains('Delete John Doe')) {
} else {
    KeywordUtil.markFailedAndStop()
}

String eventTypeRepeat = WebUI.getText(findTestObject('Page_WeCounsel/AvailableTime/Checker/a_WC PP Coffee'))

if (eventTypeRepeat.contains('WC PP Coffee')) {
} else {
    KeywordUtil.markFailedAndStop()
}

WebUI.verifyElementPresent(findTestObject('Page_WeCounsel/AvailableTime/Checker/i_Edit Attendees_fa fa-video-camera fa-fw'), 
    0)

String dateTimeRepeat = WebUI.getText(findTestObject('Page_WeCounsel/AvailableTime/Checker/a_6-05-2020 at 200 pm'))

if (dateTimeRepeat.contains('2:00 pm')) {
} else {
    KeywordUtil.markFailedAndStop()
}

WebUI.click(findTestObject('a_Cancel Appt'))

WebUI.enhancedClick(findTestObject('a_Cancel Appt Confirm'))

