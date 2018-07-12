package mytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	
	public static void main (String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("nitish25j@gmail.com");
		driver.findElement(By.cssSelector("input[data-testid='royal_pass']")).sendKeys("zxcvbnm");
		driver.findElement(By.xpath("//input[@data-testid='royal_login_button']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='_4rbf _53ij']")).getText()); // xpath created for error message
		
		
	}

}
