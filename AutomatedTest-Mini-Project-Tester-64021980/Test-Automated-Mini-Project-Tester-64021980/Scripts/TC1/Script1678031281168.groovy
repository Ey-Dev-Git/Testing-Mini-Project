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

for (def row=1;row<=findTestData('Data_Test').getRowNumbers();row++) {
    WebUI.openBrowser('')

    WebUI.navigateToUrl('https://pongvarid.github.io/probation_client_nuxt/?fbclid')

    WebUI.click(findTestObject('Object Repository/Page_/span_'))

    WebUI.click(findTestObject('Object Repository/Page_/a_'))

    WebUI.setText(findTestObject('Object Repository/Page_/input__input-63'), findTestData('Data_Test').getValue('username',row))

    WebUI.setText(findTestObject('Object Repository/Page_/input__input-66'), findTestData('Data_Test').getValue('password',row))

    WebUI.setText(findTestObject('Object Repository/Page_/input__input-69'), findTestData('Data_Test').getValue('password2',row))

    WebUI.setText(findTestObject('Object Repository/Page_/input__input-72'), findTestData('Data_Test').getValue('email',row))

    WebUI.click(findTestObject('Object Repository/Page_/div_'))

    WebUI.setText(findTestObject('Object Repository/Page_/input__input-75'), findTestData('Data_Test').getValue('name_company',row))

    WebUI.setText(findTestObject('Object Repository/Page_/input__input-78'), findTestData('Data_Test').getValue('address',row))

    WebUI.click(findTestObject('Object Repository/Page_/span__1'))

    WebUI.delay(2)

    WebUI.closeBrowser()
}

