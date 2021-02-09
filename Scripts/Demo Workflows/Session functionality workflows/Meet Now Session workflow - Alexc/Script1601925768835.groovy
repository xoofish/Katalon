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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://test-pp.wecounsel.com/users/sign_in')

WebUI.delay(2)

'autoprovider test acct'
WebUI.setText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_useremail'), 'alexc+autoprovider@visuwell.net')

'Telehealth321'
WebUI.setEncryptedText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_userpassword'), 'LCsxB9VPamtRlQlpiLe+cw==')

WebUI.click(findTestObject('Page_User Login  WeCounsel/button_Log in'))

WebUI.delay(2)

WebUI.click(findTestObject('Demo Workflows/Session functionality/General/Meet Now button'))

'For whatever reason this doesnt work. Failure handling is set to optional because verifyElementPresent returns true or exception handling, not false.'
if (WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/General/confirm start new meet now session popup'), 
    0, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Demo Workflows/Session functionality/General/confirm start new meet now session popup'))
}

WebUI.delay(10)

'robot class emulates keyboard presses'
Robot robot = new Robot()

robot.keyPress(KeyEvent.VK_TAB)

robot.keyPress(KeyEvent.VK_TAB)

'accepts chrome notifications popup'
robot.keyPress(KeyEvent.VK_ENTER)

WebUI.click(findTestObject('Demo Workflows/Session functionality/General/Start Session button'))

WebUI.delay(2)

robot.keyPress(KeyEvent.VK_TAB)

robot.keyPress(KeyEvent.VK_TAB)

'accepts chrome permissions popup'
robot.keyPress(KeyEvent.VK_ENTER)

WebUI.delay(7)

WebUI.click(findTestObject('Demo Workflows/Meet with a provider now/a_Invite Attendees_UPDATED'))

WebUI.click(findTestObject('Demo Workflows/Session functionality/General/Get to link invite'))

'gathers invite link'
String inviteLink = WebUI.getText(findTestObject('Demo Workflows/Session functionality/General/Gather link'))

WebUI.delay(2)

'launches second crhome window'
WebDriver driver2 = new ChromeDriver()

DriverFactory.changeWebDriver(driver2)

'navigates to invite link url'
WebUI.navigateToUrl(inviteLink)

'name input'
WebUI.setText(findTestObject('Demo Workflows/Session functionality/General/Input username'), 'John Doe')

WebUI.click(findTestObject('Demo Workflows/Session functionality/General/Join Session button'))

WebUI.delay(7)

'refresh'
WebUI.refresh()

WebUI.delay(2)

robot.keyPress(KeyEvent.VK_TAB)

not_run: WebUI.delay(2)

robot.keyPress(KeyEvent.VK_TAB)

not_run: WebUI.delay(2)

'accept chrome notifications popup'
robot.keyPress(KeyEvent.VK_ENTER)

WebUI.delay(7)

WebUI.click(findTestObject('Demo Workflows/Session functionality/General/Start Session button'))

WebUI.delay(2)

robot.keyPress(KeyEvent.VK_TAB)

not_run: WebUI.delay(2)

robot.keyPress(KeyEvent.VK_TAB)

not_run: WebUI.delay(2)

'accept chrome permissions popup'
robot.keyPress(KeyEvent.VK_ENTER)

WebUI.delay(2)

'refresh'
WebUI.refresh()

WebUI.delay(7)

WebUI.click(findTestObject('Demo Workflows/Session functionality/General/Start Session button'))

'Verify all left hand controls are present'
WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Advanced Settings'), 
    0)

WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Fullscreen'), 
    0)

WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Layout'), 0)

WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Mute Mic'), 0)

WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Mute Speaker'), 
    0)

WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Mute Video'), 
    0)

WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_Share Screen'), 
    0)

WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Left Hand Controls/button_End Session'), FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

