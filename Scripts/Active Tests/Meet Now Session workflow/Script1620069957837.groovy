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
import java.awt.event.InputEvent as InputEvent
import java.awt.event.KeyEvent as KeyEvent
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

/*ChromeDriver openChromeBrowserPlain() {
	WebUI.openBrowser('')
}

ChromeDriver openChromeBrowserInIncognitoMode() {
	ChromeOptions options = new ChromeOptions()
	options.addArguments("–incognito")
	WebUI.openBrowser('')
}

// open normal Chrome browser
WebDriver normalChrome = openChromeBrowserPlain()
WebUI.navigateToUrl('https://test-pp.wecounsel.com/users/sign_in')
*/
WebUI.openBrowser('https://test-visuwell.wecounsel.com/users/sign_in')

WebUI.maximizeWindow()

WebUI.enableSmartWait()

'autoprovider test acct'
WebUI.setText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_useremail'), 'visuwellautomation+provider@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_userpassword'), 'n/qdZPZskVxU+Rv/aUDKXw==')

WebUI.click(findTestObject('Page_User Login  WeCounsel/button_Log in'))

WebUI.click(findTestObject('Demo Workflows/Session functionality/General/Meet Now button'))

'For whatever reason this doesnt work. Failure handling is set to optional because verifyElementPresent returns true or exception handling, not false.'
if (WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/General/confirm start new meet now session popup'), 
    0, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Demo Workflows/Session functionality/General/confirm start new meet now session popup'))
}

'robot class emulates keyboard presses'
Robot robot = new Robot()

WebUI.delay(2)

robot.mouseMove(905, 200)

robot.mousePress(InputEvent.BUTTON1_MASK)

robot.mouseRelease(InputEvent.BUTTON1_MASK)

if (WebUI.verifyAlertPresent(3, FailureHandling.OPTIONAL) == true) {
    Alert.accept()
}

not_run: robot.keyPress(KeyEvent.VK_TAB)

not_run: robot.keyPress(KeyEvent.VK_TAB)

'accepts chrome notifications popup'
not_run: robot.keyPress(KeyEvent.VK_ENTER)

WebUI.waitForElementClickable(findTestObject('Demo Workflows/Session functionality/General/Start Session button'), 5)

WebUI.click(findTestObject('Demo Workflows/Session functionality/General/Start Session button'))

WebUI.delay(2)

robot.mouseMove(480, 270)

robot.mousePress(InputEvent.BUTTON1_MASK)

robot.mouseRelease(InputEvent.BUTTON1_MASK)

robot.mousePress(InputEvent.BUTTON1_MASK)

robot.mouseRelease(InputEvent.BUTTON1_MASK)

WebUI.delay(2)

if (WebUI.verifyAlertPresent(3, FailureHandling.OPTIONAL) == true) {
    Alert.accept()
}

not_run: robot.keyPress(KeyEvent.VK_TAB)

not_run: robot.keyPress(KeyEvent.VK_TAB)

'accepts chrome permissions popup'
not_run: robot.keyPress(KeyEvent.VK_ENTER)

WebUI.delay(1)

'Verify left hand control is present'
WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Advanced Settings'), 
    5)

'Verify left hand control is present'
WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Fullscreen'), 
    1)

'Verify left hand control is present'
not_run: WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Layout'), 
    1)

'Verify left hand control is present'
WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Mute Mic'), 1)

'Verify left hand control is present'
WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Mute Speaker'), 
    1)

'Verify left hand control is present'
WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Mute Video'), 
    1)

'Verify left hand control is present'
WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Share Screen'), 
    1)

'Verify mute present'
WebUI.verifyElementNotPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/Video is muted'), 
    1)

'click mute video'
WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Mute Video'))

WebUI.delay(2)

'Verify mute not present'
WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/Video is muted'), 1)

'click mute video'
WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Mute Video'))

'Verify mute present'
WebUI.verifyElementNotPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/Video is muted'), 
    1)

'click mute'
WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Mute Mic'))

WebUI.delay(2)

'Verify unmute present'
WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/Video is muted'), 1)

'click mute'
WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Mute Mic'))

'Verify mute present'
WebUI.verifyElementNotPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/Video is muted'), 
    1)

'click mute'
WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Mute Speaker'))

WebUI.delay(2)

'verify full screen not present'
WebUI.verifyElementNotPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/Fullscreen is large'), 
    1)

'click fullscreen'
WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Fullscreen'))

WebUI.delay(2)

'verify full screen present'
WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/Fullscreen is large'), 
    1)

'click fullscreen'
WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Fullscreen'))

'click end session'
WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_End Session'), FailureHandling.STOP_ON_FAILURE)

//WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_End Session'), FailureHandling.STOP_ON_FAILURE)
not_run: WebUI.click(findTestObject('Demo Workflows/Meet with a provider now/a_Invite Attendees_UPDATED'))

not_run: WebUI.click(findTestObject('Demo Workflows/Session functionality/General/Get to link invite'))

not_run: String inviteLink = WebUI.getText(findTestObject('Demo Workflows/Session functionality/General/Gather link'))

not_run: robot.keyPress(KeyEvent.VK_CONTROL)

