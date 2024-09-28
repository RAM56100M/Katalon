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

WebUI.navigateToUrl('https://www.saucedemo.com/v1/')

WebUI.setText(findTestObject('Object Repository/SauceLab/Page_Swag Labs/input_standard_userlocked_out_userproblem_u_db77ac'), 
    'problem_user')

WebUI.setEncryptedText(findTestObject('Object Repository/SauceLab/Page_Swag Labs/input_standard_userlocked_out_userproblem_u_3423e9'), 
    'qcu24s4901FyWDTwXGr6XA==')

WebUI.sendKeys(findTestObject('Object Repository/SauceLab/Page_Swag Labs/input_standard_userlocked_out_userproblem_u_3423e9'), 
    Keys.chord(Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('Object Repository/SauceLab/Page_Swag Labs/select_Name (A to Z)Name (Z to A)Price (low_f7e90a'), 
    'hilo', true)

WebUI.click(findTestObject('Object Repository/SauceLab/Page_Swag Labs/button_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/SauceLab/Page_Swag Labs/button_ADD TO CART_1'))

WebUI.click(findTestObject('Object Repository/SauceLab/Page_Swag Labs/button_ADD TO CART_1_2'))

WebUI.click(findTestObject('Object Repository/SauceLab/Page_Swag Labs/button_Open Menu'))

WebUI.click(findTestObject('Object Repository/SauceLab/Page_Swag Labs/a_All Items'))

WebUI.click(findTestObject('Object Repository/SauceLab/Page_Swag Labs/div_Open Menu_header_label'))

WebUI.click(findTestObject('Object Repository/SauceLab/Page_Swag Labs/path'))

WebUI.click(findTestObject('Object Repository/SauceLab/Page_Swag Labs/a_CHECKOUT'))

WebUI.click(findTestObject('Object Repository/SauceLab/Page_Swag Labs/input_CANCEL_btn_primary cart_button'))

WebUI.setText(findTestObject('Object Repository/SauceLab/Page_Swag Labs/input_ErrorFirst Name is required_first-name'), 
    'ram')

WebUI.setText(findTestObject('Object Repository/SauceLab/Page_Swag Labs/input_ErrorFirst Name is required_last-name'), 'ram')

WebUI.setText(findTestObject('Object Repository/SauceLab/Page_Swag Labs/input_ErrorFirst Name is required_postal-code'), 
    '411059')

WebUI.click(findTestObject('Object Repository/SauceLab/Page_Swag Labs/input_CANCEL_btn_primary cart_button'))

WebUI.click(findTestObject('Object Repository/SauceLab/Page_Swag Labs/a_FINISH'))

WebUI.click(findTestObject('Object Repository/SauceLab/Page_Swag Labs/div_Open Menu_header_label'))

WebUI.click(findTestObject('Object Repository/SauceLab/Page_Swag Labs/button_Open Menu'))

WebUI.click(findTestObject('Object Repository/SauceLab/Page_Swag Labs/a_Logout'))

WebUI.closeBrowser()

