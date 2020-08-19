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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test-pp.wecounsel.com/users/sign_in')

'auto org admin account'
WebUI.setText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_useremail'), 'nickbiz060+AutoOrgAdmin@gmail.com')

'Password123'
WebUI.setEncryptedText(findTestObject('Page_User Login  WeCounsel/input_Please Log In_userpassword'), 'p4y+y39Ir5PJb2ispxT0Ew==')

WebUI.click(findTestObject('Page_User Login  WeCounsel/button_Log in'))

'navigates to session list'
WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/Sessions list button'))

WebUI.mouseOver(findTestObject('Demo Workflows/Org admin checkin as patient/span_Schedule in sessions list'))

WebUI.delay(1)

'selects session'
WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/Session in schedule dropdown'))

WebUI.delay(20, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/Next button'))

'includes org admin in session'
WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/Include me button'))

WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/TEST - Type to search user'))

'searches for autoclient test'
WebUI.setText(findTestObject('Demo Workflows/Org admin checkin as patient/TEST - Type to search user'), 'AutoClient Test')

WebUI.sendKeys(findTestObject('Demo Workflows/Org admin checkin as patient/TEST - Type to search user'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/TMP - Next button'))

Date today = new Date()

'gets the time'
String Time = today.format('H')

int nowTime = Time.toInteger()

println(nowTime)

int setTime

String time = ''

'All if statements are a brute force way of gathering the next hour based off the current time'
if (nowTime == 24) {
    setTime = 12

    time = '1:00 am'
} else if (nowTime == 1) {
    setTime = 24

    time = '2:00 am'
} else if (nowTime == 2) {
    setTime = 36

    time = '3:00 am'
} else if (nowTime == 3) {
    setTime = 48

    time = '4:00 am'
} else if (nowTime == 4) {
    setTime = 60

    time = '5:00 am'
} else if (nowTime == 5) {
    setTime = 72

    time = '6:00 am'
} else if (nowTime == 6) {
    setTime = 84

    time = '7:00 am'
} else if (nowTime == 7) {
    setTime = 96

    time = '8:00 am'
} else if (nowTime == 8) {
    setTime = 108

    time = '9:00 am'
} else if (nowTime == 9) {
    setTime = 120

    time = '10:00 am'
} else if (nowTime == 10) {
    setTime = 132

    time = '11:00 am'
} else if (nowTime == 11) {
    setTime = 144

    time = '12:00 pm'
} else if (nowTime == 12) {
    setTime = 156

    time = '1:00 pm'
} else if (nowTime == 13) {
    setTime = 168

    time = '2:00 pm'
} else if (nowTime == 14) {
    setTime = 180

    time = '3:00 pm'
} else if (nowTime == 15) {
    setTime = 192

    time = '4:00 pm'
} else if (nowTime == 16) {
    setTime = 204

    time = '5:00 pm'
} else if (nowTime == 17) {
    setTime = 216

    time = '6:00 pm'
} else if (nowTime == 18) {
    setTime = 228

    time = '7:00 pm'
} else if (nowTime == 19) {
    setTime = 240

    time = '8:00 pm'
} else if (nowTime == 20) {
    setTime = 252

    time = '9:00 pm'
} else if (nowTime == 21) {
    setTime = 264

    time = '10:00 pm'
} else if (nowTime == 22) {
    setTime = 276

    time = '11:00 pm'
} else if (nowTime == 23) {
    setTime = 0

    time = '12:00 am'
} else {
    KeywordUtil.markFailedAndStop()
}

'sets option to the nearest hour'
WebUI.selectOptionByIndex(findTestObject('Demo Workflows/Org admin checkin as patient/Select time dropdown'), setTime)

WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/TMP - Next button'))

'selects service type'
WebUI.selectOptionByIndex(findTestObject('Demo Workflows/Org admin checkin as patient/Select service type'), 1)

'selects location'
WebUI.selectOptionByIndex(findTestObject('Demo Workflows/Org admin checkin as patient/Select location'), 7)

WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/TMP - Next button'))

WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/Finish finish button'))

WebUI.delay(10)

'searches for autoclient test'
WebUI.sendKeys(findTestObject('Demo Workflows/Org admin checkin as patient/User search bar'), 'AutoClient Test')

WebUI.sendKeys(findTestObject('Demo Workflows/Org admin checkin as patient/User search bar'), Keys.chord(Keys.ENTER))

'filters session'
WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/Filter Sessions'))

'filter'
WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/option_Wecounsel Private Practice'))

'filter'
WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/option_WeCounsel Private Practice - Location 2'))

WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/Apply filters button'))

String checkDate = WebUI.getText(findTestObject('Demo Workflows/Org admin checkin as patient/check Date Time'))

String timeSplit = checkDate.split(' at ')[1]

println('timeSplit ' + timeSplit)

println('time ' + time)

String date = checkDate.split(' at ')[0]

println('date ' + date)

'checks time of session'
if (timeSplit.contains(time)) {
} else {
    KeywordUtil.markFailedAndStop()
}

Date day = new Date()

String dayday = day.format('M-dd-yyyy')

println('dayday ' + dayday)

'checks date of session'
if (date.contains(dayday)) {
} else {
    KeywordUtil.markFailedAndStop()
}

String checkClient = WebUI.getText(findTestObject('Demo Workflows/Org admin checkin as patient/check AutoClient Test'))

'checks session attendee'
if (checkClient.contains('AutoClient Test')) {
} else {
    KeywordUtil.markFailedAndStop()
}

String checkSession = WebUI.getText(findTestObject('Demo Workflows/Org admin checkin as patient/check ORG - Session 60'))

'checks session type'
if (checkSession.contains('ORG - Session 60')) {
} else {
    KeywordUtil.markFailedAndStop()
}

not_run: WebUI.getText(findTestObject('Demo Workflows/Org admin checkin as patient/check Auto Org Admin Test'))

'checks into session'
WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/Check In button 2'))

WebUI.click(findTestObject('Demo Workflows/Org admin checkin as patient/Yes button for permission to check in'))

'starts session'
WebUI.verifyElementPresent(findTestObject('Demo Workflows/Org admin checkin as patient/Start Session button after login'), 
    0)

