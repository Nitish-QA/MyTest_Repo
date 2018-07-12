package mytest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\Testing\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.spicejet.com");
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
	}
}
