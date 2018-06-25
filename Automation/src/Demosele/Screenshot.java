package Demosele;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Screenshot {
	
	public static void main(String[]  args ) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=-TOuWZWqGvHx8AeJt6ywCg");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		File scrFile  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile , new File("D:\\Testing docs\\screenshot1.png"), true);
		driver.findElement(By.id("lst-ib")).sendKeys("selenium webdriver tutorial java eclipse with examples");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		File scrFilel  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFilel , new File("D:\\Testing docs\\screenshot2.png"), true);
		
		driver.findElement(By.xpath(".//*[@id='sbtc']/div[2]/div[2]/div[1]/div/ul/li[3]/div/span[1]/span/input")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		File scrFile2  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile2 , new File("D:\\Testing docs\\screenshot3.png"), true);
		
		driver.close();

		}
		
}
