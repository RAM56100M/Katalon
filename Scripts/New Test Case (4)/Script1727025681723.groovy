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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/span_Leave'))

WebUI.click(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/i_From Date_oxd-icon bi-calendar oxd-date-i_f3a9ef'))

WebUI.click(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/div_2'))

WebUI.click(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/i_To Date_oxd-icon bi-calendar oxd-date-input-icon'))

WebUI.click(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/div_31'))

WebUI.click(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/i_To Date_oxd-icon bi-calendar oxd-date-input-icon'))

WebUI.click(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/button_To Date_oxd-icon-button'))

WebUI.click(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/div_2_1'))

WebUI.click(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

WebUI.click(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec_1'))

WebUI.setText(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/input'), 't')

WebUI.click(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec_1_2'))

WebUI.click(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/span_Administration_oxd-switch-input oxd-sw_cd7952'))

WebUI.click(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/button_Search'))

WebUI.click(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/i_No Records Found_oxd-icon bi-check oxd-ch_5dff5a'))

WebUI.click(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/span_Miyuru user'))

WebUI.click(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/a_Logout'))

WebUI.closeBrowser()

