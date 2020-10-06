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

System.setProperty('webdriver.chrome.driver', 'C:\\Program Files (x86)\\Katalon_Studio_Windows_64-7.6.2\\configuration\\resources\\drivers\\chromedriver_win32\\chromedriver.exe')

'opens first crome driver'
WebDriver driver1 = new ChromeDriver()

DriverFactory.changeWebDriver(driver1)

WebUI.navigateToUrl('https://test-pp.wecounsel.com/users/sign_in')

WebUI.delay(2)

'autoprovider account'
WebUI.setText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_useremail'), 'alexc+autoprovider@visuwell.net')

'Telehealth321'
WebUI.setEncryptedText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_userpassword'), 'LCsxB9VPamtRlQlpiLe+cw==')

WebUI.click(findTestObject('Page_User Login  WeCounsel/button_Log in'))

WebUI.delay(2)

'selects meet now session'
WebUI.click(findTestObject('Demo Workflows/Session functionality/General/Meet Now button'))

not_run: if (WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/General/popup stopping meet now'), 
    0)) {
    WebUI.click(findTestObject('Demo Workflows/Session functionality/General/confirm start new meet now session popup'))
}

WebUI.delay(10)

'robot class emulates keyboard presses'
Robot robot = new Robot()

robot.keyPress(KeyEvent.VK_TAB)

robot.keyPress(KeyEvent.VK_TAB)

'for chrome notifications popup'
robot.keyPress(KeyEvent.VK_ENTER)

WebUI.click(findTestObject('Demo Workflows/Session functionality/General/Start Session button'))

WebUI.delay(2)

robot.keyPress(KeyEvent.VK_TAB)

robot.keyPress(KeyEvent.VK_TAB)

'for chrome permissions popup'
robot.keyPress(KeyEvent.VK_ENTER)

WebUI.delay(7)

WebUI.click(findTestObject('Demo Workflows/Session functionality/General/Invite Attendees button'))

WebUI.click(findTestObject('Demo Workflows/Session functionality/General/Get to link invite'))

'gathers invite link'
String inviteLink = WebUI.getText(findTestObject('Demo Workflows/Session functionality/General/Gather link'))

WebUI.delay(2)

'opens second chrome window'
WebDriver driver2 = new ChromeDriver()

DriverFactory.changeWebDriver(driver2)

WebUI.navigateToUrl(inviteLink)

'name input'
WebUI.setText(findTestObject('Demo Workflows/Session functionality/General/Input username'), 'John Doe')

WebUI.click(findTestObject('Demo Workflows/Session functionality/General/Join Session button'))

WebUI.delay(7)

WebUI.refresh()

WebUI.delay(2)

robot.keyPress(KeyEvent.VK_TAB)

robot.keyPress(KeyEvent.VK_TAB)

'for chrome notifications popup'
robot.keyPress(KeyEvent.VK_ENTER)

WebUI.delay(7)

WebUI.click(findTestObject('Demo Workflows/Session functionality/General/Start Session button'))

WebUI.delay(2)

robot.keyPress(KeyEvent.VK_TAB)

robot.keyPress(KeyEvent.VK_TAB)

'for chrome permissions popup'
robot.keyPress(KeyEvent.VK_ENTER)

WebUI.delay(2)

'refresh page'
WebUI.refresh()

WebUI.delay(7)

WebUI.click(findTestObject('Demo Workflows/Session functionality/General/Start Session button'))

'Verify left hand control is present'
WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Advanced Settings'), 
    0)

'Verify left hand control is present'
WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Fullscreen'), 
    0)

'Verify left hand control is present'
WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Layout'), 0)

'Verify left hand control is present'
WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Mute Mic'), 0)

'Verify left hand control is present'
WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Mute Speaker'), 
    0)

'Verify left hand control is present'
WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Mute Video'), 
    0)

'Verify left hand control is present'
WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Share Screen'), 
    0)

'Verify unmute not present'
WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/Video is unmuted'), 0)

'Verify mute present'
WebUI.verifyElementNotPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/Video is muted'), 
    0)

'click mute video'
WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Mute Video'))

'Verify mute not present'
WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/Video is muted'), 0)

'Verify unmute present'
WebUI.verifyElementNotPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/Video is unmuted'), 
    0)

'Verify mute present'
WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/Mic is unmuted'), 0)

'Verify unmute not present'
WebUI.verifyElementNotPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/Mic is muted'), 0)

'click mute'
WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Mute Mic'))

'Verify unmute present'
WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/Mic is muted'), 0)

'Verify mute not present'
WebUI.verifyElementNotPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/Mic is unmuted'), 
    0)

'Verify mute present'
WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/Speaker is unmuted'), 
    0)

'Verify unmute not present'
WebUI.verifyElementNotPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/Speaker is muted'), 
    0)

'click mute'
WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Mute Speaker'))

'Verify unmute present'
WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/Speaker is muted'), 0)

'Verify mute not present'
WebUI.verifyElementNotPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/Speaker is unmuted'), 
    0)

'verify regular screen present'
WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/Fullscreen is small'), 
    0)

'verify full screen not present'
WebUI.verifyElementNotPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/Fullscreen is large'), 
    0)

'click fullscreen'
WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Fullscreen'))

'verify full screen present'
WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/Fullscreen is large'), 
    0)

'verify regular screen not present'
WebUI.verifyElementNotPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/Fullscreen is small'), 
    0)

'click fullscreen'
WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Fullscreen'))

'click end session'
WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_End Session'), FailureHandling.STOP_ON_FAILURE)

