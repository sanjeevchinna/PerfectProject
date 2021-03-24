package stepDefinition;



import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;
import pageObjects.LoginPage;
import utility.DriverFactory;

public class LoginSteps {
	WebDriver driver;	
	LoginPage loginPage;
	DriverFactory driverFactory;
		

@Given("user Launch {string} browser")
public void user_launch_chrome_browser(String browser) {
	driverFactory = new DriverFactory();	
	driverFactory.setDriver(browser);
	driver = driverFactory.getDriver();
	loginPage=new LoginPage(driver);   
	Actions action= new Actions(driver);

}

@When("when user opens {string}")
public void when_user_opens(String url) {
   driver.get(url);
}

@When("user enters username as {string}")
public void user_enters_username_as(String email) {
   loginPage.setEmail(email);
   }

@When("user enters password ad {string}")
public void user_enters_password_ad(String password) {
    loginPage.setPassword(password);
    loginPage.clickSubmit();
}

@Then("user need to login succefully")
public void user_need_to_login_succefully() {
	boolean get;
	if(driver.getTitle().contains("Dashboard"))
	{
		get=true;
	
	}
	else
	{
		get=false;
	}
	Assert.assertTrue(get);
    
}
@Then("logout")
public void logout()
{
	loginPage.logout();
}

}
