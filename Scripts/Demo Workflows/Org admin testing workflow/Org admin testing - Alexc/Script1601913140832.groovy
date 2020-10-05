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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://test-pp.wecounsel.com/users/sign_in')

WebUI.maximizeWindow()

'autoorg admin test'
WebUI.setText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_useremail'), 'alexc+autoorgadmin@visuwell.net')

'Telehealth321'
WebUI.setEncryptedText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_userpassword'), 'LCsxB9VPamtRlQlpiLe+cw==')

WebUI.click(findTestObject('Page_User Login  WeCounsel/button_Log in'))

'navigates to organization management'
WebUI.click(findTestObject('Demo Workflows/Org admin check/Organization Management button left'))

'view all orgs'
WebUI.click(findTestObject('Demo Workflows/Org admin check/View All Organizations in Organization management'))

'navigates to reports'
WebUI.click(findTestObject('Demo Workflows/Org admin check/Report in orgs WCPP'))

WebUI.click(findTestObject('Demo Workflows/Org admin check/span_All therapists dropdown'))

'Selects autoprovider test as provider'
WebUI.click(findTestObject('Demo Workflows/Org admin check/li_Dr. Auto Provider Test'))

String autoprovider = WebUI.getText(findTestObject('Demo Workflows/Org admin check/a_AutoProvider Test checker'))

'checks if autoprovider test is listed'
if (autoprovider.contains('AutoProvider Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

WebUI.click(findTestObject('Demo Workflows/Org admin check/span_All event statuses dropdown'))

'Selects confirmed sessions filter'
WebUI.click(findTestObject('Demo Workflows/Org admin check/li_Confirmed'))

'checks if autoprovider test is listed'
autoprovider = WebUI.getText(findTestObject('Demo Workflows/Org admin check/a_AutoProvider Test checker'))

if (autoprovider.contains('AutoProvider Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

String confirmed = WebUI.getText(findTestObject('Demo Workflows/Org admin check/a_Confirmed checker'))

'Checks for confirmed sessions'
if (confirmed.contains('Confirmed')) {
} else {
    KeywordUtil.markFailedAndStop()
}

WebUI.click(findTestObject('Demo Workflows/Org admin check/span_All event statuses dropdown'))

'Selects cancelled sessions filter'
WebUI.click(findTestObject('Demo Workflows/Org admin check/li_Cancelled'))

autoprovider = WebUI.getText(findTestObject('Demo Workflows/Org admin check/a_AutoProvider Test checker'))

'checks if autoprovider test is listed'
if (autoprovider.contains('AutoProvider Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

String cancelled = WebUI.getText(findTestObject('Demo Workflows/Org admin check/a_Cancelled checker'))

'Checks for cancelled sessions'
if (cancelled.contains('Cancelled')) {
} else {
    KeywordUtil.markFailedAndStop()
}

WebUI.click(findTestObject('Demo Workflows/Org admin check/span_All therapists dropdown'))

'Selects amy davis as provider'
WebUI.click(findTestObject('Demo Workflows/Org admin check/li_Amy Davis'))

String amydavis = WebUI.getText(findTestObject('Demo Workflows/Org admin check/a_Amy Davis checker'))

'checks if amy davis is listed'
if (amydavis.contains('Amy Davis')) {
} else {
    KeywordUtil.markFailedAndStop()
}

cancelled = WebUI.getText(findTestObject('Demo Workflows/Org admin check/a_Cancelled checker'))

'Checks for cancelled sessions'
if (cancelled.contains('Cancelled')) {
} else {
    KeywordUtil.markFailedAndStop()
}

WebUI.click(findTestObject('Demo Workflows/Org admin check/span_All event statuses dropdown'))

'Selects confirmed sessions filter'
WebUI.click(findTestObject('Demo Workflows/Org admin check/li_Confirmed'))

amydavis = WebUI.getText(findTestObject('Demo Workflows/Org admin check/a_Amy Davis checker'))

'checks if amy davis is listed'
if (amydavis.contains('Amy Davis')) {
} else {
    KeywordUtil.markFailedAndStop()
}

confirmed = WebUI.getText(findTestObject('Demo Workflows/Org admin check/a_Confirmed checker'))

'Checks for confirmed sessions'
if (confirmed.contains('Confirmed')) {
} else {
    KeywordUtil.markFailedAndStop()
}

