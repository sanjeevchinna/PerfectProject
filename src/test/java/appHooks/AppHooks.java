package appHooks;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utility.DriverFactory;

public class AppHooks extends DriverFactory {
	DriverFactory driverfactory = new DriverFactory();
	WebDriver driver;
	@After
	public void tearDown()
	{
		driver= driverfactory.getDriver();
		driver.close();
		
	}

}
