import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

String Username = 'Admin'
String Password = 'admin123'

// Use the variable in your test steps
WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

// Set the username using the provided XPath
WebUI.setText(findTestObject('Object Repository/Page_Login/txt_Username', [('xpath') : "//input[@placeholder='Username']"]), Username)

// Set the password (assuming it's already set in your Object Repository)
WebUI.setText(findTestObject('Object Repository/Page_Login/txt_Password'), Password)

WebUI.click(findTestObject('Object Repository/Page_Login/btn_Login'))

WebUI.click(findTestObject('Object Repository/Orange_HRM/Variables/Page_OrangeHRM/span_Recruitment'))

WebUI.click(findTestObject('Object Repository/Orange_HRM/Variables/Page_OrangeHRM/span_My Info'))

WebUI.click(findTestObject('Object Repository/Orange_HRM/Variables/Page_OrangeHRM/a_Contact Details'))

WebUI.click(findTestObject('Object Repository/Orange_HRM/Variables/Page_OrangeHRM/p_Shahid Patel'))

WebUI.click(findTestObject('Object Repository/Orange_HRM/Variables/Page_OrangeHRM/a_Logout'))

WebUI.closeBrowser()
