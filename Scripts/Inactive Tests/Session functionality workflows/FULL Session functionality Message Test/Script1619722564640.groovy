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

System.setProperty('webdriver.chrome.driver', 'C:\\Program Files (x86)\\Katalon_Studio_Windows_64-7.6.2\\configuration\\resources\\drivers\\chromedriver_win32\\chromedriver.exe')

WebDriver driver1 = new ChromeDriver()

DriverFactory.changeWebDriver(driver1)

WebUI.navigateToUrl('https://test-pp.wecounsel.com/users/sign_in')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_useremail'), 'nickbiz060+AutoProvider@gmail.com')

'Telehealth321'
WebUI.setEncryptedText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_userpassword'), 'LCsxB9VPamtRlQlpiLe+cw==')

WebUI.click(findTestObject('Page_User Login  WeCounsel/button_Log in'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/span_Schedule'))

WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/a_Session'))

WebUI.delay(5)

WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/Next button'))

WebUI.delay(2)

WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/User dropdown choose attendees'))

not_run: WebUI.click(findTestObject('Page_WeCounsel/click auto client test in dropdown'))

WebUI.setText(findTestObject('Demo Workflows/Org admin checkin as patient/TEST - Type to search user'), 'AutoClient Test')

WebUI.sendKeys(findTestObject('Demo Workflows/Org admin checkin as patient/TEST - Type to search user'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/TMP - Next button'))

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

WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/TMP - Next button'))

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Demo Workflows/Org admin checkin as patient/Select service type'), 0)

WebUI.selectOptionByIndex(findTestObject('Demo Workflows/Org admin checkin as patient/Select location'), 1)

WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/TMP - Next button'))

WebUI.delay(2)

WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/Finish finish button'))

WebUI.delay(10)

WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/Filters button'))

WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/Filters AutoClient Test in attendees'))

WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/Filters Confirmed session status'))

WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/Filters ORG - Session 60 service type'))

WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/Filters Apply'))

WebUI.delay(10)

checkAutoClient = WebUI.getText(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/Check AutoClient Test'))

if (checkAutoClient.contains('AutoClient Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

checkAutoProvider = WebUI.getText(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/Check AutoProvider Test'))

if (checkAutoProvider.contains('AutoProvider Test')) {
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
    KeywordUtil.markFailedAndStop()
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

WebUI.click(findTestObject('Demo Workflows/Session functionality/General/Start Session button'))

WebUI.delay(2)

Robot robot = new Robot()

robot.keyPress(KeyEvent.VK_TAB)

robot.keyPress(KeyEvent.VK_TAB)

robot.keyPress(KeyEvent.VK_ENTER)

WebUI.delay(7)

robot.keyPress(KeyEvent.VK_TAB)

robot.keyPress(KeyEvent.VK_TAB)

robot.keyPress(KeyEvent.VK_ENTER)

WebDriver driver2 = new ChromeDriver()

DriverFactory.changeWebDriver(driver2)

WebUI.navigateToUrl('https://test-pp.wecounsel.com/users/sign_in')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_useremail'), 'nickbiz060+AutoClient@gmail.com')

'Telehealth321'
WebUI.setEncryptedText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_userpassword'), 'LCsxB9VPamtRlQlpiLe+cw==')

WebUI.click(findTestObject('Page_User Login  WeCounsel/button_Log in'))

not_run: clientAutoClient = WebUI.getText(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/Client check AutoClient Test'))

not_run: if (clientAutoClient.contains('AutoClient Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

not_run: clientAutoProvider = WebUI.getText(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/Client check AutoProvider Test'))

not_run: if (clientAutoProvider.contains('AutoProvider Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

not_run: clientTimeDate = WebUI.getText(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/Client check timedate'))

not_run: String clientTime = clientTimeDate.split(' at ')[1]

not_run: String clientDate = clientTimeDate.split(' at ')[0]

not_run: println('clientDate ' + clientDate)

not_run: if (clientTime.contains(time)) {
} else {
    KeywordUtil.markFailedAndStop()
}

not_run: Date day2 = new Date()

not_run: String daydayday = day2.format('M-dd-yyyy')

not_run: println('dayday ' + daydayday)

not_run: if (clientDate.contains(daydayday)) {
} else {
    KeywordUtil.markFailedAndStop()
}

WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/client Check In button'))

WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/client OK button after checkin'))

WebUI.delay(7)

robot.keyPress(KeyEvent.VK_TAB)

robot.keyPress(KeyEvent.VK_TAB)

robot.keyPress(KeyEvent.VK_ENTER)

WebUI.refresh()

WebUI.delay(7)

WebUI.click(findTestObject('Demo Workflows/Session functionality/General/Start Session button'))

WebUI.delay(2)

robot.keyPress(KeyEvent.VK_TAB)

robot.keyPress(KeyEvent.VK_TAB)

robot.keyPress(KeyEvent.VK_ENTER)

WebUI.delay(2)

WebUI.refresh()

WebUI.delay(7)

WebUI.click(findTestObject('Demo Workflows/Session functionality/General/Start Session button'))

WebUI.delay(2)

DriverFactory.changeWebDriver(driver1)

WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Messaging/a_Send a Document'))

WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Messaging/input_AutoClient Test_messagesubject'))

WebUI.setText(findTestObject('Demo Workflows/Session functionality/Messaging/input_AutoClient Test_messagesubject'), 'Test test')

WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Messaging/div_AutoClient Test_ql-editor ql-blank'))

WebUI.setText(findTestObject('Demo Workflows/Session functionality/Messaging/div_AutoClient Test_ql-editor ql-blank'), 'Test test')

WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Messaging/legend_Attachments'))

WebUI.uploadFile(findTestObject('Demo Workflows/Session functionality/Messaging/a_Attach a new document'), 'C:\\Users\\Alex Cullor\\Katalon Studio\\sample.pdf')

WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Messaging/button_Send'))

