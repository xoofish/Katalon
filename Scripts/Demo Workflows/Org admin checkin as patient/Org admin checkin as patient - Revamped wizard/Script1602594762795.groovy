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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://test-pp.wecounsel.com/users/sign_in')

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

not_run: WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/li_Auto Client Test_NEWSCH'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/Page_WeCounsel/input_Add Patients_scheduler-patients-search-field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/button_Next'))

Date today = new Date()

String Time = today.format('H')

int nowTime = Time.toInteger()

println(nowTime)

int setTime

String time = ''

if (nowTime == 24) {
    setTime = 12

    time = '1:00 am'
} else if (nowTime == 1) {
    setTime = 24

    time = '2:00 am'
} else if (nowTime == 2) {
    setTime = 36

    time = '3:00 am'
} else if (nowTime == 3) {
    setTime = 48

    time = '4:00 am'
} else if (nowTime == 4) {
    setTime = 60

    time = '5:00 am'
} else if (nowTime == 5) {
    setTime = 72

    time = '6:00 am'
} else if (nowTime == 6) {
    setTime = 84

    time = '7:00 am'
} else if (nowTime == 7) {
    setTime = 96

    time = '8:00 am'
} else if (nowTime == 8) {
    setTime = 108

    time = '9:00 am'
} else if (nowTime == 9) {
    setTime = 120

    time = '10:00 am'
} else if (nowTime == 10) {
    setTime = 132

    time = '11:00 am'
} else if (nowTime == 11) {
    setTime = 144

    time = '12:00 pm'
} else if (nowTime == 12) {
    setTime = 156

    time = '1:00 pm'
} else if (nowTime == 13) {
    setTime = 168

    time = '2:00 pm'
} else if (nowTime == 14) {
    setTime = 180

    time = '3:00 pm'
} else if (nowTime == 15) {
    setTime = 192

    time = '4:00 pm'
} else if (nowTime == 16) {
    setTime = 204

    time = '5:00 pm'
} else if (nowTime == 17) {
    setTime = 216

    time = '6:00 pm'
} else if (nowTime == 18) {
    setTime = 228

    time = '7:00 pm'
} else if (nowTime == 19) {
    setTime = 240

    time = '8:00 pm'
} else if (nowTime == 20) {
    setTime = 252

    time = '9:00 pm'
} else if (nowTime == 21) {
    setTime = 264

    time = '10:00 pm'
} else if (nowTime == 22) {
    setTime = 276

    time = '11:00 pm'
} else if (nowTime == 23) {
    setTime = 0

    time = '12:00 am'
} else {
    KeywordUtil.markFailedAndStop()
}

WebUI.selectOptionByIndex(findTestObject('Demo Workflows/Org admin checkin as patient/Select time dropdown'), setTime)

WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/button_Next'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Page_WeCounsel/schedule check/select_Select service typeORG - Session 60WC PP Coffee'))

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Page_WeCounsel/schedule check/select_Select service typeORG - Session 60W_5f056a'), 
    '1389', true)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Page_WeCounsel/schedule check/select_Select organizationWecounsel Private_d24de3'), 
    '1', true)

'selects service type'
not_run: WebUI.selectOptionByIndex(findTestObject('Demo Workflows/Org admin checkin as patient/Select service type'), 1)

WebUI.delay(10)

'selects location'
not_run: WebUI.selectOptionByIndex(findTestObject('Demo Workflows/Org admin checkin as patient/Select location'), 7)

WebUI.click(findTestObject('Object Repository/Page_WeCounsel/schedule check/button_Next'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_WeCounsel/schedule check/button_Finish'))

not_run: WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/TMP - Next button'))

not_run: WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/Finish finish button'))

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

not_run: String checkDate = WebUI.getText(findTestObject('Demo Workflows/Org admin checkin as patient/check Date Time'))

not_run: String timeSplit = checkDate.split(' at ')[1]

not_run: println('timeSplit ' + timeSplit)

not_run: println('time ' + time)

not_run: String date = checkDate.split(' at ')[0]

not_run: println('date ' + date)

'checks time of session'
not_run: if (timeSplit.contains(time)) {
} else {
    not_run: KeywordUtil.markFailedAndStop()
}

not_run: Date day = new Date()

not_run: String dayday = day.format('M-dd-yyyy')

not_run: println('dayday ' + dayday)

'checks date of session'
not_run: if (date.contains(dayday)) {
} else {
    not_run: KeywordUtil.markFailedAndStop()
}

String checkClient = WebUI.getText(findTestObject('Page_WeCounsel/AvailableTime/Checker/a_Auto Client Test'))

'checks session attendee'
if (checkClient.contains('Auto Client Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

not_run: String checkSession = WebUI.getText(findTestObject('Demo Workflows/Org admin checkin as patient/check ORG - Session 60'))

'checks session type'
not_run: if (checkSession.contains('ORG - Session 60')) {
} else {
    not_run: KeywordUtil.markFailedAndStop()
}

not_run: WebUI.getText(findTestObject('Demo Workflows/Org admin checkin as patient/check Auto Org Admin Test'))

'checks into session'
WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/Check In button 2'))

WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/Yes button for permission to check in'))

WebUI.delay(3)

'starts session'
WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/a_Start Session_PEXIP'), 0)
