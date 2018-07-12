package mytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.spicejet.com");
		//Now we need to create an object
		
		Select dropdown= new Select(driver.findElement(By.name("ctl00$mainContent$ddl_Adult")));
		
		dropdown.selectByIndex(1); // First Method
		dropdown.selectByValue("3");  // Second Method
		dropdown.selectByVisibleText("6");  //Third Method
	}
}
