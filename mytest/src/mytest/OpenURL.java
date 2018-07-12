package mytest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenURL {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.gecko.driver","C:\\Testing\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();	
	
	driver.get("http://www.google.com");
    System.out.println(driver.getCurrentUrl());
   // System.out.println(driver.getPageSource());
    
    driver.get("http://yahoo.com");
    System.out.println(driver.getCurrentUrl());
    driver.navigate().back();
    System.out.println(driver.getCurrentUrl());
    
    
    
	//driver.close();
		
		
		
		
	}

}
