package Demosele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class verifythetxt {

	public static void main(String args[]) throws InterruptedException {

//		System.setProperty("webdriver.firefox.marionette","D:\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.techbeamers.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		if (driver.getPageSource().contains("Best Selenium")) {
			System.out.println("This is text present in this page ");
		} else {
			System.out.println("This text not present in the page ");
		}

	}

}
