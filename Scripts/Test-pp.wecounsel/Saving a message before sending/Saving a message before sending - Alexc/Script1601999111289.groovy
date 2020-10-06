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

'Navigates to messaging center'
WebUI.click(findTestObject('Page_WeCounsel/a_Messaging Center0'))

'Clicks compose'
WebUI.click(findTestObject('Page_WeCounsel/a_Compose'))

WebUI.click(findTestObject('Page_WeCounsel/span_Recipients'))

'Selects provider test'
WebUI.click(findTestObject('Page_WeCounsel/li_Auto Client Test_New_Message'))

WebUI.click(findTestObject('Page_WeCounsel/input_Auto Client Test_message_subject'))

'Sets subject'
WebUI.setText(findTestObject('Page_WeCounsel/input_Auto Client Test_message_subject'), 'Moby Dick Save Test')

'Sets message content to first paragraph of moby dick from wikipedia'
WebUI.setText(findTestObject('Page_WeCounsel/div_Auto Client Test_Message_Body'), 'Moby-Dick; or, The Whale is an 1851 novel by American writer Herman Melville. The book is the sailor Ishmael\'s narrative of the obsessive quest of Ahab, captain of the whaling ship Pequod, for revenge on Moby Dick, the giant white sperm whale that on the ship\'s previous voyage bit off Ahab\'s leg at the knee. A contribution to the literature of the American Renaissance, the work\'s genre classifications range from late Romantic to early Symbolist. Moby-Dick was published to mixed reviews, was a commercial failure, and was out of print at the time of the author\'s death in 1891. Its reputation as a "Great American Novel" was established only in the 20th century, after the centennial of its author\'s birth. William Faulkner said he wished he had written the book himself,[1] and D. H. Lawrence called it "one of the strangest and most wonderful books in the world" and "the greatest book of the sea ever written".[2] Its opening sentence, "Call me Ishmael", is among world literature\'s most famous.[3]')

WebUI.click(findTestObject('Page_WeCounsel/button_Save_Message'))

WebUI.click(findTestObject('Page_WeCounsel/a_Messaging Center0'))

'Opens drafts'
WebUI.click(findTestObject('Object Repository/Page_WeCounsel/a_Drafts'))

'opens saved message'
WebUI.click(findTestObject('Object Repository/Page_WeCounsel/a_Moby dick save test'))

'Gets text of message content'
def text = WebUI.getText(findTestObject('Page_WeCounsel/Moby Dick Paragraph'))

'checks gathered text against expected text'
if (text.contains('Moby-Dick; or, The Whale is an 1851 novel by American writer Herman Melville. The book is the sailor Ishmael\'s narrative of the obsessive quest of Ahab, captain of the whaling ship Pequod, for revenge on Moby Dick, the giant white sperm whale that on the ship\'s previous voyage bit off Ahab\'s leg at the knee. A contribution to the literature of the American Renaissance, the work\'s genre classifications range from late Romantic to early Symbolist. Moby-Dick was published to mixed reviews, was a commercial failure, and was out of print at the time of the author\'s death in 1891. Its reputation as a "Great American Novel" was established only in the 20th century, after the centennial of its author\'s birth. William Faulkner said he wished he had written the book himself,[1] and D. H. Lawrence called it "one of the strangest and most wonderful books in the world" and "the greatest book of the sea ever written".[2] Its opening sentence, "Call me Ishmael", is among world literature\'s most famous.[3]')) {
} else {
    KeywordUtil.markFailedAndStop()
}

