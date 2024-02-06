import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: Navigate to Page home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'Step 2: At Page home, click on hyperlink computer tablets computer tablets > navigate to Page hz mobile mission'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_computer_tablets_computer_tablets'))

'Step 3: At Page hz mobile mission, click on hyperlink object > navigate to Page Sunnytech-Balance-Physics-Balancing-Decompressive dp'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_hz_mobile_mission/hyperlink_object'))

'Step 4: At Page Sunnytech-Balance-Physics-Balancing-Decompressive dp, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_Sunnytech-Balance-Physics-Balancing-Decompressive_dp/div_object'))

'Step 5: At Page Sunnytech-Balance-Physics-Balancing-Decompressive dp, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_Sunnytech-Balance-Physics-Balancing-Decompressive_dp/div_object_1'))

'Step 6: At Page Sunnytech-Balance-Physics-Balancing-Decompressive dp, click on input field keywords > navigate to Page s'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_Sunnytech-Balance-Physics-Balancing-Decompressive_dp/input_field_keywords'))

'Step 7: At Page s, click on hyperlink object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_s/hyperlink_object'))

'Step 8: At Page s, click on hyperlink object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_s/hyperlink_object_1'))

'Step 9: At Page s, click on hyperlink 2'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_s/hyperlink_2'))

'Step 10: At Page s, click on hyperlink object > navigate to Page Wireless-Transmission-Experiment-Divvlur-Education dp'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_s/hyperlink_object_2'))

'Step 11: At Page Wireless-Transmission-Experiment-Divvlur-Education dp, click on button object > navigate to Page s'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_Wireless-Transmission-Experiment-Divvlur-Education_dp/button_object'))

'Step 12: At Page s, click on hyperlink object > navigate to Page DORAMI-Clear-Radiometer-Energy-Spinning dp'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_s/hyperlink_object_5'))

'Step 13: At Page DORAMI-Clear-Radiometer-Energy-Spinning dp, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_DORAMI-Clear-Radiometer-Energy-Spinning_dp/div_object'))

'Step 14: At Page DORAMI-Clear-Radiometer-Energy-Spinning dp, click on div object > navigate to Page s'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_DORAMI-Clear-Radiometer-Energy-Spinning_dp/div_object_1'))

'Step 15: At Page s, click on hyperlink 3'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_s/hyperlink_3'))

'Step 16: At Page s, click on hyperlink tesla coil wireless transmission educati > navigate to Page stores page'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_s/hyperlink_tesla_coil_wireless_transmission_educati'))

'Step 17: At Page stores page, click on hyperlink object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_stores_page/hyperlink_object'))

'Step 18: At Page stores page, click on hyperlink see all details > navigate to Page Joytech-Loudspeaker-Wireless-Transmission-Experiment dp'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_stores_page/hyperlink_see_all_details'))

'Step 19: At Page Joytech-Loudspeaker-Wireless-Transmission-Experiment dp, click on hyperlink a autoid 56'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_Joytech-Loudspeaker-Wireless-Transmission-Experiment_dp/hyperlink_a_autoid_56'))

'Step 20: At Page Joytech-Loudspeaker-Wireless-Transmission-Experiment dp, click on hyperlink a autoid 56'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_Joytech-Loudspeaker-Wireless-Transmission-Experiment_dp/hyperlink_a_autoid_56'))

'Step 21: At Page Joytech-Loudspeaker-Wireless-Transmission-Experiment dp, click on hyperlink a autoid 56'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_Joytech-Loudspeaker-Wireless-Transmission-Experiment_dp/hyperlink_a_autoid_56'))

'Step 22: At Page Joytech-Loudspeaker-Wireless-Transmission-Experiment dp, click on hyperlink a autoid 56'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_Joytech-Loudspeaker-Wireless-Transmission-Experiment_dp/hyperlink_a_autoid_56'))

'Step 23: At Page Joytech-Loudspeaker-Wireless-Transmission-Experiment dp, click on hyperlink bylineinfo > navigate to Page stores Joytech page'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_Joytech-Loudspeaker-Wireless-Transmission-Experiment_dp/hyperlink_bylineinfo'))

'Step 24: At Page stores Joytech page, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_stores_Joytech_page/div_object'))

'Step 25: At Page stores Joytech page, click on hyperlink object > navigate to Page Joytech-Acrylic-Wireless-Transmission-Experiment dp'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_stores_Joytech_page/hyperlink_object'))

'Step 26: At Page Joytech-Acrylic-Wireless-Transmission-Experiment dp, click on hyperlink go to cart > navigate to Page cart'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_Joytech-Acrylic-Wireless-Transmission-Experiment_dp/hyperlink_go_to_cart'))

'Step 27: Add visual checkpoint at Page cart'

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Verify Wireless Transmission Experiment Divvlur Education in Cart_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}