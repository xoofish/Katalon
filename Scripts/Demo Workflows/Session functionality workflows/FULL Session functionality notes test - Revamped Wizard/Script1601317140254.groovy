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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.Alert as Alert
import java.awt.Robot as Robot
import java.awt.event.InputEvent as InputEvent
import java.awt.event.KeyEvent as KeyEvent
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver as RemoteWebDriver
import java.net.URL as URL
import java.util.HashMap as HashMap
import java.util.Map as Map
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join

WebUI.openBrowser('https://test-pp.wecounsel.com/users/sign_in')

WebUI.maximizeWindow()

WebUI.enableSmartWait()

WebUI.setText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_useremail'), 'alexc+autoprovider@visuwell.net')

'Telehealth321'
WebUI.setEncryptedText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_userpassword'), 'LCsxB9VPamtRlQlpiLe+cw==')

WebUI.click(findTestObject('Page_User Login  WeCounsel/button_Log in'))

WebUI.mouseOver(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/span_Schedule'))

WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/a_Session'))

WebUI.waitForElementClickable(findTestObject('Demo Workflows/Org admin checkin as patient/Next button'), 5)

WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/Next button'))

WebUI.setText(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/Page_WeCounsel/input_Add Patients_scheduler-patients-search-field'), 
    'auto')

WebUI.waitForElementClickable(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/span_Auto Client Test'), 
    5)

WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/span_Auto Client Test'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/button_Next'))

WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/button_Next'))

WebUI.delay(10)

'robot class emulates keyboard presses'
not_run: Robot robot = new Robot()

not_run: robot.mouseMove(1500, 475)

not_run: robot.mousePress(InputEvent.BUTTON1_MASK)

not_run: robot.mouseRelease(InputEvent.BUTTON1_MASK)

not_run: WebUI.selectOptionByIndex(findTestObject('sessionSelectOrg'), '1', FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('sessionSelectLocation'))

not_run: WebUI.selectOptionByIndex(findTestObject('sessionSelectLocation'), '0', FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('sessionSelectService'))

not_run: WebUI.selectOptionByIndex(findTestObject('sessionSelectService'), '0', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_WeCounsel/schedule check/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_WeCounsel/schedule check/button_Finish'))

not_run: WebUI.waitForElementClickable(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/Filters button'), 
    5)

not_run: WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/Filters button'))

not_run: WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/Filters for option_Auto Client Test'))

not_run: WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/Filters Confirmed session status'))

not_run: WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/Filters ORG - Session 60 service type'))

not_run: WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/Filters Apply'))

not_run: checkAutoClient = WebUI.getText(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/a_Auto Client Test'))

not_run: WebUI.sendKeys(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/a_Auto Client Test'), 
    '')

not_run: if (checkAutoClient.contains('Auto Client Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

checkAutoProvider = WebUI.getText(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/Check AutoProvider Test'))

if (checkAutoProvider.contains('Auto Provider Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

not_run: checkTimeDate = WebUI.getText(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/Check timedate'))

not_run: String timeSplit = checkTimeDate.split(' at ')[1]

not_run: println('timeSplit ' + timeSplit)

not_run: println('time ' + time)

not_run: String date = checkTimeDate.split(' at ')[0]

not_run: println('date ' + date)

not_run: if (timeSplit.contains(time)) {
} else {
    not_run: KeywordUtil.markFailedAndStop()
}

not_run: Date day = new Date()

not_run: String dayday = day.format('M-dd-yyyy')

not_run: println('dayday ' + dayday)

not_run: if (date.contains(dayday)) {
} else {
    KeywordUtil.markFailedAndStop()
}

WebUI.delay(5)

WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/CheckIn to session button'))

WebUI.waitForElementClickable(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/OK button after checkin'), 
    5)

WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/OK button after checkin'))

WebUI.waitForElementClickable(findTestObject('Demo Workflows/Session functionality/Note functionality/Treatment Notes right hand control'), 
    5)

WebUI.click(findTestObject('Demo Workflows/Session functionality/Note functionality/Treatment Notes right hand control'))

WebUI.click(findTestObject('Demo Workflows/Session functionality/Note functionality/view old note'))

WebUI.switchToWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/a_Create New Note'))

WebUI.click(findTestObject('Demo Workflows/Session functionality/Note functionality/Create Blank Note'))

WebUI.click(findTestObject('Demo Workflows/Session functionality/Note functionality/Note input'))

WebUI.setText(findTestObject('Demo Workflows/Session functionality/Note functionality/Note input'), 'Test note input in session')

WebUI.click(findTestObject('Demo Workflows/Session functionality/Note functionality/button_Save'))

