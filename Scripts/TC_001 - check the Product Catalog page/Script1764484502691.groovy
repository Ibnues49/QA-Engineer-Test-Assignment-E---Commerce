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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.ConditionType

WebUI.openBrowser('') //buka browser

WebUI.navigateToUrl('https://demowebshop.tricentis.com/')

WebUI.maximizeWindow() //maximize window

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//a[text()='Log in']")) //click menu login

WebUI.delay(2) //melakukan delay 3 detik

WebUI.setText(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//input[@id='Email']"), 'admin111@gmail.com') //input email

WebUI.delay(2) //melakukan delay 3 detik

WebUI.setText(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//input[@id='Password']"), 'admin111') //input password

WebUI.delay(2) //melakukan delay 3 detik

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//input[@value='Log in']")) //click login

WebUI.delay(3) //melakukan delay 3 detik

WebUI.scrollToPosition(0, 500)

WebUI.delay(3) //melakukan delay 3 detik

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//h2[@class='product-title']//a[contains(text(),'14.1-inch Laptop')]")) //melakukan click produk laptop

WebUI.delay (3) //melakukan delay 3 detik

WebUI.scrollToPosition(0, 200)

WebUI.verifyElementPresent(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//h1[contains(text(),'14.1-inch Laptop')]"), 5) //validasi nama product

WebUI.verifyElementPresent(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//span[contains(@class,'price-value')]"), 5) //validasi harga product

WebUI.delay (3) //melakukan delay 3 detik

WebUI.closeBrowser() //tutup browser





