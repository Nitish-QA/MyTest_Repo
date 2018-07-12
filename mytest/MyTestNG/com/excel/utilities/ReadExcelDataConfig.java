package com.excel.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelDataConfig {

	XSSFWorkbook wb;
	XSSFSheet sheet;

	// FIRST CREATE A CONSTRUCTOR
	// Constructor name remains same as the class name always
	public ReadExcelDataConfig(String excelPath) {

		try {
			File xl = new File(excelPath);

			FileInputStream fis = new FileInputStream(xl);

			wb = new XSSFWorkbook(fis);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public String getData(int sheetnum, int row, int column) {
		
		sheet = wb.getSheetAt(sheetnum);
		String data = sheet.getRow(row).getCell(column).getStringCellValue();
		return data;
	}
}
//DONE