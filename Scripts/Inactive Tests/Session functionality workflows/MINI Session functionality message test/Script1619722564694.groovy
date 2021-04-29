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

'navigates to send a document'
WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Messaging/a_Send a Document'))

WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Messaging/input_AutoClient Test_messagesubject'))

'sets subject'
WebUI.setText(findTestObject('Demo Workflows/Session functionality/Messaging/input_AutoClient Test_messagesubject'), 'Test test')

WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Messaging/div_AutoClient Test_ql-editor ql-blank'))

'sets body'
WebUI.setText(findTestObject('Demo Workflows/Session functionality/Messaging/div_AutoClient Test_ql-editor ql-blank'), 
    'Test test')

WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Messaging/legend_Attachments'))

'CHANGE FILE PATH uploads document to attachments'
WebUI.uploadFile(findTestObject('Demo Workflows/Session functionality/Messaging/a_Attach a new document'), 'C:\\Users\\hawki\\Desktop\\WCPP\\sample.pdf')

WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Messaging/button_Send'))

