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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test-skytherapist.wecounsel.com/users/sign_in')

'Logs into skytherapist provider'
WebUI.setText(findTestObject('Page_SkyTherapist/input_Please Log In_useremail'), 'mtrvisuwell+skytestadmin@wecounsel.com')

'Telehealth321'
WebUI.setEncryptedText(findTestObject('Page_SkyTherapist/input_Please Log In_userpassword'), 'LCsxB9VPamtRlQlpiLe+cw==')

WebUI.click(findTestObject('Page_SkyTherapist/button_Log in'))

'Navigates to session list'
WebUI.click(findTestObject('Object Repository/Page_SkyTherapist/a_Sessions List 10'))

'Pre-scheduled requests'
WebUI.click(findTestObject('Object Repository/Page_SkyTherapist/span_Pre-Scheduled Requests'))

WebUI.delay(2)

'Gathers text of client in most recently scheduled session'
def clientName = WebUI.getText(findTestObject('Object Repository/Page_SkyTherapist/Client Name check'))

'Compares gathered client name to expected'
if (clientName.contains('SkyPat Auto Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

'Gets textmof session start time'
def sessionStart = WebUI.getText(findTestObject('Page_SkyTherapist/td_1245PM 842020'))

def compareTime = GlobalVariable.sessionTime.split(' - ')[0]

def startTime = sessionStart.split(' ')[0]

not_run: println('Start Time ' + startTime)

def startDate = sessionStart.split(' ')[1]

not_run: println('Start Date ' + startDate)

String sentDate = GlobalVariable.sessionDate + ' 2021' //must be changed each year -------------------------------------------------------------------------------|||||

KeywordLogger Log = new KeywordLogger()

Log.logWarning('Year must be manually changed each year')

not_run: println('sent date ' + sentDate)

Date parsedDate = Date.parse('EEEE MMMM dd yyyy', sentDate)

not_run: println('parsed date ' + parsedDate)

String sDate = parsedDate.format('M/d/yyyy')

not_run: println('sDate ' + sDate)

'Compares gathered date to expected (global variable)'
if (WebUI.verifyMatch(startDate, sDate, true)) {
} else {
    KeywordUtil.markFailedAndStop()
}

