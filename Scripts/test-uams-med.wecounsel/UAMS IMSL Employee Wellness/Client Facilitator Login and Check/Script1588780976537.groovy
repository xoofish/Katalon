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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.click(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/a_Log in'))

'Logs into uams clinical facilitator'
WebUI.setText(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/input_Please Log In_useremail'), 
    'alexuamsqa+UAMSclinicalfacilitator@gmail.com')

'Password123'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/input_Please Log In_userpassword'), 
    'p4y+y39Ir5PJb2ispxT0Ew==')

WebUI.click(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/button_Log in'))

'Navigates to session list'
WebUI.click(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/a_Sessions List 16'))

'pre-scheduled requests'
WebUI.click(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/span_Pre-Scheduled Requests'))

def text = WebUI.getText(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/Patient Value'))

'Checks gathered text of patient name against expected'
if (text.contains('john doe')) {
} else {
    KeywordUtil.markFailedAndStop()
}

WebUI.click(findTestObject('Page_University of Arkansas for Medical Sciences/a_Assign'))

def text1 = WebUI.getText(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/Double Check John Doe'))

'Checks gathered text of patient name against expected'
if (text1.contains('john doe')) {
} else {
    KeywordUtil.markFailedAndStop()
}

not_run: WebUI.click(findTestObject('Page_University of Arkansas for Medical Sciences/Select Provider Span'))

WebUI.click(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/span_Select Provider'))

'Assigns session to self'
WebUI.click(findTestObject('Page_University of Arkansas for Medical Sciences/Client Meet Clinical Facilitator Test'))

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/select_Select ProviderDaniel RogersDr Qa Im_1681b7'), 
    '12654', true)

not_run: WebUI.click(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/form_Assign SessionEdit Session Available T_0675ec'))

WebUI.click(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/button_Save'))

not_run: WebUI.click(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/a_Upcoming Sessions'))

not_run: WebUI.click(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/a_Upcoming Sessions'))

