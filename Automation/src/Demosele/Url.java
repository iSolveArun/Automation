package Demosele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Url {

	public  void testPageTitle() {
		
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.techbeamers.com/");
		driver.manage().window().maximize();
		String urll = "http://www.techbeamers.com/";
		boolean flag = false;
		if (driver.getTitle().equalsIgnoreCase(urll)) {
			flag = true;
			// This method will return True when the page title matches with specified string
			System.out.println("Yeah... Page title matched");
		}
		Assert.assertTrue(flag, "Page title is not matching with expected");
		
		
//		String currentURL =  driver.Url();
//		driver.close();
//		if(currentURL.equalsIgnoreCase(Url))
//				
//		if(urll=="http://www.techbeamers.com/")
////		if(urll.equals(getCurrentUrl))
////		if(urll.contains(getCurrentUrl))	+-//		{		
//			System.out.println("url passed");
//		}
//		else
//		{
//			System.out.println("url Faild");
		}
		
	}
	

