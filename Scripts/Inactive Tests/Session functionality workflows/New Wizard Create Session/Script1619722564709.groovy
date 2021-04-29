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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test-pp.wecounsel.com/users/sign_in')

WebUI.setText(findTestObject('Object Repository/Demo Workflows/Session functionality/Session schedule and checkin/input_Please Log In_useremail'), 
    'nickbiz060+autoprovider@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Demo Workflows/Session functionality/Session schedule and checkin/input_Please Log In_userpassword'), 
    'LCsxB9VPamtRlQlpiLe+cw==')

WebUI.click(findTestObject('Object Repository/Demo Workflows/Session functionality/Session schedule and checkin/button_Log in'))

WebUI.click(findTestObject('Object Repository/Demo Workflows/Session functionality/Session schedule and checkin/a_Session'))

WebUI.click(findTestObject('Object Repository/Demo Workflows/Session functionality/Session schedule and checkin/button_Next'))

WebUI.setText(findTestObject('Object Repository/Demo Workflows/Session functionality/Session schedule and checkin/input_Me_scheduler-search-field (1)'), 
    'autoclient test')

WebUI.click(findTestObject('Object Repository/Demo Workflows/Session functionality/Session schedule and checkin/span_AutoClient Test'))

WebUI.click(findTestObject('Object Repository/Demo Workflows/Session functionality/Session schedule and checkin/button_Next'))