not_run: robot.keyPress(KeyEvent.VK_C)

not_run: robot.keyRelease(KeyEvent.VK_CONTROL)

not_run: robot.keyPress(KeyEvent.VK_ESCAPE)

not_run: WebUI.delay(2)

not_run: WebUI.switchToWindowIndex(0)

/*
// open incognito Chrome browser
WebDriver incognitoChrome = openChromeBrowserInIncognitoMode()
*/
not_run: robot.keyPress(KeyEvent.VK_SHIFT)

not_run: robot.keyPress(KeyEvent.VK_CONTROL)

not_run: robot.keyPress(KeyEvent.VK_N)

not_run: robot.keyPress(KeyEvent.VK_N)

not_run: robot.keyPress(KeyEvent.VK_N)

not_run: robot.keyPress(KeyEvent.VK_N)

not_run: robot.keyRelease(KeyEvent.VK_SHIFT)

not_run: robot.keyRelease(KeyEvent.VK_CONTROL)

//WebUI.navigateToUrl(inviteLink)
not_run: WebUI.delay(2)

not_run: robot.keyPress(KeyEvent.VK_CONTROL)

not_run: robot.keyPress(KeyEvent.VK_V)

not_run: robot.keyRelease(KeyEvent.VK_CONTROL)

not_run: robot.keyPress(KeyEvent.VK_ENTER)

not_run: WebUI.delay(2)

//WebUI.switchToWindowUrl(inviteLink)
//robot.mousePress(InputEvent.BUTTON1_MASK)
//robot.mouseRelease(InputEvent.BUTTON1_MASK)
not_run: robot.keyPress(KeyEvent.VK_TAB)

not_run: robot.keyPress(KeyEvent.VK_TAB)

not_run: robot.keyPress(KeyEvent.VK_TAB)

not_run: robot.keyPress(KeyEvent.VK_TAB)

not_run: robot.keyPress(KeyEvent.VK_TAB)

not_run: robot.keyPress(KeyEvent.VK_TAB)

not_run: robot.keyPress(KeyEvent.VK_TAB)

not_run: robot.keyPress(KeyEvent.VK_TAB)

not_run: robot.keyPress(KeyEvent.VK_TAB)

not_run: robot.keyPress(KeyEvent.VK_TAB)

//WebUI.setText(findTestObject('Demo Workflows/Session functionality/General/Input username'), 'John Doe')
//selenium.click("id=transient_user_name")
//selenium.type("id=transient_user_name", "John Doe")
//selenium.sendKeys("id=transient_user_name", "${KEY_ENTER}")
'name input'
not_run: WebUI.delay(3)

not_run: robot.keyPress(KeyEvent.VK_SHIFT)

not_run: robot.keyPress(KeyEvent.VK_J)

not_run: robot.keyRelease(KeyEvent.VK_SHIFT)

not_run: robot.keyPress(KeyEvent.VK_O)

not_run: robot.keyPress(KeyEvent.VK_H)

not_run: robot.keyPress(KeyEvent.VK_N)

not_run: robot.keyPress(KeyEvent.VK_SPACE)

not_run: robot.keyPress(KeyEvent.VK_SHIFT)

not_run: robot.keyPress(KeyEvent.VK_D)

not_run: robot.keyRelease(KeyEvent.VK_SHIFT)

not_run: robot.keyPress(KeyEvent.VK_O)

not_run: robot.keyPress(KeyEvent.VK_E)

not_run: WebUI.click(findTestObject('Demo Workflows/Session functionality/General/Join Session button'))

//robot.keyPress(KeyEvent.VK_ENTER)
not_run: robot.mouseMove(950, 675)

not_run: WebUI.delay(2)

not_run: robot.mousePress(InputEvent.BUTTON1_MASK)

not_run: robot.mouseRelease(InputEvent.BUTTON1_MASK)

not_run: robot.keyPress(KeyEvent.VK_TAB)

not_run: robot.keyPress(KeyEvent.VK_TAB)

'accept chrome notifications popup'
not_run: robot.keyPress(KeyEvent.VK_ENTER)

not_run: WebUI.delay(1)

not_run: WebUI.waitForElementClickable(findTestObject('Demo Workflows/Session functionality/General/Start Session button'), 
    5)

not_run: WebUI.click(findTestObject('Demo Workflows/Session functionality/General/Start Session button'))

not_run: robot.mouseMove(1200, 900)

not_run: robot.mousePress(InputEvent.BUTTON1_MASK)

not_run: robot.mouseRelease(InputEvent.BUTTON1_MASK)

not_run: WebUI.delay(2)

not_run: if (WebUI.verifyAlertPresent(3, FailureHandling.OPTIONAL) == true) {
    Alert.accept()
}

not_run: robot.mousePress(InputEvent.BUTTON1_MASK)

not_run: robot.mouseRelease(InputEvent.BUTTON1_MASK)

not_run: WebUI.click(findTestObject('Demo Workflows/Session functionality/General/Start Session button'))

'Verify all left hand controls are present'
not_run: WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Advanced Settings'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Fullscreen'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Layout'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Mute Mic'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Mute Speaker'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Mute Video'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Share Screen'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_End Session'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.closeBrowser()

