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

not_run: WebUI.callTestCase(findTestCase('login_testcase/login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('home_page/search_field'), backlog)

WebUI.submit(findTestObject('home_page/search_field'))

WebUI.verifyElementPresent(findTestObject('issue_page/wrapper_tracker'), 3)

WebUI.click(findTestObject('issue_page/add_subtask'))

WebUI.waitForElementPresent(findTestObject('issue_page/wrapper_issue'), 3)

WebUI.click(findTestObject('issue_page/tracker/bugfix_tracker'))

WebUI.delay(5)

WebUI.setText(findTestObject('issue_page/subject_issue'), subject)

WebUI.setText(findTestObject('issue_page/description_issue'), description)

WebUI.click(findTestObject('issue_page/assigne/darmadi'))

WebUI.click(findTestObject('issue_page/targetversion/oneID'))

WebUI.setText(findTestObject('issue_page/estimated_time'), estimatedtime)

WebUI.click(findTestObject('issue_page/storypoints/sp1'))

not_run: WebUI.click(findTestObject('issue_page/create_btn'))

