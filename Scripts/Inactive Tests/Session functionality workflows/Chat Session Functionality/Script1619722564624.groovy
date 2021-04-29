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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.Alert as Alert
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent

System.setProperty('webdriver.chrome.driver', 'C:\\Users\\hawki\\Documents\\2Visuwell\\Katalon_Studio_Windows_64-7.4.0\\configuration\\resources\\drivers\\chromedriver_win32\\chromedriver.exe')

'opens first chrome window'
WebDriver driver1 = new ChromeDriver()

DriverFactory.changeWebDriver(driver1)

WebUI.navigateToUrl('https://test-pp.wecounsel.com/users/sign_in')

WebUI.delay(2)

'autoprovider test acct'
WebUI.setText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_useremail'), 'nickbiz060+AutoProvider@gmail.com')

'Password123'
WebUI.setEncryptedText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_userpassword'), 'p4y+y39Ir5PJb2ispxT0Ew==')

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

WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Chat Functionality/Chat button'))

WebUI.delay(5)

not_run: WebUI.waitForElementPresent(findTestObject('Demo Workflows/Session functionality/Chat Functionality/Type message in chat'), 
    20)

if (!(WebUI.waitForElementPresent(findTestObject('Demo Workflows/Session functionality/Chat Functionality/Type message in chat'), 
    20))) {
    WebUI.refresh()

    WebUI.delay(7)
}

WebUI.sendKeys(findTestObject('Demo Workflows/Session functionality/Chat Functionality/Type message in chat'), 'Test Test')

WebUI.sendKeys(findTestObject('Demo Workflows/Session functionality/Chat Functionality/Type message in chat'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Demo Workflows/Session functionality/General/Invite Attendees button'))

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

robot.keyPress(KeyEvent.VK_TAB)

'accept chrome notifications popup'
robot.keyPress(KeyEvent.VK_ENTER)

WebUI.delay(7)

WebUI.click(findTestObject('Demo Workflows/Session functionality/General/Start Session button'))

WebUI.delay(2)

robot.keyPress(KeyEvent.VK_TAB)

robot.keyPress(KeyEvent.VK_TAB)

'accept chrome permissions popup'
robot.keyPress(KeyEvent.VK_ENTER)

WebUI.delay(2)

'refresh'
WebUI.refresh()

WebUI.delay(7)

WebUI.click(findTestObject('Demo Workflows/Session functionality/General/Start Session button'))

not_run: WebUI.delay(7)

not_run: WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Chat Functionality/Chat button'))

not_run: WebUI.delay(5)

not_run: WebUI.waitForElementPresent(findTestObject('Demo Workflows/Session functionality/Chat Functionality/Type message in chat'), 
    20)

not_run: if (!(WebUI.waitForElementPresent(findTestObject('Demo Workflows/Session functionality/Chat Functionality/Type message in chat'), 
    20))) {
    WebUI.refresh()

    WebUI.delay(7)
}

not_run: WebUI.refresh()

WebUI.delay(7)

messageCheck = WebUI.getText(findTestObject('Demo Workflows/Session functionality/Chat Functionality/message check'))

if (messageCheck.contains('Test Test')) {
}

WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Chat Functionality/Type message in chat'))

WebUI.sendKeys(findTestObject('Demo Workflows/Session functionality/Chat Functionality/Type message in chat'), 'Test Test')

WebUI.sendKeys(findTestObject('Demo Workflows/Session functionality/Chat Functionality/Type message in chat'), Keys.chord(
        Keys.ENTER))

