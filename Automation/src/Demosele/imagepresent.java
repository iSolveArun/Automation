package Demosele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class imagepresent {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.techbeamers.com/selenium-webdriver-tutorial/");
		Thread.sleep(30);
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath(".//*[@id='post-2767']/div/div/p[5]/strong/span/img"));
		String path = element.getAttribute("src");
		boolean imageLoaded1 = false;
		// WebElement ImageFile=driver.findElement(By.xpath(""));
		if (!imageLoaded1) {
			System.out.println("Image displayed.");
		} else {
			System.out.println("Image not displayed.");

			// WebElement ImageFile =
			// driver.findElement(By.xpath("//img[contains(@id,'Test
			// Image')]"));
		}
	}
}