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

WebUI.click(findTestObject('Object Repository/Page_SkyTherapist/a'))

WebUI.click(findTestObject('Object Repository/Page_SkyTherapist/span_Select State'))

'Selects alabama as the state'
WebUI.click(findTestObject('Page_SkyTherapist/Select Alabama'))

not_run: WebUI.click(findTestObject('Object Repository/Page_SkyTherapist/form_Select StateAlabamaAlaskaArizonaArkans_ec8b00'))

'Clicks skytherapist provider'
WebUI.click(findTestObject('Object Repository/Page_SkyTherapist/a_SkyTherapist Provider'))

'Clicks schedule session'
WebUI.click(findTestObject('Object Repository/Page_SkyTherapist/a_Schedule a Session'))

WebUI.click(findTestObject('Object Repository/Page_SkyTherapist/button_month'))

'Navigates far into the future to assure scheduled sessions are available'
WebUI.click(findTestObject('Object Repository/Page_SkyTherapist/span_May 2020_fc-icon fc-icon-right-single-arrow'))

WebUI.click(findTestObject('Object Repository/Page_SkyTherapist/span_May 2020_fc-icon fc-icon-right-single-arrow'))

WebUI.click(findTestObject('Object Repository/Page_SkyTherapist/span_May 2020_fc-icon fc-icon-right-single-arrow'))

WebUI.click(findTestObject('Object Repository/Page_SkyTherapist/span_May 2020_fc-icon fc-icon-right-single-arrow'))

WebUI.click(findTestObject('Object Repository/Page_SkyTherapist/span_May 2020_fc-icon fc-icon-right-single-arrow'))

WebUI.click(findTestObject('Object Repository/Page_SkyTherapist/span_May 2020_fc-icon fc-icon-right-single-arrow'))

WebUI.click(findTestObject('Object Repository/Page_SkyTherapist/span_May 2020_fc-icon fc-icon-right-single-arrow'))

'Navigates far into the future to assure scheduled sessions are available\r\n'
WebUI.click(findTestObject('Object Repository/Page_SkyTherapist/span_May 2020_fc-icon fc-icon-right-single-arrow'))

'Clicks available time'
WebUI.click(findTestObject('Object Repository/Page_SkyTherapist/span_Available Time'))

'Saves session date globally'
GlobalVariable.sessionDate = WebUI.getText(findTestObject('Object Repository/Page_SkyTherapist/Session date Getter'))

'Saves session time globally'
GlobalVariable.sessionTime = WebUI.getText(findTestObject('Object Repository/Page_SkyTherapist/Session Time Getter'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_SkyTherapist/span_Session Request (Pending) - 0 (50 min)_faux-selection-indicator'))

'Selects session type'
WebUI.click(findTestObject('Page_SkyTherapist/Select Session in Dropdown'))

WebUI.click(findTestObject('Object Repository/Page_SkyTherapist/button_Request Session'))

