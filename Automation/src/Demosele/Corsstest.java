//package Demosele;
//
//
//	package CMSBenz;
//
//	import java.util.concurrent.TimeUnit;
//
//	import org.openqa.selenium.By;
//	import org.openqa.selenium.WebDriver;
//	import org.openqa.selenium.WebElement;
//	import org.openqa.selenium.chrome.ChromeDriver;
//	import org.openqa.selenium.interactions.Actions;
//	import org.openqa.selenium.support.ui.Select;
//	import org.testng.annotations.BeforeTest;
//	import org.testng.annotations.Test;
//
//	import CMSBenzRead.ReadExcel;
//	import CMSBenzRead.ReadProperties;
//
//	public class Master {
//
//		CommonFunctions common = new CommonFunctions();
//		WebDriver driver;
//
//		@BeforeTest
//		public void loadBrowser() throws Exception {
//			common.openBrowser("chrome");
//			common.getURL(ReadProperties.readProperties("url"));
//			common.maximizeScreen();
//			common.waitForTime(20);
//			common.printMessage("Case1 ::: loginWithValidCredentials :::");
//		}
//
//		@Test(priority = 1)
//		public void masterLogin() throws Exception {
//			common.inputForSendKeysAndClick(ReadProperties.readProperties("username_logtxt"),ReadExcel.getValue("login_username"), "input");
//			common.printMessage("Entered UserName");
//			common.inputForSendKeysAndClick(ReadProperties.readProperties("pwd_logtxt"), ReadExcel.getValue("login_pwd"),"input");
//			common.printMessage("Entered Password");
//			common.inputForSendKeysAndClick(ReadProperties.readProperties("submitbtn"), "", "click");
//			common.printMessage("Clicked Login Button");
//			common.sleep(2000);
//			common.takeScreenshot("D:\\Testing docs\\Projects\\Docs For CMS\\Auto Screen\\masterLogin.png");
//		}
//
//		@Test(priority = 2)
//		public void designation() throws Exception {
//		
//			common.inputForSendKeysAndClick(ReadProperties.readProperties("master_lnk"),ReadExcel.getValue(""),"click");
//			common.inputForSendKeysAndClick(ReadProperties.readProperties("dgn_select"),ReadExcel.getValue(""),"click");
//			common.dp(".//*[@id='btnSave_Designation","Inactive");
//			common.inputForSendKeysAndClick(ReadProperties.readProperties("btn_Desg"),ReadExcel.getValue(""),"click");
//			common.sleep(2000);
//			common.takeScreenshot("D:\\Testing docs\\Projects\\Docs For CMS\\Auto Screen\\designation.png");
//		}
//
//		@Test(priority = 3)
//		public void lounge() throws Exception {
//	
//			common.inputForSendKeysAndClick(ReadProperties.readProperties("Lou_link"), ReadExcel.getValue(""), "click");
//			common.inputForSendKeysAndClick(ReadProperties.readProperties("lou_select"), ReadExcel.getValue(""), "click");
//			common.dp(".//*[@id='btnSave_Designation","Inactive");
//			common.inputForSendKeysAndClick(ReadProperties.readProperties("Lou_save"), ReadExcel.getValue(""), "click");
//			common.sleep(2000);
//			common.takeScreenshot("D:\\Testing docs\\Projects\\Docs For CMS\\Auto Screen\\lounge.png");
//		}
//
//		@Test(priority = 4)
//		public void appointmentType() throws Exception {
//			common.inputForSendKeysAndClick(ReadProperties.readProperties("app_link"), ReadExcel.getValue(""), "click");
//			common.inputForSendKeysAndClick(ReadProperties.readProperties("app_select"), ReadExcel.getValue(""), "click");
//			common.dp(".//*[@id='btnSave_AppointmentType']","Inactive");
//			common.inputForSendKeysAndClick(ReadProperties.readProperties("app_save"), ReadExcel.getValue(""), "click");
//			common.sleep(2000);
//			common.takeScreenshot("D:\\Testing docs\\Projects\\Docs For CMS\\Auto Screen\\appointmentType.png");
//		}
//
//	 	@Test(priority = 5)
//	 	public void enquiryType() throws Exception {
//
//			common.inputForSendKeysAndClick(ReadProperties.readProperties("enq_link"),ReadExcel.getValue(""),"click");
//			common.sleep(2000);
//			common.inputForSendKeysAndClick(ReadProperties.readProperties("enq_select"),ReadExcel.getValue(""),"click");
//			common.dp(".//*[@id='idEnquiryTypeStatus']","Inactive");
//			common.inputForSendKeysAndClick(ReadProperties.readProperties("Enq_upload"),ReadExcel.getValue("upload_file_pth"),"input");
//			common.sleep(2000);
//			common.takeScreenshot("D:\\Testing docs\\Projects\\Docs For CMS\\Auto Screen\\enquiryType.png");
//
//	 }
//		@Test(priority = 6)
//		public void productGroup() throws Exception {
//	
//			common.inputForSendKeysAndClick(ReadProperties.readProperties("productg_link"),ReadExcel.getValue(""),"click");
//			common.inputForSendKeysAndClick(ReadProperties.readProperties("productg_select"),ReadExcel.getValue(""),"click");
//			common.dp("productg_Status","Inactive");
//			common.inputForSendKeysAndClick(ReadProperties.readProperties("productg_broswe"),ReadExcel.getValue("upload_file_pth"),"input");
//			common.inputForSendKeysAndClick(ReadProperties.readProperties("productg_save"),ReadExcel.getValue(""),"click");
//			common.inputForSendKeysAndClick(ReadProperties.readProperties("productg_reset"),ReadExcel.getValue(""),"click");
//			common.sleep(2000);
//			common.takeScreenshot("D:\\Testing docs\\Projects\\Docs For CMS\\Auto Screen\\productGroup.png");
//		 }
//		 @Test(priority = 7)
//		 public void productName() throws Exception {
//
//			common.inputForSendKeysAndClick(ReadProperties.readProperties("productn_link"),ReadExcel.getValue(""),"click");
//			common.inputForSendKeysAndClick(ReadProperties.readProperties("productn_select"),ReadExcel.getValue(""),"click");
//			common.dp("productn_status","Inactive");
//			common.dp("productn_browse","AMG");
//			common.inputForSendKeysAndClick(ReadProperties.readProperties("productn_save"),ReadExcel.getValue(""),"click");
//			common.inputForSendKeysAndClick(ReadProperties.readProperties("productn_reset"),ReadExcel.getValue(""),"click");
//			common.sleep(2000);
//			common.takeScreenshot("D:\\Testing docs\\Projects\\Docs For CMS\\Auto Screen\\productName.png");
//		 }
//
//		 @Test(priority = 8)
//		 public void outlet() throws Exception {
//			
//				common.inputForSendKeysAndClick(ReadProperties.readProperties("outlet_link"),ReadExcel.getValue(""),"click");
//				common.inputForSendKeysAndClick(ReadProperties.readProperties("outlet_select"),ReadExcel.getValue(""),"click");
//				common.inputForSendKeysAndClick(ReadProperties.readProperties("outlet_save"),ReadExcel.getValue(""),"click");
//				common.inputForSendKeysAndClick(ReadProperties.readProperties("outlet_reset"),ReadExcel.getValue(""),"click");
//				common.sleep(2000);
//				common.takeScreenshot("D:\\Testing docs\\Projects\\Docs For CMS\\Auto Screen\\outlet.png");
//		 }
//		 @Test(priority = 9)
//		 public void exportHelp() throws Exception {
//
//				common.inputForSendKeysAndClick(ReadProperties.readProperties("export_link"),ReadExcel.getValue(""),"click");
//				common.inputForSendKeysAndClick(ReadProperties.readProperties("export_select"),ReadExcel.getValue(""),"click");
//				common.dp(".//*[@id='btnSave_Designation","Inactive");
//				common.inputForSendKeysAndClick(ReadProperties.readProperties("export_Save"),ReadExcel.getValue(""),"click");
//			 	common.inputForSendKeysAndClick(ReadProperties.readProperties("export_reset"),ReadExcel.getValue(""),"click");
//				common.sleep(2000);
//				common.takeScreenshot("D:\\Testing docs\\Projects\\Docs For CMS\\Auto Screen\\exportHelp.png");
//		 }
//	}
//
