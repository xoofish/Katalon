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

WebUI.openBrowser('https://test-uhhospitals.wecounsel.com/users/sign_in')

WebUI.maximizeWindow()

WebUI.enableSmartWait()

WebUI.setText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_useremail'), 'visuwellautomation+uhprovider@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_userpassword'), 'n/qdZPZskVxU+Rv/aUDKXw==')

WebUI.click(findTestObject('Page_User Login  WeCounsel/button_Log in'))

WebUI.click(findTestObject('UHMeet Now'))

WebUI.delay(2)

Robot robot = new Robot()

robot.mouseMove(0, 0)

robot.mouseMove(350, 150)

WebUI.delay(1)

robot.mousePress(InputEvent.BUTTON1_MASK)

robot.mouseRelease(InputEvent.BUTTON1_MASK)

WebUI.click(findTestObject('Pre-Session Audio'))

WebUI.delay(1)

WebUI.click(findTestObject('Pre-Session Audio'))

WebUI.click(findTestObject('Pre-Session Video'))

WebUI.delay(1)

WebUI.click(findTestObject('Pre-Session Video'))

WebUI.click(findTestObject('Left Pane Menu'))

WebUI.click(findTestObject('Left Pane Menu'))

WebUI.click(findTestObject('Left Pane Invite'))

WebUI.click(findTestObject('Left Pane Invite'))

WebUI.click(findTestObject('Left Pane Attendees'))

WebUI.click(findTestObject('Left Pane Attendees'))

WebUI.click(findTestObject('Left Pane Chat'))

WebUI.click(findTestObject('Left Pane Chat'))

WebUI.click(findTestObject('Left Pane Advanced'))

WebUI.click(findTestObject('Left Pane Advanced'))

WebUI.click(findTestObject('UH PreSession Join'))

WebUI.click(findTestObject('Left Pane Menu'))

WebUI.click(findTestObject('Left Pane Menu'))

WebUI.click(findTestObject('Left Pane Invite'))

WebUI.click(findTestObject('Left Pane Invite'))

WebUI.click(findTestObject('UH Screenshare'))

robot.keyPress(KeyEvent.VK_ESCAPE)

WebUI.click(findTestObject('UH Fullscreen'))

WebUI.click(findTestObject('UH Fullscreen'))

WebUI.click(findTestObject('UH Attendees'))

WebUI.click(findTestObject('UH Attendees'))

WebUI.click(findTestObject('UH Chat'))

WebUI.click(findTestObject('UH Chat'))

WebUI.click(findTestObject('UH Advanced'))

WebUI.click(findTestObject('UH Advanced'))

WebUI.click(findTestObject('UH Layout'))

WebUI.click(findTestObject('UH Layout'))

WebUI.click(findTestObject('UH Audio'))

WebUI.click(findTestObject('UH Audio'))

WebUI.click(findTestObject('UH Video'))

WebUI.click(findTestObject('UH Video'))

WebUI.click(findTestObject('UH End Session'))

WebUI.click(findTestObject('Left Pane Menu'))

WebUI.click(findTestObject('UH Home'))

WebUI.click(findTestObject('Cancel Session'))

WebUI.click(findTestObject('Confirm Cancel Session'))

