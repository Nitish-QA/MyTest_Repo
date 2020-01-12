package mytest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass2 extends PreCondition {

	public static void main(String[] args) {
		
		initialization();
		
        driver.get(prop.getProperty("ActionClass2URL"));
		
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().build().perform();
		WebElement  move = (driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")));
		a.moveToElement(move).keyDown(Keys.SHIFT).sendKeys("hello").sendKeys(Keys.SPACE).keyUp(Keys.SHIFT).sendKeys("girl").build().perform();
	
	}

}
