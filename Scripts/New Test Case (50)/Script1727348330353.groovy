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

WebUI.navigateToUrl('https://parabank.parasoft.com/parabank/index.htm')

WebUI.setText(findTestObject('Object Repository/Banking/Page_ParaBank  Welcome  Online Banking/input_Username_username (1)'), 
    'ram')

WebUI.setEncryptedText(findTestObject('Object Repository/Banking/Page_ParaBank  Welcome  Online Banking/input_Password_password (1)'), 
    '1GvK2HZY7CyrJ0QUV2kr7w==')

WebUI.click(findTestObject('Object Repository/Banking/Page_ParaBank  Welcome  Online Banking/input_Password_button (1)'))

WebUI.click(findTestObject('Object Repository/Banking/Page_ParaBank  Accounts Overview/a_Transfer Funds'))

WebUI.setText(findTestObject('Object Repository/Banking/Page_ParaBank  Transfer Funds/input_Amount_input'), '50')

WebUI.click(findTestObject('Object Repository/Banking/Page_ParaBank  Transfer Funds/input_From account to account_button'))

WebUI.click(findTestObject('Object Repository/Banking/Page_ParaBank  Transfer Funds/a_home'))

WebUI.closeBrowser()

