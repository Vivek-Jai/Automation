package rest.Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writeexcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("C:\\Users\\LENOVO\\Desktop\\write.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sh = wb.getSheet("Sheet1");
        
        sh.createRow(0).createCell(1).setCellValue("vivek");
        
        
        FileOutputStream fout = new FileOutputStream("C:\\Users\\LENOVO\\Desktop\\write.xlsx");
        
        wb.write(fout);
        fout.close();
        

		
        
	}

}
