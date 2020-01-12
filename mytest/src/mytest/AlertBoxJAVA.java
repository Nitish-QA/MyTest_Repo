package mytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxJAVA extends PreCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		initialization();

		driver.get(prop.getProperty("AlertBoxJAVAURL"));

		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		 driver.switchTo().alert().accept();
		 System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		System.out.println(driver.switchTo().alert().getText());
		
		

	}

}
