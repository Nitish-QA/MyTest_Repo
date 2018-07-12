package project2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationPractise {


		public static void main(String[]args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Testing\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query=t-shirts&submit_search=");
			WebElement ItemDriver = driver.findElement(By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line']"));
			Actions move = new Actions(driver);
			move.moveToElement(ItemDriver).build().perform();
			move.moveToElement(ItemDriver).click(driver.findElement(By.xpath("//div[@class='product-container']/div[2]/div[2]//a[@class='button ajax_add_to_cart_button btn btn-default']"))).build().perform();
	
			Thread.sleep(2000L);
			driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']//span")).click();
			
		}

}
