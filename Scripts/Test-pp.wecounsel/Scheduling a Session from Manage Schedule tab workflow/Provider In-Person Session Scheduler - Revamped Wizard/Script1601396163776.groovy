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

'Navigates to manage schedule'
WebUI.click(findTestObject('Object Repository/Page_WeCounsel/a_Manage Schedule'))

WebUI.click(findTestObject('Object Repository/Page_WeCounsel/button_Schedule'))

'Schedules a session'
WebUI.click(findTestObject('Object Repository/Page_WeCounsel/a_Session'))

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/Demo Workflows/Scheduler/select_Video SessionIn-Person Session'), 
    'in-person-session', true)

WebUI.click(findTestObject('Object Repository/Demo Workflows/Scheduler/button_Next'))

WebUI.setText(findTestObject('Object Repository/Demo Workflows/Scheduler/input_Me_scheduler-search-field'), 'autoclient test')

WebUI.click(findTestObject('Object Repository/Demo Workflows/Scheduler/span_AutoClient Test'))

WebUI.click(findTestObject('Object Repository/Demo Workflows/Scheduler/span_Add another guest'))

String TimeStampEmail = ('alexc+DELETE' + System.nanoTime()) + '@visuwell.net'

WebUI.setText(findTestObject('Object Repository/Demo Workflows/Scheduler/input'), TimeStampEmail)

WebUI.setText(findTestObject('Object Repository/Demo Workflows/Scheduler/input_1'), '(423) 280 - 3111')

WebUI.setText(findTestObject('Object Repository/Demo Workflows/Scheduler/input_1_2'), 'john')

WebUI.setText(findTestObject('Object Repository/Demo Workflows/Scheduler/input_1_2_3'), 'doe')

WebUI.click(findTestObject('Object Repository/Demo Workflows/Scheduler/label_No'))

WebUI.click(findTestObject('Object Repository/Demo Workflows/Scheduler/button_Add'))

WebUI.click(findTestObject('Object Repository/Demo Workflows/Scheduler/button_Next'))

WebUI.delay(10)

Date today = new Date()

Date tomorrow = today.next()

'Gets date of tomorrow'
String formattedDate = tomorrow.format('MM/dd/yyyy')

WebUI.setText(findTestObject('Demo Workflows/Scheduler/input (1)'), '')

'Inputs date of tomorrow'
for (int i = 0; i < formattedDate.length(); i++) {
    String part = formattedDate.charAt(i)

    WebUI.sendKeys(findTestObject('Demo Workflows/Scheduler/input (1)'), part)

    Thread.sleep(500)
}

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_WeCounsel/AvailableTime/select_1200 am1205 am1210 am1215 am1220 am1_1096b9'), 
    '13:00:00', true)

WebUI.click(findTestObject('Object Repository/Page_WeCounsel/button_Next'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_WeCounsel/AvailableTime/Checker/select_Select service typeORG - Session 60W_5f056a'), 
    '1469', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Demo Workflows/Scheduler/select_Select organizationWecounsel Private_d24de3'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_WeCounsel/schedule check/button_Next'))

WebUI.delay(5)

def eventTypeCheck = WebUI.getText(findTestObject('Page_WeCounsel/insideIframe/div_Video Session'))

if (eventTypeCheck.contains('In Person Session')) {
} else {
    KeywordUtil.markFailedAndStop()
}

def clientTestCheck = WebUI.getText(findTestObject('Page_WeCounsel/insideIframe/li_AutoClient Test'))

if (clientTestCheck.contains('Client Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

not_run: def orgAdminCheck = WebUI.getText(findTestObject('Page_WeCounsel/insideIframe/li_Org Admin Test'))

not_run: if (orgAdminCheck.contains('Heath Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

def providerCheck = WebUI.getText(findTestObject('Page_WeCounsel/insideIframe/p_AutoProvider Test'))

if (providerCheck.contains('Provider Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

def guestCheck = WebUI.getText(findTestObject('Page_WeCounsel/insideIframe/li_John Doe Email nickbiz060client1gmailcom SMS number 1231231234'))

println(guestCheck)

if (guestCheck.contains('john doe, Email: nickbiz060')) {
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

WebUI.click(findTestObject('Object Repository/Demo Workflows/Scheduler/button_Finish'))

WebUI.delay(5)

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

not_run: println(lastCheck + ' at 1:00 pm')

not_run: if (dateTimeCheck.contains(lastCheck + ' at 1:00 pm')) {
} else {
    KeywordUtil.markFailedAndStop()
}

