package MyTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.excel.utilities.TestUtil;

public class eBaySignUPExcel {

	WebDriver driver;
	
	@BeforeMethod
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Testing\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@DataProvider
	public void getData() {
		TestUtil excel = new TestUtil("C:\\Testing\\ExcelData\\TestData1.xlsx");
		
		
	}
	@Test(dataProvider = "getData ")
	public void eBaySignUp(String FirstName, String LastName, String Email, String Password) {
		driver.get("https://reg.ebay.in/reg/PartialReg");
		
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(FirstName);
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(LastName);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Email);
		driver.findElement(By.xpath("//input[@id='PASSWORD']")).sendKeys(Password);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
