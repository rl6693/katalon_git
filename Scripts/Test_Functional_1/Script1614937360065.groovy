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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://z29vzcbmaw5kaw5nigzvcib5b3u.prospace.io/')

WebUI.setText(findTestObject('Test_Functional_1/Page_Prospace factorial/input_Prospace factoral calculator_number'), '0')

WebUI.click(findTestObject('Test_Functional_1/Page_Prospace factorial/button_Calclate'))

WebUI.click(findTestObject('Test_Functional_1/Page_Prospace factorial/p_Prospace factoral calculator_input-group'))

WebUI.delay(3)

WebUI.setText(findTestObject('Test_Functional_1/Page_Prospace factorial/input_Prospace factoral calculator_number'), 'One')

WebUI.click(findTestObject('Test_Functional_1/Page_Prospace factorial/button_Calclate'))

WebUI.delay(3)

WebUI.setText(findTestObject('Test_Functional_1/Page_Prospace factorial/input_Prospace factoral calculator_number'), '-1')

WebUI.click(findTestObject('Test_Functional_1/Page_Prospace factorial/button_Calclate'))

WebUI.delay(3)

WebUI.setText(findTestObject('Test_Functional_1/Page_Prospace factorial/input_Prospace factoral calculator_number'), '2.3')

WebUI.click(findTestObject('Test_Functional_1/Page_Prospace factorial/button_Calclate'))

WebUI.delay(3)

WebUI.closeBrowser()

