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

'clicks send a document '
WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Patient doc functionality/Client right hand Send a Document'))

WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Patient doc functionality/message subject'))

'sets message subject '
WebUI.setText(findTestObject('Demo Workflows/Session functionality/Patient doc functionality/message subject'), 'Test test')

WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Patient doc functionality/Message body'))

'sets message body'
WebUI.setText(findTestObject('Demo Workflows/Session functionality/Patient doc functionality/Message body'), 'Test test')

WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Patient doc functionality/Attachments'))

'CHANGE FILE PATH uploads file to attachments'
WebUI.uploadFile(findTestObject('Demo Workflows/Session functionality/Patient doc functionality/Attach a new document'), 
    'C:\\Users\\CarldeSoto\\Documents\\sample.pdf')

WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Patient doc functionality/button_Send'))

WebUI.delay(7)

'navigates to saved documents'
WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Patient doc functionality/Client right hand Saved Documents'))

WebUI.delay(2)

'clicks sample pdf'
WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Patient doc functionality/samplepdf'))

'fails if tab does not open'
WebUI.switchToWindowIndex(1)

'navigates back to main tab'
WebUI.switchToWindowIndex(0)

WebUI.delay(2)

'ends session'
WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Patient doc functionality/button_End Session'))

