package mytest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass extends PreCondition{

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        initialization();
		
        driver.get(prop.getProperty("ActionsClassURL"));
		
		Actions a = new Actions(driver);

		a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-yourAccount']//span[@class='nav-line-2']"))).build().perform();
		WebElement move = driver.findElement(By.xpath("//span[@class='nav-text'][contains(text(),'Your Account')]"));
		
		a.moveToElement(move).contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();	
		
		
	}

}
