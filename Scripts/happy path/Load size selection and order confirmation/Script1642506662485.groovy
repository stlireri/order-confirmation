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

WebUI.callTestCase(findTestCase('happy path/location set up'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Sendy/span_small'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Sendy/span_medium'), 'Medium')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Sendy/span_large'), 'Large')

WebUI.click(findTestObject('Object Repository/Page_Sendy/span_medium'))

WebUI.click(findTestObject('Object Repository/Page_Sendy/div_Van                                    _b9bc66'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Sendy/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Sendy/button_Continue'))

WebUI.setText(findTestObject('Object Repository/Page_Sendy/input_(Required)_el-input__inner'), 'groceries')

WebUI.click(findTestObject('Object Repository/Page_Sendy/body_Please enable Javascript to enjoy usin_506b4f'))

WebUI.click(findTestObject('Object Repository/Page_Sendy/a_Add pickup instructions'))

WebUI.setText(findTestObject('Object Repository/Page_Sendy/textarea_Confirm Van Order_name'), 'pick package from john doe')

WebUI.setText(findTestObject('Object Repository/Page_Sendy/input__telephone'), '+254 712 345678')

WebUI.click(findTestObject('Object Repository/Page_Sendy/input__u_terms'))

WebUI.click(findTestObject('Object Repository/Page_Sendy/input_Notify them of the pickup via SMS_but_3ba9c9'))

WebUI.click(findTestObject('Object Repository/Page_Sendy/a_Add drop off instructions'))

WebUI.setText(findTestObject('Object Repository/Page_Sendy/textarea_Confirm Van Order_name'), 'deliver to this contact')

WebUI.setText(findTestObject('Object Repository/Page_Sendy/input__telephone'), '+254 712 345678')

WebUI.click(findTestObject('Object Repository/Page_Sendy/div_Notify them of the pickup via SMS'))

WebUI.click(findTestObject('Object Repository/Page_Sendy/input_Notify them of the pickup via SMS_but_3ba9c9'))

WebUI.click(findTestObject('Page_Sendy/input_Do you have a preferred rider at your_02e81e'))

WebUI.click(findTestObject('Object Repository/Page_Sendy/li_No'))

WebUI.click(findTestObject('Object Repository/Page_Sendy/input_KES 0_paymentOptions'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Sendy/button_Confirm Van Order'), 0)

