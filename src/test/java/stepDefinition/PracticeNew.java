package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.reactivex.rxjava3.functions.Action;



public class PracticeNew {
	static WebDriver driver;
	public static void driverint()
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	    driver= new ChromeDriver();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driverint();
		driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		Actions act = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//*[text()='Draggable 1']"));
		WebElement target = driver.findElement(By.xpath("//*[@id=\"mydropzone\"]"));
		act.dragAndDrop(source, target).build().perform();;
		
		
		
	}

}
