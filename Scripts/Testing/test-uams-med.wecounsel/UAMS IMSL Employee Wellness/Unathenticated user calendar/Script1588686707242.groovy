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

WebUI.navigateToUrl('https://test-uams-med.wecounsel.com/organizations/712/public_calendar')

'Navigates to next week'
WebUI.click(findTestObject('Page_University of Arkansas for Medical Sciences/Next Week Arrow'))

'Selects 4:00-5:00 pm'
WebUI.click(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/div_400 - 500'))

'first name\r\n'
WebUI.setText(findTestObject('Page_University of Arkansas for Medical Sciences/input_First name_eventguest_request_first_name'), 
    'john')

'last name'
WebUI.setText(findTestObject('Page_University of Arkansas for Medical Sciences/input_Last name_eventguest_request_last_name'), 
    'doe')

'email set to alexuamsqa+DELETE(timestamp)@gmail.com'
String GuestEmail = ('alexuamsqa+DELETE' + System.nanoTime()) + '@gmail.com'

WebUI.setText(findTestObject('Page_University of Arkansas for Medical Sciences/input_Your email (Must be a valid email add_2ad710'), 
    GuestEmail)

'Phone number set'
WebUI.setText(findTestObject('Page_University of Arkansas for Medical Sciences/input_Return phone number_eventguest_reques_ea5905'), 
    '(123) 123-1234')

WebUI.click(findTestObject('Page_University of Arkansas for Medical Sciences/span_No'))

'Gender preference male\r\n'
WebUI.click(findTestObject('Page_University of Arkansas for Medical Sciences/Select Male'))

WebUI.click(findTestObject('Page_University of Arkansas for Medical Sciences/span_Well Well Well - (60 min)_faux-selecti_e8220b'))

'Well Well Well service type\r\n'
WebUI.click(findTestObject('Page_University of Arkansas for Medical Sciences/li_Well Well Well - (60 min)'))

WebUI.click(findTestObject('Page_University of Arkansas for Medical Sciences/span_Confirm state'))

'State set to tennessee'
WebUI.click(findTestObject('Page_University of Arkansas for Medical Sciences/Tennessee Option'))

'Agree to T&S'
WebUI.check(findTestObject('Page_University of Arkansas for Medical Sciences/I agree to the Terms and Conditions of UAMS'))

WebUI.click(findTestObject('Page_University of Arkansas for Medical Sciences/button_Request Session'))

