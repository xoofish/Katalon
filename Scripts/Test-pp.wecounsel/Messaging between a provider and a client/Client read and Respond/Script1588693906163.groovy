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

'Navigates to message center '
WebUI.click(findTestObject('Object Repository/Page_WeCounsel/a_Messaging Center1'))

'Clicks on most recent message\r\n'
WebUI.click(findTestObject('Object Repository/Page_WeCounsel/a_Moby Dick Test'))

WebUI.delay(3)

'Gathers text of paragraph'
def text = WebUI.getText(findTestObject('Page_WeCounsel/Moby Dick Paragraph'))

'Checks to see if text gathered matches the text expected'
if (text.contains('Moby-Dick; or, The Whale is an 1851 novel by American writer Herman Melville. The book is the sailor Ishmael\'s narrative of the obsessive quest of Ahab, captain of the whaling ship Pequod, for revenge on Moby Dick, the giant white sperm whale that on the ship\'s previous voyage bit off Ahab\'s leg at the knee. A contribution to the literature of the American Renaissance, the work\'s genre classifications range from late Romantic to early Symbolist. Moby-Dick was published to mixed reviews, was a commercial failure, and was out of print at the time of the author\'s death in 1891. Its reputation as a "Great American Novel" was established only in the 20th century, after the centennial of its author\'s birth. William Faulkner said he wished he had written the book himself,[1] and D. H. Lawrence called it "one of the strangest and most wonderful books in the world" and "the greatest book of the sea ever written".[2] Its opening sentence, "Call me Ishmael", is among world literature\'s most famous.')) {
} else {
    KeywordUtil.markFailedAndStop()
}

'Clicks reply'
WebUI.click(findTestObject('Page_WeCounsel/a_To Client Test_we-message-controls-item w_076192'))

WebUI.click(findTestObject('Object Repository/Page_WeCounsel/p'))

'Types into the subject of the response'
WebUI.setText(findTestObject('Page_WeCounsel/ReplyMessage'), 'Moby Dick Test Response')

WebUI.click(findTestObject('Page_WeCounsel/button_Send'))

