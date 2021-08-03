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
WebUI.openBrowser('http://portal.visuwell.io')

WebUI.maximizeWindow()

WebUI.enableSmartWait()

WebUI.setText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_useremail'), 'pexiptestautomation@demo.com')

WebUI.setEncryptedText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_userpassword'), 'Q2agodYdgkwyaooFOl+Qyw==')

WebUI.click(findTestObject('Page_User Login  WeCounsel/button_Log in'))

WebUI.click(findTestObject('Demo Workflows/Session functionality/General/Meet Now button'))

'For whatever reason this doesnt work. Failure handling is set to optional because verifyElementPresent returns true or exception handling, not false.'
if (WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/General/confirm start new meet now session popup'), 
    0, FailureHandling.OPTIONAL)) {
    not_run: WebUI.click(findTestObject('Demo Workflows/Session functionality/General/confirm start new meet now session popup'))
}

'robot class emulates keyboard presses'
Robot robot = new Robot()

WebUI.delay(2)

robot.mouseMove(0, 0)

robot.mouseMove(350, 150)

robot.mousePress(InputEvent.BUTTON1_MASK)

robot.mouseRelease(InputEvent.BUTTON1_MASK)

if (WebUI.verifyAlertPresent(3, FailureHandling.OPTIONAL) == true) {
    Alert.accept()
}

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
}

WebUI.waitForElementClickable(findTestObject('Prod_EndSession'), 10)

WebUI.verifyElementClickable(findTestObject('Prod_EndSession'))

WebUI.click(findTestObject('Prod_EndSession'))

WebUI.click(findTestObject('Prod_Home'))

WebUI.click(findTestObject('Prod_Cancel'))

WebUI.click(findTestObject('Prod_CancelConfirm'))

WebUI.delay(5)

WebUI.verifyElementNotPresent(findTestObject('Prod_Cancel'), 5)

