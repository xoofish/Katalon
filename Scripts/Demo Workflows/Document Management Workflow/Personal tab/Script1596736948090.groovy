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

'Navigates to document center'
WebUI.click(findTestObject('Demo Workflows/Document Management Workflow/a_Document Center0'))

'Navigates to personal documents tab'
WebUI.click(findTestObject('Demo Workflows/Document Management Workflow/Personal tab button'))

WebUI.click(findTestObject('Demo Workflows/Document Management Workflow/Personal New doc button'))

WebUI.delay(1)

'upload new personal doc'
WebUI.click(findTestObject('Demo Workflows/Document Management Workflow/personal upload doc button'))

WebUI.delay(1)

'CHANGE "INPUT" TO FILE PATH Selects local file (Sample.pdf)'
WebUI.uploadFile(findTestObject('Demo Workflows/Document Management Workflow/personal Select file'), 'C:\\Users\\Alex Cullor\\Katalon Studio\\sample.pdf')

'upload'
WebUI.click(findTestObject('Demo Workflows/Document Management Workflow/Personal upload button'))

WebUI.delay(5)

'opens the document'
WebUI.click(findTestObject('Demo Workflows/Document Management Workflow/personal open sample pdf'))

'This fails if the document does not open in a new tab'
WebUI.switchToWindowIndex(1)

'this switches back to the tab with the document center open'
WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Demo Workflows/Document Management Workflow/personal sample pdf dropdown menu'))

'clicks send in the document dropdown'
WebUI.click(findTestObject('Demo Workflows/Document Management Workflow/personal sample pdf send'))

WebUI.click(findTestObject('Demo Workflows/Document Management Workflow/personal message span_Recipients'))

'selects autoclient test'
WebUI.click(findTestObject('Demo Workflows/Document Management Workflow/personal AutoClient Test in send dropdown'))

WebUI.click(findTestObject('Demo Workflows/Document Management Workflow/Personal send message subject'))

'sets subject of message'
WebUI.setText(findTestObject('Demo Workflows/Document Management Workflow/Personal send message subject'), 'Personal Doc Center Send Test')

WebUI.click(findTestObject('Demo Workflows/Document Management Workflow/personal send message button'))

WebUI.delay(5)

WebUI.click(findTestObject('Demo Workflows/Document Management Workflow/personal sample pdf dropdown menu'))

'deletes the newly uploaded sample.pdf'
WebUI.click(findTestObject('Demo Workflows/Document Management Workflow/personal sample pdf delete'))

'accepts the chrome popup'
WebUI.acceptAlert()

