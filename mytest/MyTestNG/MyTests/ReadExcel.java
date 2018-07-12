package MyTests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception { // Use simple "Exception" to handle all type of exception
		// TODO Auto-generated method stub
		
		             //create a File object and pass Location of the Excel File.
		File xl = new File("C:\\Testing\\ExcelData\\TestData1.xlsx");

		            // Create FileInputStream object and pass the File object
		FileInputStream fis = new FileInputStream(xl);

		            // To deal with xlsx file we use XSSFWorkbook and for xls file we use HSSFWorkbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		            // Now we need to specify sheet of the xslx (i.e which sheet we need to access)
		XSSFSheet sheet = wb.getSheet("Sheet1");

		            // Now to call a data from excel
		String value1 = sheet.getRow(0).getCell(0).getStringCellValue();

		System.out.println(" First username is " + value1);

	// >>>>>>>>>>>> TO PRINT ALL THE VALUES IN <<<<<<<<<<<<<<<<<<<<<<<<<

		            // To COUNT number of ROWS
		int rcount = sheet.getLastRowNum();
		System.out.println("No. of Rows are " + rcount);

		for (int i = 0; i < rcount; i++) {
			String values = sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println("In row" + i + " value is " + values);
		}

	}
	/*
	  NOW WE CAN'T WRITE above Codes in Each Class to get those data.
	  This is not the smart way, So better we should create a library
	  and access it from anywhere please REFER "ReadExcelLibrary" in Package MyLib
	*/

}
