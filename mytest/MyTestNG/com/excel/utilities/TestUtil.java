package com.excel.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestUtil {

	public TestUtil() throws Exception {
		ArrayList<Object[]> data = new ArrayList<Object[]>();
		 
		FileInputStream fis = new FileInputStream("C:\\Testing\\ExcelData\\TestData1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		                  //int SheetCnt = wb.getNumberOfSheets();
		XSSFSheet sheet = wb.getSheetAt(3);
		
		for(int rownum=0;rownum<=sheet.getLastRowNum();rownum++) {
		
	
		}
		return;
	}
}	
		
		
		
		
		
		

		/*FileInputStream fis = new FileInputStream("C:\\Testing\\ExcelData\\TestData1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		int SheetCnt = wb.getNumberOfSheets();
		for (int i = 0; i < SheetCnt; i++) {
			if (wb.getSheetName(i).equalsIgnoreCase("Sheet4")) {

				XSSFSheet sheetnum = wb.getSheetAt(i);
				      //Now we use Iterator to Iterate through each row
				Iterator<Row> rows  = sheetnum.iterator();
				Row row1 = rows.next();  // control goes to 1st row
	            Iterator<Cell> row1cell = row1.cellIterator();  // to iterate through cells of first row
	            //row1cell.next(); //control will goes to first column
	            while (row1cell.hasNext()) {
	            	Cell value  = row1cell.next();
	            	if(value.getStringCellValue().equalsIgnoreCase("FirstName")))
	            }
	            
  			}
		}*/

	
