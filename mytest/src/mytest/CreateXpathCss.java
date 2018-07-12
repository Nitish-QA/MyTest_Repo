package mytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateXpathCss {
	
	public static void main (String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\Testing\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://login.salesforce.com");
		
		//formulae for Xpath = //tagname[@attribute 'value'])
		// formulae for Css =    tagname[attribute 'value']
		
		driver.findElement(By.xpath("//input[@type = 'email']")).sendKeys("UsernameEntered");
		
		driver.findElement(By.cssSelector("*[type = 'password']")).sendKeys("vikash");
		driver.findElement(By.id("Login")).click();
		
		System.out.println(driver.findElement(By.id("error")).getText());
		
	}

}
