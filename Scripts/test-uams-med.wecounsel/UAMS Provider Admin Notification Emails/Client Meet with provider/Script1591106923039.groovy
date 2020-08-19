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

WebUI.navigateToUrl('https://test-uams-med.wecounsel.com/users/sign_in')

'uams client account'
WebUI.setText(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/UAMS Provider Admin Notification Emails/input_Please Log In_useremail'), 
    'alexuamsqa+uamsclient@gmail.com')

'Password123'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/UAMS Provider Admin Notification Emails/input_Please Log In_userpassword'), 
    'p4y+y39Ir5PJb2ispxT0Ew==')

WebUI.sendKeys(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/UAMS Provider Admin Notification Emails/input_Please Log In_userpassword'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/UAMS Provider Admin Notification Emails/a_Meet With a Provider Now'))

not_run: WebUI.click(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/UAMS Provider Admin Notification Emails/span_Telehealth - (30 min)_faux-selection-i_b5a73a'))

WebUI.click(findTestObject('Page_University of Arkansas for Medical Sciences/UAMS Provider Admin Notification Emails/span_Telehealth - (30 min)_faux-selection-i_b5a73a'))

'Selects Telehealth as session type'
WebUI.click(findTestObject('Page_University of Arkansas for Medical Sciences/UAMS Provider Admin Notification Emails/li_Telehealth - (30 min)'))

WebUI.delay(2)

not_run: WebUI.click(findTestObject('Page_University of Arkansas for Medical Sciences/UAMS Provider Admin Notification Emails/form_Do you have a preference for your cons_c9f0d5'))

'Requests session'
WebUI.click(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/UAMS Provider Admin Notification Emails/button_Request Session'))

'Description for problems the client has'
WebUI.setText(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/UAMS Provider Admin Notification Emails/textarea_Please describe briefly_whatIsReas_4a0495'), 
    'I need help')

Date today = new Date()

String day = today.format('MM/dd/yyyy')

'Set the date to today'
WebUI.setText(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/UAMS Provider Admin Notification Emails/input_When did you start feeling this way_s_e74c35'), 
    day)

WebUI.click(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/UAMS Provider Admin Notification Emails/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/UAMS Provider Admin Notification Emails/label_No'))

'Finishes setup'
WebUI.click(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/UAMS Provider Admin Notification Emails/button_Finish'))

not_run: WebUI.click(findTestObject('Page_University of Arkansas for Medical Sciences/I agree to the Terms and Conditions of UAMS'))

'Finishes setup'
not_run: WebUI.click(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/UAMS Provider Admin Notification Emails/button_Finish'))

'inputs fake address'
WebUI.setText(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/UAMS Provider Admin Notification Emails/input_Enter Current Location_eventcurrent_location'), 
    '123 Fake Street')

'gives consent for session'
WebUI.click(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/UAMS Provider Admin Notification Emails/span_I have read the Informed Consent docum_ab0965'))

WebUI.click(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/UAMS Provider Admin Notification Emails/button_I Agree'))

