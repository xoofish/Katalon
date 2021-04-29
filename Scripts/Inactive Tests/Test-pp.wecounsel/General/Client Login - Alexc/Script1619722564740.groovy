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

WebUI.openBrowser('https://test-pp.wecounsel.com/users/sign_in')

WebUI.maximizeWindow()

'Email used for all wecounsel client testing\r\n'
WebUI.setText(findTestObject('Object Repository/Page_User Login  WeCounsel/input_Please Log In_useremail'), 'alexc+autoclient@visuwell.net')

'Telehealth321'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_User Login  WeCounsel/input_Please Log In_userpassword'), 
    'LCsxB9VPamtRlQlpiLe+cw==')

WebUI.click(findTestObject('Object Repository/Page_User Login  WeCounsel/button_Log in'))

