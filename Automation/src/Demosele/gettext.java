package Demosele;

import org.testng.annotations.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.io.File;
import java.io.IOException;

public class gettext {

	WebDriver driver;

	@BeforeTest
	@Parameters("Browser")
	public void check(String browser) throws Exception {

		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Chrome is Passed");
			Thread.sleep(15000);

			if (driver.getPageSource().contains("Best Selenium")) {

				System.out.println("This is text present in this page ");
			} else {
				System.out.println("This text not present in the page ");
			}
		} else if (browser.equalsIgnoreCase("Firefox")) {
			// System.setProperty("webdriver.firefox.marionette","D:\\geckodriver.exe");
			System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("Firefox is Passed");

			if (driver.getPageSource().contains("Best Selenium")) {
				System.out.println("This is text present in this page ");
			} else {
				System.out.println("This text not present in the page ");
				Thread.sleep(9000);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scrFile, new File("D:\\Testing docs\\screenshot2.png"), true);
				System.out.println("Firefox Screen Sucessed");
			}
		}

		else if (browser.equalsIgnoreCase("InternetExplorer")) {
			System.setProperty("webdriver.ie.driver", "D:\\IEDriverserver.exe");
			driver = new InternetExplorerDriver();
			System.out.println("InternetExplorer is Passed");
			if (driver.getPageSource().contains("Best method")) {
				System.out.println("This is text present in this page ");
			} else {
				System.out.println("This text not present in the page ");
				Thread.sleep(9000);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scrFile, new File("D:\\Testing docs\\screenshot3.png"), true);
				System.out.println("InternetExplorer Screen Sucessed");
			}
		} else {
			throw new Exception("Browser is not correct");
		}
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@Test
	public void testParameterWithXML() throws InterruptedException, IOException {
		driver.get("http://www.techbeamers.com/");
		driver.manage().window().maximize();
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:\\Testing docs\\screenshot15.png"), true);
		// driver.close();
	}
}
