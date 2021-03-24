  package stepDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgDemo {
	@DataProvider(name ="dataprovider")
	public String[][] testData() throws IOException
	{ 
		
		File file= new File("C:\\Users\\sanje\\OneDrive\\Desktop\\test.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet= workbook.getSheetAt(0);
		
		int rowcount= sheet.getLastRowNum()-sheet.getFirstRowNum();
		int cellcount = sheet.getRow(1).getLastCellNum();
		String[][] a= new String[rowcount][cellcount];
			
		
		for (int i = 2; i < rowcount; i++) {
			
			for (int j = 2; j < cellcount; j++) {
				a[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(a[i][j]);
				
			}
			
			
		}	
		workbook.close();
		
		return a;
		
	}

	@Test(dataProvider = "dataprovider")
	public void practice(String username ,String password)
	{
		System.out.println(username);
		System.out.println(password);
	}

}
