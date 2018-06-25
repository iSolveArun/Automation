package Demosele;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Email {

	public static void main(String args[])
			throws IOException, JXLException, BiffException, FileNotFoundException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Sheet s;

		FileInputStream fi = new FileInputStream("D:\\EclispeWorkSpace\\SeleLearning\\src\\Demosele\\Testdata.xlsx");
		Workbook w = Workbook.getWorkbook(fi);
		s = w.getSheet(0);
		int z = s.getRows();
		System.out.println("no of rows:" + z);
		driver.get("http://172.16.0.74/iflowckyc_IDBI/Login-Page?act=signout");
		for (int row = 0; row <= s.getRows(); row++) {
			String username = s.getCell(0, row).getContents();
			System.out.println("Username " + username);
			// driver.get("http://www.gmail.com");
			driver.manage().window().maximize();
			driver.findElement(By.name("inputEmail")).sendKeys(username);
			String password = s.getCell(1, row).getContents();
			System.out.println("inputPassword " + password);

			Thread.sleep(10000);
			driver.findElement(By.name("btnSubmit")).click();
			if ((driver.findElement(By.xpath(".//*[@id='btnSubmit']"))).isDisplayed()) {
				System.out.println("Login Fail !Error Exists");
				String Error = driver.findElement(By.xpath(".//*[@id='btnSubmit']")).getText();
				System.out.println("The Error is :" + Error);
			} else {
				System.out.println("Login Pass");
			}
			Thread.sleep(30000);
			String InboxURL = driver.getCurrentUrl();
			System.out.println(InboxURL);
			driver.findElement(By.xpath("//span[@class='gb_d gbii']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("gb_71")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@id='account-chooser-link']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@id='account-chooser-add-account']")).click();
			Thread.sleep(2000);
			// driver.close();
		}
		driver.quit();
	}

}