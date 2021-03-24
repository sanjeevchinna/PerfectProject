package testRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.java.it.Data;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions(		
		features = "Features",
		glue = {"stepDefinition","appHooks"},
		plugin = {"pretty",
				"html:src\\test-output\\index.html",	
				
		},
		monochrome = true,
		publish = true			
		
		)


public class TestRunner{
	
	
	

}
