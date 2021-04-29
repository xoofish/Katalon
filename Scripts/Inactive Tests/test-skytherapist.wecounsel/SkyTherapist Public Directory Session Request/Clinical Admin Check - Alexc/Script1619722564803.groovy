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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import java.util.Date as Date
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Calendar as Calendar

WebUI.openBrowser('https://test-skytherapist.wecounsel.com/users/sign_in')

WebUI.enableSmartWait()

WebUI.maximizeWindow()

'Logs into skytherapist provider'
WebUI.setText(findTestObject('Page_SkyTherapist/input_Please Log In_useremail'), 'mtrvisuwell+skytestadmin@wecounsel.com')

'Telehealth321'
WebUI.setEncryptedText(findTestObject('Page_SkyTherapist/input_Please Log In_userpassword'), 'LCsxB9VPamtRlQlpiLe+cw==')

WebUI.click(findTestObject('Page_SkyTherapist/button_Log in'))

'Navigates to session list'
WebUI.click(findTestObject('Object Repository/Page_SkyTherapist/a_Sessions List 10'))

'Pre-scheduled requests'
WebUI.click(findTestObject('Object Repository/Page_SkyTherapist/span_Pre-Scheduled Requests'))

not_run: WebUI.delay(2)

'Gathers text of client in most recently scheduled session'
def clientName = WebUI.getText(findTestObject('Object Repository/Page_SkyTherapist/Client Name check'))

'Compares gathered client name to expected'
if (clientName.contains('Oct 7 October')) {
} else {
    KeywordUtil.markFailedAndStop()
}

'Gets textmof session start time'
def sessionStart = WebUI.getText(findTestObject('Page_SkyTherapist/td_1245PM 842020'))

if (sessionStart.contains('12:45PM 5/4/2021')) {
} else {
    KeywordUtil.markFailedAndStop()
}

