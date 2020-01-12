package mytest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseWeb{
	
  public static void main (String[]args) throws InterruptedException {
  System.setProperty("webdriver.chrome.driver", "C:\\Testing\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.get("http://www.goindigo.in");
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  
  driver.findElement(By.xpath("//a[@class='bw-trip-tabs']")).click();
  driver.findElement(By.xpath("//input[@id='depart-date']")).click();
  
  String month = driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']/div/div/span[1]")).getText();
  System.out.println(month);
 
  while(!month.contains("March")) {
	  driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	 
  }
  }
}

	

	
	
	


	