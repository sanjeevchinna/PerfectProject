package stepDefinition;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import tech.grasshopper.pdf.extent.ExtentPDFCucumberReporter;

public class Extent_Report {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		ExtentPDFCucumberReporter pdf = new ExtentPDFCucumberReporter("src\\index.pdf");
		ExtentReports er= new ExtentReports();
		ExtentTest logger= er.createTest("Extent_Report");
		
		
	}

}
  