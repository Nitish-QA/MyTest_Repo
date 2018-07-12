package mytest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.makemytrip.com/");
		     // Select Month
		driver.findElement(By.id("hp-widget__depart")).click();
		while(!driver.findElement(By.xpath("//div[@class='dateFilter hasDatepicker'] //div[@class='ui-datepicker-group ui-datepicker-group-last'] //span[@class='ui-datepicker-month']")).getText().contains("NOVEMBER")) {
			driver.findElement(By.xpath("//div[@class='dateFilter hasDatepicker'] //div[@class='ui-datepicker-group ui-datepicker-group-last'] //span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		     // Now Select Date
		driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']/table/tbody/tr[4]/td[3][contains(@data-month,'10')]")).click();
		     // OR Best practises for selecting Date
		int count = driver.findElements(By.xpath("//td[@data-month='10']")).size();
		for(int i=1;i<count;i++) {
			String day = driver.findElements(By.xpath("//td[@data-month='10']")).get(i).getText();
			
			if(day.equalsIgnoreCase("21")) {
				driver.findElements(By.xpath("//td[@data-month='10']")).get(i).click();
			}
		
		}
		
			
		
	}
}
		

