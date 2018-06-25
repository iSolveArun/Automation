package Demosele;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class winhandletab {

	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.online.citibank.co.in");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("URL Loaded");
		driver.findElement(By.partialLinkText("Login")).click();
		System.out.println("Clicked Login");
		Thread.sleep(1000);

		String main = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();

		while (i1.hasNext()) {
			String child = i1.next();

			if (!main.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);

				driver.findElement(By.xpath("//*[@id=\'User_Id\']")).sendKeys("senthil");
				System.out.println("Clicked Child Window");
				Thread.sleep(1000);
				driver.close();
				System.out.println("Closed Child Window");
			}
			driver.switchTo().window(main);
			System.out.println("Switched to Main window");
			Thread.sleep(1000);
			driver.close();
		}

	}
}
