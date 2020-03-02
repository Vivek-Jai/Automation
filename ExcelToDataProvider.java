package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.DataProvider;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelToDataProvider {
	
	static String [][] data;
	
	@DataProvider(name= "register")
	public static String[] [] register() throws BiffException, IOException
	{
		data=getExceldata();
		
		return data;
	}
	
	
	
	
	
	public static String [][] getExceldata() throws BiffException, IOException
	{
		FileInputStream Fis = new FileInputStream("C:\\Users\\innoppl\\Desktop\\Data.xls");
		
		Workbook workbook = Workbook.getWorkbook(Fis);
		
		Sheet sheet = workbook.getSheet(0);
		
		int rc = sheet.getRows();
		int col = sheet.getColumns();
		
		String TestData [] []  = new String [rc-1] [col];
		
		for (int i=1; i< rc; i++)
		{
			for(int j=0; j<col;j++)
			{
				TestData [i-1][j] = sheet.getCell(j, i).getContents();
			}
		}
		return TestData;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
