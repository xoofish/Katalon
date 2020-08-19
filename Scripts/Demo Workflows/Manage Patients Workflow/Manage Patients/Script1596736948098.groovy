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

'navigates to manage clients'
WebUI.click(findTestObject('Demo Workflows/Manage Patients Workflow/Manage Clients Button'))

'selects autoclient test'
WebUI.click(findTestObject('Demo Workflows/Manage Patients Workflow/AutoClient Test manage'))

'gathers text of phone number'
String PhoneNum = WebUI.getText(findTestObject('Demo Workflows/Manage Patients Workflow/Get Phone num'))

String NewPhoneNum

'changes phone number between 123-123-1234 and 555-555-5555'
if (PhoneNum.contains('(123) 123-1234')) {
    NewPhoneNum = '(555) 555-5555'
} else {
    NewPhoneNum = '(123) 123-1234'
}

WebUI.click(findTestObject('Demo Workflows/Manage Patients Workflow/Edit Button'))

'Inputs the new phone number'
WebUI.setText(findTestObject('Demo Workflows/Manage Patients Workflow/Input phone number'), NewPhoneNum)

WebUI.click(findTestObject('Demo Workflows/Manage Patients Workflow/Save Button'))

'navigates to message history'
WebUI.click(findTestObject('Demo Workflows/Manage Patients Workflow/Message History Button'))

'If it cannot get text then it fails'
WebUI.getText(findTestObject('Demo Workflows/Manage Patients Workflow/Moby Dick Message'))

'Navigates to stored documents'
WebUI.click(findTestObject('Demo Workflows/Manage Patients Workflow/Stored Documents Button'))

WebUI.click(findTestObject('Demo Workflows/Manage Patients Workflow/Upload Document'))

'CHANGE "INPUT" TO FILE PATH Selects local file (Sample.pdf)'
WebUI.uploadFile(findTestObject('Demo Workflows/Manage Patients Workflow/a_Select file'), 'C:\\Users\\Alex Cullor\\Katalon Studio\\sample.pdf')

'uploads doc'
WebUI.click(findTestObject('Demo Workflows/Manage Patients Workflow/button_Upload'))

WebUI.delay(5)

'opens newly added document'
WebUI.click(findTestObject('Demo Workflows/Manage Patients Workflow/Open samplepdf doc'))

'Will fail if pdf is not opened in new tab'
WebUI.switchToWindowIndex(1)

'switches back to main tab'
WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Demo Workflows/Manage Patients Workflow/Document Action Dropdown'))

'Clicks send in document dropdown'
WebUI.click(findTestObject('Demo Workflows/Manage Patients Workflow/Doc Dropdown Send'))

WebUI.click(findTestObject('Demo Workflows/Manage Patients Workflow/span_Recipients'))

'selects autoclient test'
WebUI.click(findTestObject('Demo Workflows/Manage Patients Workflow/AutoClient Test in doc send list'))

WebUI.click(findTestObject('Demo Workflows/Manage Patients Workflow/Doc send msg subject'))

'sets subject'
WebUI.setText(findTestObject('Demo Workflows/Manage Patients Workflow/Doc send msg subject'), 'Doc send test')

'sets content of message'
WebUI.setText(findTestObject('Demo Workflows/Manage Patients Workflow/Doc send msg body'), 'Test test')

'send'
WebUI.click(findTestObject('Demo Workflows/Manage Patients Workflow/Doc message send button'))

WebUI.delay(15)

WebUI.click(findTestObject('Demo Workflows/Manage Patients Workflow/Document Action Dropdown'))

'deletes newly uploaded doc'
WebUI.click(findTestObject('Demo Workflows/Manage Patients Workflow/Doc Dropdown Delete'))

'accepts chrome popup'
WebUI.acceptAlert()

'navigates to notes'
WebUI.click(findTestObject('Demo Workflows/Manage Patients Workflow/Notes Button'))

WebUI.click(findTestObject('Demo Workflows/Manage Patients Workflow/Create Notes Button'))

'create a new blank note'
WebUI.click(findTestObject('Demo Workflows/Manage Patients Workflow/Create Blank Note Button'))

'content of note'
WebUI.setText(findTestObject('Demo Workflows/Manage Patients Workflow/Note Input'), 'This is a sample input for a note')

WebUI.click(findTestObject('Demo Workflows/Manage Patients Workflow/Save Note Button'))

'opens newly created note'
WebUI.click(findTestObject('Demo Workflows/Manage Patients Workflow/Test Note'))

'Will fail if note is not opened in new tab'
WebUI.switchToWindowIndex(1)

'switches back to main tab'
WebUI.switchToWindowIndex(0)

WebUI.delay(5)

'sends note'
WebUI.click(findTestObject('Demo Workflows/Manage Patients Workflow/Send Note'))

WebUI.click(findTestObject('Demo Workflows/Manage Patients Workflow/span_Recipients'))

'selects auto client'
WebUI.click(findTestObject('Demo Workflows/Manage Patients Workflow/AutoClient Test in notes send list'))

WebUI.click(findTestObject('Demo Workflows/Manage Patients Workflow/Notes send msg subject'))

'sets subject'
WebUI.setText(findTestObject('Demo Workflows/Manage Patients Workflow/Notes send msg subject'), 'Test Note Sending')

'sets content'
WebUI.setText(findTestObject('Demo Workflows/Manage Patients Workflow/Notes send msg body'), 'Test test')

'sends'
WebUI.click(findTestObject('Demo Workflows/Manage Patients Workflow/Notes message send button'))

