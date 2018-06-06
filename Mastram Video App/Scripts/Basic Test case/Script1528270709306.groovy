import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('C:\\Users\\Vikash\\Desktop\\App\\app-mastram-universal-debug.apk', true)
Mobile.delay(5)
Mobile.takeScreenshot()
Mobile.tap(findTestObject('Basic Test ID/android.widget.ImageButton0'), 0)
Mobile.delay(5)
Mobile.takeScreenshot()
Mobile.tap(findTestObject('Basic Test ID/android.widget.TextView15 - My Playlist'), 0)
Mobile.delay(5)
Mobile.tap(findTestObject('Basic Test ID/android.widget.Button1 - OK'), 0)

Mobile.hideKeyboard()
Mobile.takeScreenshot()
Mobile.pressBack()

Mobile.tap(findTestObject('Basic Test ID/android.widget.TextView1'), 0)
Mobile.takeScreenshot()
Mobile.setText(findTestObject('Basic Test ID/android.widget.EditText0 - Search'), 'Salman Khan', 0)
Mobile.delay(5)
Mobile.takeScreenshot()
Mobile.tap(findTestObject('Basic Test ID/android.widget.RelativeLayout1'), 0)
Mobile.delay(5)
Mobile.takeScreenshot()
Mobile.hideKeyboard()

Mobile.tap(findTestObject('Basic Test ID/android.widget.LinearLayout23'), 0)

Mobile.pressBack()
Mobile.delay(5)
Mobile.takeScreenshot()
Mobile.pressBack()

Mobile.tap(findTestObject('Basic Test ID/android.widget.TextView2'), 0)

Mobile.tap(findTestObject('Basic Test ID/android.widget.RelativeLayout2'), 0)
Mobile.delay(5)
Mobile.takeScreenshot()
Mobile.tap(findTestObject('Basic Test ID/android.widget.Button1 - OK'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Basic Test ID/android.widget.RelativeLayout5'), 0)
Mobile.delay(5)
Mobile.takeScreenshot()
Mobile.tap(findTestObject('Basic Test ID/android.widget.Button0 - MORE'), 0)

Mobile.pressBack()

Mobile.pressBack()
Mobile.delay(5)
Mobile.takeScreenshot()
Mobile.pressBack()

Mobile.closeApplication()

