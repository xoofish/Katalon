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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

System.setProperty('webdriver.chrome.driver', 'C:\\Program Files (x86)\\Katalon_Studio_Windows_64-7.6.2\\configuration\\resources\\drivers\\chromedriver_win32\\chromedriver.exe')

WebDriver driver1 = new ChromeDriver()

'opens first chrome window'
DriverFactory.changeWebDriver(driver1)

WebUI.navigateToUrl('https://test-uams-med.wecounsel.com/users/sign_in')

'UAMS client acct'
WebUI.setText(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/UAMS Provider Admin Notification Emails/input_Please Log In_useremail'), 
    'nickbiz060+uamsclient@gmail.com')

'Telehealth321'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/UAMS Provider Admin Notification Emails/input_Please Log In_userpassword'), 
    'LCsxB9VPamtRlQlpiLe+cw==')

WebUI.sendKeys(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/UAMS Provider Admin Notification Emails/input_Please Log In_userpassword'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(2)

'clicks meet with a provider now'
WebUI.click(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/UAMS Provider Admin Notification Emails/a_Meet With a Provider Now'))

not_run: WebUI.click(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/UAMS Provider Admin Notification Emails/span_Telehealth - (30 min)_faux-selection-i_b5a73a'))

WebUI.click(findTestObject('Page_University of Arkansas for Medical Sciences/UAMS Provider Admin Notification Emails/span_Telehealth - (30 min)_faux-selection-i_b5a73a'))

'selects telehealth session type'
WebUI.click(findTestObject('Page_University of Arkansas for Medical Sciences/UAMS Provider Admin Notification Emails/li_Telehealth - (30 min)'))

'requests session'
WebUI.click(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/UAMS Provider Admin Notification Emails/button_Request Session'))

WebUI.delay(2)

'input for issues client is having'
WebUI.setText(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/UAMS Provider Admin Notification Emails/textarea_Please describe briefly_whatIsReas_4a0495'), 
    'I need help')

Date today = new Date()

String day = today.format('MM/dd/yyyy')

'sets when were you having issues to todays date'
WebUI.setText(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/UAMS Provider Admin Notification Emails/input_When did you start feeling this way_s_e74c35'), 
    day)

WebUI.click(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/UAMS Provider Admin Notification Emails/button_Next'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/UAMS Provider Admin Notification Emails/label_No'))

WebUI.click(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/UAMS Provider Admin Notification Emails/button_Finish'))

WebUI.delay(2)

'inputs fale address'
WebUI.setText(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/UAMS Provider Admin Notification Emails/input_Enter Current Location_eventcurrent_location'), 
    '123 Fake Street')

WebUI.click(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/UAMS Provider Admin Notification Emails/span_I have read the Informed Consent docum_ab0965'))

'consents to session'
WebUI.click(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/UAMS Provider Admin Notification Emails/button_I Agree'))

WebUI.delay(2)

WebDriver driver2 = new ChromeDriver()

'opens second chrome window'
DriverFactory.changeWebDriver(driver2)

WebUI.navigateToUrl('https://test-uams-med.wecounsel.com/users/sign_in')

'uams provider acct'
WebUI.setText(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/UAMS Provider Admin Notification Emails/input_Please Log In_useremail'), 
    'nickbiz060+uamsprovider@gmail.com')

'Telehealth321'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/UAMS Provider Admin Notification Emails/input_Please Log In_userpassword'), 
    'LCsxB9VPamtRlQlpiLe+cw==')

WebUI.sendKeys(findTestObject('Object Repository/Page_University of Arkansas for Medical Sciences/UAMS Provider Admin Notification Emails/input_Please Log In_userpassword'), 
    Keys.chord(Keys.ENTER))

'navigates to on demand requests'
WebUI.click(findTestObject('Demo Workflows/Meet with a provider now/span_On-Demand Requests'))

'checks to see if time says "NOW"'
String now = WebUI.getText(findTestObject('Demo Workflows/Meet with a provider now/Checker time NOW'))

if (now.contains('NOW')) {
} else {
    KeywordUtil.markFailedAndStop()
}

String name = WebUI.getText(findTestObject('Demo Workflows/Meet with a provider now/Checker name UAMS - Client Test'))

'checks to see if name is uams client'
if (name.contains('UAMS - Client Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

String phone = WebUI.getText(findTestObject('Demo Workflows/Meet with a provider now/Checker phone (123) 123-1234'))

'checks phone number associated with uams client'
if (phone.contains('(123) 123-1234')) {
} else {
    KeywordUtil.markFailedAndStop()
}

String type = WebUI.getText(findTestObject('Demo Workflows/Meet with a provider now/Checker type Telehealth'))

'checks session type'
if (type.contains('Telehealth')) {
} else {
    KeywordUtil.markFailedAndStop()
}

String subscription = WebUI.getText(findTestObject('Demo Workflows/Meet with a provider now/checker subscriptionUniversity of Arkansas for Medical Sciences - UAMS'))

'checks university subscription plan'
if (subscription.contains('UAMS - UAMS')) {
} else {
    KeywordUtil.markFailedAndStop()
}

String description = WebUI.getText(findTestObject('Demo Workflows/Meet with a provider now/Checker description I need help'))

'checks description'
if (description.contains('I need help')) {
} else {
    KeywordUtil.markFailedAndStop()
}

WebUI.click(findTestObject('Demo Workflows/Meet with a provider now/Claim session button'))

'claims session'
not_run: WebUI.click(findTestObject('Demo Workflows/Meet with a provider now/I Agree to claim'))

WebUI.click(findTestObject('Demo Workflows/Meet with a provider now/Start Session button'))

