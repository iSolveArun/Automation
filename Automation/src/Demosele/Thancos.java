package Demosele;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Thancos {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Testing docs\\Java_Selenium\\New folder\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver", "D:\\Testing docs\\Java_Selenium\\New folder\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
		driver.get("http://172.16.0.74/iServeThancoCBE/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//login
		driver.findElement(By.cssSelector("#username")).sendKeys("thancos");
		driver.findElement(By.cssSelector("#password")).sendKeys("thancos123$");
		driver.findElement(By.id("btnSubmit")).click();
		//main menu
		WebElement master = driver.findElement(By.xpath(".//*[@id='navbar']/ul/li[3]/a"));
		WebElement employe = driver.findElement(By.linkText("Employee"));
		System.out.println("Mainmenu selected");
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		action.moveToElement(master).moveToElement(employe).click().build().perform();
		
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		//Employee
//		driver.findElement(By.xpath(".//*[@id='EmployeeName']")).click();
		
////		driver.switchTo().alert().dismiss();
//		Alert alert = driver.switchTo().alert();	
//		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
//		String alertMessage= driver.switchTo().alert().getText();
//		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
//		System.out.println(alertMessage);	
//	    Thread.sleep(5000);
//	    alert.accept();	
		
		
		driver.findElement(By.xpath(".//*[@id='EmployeeName']")).sendKeys("Arunkumar");
		driver.findElement(By.id("LastName")).sendKeys("M");
		
		Select  Gender = new Select (driver.findElement(By.id("ddlGender")));
		Gender.selectByIndex(1);
		
		Select SSNStatus  = new Select (driver.findElement(By.id("ddlSSN")));
		SSNStatus.selectByIndex(1);
		
		Select Designation = new Select (driver.findElement(By.id("ddlDesignation")));
		Designation.selectByVisibleText("Maker");
		
		driver.findElement(By.cssSelector("#Salary")).sendKeys("30000");
		
		driver.findElement(By.xpath(".//*[@id='Emailid']")).sendKeys("Testing.engg@isolve.com");
		
		driver.findElement(By.id("MobileNo")).sendKeys("9996663332");
		
		driver.findElement(By.id("PhoneNo")).sendKeys("04456238956");
		
		List<WebElement> allDates=driver.findElements(By.id("DOB"));
		
		for(WebElement ele:allDates)
		{
			
			String date=ele.getText();
			
			if(date.equalsIgnoreCase("28"))
			{
				ele.click();
				break;
			}
			
		}
//		driver.findElement(By.id("DOB")).sendKeys("02/06/2018");
		List<WebElement> allDatess=driver.findElements(By.id("DOJ"));
		{
		for(WebElement element:allDates)
			{
			String datee=element.getText();
			
			if(datee.equalsIgnoreCase("28"))
			{
				element.click();
				break;
			}
			
		}
		driver.findElement(By.cssSelector("#Address1")).sendKeys("Chennai velachery");
		
		driver.findElement(By.cssSelector("#Address2")).sendKeys("Chennai2");
		
		driver.findElement(By.name("PINCode")).sendKeys("Chennai2");
		Select ProofType = new Select (driver.findElement(By.id("ddlSSN")));
		
		ProofType.selectByIndex(1);
		driver.findElement(By.name("btn btn-primary")).sendKeys("D:\\Testing docs\\boss_man-512.png");
		driver.findElement(By.name("btn btn-primary")).sendKeys("D:\\Testing docs\\images.jpg");
		driver.findElement(By.id("Status")).click();
	}

}
}