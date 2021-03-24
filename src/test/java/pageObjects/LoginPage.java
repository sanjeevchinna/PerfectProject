package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="Email")
	WebElement email;
	@FindBy(id="Password")
	WebElement password;
	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	WebElement submit;
	@FindBy(linkText = "Logout")
	WebElement logout;
	public void setEmail(String username)
	{
		email.clear();
		email.sendKeys(username);
	}
	public void setPassword(String pass)
	{
		password.clear();
		password.sendKeys(pass);
		
	}
	public void clickSubmit()
	{
		submit.click();
	}
	public void logout()
	{
		logout.click();
	}
}