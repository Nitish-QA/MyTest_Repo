package MyTests;

import com.excel.utilities.ReadExcelDataConfig;

public class TakingExcelData {

	public static void main(String[] args) {
		
		//To take excel data we will create object with class name of that excel library that we created earlier
		
		ReadExcelDataConfig excel = new ReadExcelDataConfig("C:\\Testing\\ExcelData\\TestData1.xlsx");
		 
		System.out.println(excel.getData(1, 0, 0));
		System.out.println(excel.getData(1, 0, 1));
		
		
		System.out.println(excel.getData(2, 0, 0));
		System.out.println(excel.getData(2, 0, 1));
	

	}
}
