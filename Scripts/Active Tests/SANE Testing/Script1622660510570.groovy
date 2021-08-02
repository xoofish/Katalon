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

WebUI.openBrowser('https://test-uams-sane.wecounsel.com/users/sign_in')

WebUI.maximizeWindow()

WebUI.enableSmartWait()

WebUI.setText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_useremail'), 'jactvis+saneprov1@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_userpassword'), 'n/qdZPZskVxU+Rv/aUDKXw==')

WebUI.click(findTestObject('Page_User Login  WeCounsel/button_Log in'))

WebUI.mouseOver(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/span_Schedule'))

WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/a_Session'))

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/Next button'))

WebUI.setText(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/Page_WeCounsel/input_Add Patients_scheduler-patients-search-field'), 
    'test')

WebUI.waitForElementClickable(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/span_Auto Client Test'), 
    15)

WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/span_Auto Client Test'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/button_Next'))

WebUI.click(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/button_Next'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_WeCounsel/schedule check/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_WeCounsel/schedule check/button_Finish'))

checkAutoProvider = WebUI.getText(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/Check AutoProvider Test'))

if (checkAutoProvider.contains('Auto Provider Test')) {
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

WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Note functionality/Treatment Notes right hand control'))

WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Note functionality/view old note'))

WebUI.switchToWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Session schedule and checkin/a_Create New Note'))

WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Note functionality/Create Blank Note'))

WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Note functionality/Note input'))

WebUI.setText(findTestObject('Demo Workflows/Session functionality/Note functionality/Note input'), 'Test note input in session')

WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Note functionality/button_Save'))

WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Document Test/a_Saved Documents'))

WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Document Test/a_samplepdf'))

WebUI.switchToWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('SessionDocumentsClose'))

WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Messaging/a_Send a Document'))

WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Messaging/input_AutoClient Test_messagesubject'))

WebUI.setText(findTestObject('Demo Workflows/Session functionality/Messaging/input_AutoClient Test_messagesubject'), 'Test test')

WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Messaging/div_AutoClient Test_ql-editor ql-blank'))

WebUI.setText(findTestObject('Demo Workflows/Session functionality/Messaging/div_AutoClient Test_ql-editor ql-blank'), 'Test test')

WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Messaging/legend_Attachments'))

WebUI.uploadFile(findTestObject('Demo Workflows/Session functionality/Messaging/a_Attach a new document'), 'C:\\Users\\CarldeSoto\\Documents\\sample.pdf')

WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Messaging/button_Send'))

WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Patient file/Personal Information in session'))

WebUI.delay(2)

PhoneNum = WebUI.getText(findTestObject('Demo Workflows/Session functionality/Patient file/Phone number (click to edit)'))

String NewPhoneNum

if (PhoneNum.contains('(123) 123-1234')) {
    NewPhoneNum = '(555) 555-5555'
} else {
    NewPhoneNum = '(123) 123-1234'
}

WebUI.click(findTestObject('Demo Workflows/Session functionality/Patient file/Phone number (click to edit)'))

WebUI.setText(findTestObject('Demo Workflows/Session functionality/Patient file/Phone number input'), NewPhoneNum)

WebUI.click(findTestObject('Demo Workflows/Session functionality/Patient file/Save changes'))

WebUI.delay(10)

WebUI.click(findTestObject('Demo Workflows/Session functionality/Patient file/Personal Information in session'))

WebUI.delay(2)

CheckPhoneNum = WebUI.getText(findTestObject('Demo Workflows/Session functionality/Patient file/Phone number (click to edit)'))

