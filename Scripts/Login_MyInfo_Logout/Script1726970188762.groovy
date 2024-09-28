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

WebUI.click(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/span_My Info'))

WebUI.click(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/a_Contact Details'))

WebUI.setText(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/input_Street 1_oxd-input oxd-input--focus'), 'test')

WebUI.setText(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/input_Street 2_oxd-input oxd-input--active'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/input_City_oxd-input oxd-input--active'), 'US')

WebUI.setText(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/input_StateProvince_oxd-input oxd-input--active'), 
    'US')

WebUI.setText(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/input_ZipPostal Code_oxd-input oxd-input--active'), 
    '')

WebUI.click(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/input_ZipPostal Code_oxd-input oxd-input--active'))

WebUI.click(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/div_-- Select --'))

WebUI.click(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/button_Save'))

WebUI.click(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/span_Dashboard'))

WebUI.click(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/p_(1) Pending Self Review'))

WebUI.click(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/span_manda user'))

WebUI.click(findTestObject('Object Repository/Orange_HRM/Page_OrangeHRM/a_Logout'))

WebUI.closeBrowser()

