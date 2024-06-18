import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.common.selectPaymentMethodAndProvideBankDetails
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.navigateAddToCartAndLogin
import internal.GlobalVariable
import katalon.truetest.TrueTestScripts
import katalon.common.fillAddressDetailsCheckout
import com.kms.katalon.core.configuration.RunConfiguration

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://practicesoftwaretesting.com/"

TrueTestScripts.navigate('/')

"Step 2: Click on span sliderBar"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_sliderBar'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 2: Click on span sliderBar.png')

"Step 3: Click on span ngxSlider3"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_ngxSlider3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 3: Click on span ngxSlider3.png')

"Step 4: Click on ngx slider"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/ngx_slider'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 4: Click on ngx slider.png')

"Step 5: Click on ngx slider"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/ngx_slider'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 5: Click on ngx slider.png')

"Step 6: Click on ngx slider"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/ngx_slider'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 6: Click on ngx slider.png')

"Step 7: Click on span sliderBar"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_sliderBar'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 7: Click on span sliderBar.png')

"Step 8: Navigate, add to cart, and proceed to login"

navigateAddToCartAndLogin.execute()

"Step 9: Fill address details in checkout process"

fillAddressDetailsCheckout.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Select payment method and provide bank details"

selectPaymentMethodAndProvideBankDetails.execute(data_path_1, Integer.valueOf(index_1))

"Step 11: Click on button confirm"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 11: Click on button confirm.png')

"Step 12: Click on button confirm"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 12: Click on button confirm.png')

"Step 13: Click on link home"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/#/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 13: Click on link home.png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Verify Checkout Process with Multiple Slider Interactions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
