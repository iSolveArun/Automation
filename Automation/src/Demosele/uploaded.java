package Demosele;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class uploaded {

										   
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/selenium/upload/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement upload= driver.findElement(By.className("upload_txt"));
		upload.sendKeys("D:\\13QWERT1234C1SZ.xlsx");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='terms']")).click();
		WebElement sub= driver.findElement(By.id("submitbutton"));
		sub.click();
		WebElement text = driver.findElement(By.xpath(".//*[@id='res']/center"));
		Thread.sleep(1000);
		System.out.println("gettext()"+text.getText());
		File image = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(image, new File("D:\\Testing docs\\screens.png"));
		driver.close();
		
			}

}
