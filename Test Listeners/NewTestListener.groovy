import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.TearDown
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

import com.kms.katalon.core.webui.driver.ExistingRemoteWebDriver

import com.kms.katalon.core.configuration.RunConfiguration

class LambdaListener {

	TestSuiteContext suiteContext;

	/**
	 * Executes before every test case starts.
	 * @param testCaseContext related information of the executed test case.
	 */
	@BeforeTestCase
	def sampleBeforeTestCase(TestCaseContext testCaseContext) {
		
		
		//To set the test name at LambdaTest.
		RunConfiguration.setDriverPreferencesProperty("Remote", "name", testCaseContext.getTestCaseId());
		if (suiteContext != null){
			RunConfiguration.setDriverPreferencesProperty("Remote","build", suiteContext.getTestSuiteId());
		}
		println testCaseContext.getTestCaseId();
		println RunConfiguration.getDriverPreferencesProperties();
	}
	/**
	 * Executes after every test case ends.
	 * @param testCaseContext related information of the executed test case.
	 */
	@com.kms.katalon.core.annotation.TearDown
	@AfterTestCase
	def sampleAfterTestCase(TestCaseContext testCaseContext) {
		//To set the status of test at LambdaTest.
		String result="failed";
		if(testCaseContext.getTestCaseStatus().equalsIgnoreCase("PASSED")){
			result="passed"
		}
		try{
			WebUI.executeJavaScript("lambda-status="+result,null)
		}catch (Exception e)
		{
			println e.toString()
		}
		finally {
			WebUI.closeBrowser()
		}
		println testCaseContext.getTestCaseId()
		println testCaseContext.getTestCaseStatus()
	}

	/**
	 * Executes before every test suite starts.
	 * @param testSuiteContext: related information of the executed test suite.
	 */
	@BeforeTestSuite
	def sampleBeforeTestSuite(TestSuiteContext testSuiteContext) {
		suiteContext=testSuiteContext
		//To Set the build Name at LambdaTest.
		RunConfiguration.setDriverPreferencesProperty("Remote","build", suiteContext.getTestSuiteId());
		println testSuiteContext.getTestSuiteId()
	}

	/**
	 * Executes after every test suite ends.
	 * @param testSuiteContext: related information of the executed test suite.
	 */
	@AfterTestSuite
	def sampleAfterTestSuite(TestSuiteContext testSuiteContext) {
		println testSuiteContext.getTestSuiteId()
	}
}