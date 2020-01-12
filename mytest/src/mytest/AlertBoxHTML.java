package mytest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxHTML extends PreCondition {

	public static void main(String[] args) {
		initialization();

		driver.get(prop.getProperty("AlertBoxHTMLURL"));

		driver.findElement(By.xpath("(//div[@class='ios-ui-select-ex'])[9]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='btn.buttonGlbl.btn-close.button-trigger")).submit();

	}
}
