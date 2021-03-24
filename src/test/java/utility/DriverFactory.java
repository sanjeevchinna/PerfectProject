package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	
	WebDriver driver;
	private static ThreadLocal<WebDriver> tldriver = new ThreadLocal<>();
	
	public void setDriver(String browser)
	{
		if(browser.contains("Chrome")) {
			
			 System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			    driver= new ChromeDriver();
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);;
			    tldriver.set(driver);
			    
			   
		}
		else {
			System.out.println("Enter a valid browser name");
		}
		
			
	}
	public WebDriver getDriver()
	{
		return tldriver.get();
	}

}
