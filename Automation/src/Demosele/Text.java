package Demosele;

	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

public class Text { 
				public static void main(String[] args) throws Exception{
					
//				System.setProperty("webdriver.firefox.marionette","F:\\geckodriver.exe");
				System.setProperty ("webdriver.chrome.driver","D:\\chromedriver.exe" );
				WebDriver driver = new ChromeDriver(); 
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
				String eTitle = "Implicit Wait & Explicit Wait in Selenium";
				String aTitle = "Implicit Wait & Explicit Wait in Selenium";
				// launch Chrome and redirect it to the Base URL
				driver.get("https://www.guru99.com/implicit-explicit-waits-selenium.html" );
				//Maximizes the browser window
				driver.manage().window().maximize() ;
				//get the actual value of the title
				aTitle = driver.getTitle();
				//compare the actual title with the expected title
				if (aTitle.equals(eTitle))
				{
				System.out.println( "Test Passed") ;
				}
				else {
				System.out.println( "Test Failed" );
				}
				//close browser
//				driver.close();
			}
			}
