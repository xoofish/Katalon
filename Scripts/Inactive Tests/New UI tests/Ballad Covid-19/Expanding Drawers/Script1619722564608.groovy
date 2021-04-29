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
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test-balladhealth.wecounsel.com/users/sign_in')

'logs in with BalladProvider'
WebUI.setText(findTestObject('Object Repository/New UI testing/input_Please Log In_useremail'), 'nickbiz060+balladprovider@gmail.com')

'Password123'
WebUI.setEncryptedText(findTestObject('Object Repository/New UI testing/input_Please Log In_userpassword'), 'p4y+y39Ir5PJb2ispxT0Ew==')

WebUI.click(findTestObject('Object Repository/New UI testing/button_Log in'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('New UI testing/hover Schedule'))

'clicks session in schedule dropdown'
WebUI.click(findTestObject('New UI testing/Session in schedule'))

WebUI.delay(2)

'removes user (no user currently associated with balladprovider)'
WebUI.click(findTestObject('New UI testing/remove user'))

WebUI.click(findTestObject('New UI testing/add another guest'))

WebUI.click(findTestObject('New UI testing/input_Email_guest'))

WebUI.setText(findTestObject('New UI testing/input_Email_guest'), ('nickbiz060+DELETE' + System.nanoTime()) + '@gmail.com')

WebUI.click(findTestObject('New UI testing/input_First Name_guest'))

WebUI.setText(findTestObject('New UI testing/input_First Name_guest'), 'Delete')

WebUI.click(findTestObject('New UI testing/input_Last Name_guest'))

'creates a guest '
WebUI.setText(findTestObject('New UI testing/input_Last Name_guest'), 'Me')

WebUI.click(findTestObject('New UI testing/Next 1'))

WebUI.delay(2)

WebUI.click(findTestObject('New UI testing/Next2'))

WebUI.delay(2)

'selects location as determine by attendees'
WebUI.selectOptionByIndex(findTestObject('New UI testing/location dropdown'), 0)

WebUI.click(findTestObject('New UI testing/Next2'))

WebUI.delay(2)

'finishes'
WebUI.click(findTestObject('New UI testing/Finish button'))

WebUI.delay(10)

WebUI.click(findTestObject('New UI testing/Filter button'))

WebUI.delay(2)

not_run: WebUI.click(findTestObject('New UI testing/Delete Me filter'))

'filters by confirmed sessions'
WebUI.click(findTestObject('New UI testing/Confirmed filter'))

WebUI.click(findTestObject('New UI testing/button_Apply'))

WebUI.delay(2)

'clicks check in'
WebUI.click(findTestObject('New UI testing/Check In'))

WebUI.click(findTestObject('New UI testing/a_OK'))

not_run: WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Demo Workflows/Session functionality/General/Start Session button'), 70)

WebUI.click(findTestObject('Demo Workflows/Session functionality/General/Start Session button'))

WebUI.delay(2)

'robot class emulates keyboard presses'
Robot robot = new Robot()

robot.keyPress(KeyEvent.VK_TAB)

robot.keyPress(KeyEvent.VK_TAB)

'accepts chrome notifications popup'
robot.keyPress(KeyEvent.VK_ENTER)

WebUI.delay(10)

'closes left drawer'
WebUI.enhancedClick(findTestObject('Object Repository/New UI testing/a_Set Session Status_toggle'))

WebUI.delay(2)

'element never actually disappears when drawer is minimized'
not_run: WebUI.verifyElementNotPresent(findTestObject('New UI testing/button_Mute Mic'), 0)

'opens left drawer'
WebUI.enhancedClick(findTestObject('Object Repository/New UI testing/a_Set Session Status_toggle'))

WebUI.delay(2)

'checks to see if mute mic button is visible'
WebUI.verifyElementPresent(findTestObject('New UI testing/button_Mute Mic'), 0)

'opens bottom video drawer'
WebUI.enhancedClick(findTestObject('Object Repository/New UI testing/a_Advanced Settings_toggle'))

WebUI.delay(2)

'checks to see if video is visible'
WebUI.verifyElementPresent(findTestObject('New UI testing/Current participant mini screen'), 0)

'closes bottom video drawer'
WebUI.enhancedClick(findTestObject('Object Repository/New UI testing/a_Advanced Settings_toggle'))

not_run: WebUI.delay(2)

'element never actually disappears when drawer is minimized'
not_run: WebUI.verifyElementNotPresent(findTestObject('New UI testing/Current participant mini screen'), 0)

