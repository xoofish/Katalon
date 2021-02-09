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

'navigates to calendar'
WebUI.click(findTestObject('Demo Workflows/Patient Functionality/My Calendar'))

'selects month view'
WebUI.click(findTestObject('Demo Workflows/Patient Functionality/Calendar Month View'))

'selects day view'
WebUI.click(findTestObject('Demo Workflows/Patient Functionality/Calendar Day View'))

'selects week view'
WebUI.click(findTestObject('Demo Workflows/Patient Functionality/Calendar Week View'))

'navigates to document center'
WebUI.click(findTestObject('Demo Workflows/Patient Functionality/Document Center'))

'navigates to personal tab'
WebUI.click(findTestObject('Demo Workflows/Patient Functionality/Personal Tab'))

WebUI.click(findTestObject('Demo Workflows/Patient Functionality/Upload Document'))

'CHANGE "INPUT" TO FILE PATH Selects local file (Sample.pdf)'
WebUI.uploadFile(findTestObject('Demo Workflows/Patient Functionality/Select File'), 'C:\\Users\\CarldeSoto\\Documents\\sample.pdf')

WebUI.click(findTestObject('Demo Workflows/Patient Functionality/Upload (After select doc)'))

WebUI.delay(12)

'opens newly uploaded doc'
WebUI.click(findTestObject('Demo Workflows/Patient Functionality/Open Sample PDF'))

'This fails if the document does not open in a new tab'
WebUI.switchToWindowIndex(1)

'this switches back to the tab with the document center open'
WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Demo Workflows/Patient Functionality/Sample PDF dropdown'))

'clicks send in document dropdown'
WebUI.click(findTestObject('Demo Workflows/Patient Functionality/Send in dropdown'))

WebUI.click(findTestObject('Demo Workflows/Patient Functionality/Send model Recipiants dropdown'))

'selects autoprovider test'
WebUI.click(findTestObject('Demo Workflows/Patient Functionality/Send model AutoProvider Test in dropdown'))

WebUI.click(findTestObject('Demo Workflows/Patient Functionality/Send model message subject'))

'sets subject'
WebUI.setText(findTestObject('Demo Workflows/Patient Functionality/Send model message subject'), 'Test send')

not_run: WebUI.click(findTestObject('Demo Workflows/Patient Functionality/Send model paragraph entry'))

not_run: WebUI.setText(findTestObject('Demo Workflows/Patient Functionality/Send model paragraph entry'), 'Test test test')

WebUI.click(findTestObject('Demo Workflows/Patient Functionality/Send model send button'))

WebUI.delay(12)

WebUI.click(findTestObject('Demo Workflows/Patient Functionality/Sample PDF dropdown'))

'deletes newly uploaded doc'
WebUI.click(findTestObject('Demo Workflows/Patient Functionality/Delete in dropdown'))

'accepts chrome popup'
WebUI.acceptAlert()

'navigates to journals'
WebUI.click(findTestObject('Demo Workflows/Patient Functionality/Written Journals Tab'))

'creates a new journal'
WebUI.click(findTestObject('Demo Workflows/Patient Functionality/Create new journal entry'))

WebUI.click(findTestObject('Demo Workflows/Patient Functionality/Journal Title'))

Date date = new Date()

String journalName = date

'sets journal title to todays date'
WebUI.setText(findTestObject('Demo Workflows/Patient Functionality/Journal Title'), journalName)

WebUI.click(findTestObject('Demo Workflows/Patient Functionality/Journal paragraph'))

'sets content of jounral'
WebUI.setText(findTestObject('Demo Workflows/Patient Functionality/Journal paragraph'), 'Test test test')

WebUI.click(findTestObject('Demo Workflows/Patient Functionality/Journal Create button'))

