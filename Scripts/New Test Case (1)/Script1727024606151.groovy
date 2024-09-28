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

WebUI.click(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/span_Admin'))

WebUI.click(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/button_Add'))

WebUI.click(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/div_-- Select --'))

WebUI.setText(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/input'), 'Ram')

WebUI.click(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/div_Status'))

WebUI.click(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus'))

WebUI.setText(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/input'), 'Ram Patil')

WebUI.click(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/div_User RoleESS'))

WebUI.click(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus'))

WebUI.setText(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus'), 'Track@0021')

WebUI.setEncryptedText(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/input_Password_oxd-input oxd-input--focus'), 
    '1GvK2HZY7CyrJ0QUV2kr7w==')

WebUI.setEncryptedText(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/input_Confirm Password_oxd-input oxd-input-_a3aecb'), 
    '1GvK2HZY7CyrJ0QUV2kr7w==')

WebUI.click(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/button_Save'))

WebUI.click(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/button_Save'))

WebUI.doubleClick(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/input'))

WebUI.setText(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/input'), 't')

WebUI.click(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/button_Save'))

WebUI.click(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/p_Miyuru user'))

WebUI.click(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/a_Logout'))

WebUI.closeBrowser()

