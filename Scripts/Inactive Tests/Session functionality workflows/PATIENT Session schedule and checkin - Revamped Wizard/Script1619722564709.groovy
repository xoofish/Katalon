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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.Alert as Alert
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://test-pp.wecounsel.com/users/sign_in')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_useremail'), 'alexc+autoprovider@visuwell.net')

'Telehealth321'
WebUI.setEncryptedText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_userpassword'), 'LCsxB9VPamtRlQlpiLe+cw==')

WebUI.click(findTestObject('Page_User Login  WeCounsel/button_Log in'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/span_Schedule'))

WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/a_Session'))

WebUI.delay(2)

WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/Next button'))

WebUI.delay(2)

not_run: WebUI.setText(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/input_Me_scheduler-search-field (1)'), 
    'Auto Client Test')

WebUI.setText(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/Page_WeCounsel/input_Add Patients_scheduler-patients-search-field'), 
    'Auto Client Test')

WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/span_Auto Client Test'))

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

WebUI.delay(10)

not_run: WebUI.click(findTestObject('Page_WeCounsel/schedule check/select_Select service typeORG - Session 60WC PP Coffee'))

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Page_WeCounsel/schedule check/select_Select service typeORG - Session 60W_5f056a'), 
    '1389', true)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Page_WeCounsel/schedule check/select_Select organizationWecounsel Private_d24de3'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_WeCounsel/schedule check/button_Next'))

WebUI.delay(5)

not_run: WebUI.click(findTestObject('Object Repository/Page_WeCounsel/schedule check/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_WeCounsel/schedule check/button_Finish'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Page_WeCounsel/schedule check/select_Select service typeORG - Session 60WC PP Coffee'))

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Page_WeCounsel/schedule check/select_Select service typeORG - Session 60W_5f056a'), 
    '1389', true)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Page_WeCounsel/schedule check/select_Select organizationWecounsel Private_d24de3'), 
    '1', true)

not_run: WebUI.click(findTestObject('Object Repository/Page_WeCounsel/schedule check/button_Next'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Object Repository/Page_WeCounsel/schedule check/button_Next'))

not_run: WebUI.click(findTestObject('Object Repository/Page_WeCounsel/schedule check/button_Finish'))

WebUI.delay(10)

WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/Filters button'))

WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/Filters for option_Auto Client Test'))

WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/Filters Confirmed session status'))

WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/Filters ORG - Session 60 service type'))

WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/Filters Apply'))

WebUI.delay(10)

checkAutoClient = WebUI.getText(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/a_Auto Client Test'))

if (checkAutoClient.contains('Auto Client Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

checkAutoProvider = WebUI.getText(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/a_Dr. Auto Provider Test'))

if (checkAutoProvider.contains('Dr. Auto Provider Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

checkTimeDate = WebUI.getText(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/Check timedate'))

String timeSplit = checkTimeDate.split(' at ')[1]

println('timeSplit ' + timeSplit)

println('time ' + time)

String date = checkTimeDate.split(' at ')[0]

println('date ' + date)

if (timeSplit.contains(time)) {
} else {
    not_run: KeywordUtil.markFailedAndStop()
}

Date day = new Date()

String dayday = day.format('M-dd-yyyy')

println('dayday ' + dayday)

if (date.contains(dayday)) {
} else {
    KeywordUtil.markFailedAndStop()
}

WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/CheckIn to session button'))

WebUI.delay(2)

WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/OK button after checkin'))

WebUI.delay(7)

Robot robot = new Robot()

robot.keyPress(KeyEvent.VK_TAB)

robot.keyPress(KeyEvent.VK_TAB)

robot.keyPress(KeyEvent.VK_ENTER)

WebUI.click(findTestObject('Demo Workflows/Session functionality/General/Start Session button'))

WebUI.delay(2)

robot.keyPress(KeyEvent.VK_TAB)

robot.keyPress(KeyEvent.VK_TAB)

robot.keyPress(KeyEvent.VK_ENTER)

WebUI.delay(7)

WebDriver driver2 = new ChromeDriver()

DriverFactory.changeWebDriver(driver2)

WebUI.navigateToUrl('https://test-pp.wecounsel.com/users/sign_in')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_useremail'), 'alexc+autoclient@visuwell.net')

'Telehealth321'
WebUI.setEncryptedText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_userpassword'), 'LCsxB9VPamtRlQlpiLe+cw==')

WebUI.click(findTestObject('Page_User Login  WeCounsel/button_Log in'))

not_run: clientAutoClient = WebUI.getText(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/Client check AutoClient Test'))

'checks autoclient attendee'
not_run: if (clientAutoClient.contains('AutoClient Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

not_run: clientAutoProvider = WebUI.getText(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/Client check AutoProvider Test'))

'checks autoprovider attendee'
not_run: if (clientAutoProvider.contains('AutoProvider Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

not_run: clientTimeDate = WebUI.getText(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/Client check timedate'))

not_run: String clientTime = clientTimeDate.split(' at ')[1]

not_run: String clientDate = clientTimeDate.split(' at ')[0]

not_run: println('clientDate ' + clientDate)

'checks time'
not_run: if (clientTime.contains(time)) {
} else {
    KeywordUtil.markFailedAndStop()
}

not_run: Date day2 = new Date()

not_run: String daydayday = day2.format('M-dd-yyyy')

not_run: println('dayday ' + daydayday)

'checks date'
not_run: if (clientDate.contains(daydayday)) {
} else {
    KeywordUtil.markFailedAndStop()
}

WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/client Check In button'))

'checkin to session'
WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/client OK button after checkin'))

WebUI.delay(7)

robot.keyPress(KeyEvent.VK_TAB)

robot.keyPress(KeyEvent.VK_TAB)

'accept chrome notifications popup'
robot.keyPress(KeyEvent.VK_ENTER)

WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/General/Start Session button'))

WebUI.delay(2)

robot.keyPress(KeyEvent.VK_TAB)

robot.keyPress(KeyEvent.VK_TAB)

'accept chrome notifications popup'
robot.keyPress(KeyEvent.VK_ENTER)

WebUI.delay(2)

'refresh'
WebUI.refresh()

WebUI.delay(7)

'start session'
WebUI.click(findTestObject('Demo Workflows/Session functionality/General/Start Session button'))

WebUI.delay(2)

