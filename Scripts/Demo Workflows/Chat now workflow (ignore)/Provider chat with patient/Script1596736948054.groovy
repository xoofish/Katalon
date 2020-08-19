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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.Keys as Keys

System.setProperty('webdriver.chrome.driver', 'C:\\Users\\hawki\\Documents\\2Visuwell\\Katalon_Studio_Windows_64-7.4.0\\configuration\\resources\\drivers\\chromedriver_win32\\chromedriver.exe')

WebDriver driver1 = new ChromeDriver()

DriverFactory.changeWebDriver(driver1)

WebUI.navigateToUrl('https://test-pp.wecounsel.com/users/sign_in')

WebUI.setText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_useremail'), 'nickbiz060+AutoProvider@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_userpassword'), 'p4y+y39Ir5PJb2ispxT0Ew==')

WebUI.click(findTestObject('Page_User Login  WeCounsel/button_Log in'))

WebDriver driver2 = new ChromeDriver()

DriverFactory.changeWebDriver(driver2)

WebUI.navigateToUrl('https://test-pp.wecounsel.com/users/sign_in')

WebUI.setText(findTestObject('Object Repository/Page_User Login  WeCounsel/input_Please Log In_useremail'), 'nickbiz060+AutoClient@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_User Login  WeCounsel/input_Please Log In_userpassword'), 
    'p4y+y39Ir5PJb2ispxT0Ew==')

WebUI.click(findTestObject('Object Repository/Page_User Login  WeCounsel/button_Log in'))

DriverFactory.changeWebDriver(driver1)

WebUI.click(findTestObject('Demo Workflows/Chat now workflow/Manage Clients button'))

WebUI.click(findTestObject('Demo Workflows/Chat now workflow/AutoClient dropdown'))

WebUI.click(findTestObject('Demo Workflows/Chat now workflow/Chat Now in dropdown'))

WebUI.delay(10)

not_run: WebUI.refresh()

WebUI.waitForElementPresent(findTestObject('Demo Workflows/Chat now workflow/Message text box'), 0)

WebUI.click(findTestObject('Demo Workflows/Chat now workflow/Message text box'))

WebUI.sendKeys(findTestObject('Demo Workflows/Chat now workflow/Message text box'), 'Hello from provider!')

WebUI.sendKeys(findTestObject('Demo Workflows/Chat now workflow/Message text box'), Keys.chord(Keys.ENTER))

DriverFactory.changeWebDriver(driver2)

not_run: WebUI.delay(10)

not_run: WebUI.refresh()

WebUI.waitForElementPresent(findTestObject('Demo Workflows/Chat now workflow/Message text box'), 0)

WebUI.click(findTestObject('Demo Workflows/Chat now workflow/Message text box'))

WebUI.sendKeys(findTestObject('Demo Workflows/Chat now workflow/Message text box'), 'Hello from client!')

WebUI.sendKeys(findTestObject('Demo Workflows/Chat now workflow/Message text box'), Keys.chord(Keys.ENTER))

DriverFactory.changeWebDriver(driver1)

