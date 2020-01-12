package mytest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

/*Steps:
 * 1. First download Apache POI jars and Add to the java project build path
 * 2. Now for using Excel sheet we have to navigate to Excel->workbooks->sheets->rows->cells
 * 3. Need to use FileInputStream class from java to read the file(excel in this case). To write the data use FileOutputStream.
 * 4. Now for accessing workbook create object of XSSFWorkbook class.
 * 5. To access sheets create object of XSSFSheet class
 * 6. To access rows create object of XSSFRow class
 * 7. To access cells create object of XSSFCell class
 * 
 */

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream("C:\\Testing\\ExcelData\\TestData1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheet("Sheet4"); // locate sheet by sheet name
		// OR
		// XSSFSheet sheet = workbook.getSheetAt(3); // locate sheet by Index

// PRINT DATA FROM EXCEL

		int rowcount = sheet.getLastRowNum(); // to get row count
		System.out.println("number of rows are: " + rowcount);

		int colcount = sheet.getRow(0).getLastCellNum(); // for cell count first get first row and get count of last
															// cell
		System.out.println("number of rows are: " + rowcount);

		for (int i = 0; i < rowcount; i++) {
			XSSFRow currentrow = sheet.getRow(i); // get the row and store it

			for (int j = 0; j < colcount; j++) {
				String value = currentrow.getCell(j).toString(); // to get the value from cells
				System.out.print(" "+value);
			}
			
			System.out.println();

		}

		// To get value from particular cells
		String userid = sheet.getRow(1).getCell(2).toString();
		String pwd = sheet.getRow(1).getCell(3).toString();
		System.out.println("username is = " + userid);
		System.out.println("password is = " + pwd);
		
		sheet.

	}

}
