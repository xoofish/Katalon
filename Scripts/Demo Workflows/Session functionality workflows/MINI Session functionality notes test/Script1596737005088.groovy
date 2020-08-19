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

'navigates to notes'
WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Note functionality/Treatment Notes right hand control'))

'clicks on old note'
WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Note functionality/view old note'))

'fails if tab does not open'
WebUI.switchToWindowIndex(1)

'switches back to main tab'
WebUI.switchToWindowIndex(0)

WebUI.enhancedClick(findTestObject('Demo Workflows/Manage Patients Workflow/Page_WeCounsel/Create Notes Button'))

WebUI.delay(1)

'creates new note'
WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Note functionality/Create Blank Note'))

WebUI.delay(1)

WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Note functionality/Note input'))

'Notes body'
WebUI.setText(findTestObject('Demo Workflows/Session functionality/Note functionality/Note input'), 'Test note input in session')

WebUI.delay(1)

WebUI.enhancedClick(findTestObject('Demo Workflows/Session functionality/Note functionality/button_Save'))

