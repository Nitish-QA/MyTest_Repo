package mytest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().build().perform();
		WebElement  move = (driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")));
		a.moveToElement(move).keyDown(Keys.SHIFT).sendKeys("hello").sendKeys(Keys.SPACE).keyUp(Keys.SHIFT).sendKeys("girl").build().perform();
		
	}

}
