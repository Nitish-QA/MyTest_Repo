package mytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main (String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://login.salesforce.com");
		
		driver.findElement(By.id("username")).sendKeys("UsernameEntered");
		driver.findElement(By.id("username")).clear();
		
		driver.findElement(By.name("username")).sendKeys("UsernameEntered");
		driver.findElement(By.name("username")).clear();
		
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("UsernameEntered");
		driver.findElement(By.xpath("//*[@id='username']")).clear();	
		
		driver.findElement(By.cssSelector("#username")).sendKeys("UsernameEntered");
		//driver.findElement(By.cssSelector("#username")).clear();
		
		driver.findElement(By.id("password")).sendKeys("5628265");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		
		
		
		
		
		
	}
	
}
