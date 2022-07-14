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

Mobile.startExistingApplication(GlobalVariable.appId)

Mobile.tap(findTestObject('Object Repository/Register/btn_CreateProfile'), 0)

Mobile.setText(findTestObject('Object Repository/Register/set_FirstName'), 'Adam', 0)

Mobile.setText(findTestObject('Object Repository/Register/set_LastName'), 'Ghufron', 0)

Mobile.setText(findTestObject('Object Repository/Register/set_Country'), 'Indonesia', 0)

Mobile.setText(findTestObject('Object Repository/Register/set_Username'), 'damaki', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/Register/set_Password'), '3UutqkOQjORamBZZj1y3kQ==', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/Register/set_ConfirmPassword'), '3UutqkOQjORamBZZj1y3kQ==', 0)

Mobile.tap(findTestObject('Object Repository/Register/btn_SubmitProfile'), 0)

Mobile.closeApplication()

