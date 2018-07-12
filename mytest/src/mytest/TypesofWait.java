package mytest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TypesofWait {

	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://alaskatrips.poweredbygps.com");
//IMPLICIT WAIT		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@class='tab-label']")).click();
		driver.findElement(By.xpath("//input[@id='hotel-destination']")).sendKeys("NYC");
		driver.findElement(By.xpath("//input[@id='hotel-destination']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@id='hotel-checkin']")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//a[contains(@href,'New-York-Hotels-San-Carlos-Hotel')]")).click();
		
// EXPLICIT WAIT 	
		WebDriverWait d = new WebDriverWait(driver,5);  
		d.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@href,'New-York-Hotels-San-Carlos-Hotel')]")));
// Thread.sleep(5000L) 	
		Thread.sleep(5000L);	// means execution paused for 5 seconds	
		driver.findElement(By.xpath("//a[contains(@href,'New-York-Hotels-San-Carlos-Hotel')]")).click();
		

		
	}
}
