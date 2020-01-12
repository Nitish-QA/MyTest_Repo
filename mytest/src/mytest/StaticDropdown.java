package mytest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {


	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.spicejet.com");
		
		
	//Now we need to create an object
		
		Select select= new Select(driver.findElement(By.name("ctl00$mainContent$ddl_Adult")));
		
		select.selectByIndex(1); // First Method
		select.selectByValue("3");  // Second Method
		select.selectByVisibleText("6");  //Third Method
		
		select.deselectByIndex(1); // First Method
		select.deselectByValue("3");  // Second Method
		select.deselectByVisibleText("6");  //Third Method
		
	//To print all available options in the dropdown
		List<WebElement> options = select.getOptions();
		System.out.println(options);
		
		
	//To deselect all previously selected options
		select.deselectAll();
		
		
	//To print first selected option
		System.out.println(select.getFirstSelectedOption().getText());

		
	}
	   
}
