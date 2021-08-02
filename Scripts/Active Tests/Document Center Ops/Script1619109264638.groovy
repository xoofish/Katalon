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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.awt.Robot as Robot
import java.awt.event.InputEvent as InputEvent
import java.awt.event.KeyEvent as KeyEvent

WebUI.openBrowser('https://test-visuwell.wecounsel.com/users/sign_in')

WebUI.enableSmartWait()

WebUI.maximizeWindow()

'Email used for all wecounsel provider testing\r\n'
WebUI.setText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_useremail'), 'visuwellautomation+provider@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_userpassword'), 'n/qdZPZskVxU+Rv/aUDKXw==')

WebUI.click(findTestObject('Page_User Login  WeCounsel/button_Log in'))

'Navigates to document center'
WebUI.click(findTestObject('Demo Workflows/Document Management Workflow/a_Document Center0'))

'Upload template '
WebUI.click(findTestObject('Demo Workflows/Document Management Workflow/a_Upload Templates'))

WebUI.focus(findTestObject('Demo Workflows/Document Management Workflow/Library Select file button'))

Robot robot = new Robot()

robot.keyPress(KeyEvent.VK_ENTER)

WebUI.delay(5)

'CHANGE "INPUT" TO FILE PATH Selects local file (Sample.pdf)'
WebUI.uploadFile(findTestObject('Demo Workflows/Document Management Workflow/Library Select file button'), 'C:\\Users\\CarldeSoto\\Documents\\sample.pdf')

'upload'
WebUI.click(findTestObject('Demo Workflows/Document Management Workflow/Library Upload button'))

not_run: WebUI.waitForElementClickable(findTestObject('Demo Workflows/Document Management Workflow/Library Next page'), 
    20)

not_run: WebUI.enhancedClick(findTestObject('Demo Workflows/Document Management Workflow/Library Next page'))

'opens the document'
WebUI.click(findTestObject('Demo Workflows/Document Management Workflow/Library Open Sample pdf'))

'This fails if the document does not open in a new tab'
WebUI.switchToWindowIndex(1)

'this switches back to the tab with the document center open'
WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Demo Workflows/Document Management Workflow/Library sample pdf dropdown'))

'clicks send in the document dropdown'
WebUI.click(findTestObject('Demo Workflows/Document Management Workflow/Library Sample pdf send'))

WebUI.click(findTestObject('Demo Workflows/Document Management Workflow/library send span_Recipients'))

'selects autoclient test'
WebUI.click(findTestObject('Demo Workflows/Document Management Workflow/Library AutoClient Test in send dropdown'))

WebUI.click(findTestObject('Demo Workflows/Document Management Workflow/library send message subject'))

'sets subject of message'
WebUI.setText(findTestObject('Demo Workflows/Document Management Workflow/library send message subject'), 'Doc center send test')

'sends message'
WebUI.click(findTestObject('Demo Workflows/Document Management Workflow/library send message button'))

WebUI.delay(8)

WebUI.click(findTestObject('Demo Workflows/Document Management Workflow/Library sample pdf dropdown'))

'deletes the newly uploaded sample.pdf'
WebUI.click(findTestObject('Demo Workflows/Document Management Workflow/Library sample pdf delete'))

'accepts the chrome popup'
WebUI.acceptAlert()

not_run: WebUI.closeBrowser()

not_run: WebUI.openBrowser('https://test-visuwell.wecounsel.com/users/sign_in')

'Email used for all wecounsel provider testing\r\n'
not_run: WebUI.setText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_useremail'), 'visuwellautomation+patient@gmail.com')

not_run: WebUI.setEncryptedText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_userpassword'), 'n/qdZPZskVxU+Rv/aUDKXw==')

not_run: WebUI.click(findTestObject('Page_User Login  WeCounsel/button_Log in'))

'Navigates to document center'
not_run: WebUI.click(findTestObject('Demo Workflows/Patient Functionality/Document Center'))

'Navigates to personal documents tab'
not_run: WebUI.click(findTestObject('Demo Workflows/Document Management Workflow/Personal tab button'))

not_run: WebUI.click(findTestObject('Demo Workflows/Manage Patients Workflow/Upload Document'))

'CHANGE "INPUT" TO FILE PATH Selects local file (Sample.pdf)'
not_run: WebUI.uploadFile(findTestObject('Demo Workflows/Document Management Workflow/personal Select file'), 'C:\\Users\\CarldeSoto\\Documents\\sample.pdf')

'upload'
not_run: WebUI.click(findTestObject('Demo Workflows/Document Management Workflow/Personal upload button'))

not_run: WebUI.waitForElementClickable(findTestObject('Demo Workflows/Document Management Workflow/personal open sample pdf'), 
    5)

'opens the document'
not_run: WebUI.enhancedClick(findTestObject('Demo Workflows/Document Management Workflow/personal open sample pdf'))

'This fails if the document does not open in a new tab'
not_run: WebUI.switchToWindowIndex(1)

'this switches back to the tab with the document center open'
not_run: WebUI.switchToWindowIndex(0)

not_run: WebUI.click(findTestObject('Demo Workflows/Document Management Workflow/personal sample pdf dropdown menu'))

'clicks send in the document dropdown'
not_run: WebUI.click(findTestObject('Demo Workflows/Document Management Workflow/personal sample pdf send'))

not_run: WebUI.click(findTestObject('Demo Workflows/Document Management Workflow/personal message span_Recipients'))

'selects autoclient test'
not_run: WebUI.click(findTestObject('Demo Workflows/Document Management Workflow/personal AutoClient Test in send dropdown'))

not_run: WebUI.click(findTestObject('Demo Workflows/Document Management Workflow/Personal send message subject'))

'sets subject of message'
not_run: WebUI.setText(findTestObject('Demo Workflows/Document Management Workflow/Personal send message subject'), 'Personal Doc Center Send Test')

not_run: WebUI.click(findTestObject('Demo Workflows/Document Management Workflow/personal send message button'))

not_run: WebUI.mouseOver(findTestObject('Demo Workflows/Document Management Workflow/personal sample pdf dropdown menu'))

not_run: WebUI.waitForElementClickable(findTestObject('Demo Workflows/Document Management Workflow/personal sample pdf delete'), 
    5)

not_run: WebUI.enhancedClick(findTestObject('Demo Workflows/Document Management Workflow/personal sample pdf delete'))

not_run: WebUI.acceptAlert()

