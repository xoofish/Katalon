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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://test-uams.wecounsel.com/users/sign_in')

WebUI.delay(2)

'uams provider test account'
WebUI.setText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_useremail'), 'alexc+uamsprovider@visuwell.net')

'Telehealth321'
WebUI.setEncryptedText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_userpassword'), 'LCsxB9VPamtRlQlpiLe+cw==')

WebUI.click(findTestObject('Page_User Login  WeCounsel/button_Log in'))

WebUI.delay(2)

'navigates to manage schedule'
WebUI.click(findTestObject('Demo Workflows/Session functionality/Verify pre-session agreement/a_Manage Schedule'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Demo Workflows/Session functionality/Verify pre-session agreement/span_Schedule'))

'clicks session under schedule'
WebUI.click(findTestObject('Demo Workflows/Session functionality/Verify pre-session agreement/a_Session'))

WebUI.delay(5)

WebUI.click(findTestObject('Demo Workflows/Session functionality/Verify pre-session agreement/button_Next'))

WebUI.delay(2)

WebUI.click(findTestObject('Demo Workflows/Session functionality/Verify pre-session agreement/div_Type to search'))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Demo Workflows/Session functionality/Verify pre-session agreement/type user input'), 'UAMS Client Test')

'searches for UAMS Client Test'
WebUI.sendKeys(findTestObject('Demo Workflows/Session functionality/Verify pre-session agreement/type user input'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/TMP - Next button'))

WebUI.delay(2)

WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/TMP - Next button'))

WebUI.delay(1)

'Selects location'
WebUI.selectOptionByIndex(findTestObject('Demo Workflows/Session functionality/Verify pre-session agreement/select_Determine location from attendeesUAMS'), 
    0)

WebUI.delay(1)

'Selects service type'
WebUI.selectOptionByIndex(findTestObject('Demo Workflows/Session functionality/Verify pre-session agreement/select_TelehealthTelehealthZERO'), 
    0)

WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/TMP - Next button'))

WebUI.delay(2)

'Clicks finish'
WebUI.click(findTestObject('Demo Workflows/Session functionality/Verify pre-session agreement/button_Finish'))

WebUI.delay(10)

'Navigates to session list'
WebUI.click(findTestObject('Demo Workflows/Session functionality/Verify pre-session agreement/a_Session List'))

WebUI.delay(2)

'Navigates to upcoming sessions'
WebUI.click(findTestObject('Demo Workflows/Session functionality/Verify pre-session agreement/span_Upcoming Sessions'))

WebUI.delay(2)

'opens filter dropdown'
WebUI.click(findTestObject('Demo Workflows/Session functionality/Verify pre-session agreement/legend_Filter'))

WebUI.delay(2)

'filters by confirmed'
WebUI.click(findTestObject('Demo Workflows/Session functionality/Verify pre-session agreement/option_Confirmed'))

WebUI.click(findTestObject('Demo Workflows/Session functionality/Verify pre-session agreement/Apply filters button'))

WebUI.delay(5)

clientTest = WebUI.getText(findTestObject('Page_University of Arkansas for Medical Sciences/a_UAMS Client Test'))

'checks client'
if (clientTest.contains('UAMS Client Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

providerTest = WebUI.getText(findTestObject('Page_University of Arkansas for Medical Sciences/a_UAMS Provider Test'))

'checks provider'
if (providerTest.contains('UAMS Provider Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

not_run: Telehealth = WebUI.getText(findTestObject('Demo Workflows/Session functionality/Verify pre-session agreement/a_Telehealth'))

'checks telehealth'
not_run: if (Telehealth.contains('Telehealth')) {
} else {
    not_run: KeywordUtil.markFailedAndStop()
}

not_run: Confirmed = WebUI.getText(findTestObject('Demo Workflows/Session functionality/Verify pre-session agreement/a_Confirmed'))

'checks confirmed'
not_run: if (Confirmed.contains('Confirmed')) {
} else {
    not_run: KeywordUtil.markFailedAndStop()
}

'checks video session'
WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Verify pre-session agreement/i_NA_fa fa-video-camera fa-fw'), 
    0)

'clicks check in'
WebUI.click(findTestObject('Demo Workflows/Session functionality/Verify pre-session agreement/a_Check In'))

WebUI.delay(1)

WebUI.click(findTestObject('Demo Workflows/Session functionality/Verify pre-session agreement/a_OK'))

WebUI.delay(10)

'Robot emulates keyboard presses'
Robot robot = new Robot()

not_run: robot.keyPress(KeyEvent.VK_TAB)

not_run: robot.keyPress(KeyEvent.VK_TAB)

'accepts chrome notifications popup'
not_run: robot.keyPress(KeyEvent.VK_ENTER)

WebUI.click(findTestObject('Demo Workflows/Session functionality/General/Start Session button'))

WebUI.delay(2)

robot.keyPress(KeyEvent.VK_TAB)

robot.keyPress(KeyEvent.VK_TAB)

'accepts chrome permissions popup'
robot.keyPress(KeyEvent.VK_ENTER)

WebUI.delay(2)

'opens second chrome window'
WebDriver driver2 = new ChromeDriver()

DriverFactory.changeWebDriver(driver2)

'url is set to invite link'
WebUI.navigateToUrl('https:/test-uams.wecounsel.com/users/sign_in')

WebUI.delay(2)

'logs into uams client test'
WebUI.setText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_useremail'), 'alexc+uamsclient@visuwell.net')

'Telehealth321'
WebUI.setEncryptedText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_userpassword'), 'LCsxB9VPamtRlQlpiLe+cw==')

WebUI.click(findTestObject('Page_User Login  WeCounsel/button_Log in'))

WebUI.delay(2)

'opens filter dropdown'
WebUI.click(findTestObject('Demo Workflows/Session functionality/Verify pre-session agreement/1Client portion/legend_Filter'))

WebUI.delay(1)

'filters by confirmed'
WebUI.click(findTestObject('Demo Workflows/Session functionality/Verify pre-session agreement/1Client portion/option_Confirmed'))

WebUI.click(findTestObject('Demo Workflows/Session functionality/Verify pre-session agreement/1Client portion/button_Apply'))

WebUI.delay(1)

providercheck = WebUI.getText(findTestObject('Page_University of Arkansas for Medical Sciences/a_UAMS Provider Test'))

'checks provider'
if (providercheck.contains('UAMS Provider Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

'checks in'
WebUI.click(findTestObject('Demo Workflows/Session functionality/Verify pre-session agreement/1Client portion/a_Check In'))

WebUI.click(findTestObject('Demo Workflows/Session functionality/Verify pre-session agreement/1Client portion/a_OK'))

WebUI.delay(2)

WebUI.click(findTestObject('Demo Workflows/Session functionality/Verify pre-session agreement/1Client portion/input_Enter Current Location_eventcurrent_location'))

'enters fake address'
WebUI.setText(findTestObject('Demo Workflows/Session functionality/Verify pre-session agreement/1Client portion/input_Enter Current Location_eventcurrent_location'), 
    '123 Fake street')

'toggles consent box'
WebUI.click(findTestObject('Demo Workflows/Session functionality/Verify pre-session agreement/1Client portion/Toggle i consent'))

'clicks i agree'
WebUI.click(findTestObject('Demo Workflows/Session functionality/Verify pre-session agreement/1Client portion/button_I Agree'))

WebUI.delay(10)

'verifies start session button is present'
WebUI.verifyElementPresent(findTestObject('Demo Workflows/Session functionality/Verify pre-session agreement/1Client portion/button_Start Session'), 
    0)

