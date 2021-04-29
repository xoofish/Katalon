import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
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
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
//import org.openqa.selenium.Alert as Alert
//import org.openqa.selenium.WebDriver as WebDriver
//import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
//import java.awt.AWTException as AWTException
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent

//import org.openqa.selenium.By as By
//WebDriver driver = DriverFactory.getWebDriver()
WebUI.openBrowser('')

WebUI.navigateToUrl('https://test-pp.wecounsel.com/users/sign_in')

WebUI.setText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_useremail'), 'nickbiz060+AutoProvider@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_userpassword'), 'p4y+y39Ir5PJb2ispxT0Ew==')

WebUI.click(findTestObject('Page_User Login  WeCounsel/button_Log in'))

not_run: WebUI.acceptAlert()

WebUI.click(findTestObject('Demo Workflows/Session functionality/General/Meet Now button'))

if (WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/General/popup stopping meet now'), 
    0)) {
    WebUI.click(findTestObject('Demo Workflows/Session functionality/General/confirm start new meet now session popup'))
}

WebUI.delay(10)

Robot robot = new Robot()

robot.keyPress(KeyEvent.VK_TAB)

robot.keyPress(KeyEvent.VK_TAB)

robot.keyPress(KeyEvent.VK_ENTER)

not_run: WebUI.click(findTestObject('Demo Workflows/Session functionality/General/Start Session button'))

WebUI.delay(10)

not_run: WebUI.switchToWindowTitle('test-pp.wecounsel.com wants to')

not_run: WebUI.switchToWindowIndex(1)

not_run: WebUI.waitForAlert(5)

not_run: WebUI.getAlertText()

// Creates the delay of 5 sec so that you can open notepad before
// Robot start writting
//robot.delay(5000)
robot.keyPress(KeyEvent.VK_TAB)

robot.keyPress(KeyEvent.VK_TAB)

robot.keyPress(KeyEvent.VK_ENTER)

//WebUI.acceptAlert()
WebUI.delay(1)

