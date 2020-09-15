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

WebUI.delay(5)

'Navigates to manage schedule'
WebUI.click(findTestObject('Object Repository/Page_WeCounsel/a_Manage Schedule'))

WebUI.click(findTestObject('Object Repository/Page_WeCounsel/button_Schedule'))

'Schedules a session'
WebUI.click(findTestObject('Object Repository/Page_WeCounsel/a_Session'))

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_WeCounsel/event type span'))

WebUI.click(findTestObject('Object Repository/Page_WeCounsel/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_WeCounsel/div_User_multiselect__tags'))

not_run: WebUI.click(findTestObject('Object Repository/Page_WeCounsel/span_Client Test'))

'Selects auto client'
WebUI.click(findTestObject('Page_WeCounsel/insideIframe/Auto Client Selector'))

'Clicks add another user'
WebUI.click(findTestObject('Object Repository/Page_WeCounsel/a_ add another user'))

WebUI.click(findTestObject('Object Repository/Page_WeCounsel/div_User_multiselect__tags_1'))

'Selects org admin test'
WebUI.click(findTestObject('Object Repository/Page_WeCounsel/span_Org Admin Test'))

'adds a guest'
WebUI.click(findTestObject('Object Repository/Page_WeCounsel/a_ add another guest'))

String TimeStampEmail = ('nickbiz060+DELETE' + System.nanoTime()) + '@gmail.com'

'Sets email to nickbiz060+DELETE(timestamp)@gmail.com'
WebUI.setText(findTestObject('Object Repository/Page_WeCounsel/input_Email_guest-email-1588959461844'), TimeStampEmail)

'VALID SMS TO NICK HAWKINS (Change this)'
WebUI.setText(findTestObject('Page_WeCounsel/insideIframe/input_SMS Phone_guest-sms-number-1589915293955'), '4232252263')

'First name'
WebUI.setText(findTestObject('Page_WeCounsel/insideIframe/input_First Name_guest-first_name-1589915293955'), 'john')

'Last name'
WebUI.setText(findTestObject('Page_WeCounsel/insideIframe/input_Last Name_guest-last_name-1589915293955'), 'doe')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_WeCounsel/button_Next'))

WebUI.delay(10)

Date today = new Date()

Date tomorrow = today.next()

'Gets date of tomorrow'
String formattedDate = tomorrow.format('MM/dd/yyyy')

WebUI.setText(findTestObject('Page_WeCounsel/insideIframe/input_Start time_session-date'), '')

not_run: WebUI.delay(5)

not_run: WebUI.setText(findTestObject('Page_WeCounsel/insideIframe/input_Start time_session-date'), formattedDate)

'Inputs date of tomorrow'
for (int i = 0; i < formattedDate.length(); i++) {
    String part = formattedDate.charAt(i)

    WebUI.sendKeys(findTestObject('Page_WeCounsel/insideIframe/input_Start time_session-date'), part)

    Thread.sleep(500)
}

WebUI.delay(1)

WebUI.click(findTestObject('Page_WeCounsel/insideIframe/Time Picker Dropdown'))

'Selects 12 pm'
WebUI.click(findTestObject('Page_WeCounsel/insideIframe/option noon'))

'Clicks repeat session'
WebUI.click(findTestObject('Object Repository/Page_WeCounsel/label_Repeat session'))

WebUI.click(findTestObject('Page_WeCounsel/insideIframe/ends on bool'))

Date nextWeek = new Date()

nextWeek = nextWeek.next()

nextWeek = nextWeek.next()

nextWeek = nextWeek.next()

nextWeek = nextWeek.next()

nextWeek = nextWeek.next()

nextWeek = nextWeek.next()

nextWeek = nextWeek.next()

'Gets date of next week'
String endDate = nextWeek.format('MM/dd/yyyy')

WebUI.setText(findTestObject('Page_WeCounsel/insideIframe/ends on input box'), '')

for (int i = 0; i < endDate.length(); i++) {
    String part2 = endDate.charAt(i)

    WebUI.sendKeys(findTestObject('Page_WeCounsel/insideIframe/ends on input box'), part2)

    Thread.sleep(500)
}

WebUI.click(findTestObject('Object Repository/Page_WeCounsel/button_Next'))

'Org session 60'
WebUI.selectOptionByValue(findTestObject('Page_WeCounsel/select_ORG - Session 60WC PP Coffee'), '1469', true)

'Determines location from attendees\r\n'
WebUI.selectOptionByValue(findTestObject('Page_WeCounsel/select_Determine location from attendeesWeC_08f978'), '525', true)

WebUI.click(findTestObject('Object Repository/Page_WeCounsel/button_Next'))

def eventTypeCheck = WebUI.getText(findTestObject('Page_WeCounsel/insideIframe/div_Video Session'))

if (eventTypeCheck.contains('Video Session')) {
} else {
    KeywordUtil.markFailedAndStop()
}

def clientTestCheck = WebUI.getText(findTestObject('Page_WeCounsel/insideIframe/li_AutoClient Test'))

if (clientTestCheck.contains('Client Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

def orgAdminCheck = WebUI.getText(findTestObject('Page_WeCounsel/insideIframe/li_Org Admin Test'))

if (orgAdminCheck.contains('Heath Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

def providerCheck = WebUI.getText(findTestObject('Page_WeCounsel/insideIframe/p_AutoProvider Test'))

if (providerCheck.contains('Provider Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

not_run: def guestttttttCheck = WebUI.getText(findTestObject('Page_WeCounsel/insideIframe/li_John Doe Email nickbiz060client1gmailcom'))

def guestCheck = WebUI.getText(findTestObject('Page_WeCounsel/insideIframe/john doe name and email check - video'))

if (guestCheck.contains('john doe, Email: nickbiz060')) {
    //, SMS number: 1231231234
} else {
    KeywordUtil.markFailedAndStop()
}

def serviceTypeCheck = WebUI.getText(findTestObject('Page_WeCounsel/insideIframe/li_WC PP Coffee'))

if (serviceTypeCheck.contains('WC PP Coffee')) {
} else {
    KeywordUtil.markFailedAndStop()
}

def locationCheck = WebUI.getText(findTestObject('Page_WeCounsel/insideIframe/div_WeCounsel Private Practice - Location 2'))

if (locationCheck.contains('WeCounsel Private Practice - Location 2')) {
} else {
    KeywordUtil.markFailedAndStop()
}

WebUI.click(findTestObject('Object Repository/Page_WeCounsel/button_Finish'))

not_run: WebUI.delay(4)

not_run: WebUI.click(findTestObject('Page_WeCounsel/insideIframe/close Review X Button'))

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('Page_WeCounsel/schedule check/a_Session List'))

not_run: WebUI.click(findTestObject('Page_WeCounsel/schedule check/legend_Filter'))

not_run: WebUI.click(findTestObject('Page_WeCounsel/schedule check/option_Confirmed'))

not_run: WebUI.click(findTestObject('Page_WeCounsel/schedule check/button_Apply'))

not_run: WebUI.verifyElementPresent(findTestObject('Page_WeCounsel/schedule check/i_Edit Attendees_fa fa-video-camera fa-fw'), 
    0)

not_run: def dateTimeCheck = WebUI.getText(findTestObject('Page_WeCounsel/schedule check/a_5-27-2020 at 1200 pm'))

not_run: Date tmp = tomorrow

not_run: String lastCheck = tmp.format('M-dd-yyyy')

not_run: println(lastCheck + ' at 12:00 pm')

not_run: if (dateTimeCheck.contains(lastCheck + ' at 12:00 pm')) {
} else {
    KeywordUtil.markFailedAndStop()
}

