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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test-uams-med.wecounsel.com/users/sign_in')

'uams provider account'
WebUI.setText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_useremail'), 'nickbiz060+uamsProvider@gmail.com')

'Telehealth321'
WebUI.setEncryptedText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_userpassword'), 'LCsxB9VPamtRlQlpiLe+cw==')

WebUI.click(findTestObject('Page_User Login  WeCounsel/button_Log in'))

'Checks to see if demand queue is present'
WebUI.verifyElementPresent(findTestObject('Demo Workflows/Demand Queue/span_On-Demand Requests'), 0)

'Toggles "on-call" off'
WebUI.click(findTestObject('Demo Workflows/Demand Queue/span_On-Call'))

'refreshes web browser'
WebUI.refresh()

'Checks to see if demand queue is NOT present'
WebUI.verifyElementNotPresent(findTestObject('Demo Workflows/Demand Queue/span_On-Demand Requests'), 0)

'Toggles "on-call" on'
WebUI.click(findTestObject('Demo Workflows/Demand Queue/span_On-Call'))

'refreshes web browser'
WebUI.refresh()

'Checks to see if demand queue is present'
WebUI.verifyElementPresent(findTestObject('Demo Workflows/Demand Queue/span_On-Demand Requests'), 0)

