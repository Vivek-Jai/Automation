package rest.Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream  XL = new FileInputStream ("C:\\Users\\LENOVO\\Desktop\\ReadExcel.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(XL);
        XSSFSheet sh = wb.getSheet("Sheet1");
        
     int rc = sh.getLastRowNum();
     int col= sh.getRow(rc).getLastCellNum();
     
    // System.out.println(rc);
   //  System.out.println(col);
    /* String val= sh.getRow(0).getCell(0).getStringCellValue();
     String val1= sh.getRow(0).getCell(2).getStringCellValue();
     
     System.out.println(val);
     System.out.println(val1);*/
     
     for( int i=0;i<=rc;i++){
    	 for( int j=0;j<col;j++)
    	 {
    	 
    	CellType type = sh.getRow(i).getCell(j).getCellTypeEnum();
    	
    	if(type==CellType.NUMERIC)
    	{
    		System.out.println(sh.getRow(i).getCell(j).getNumericCellValue());
    	}
    	else if (type==CellType.STRING)
    	{
    		System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
    	}
    	
    	
    	
    	
    	 }
    	 
	}
    
}
}

