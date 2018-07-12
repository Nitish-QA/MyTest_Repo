package mytest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PractiseWeb {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://irctc.co.in");

		
		/*  driver.findElement(By.
		  xpath("//div[@class='h_menu_drop_button hidden-xs']//a[@tabindex='0']//i[@class='fa fa-align-justify']"
		  )).click();
		  
		  
		  driver.findElement(By.xpath(
		  "//div[@class='ng-star-inserted']//span[@class='a']")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@id='userId']")).sendKeys("kaushal699");
		  driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys("5628265");
		  driver.findElement(By.xpath("//div[@class='nlpRefresh']")).click();
		  driver.findElement(By.xpath("//div[@class='nlpRefresh']")).click();
		  
		  Thread.sleep(9000); driver.findElement(By.
		  xpath("//button[@class='search_btn'][contains(text(),'SIGN IN')]")).click();
		  driver.findElement(By.xpath("(//span[@class='ui-autocomplete ui-widget'])[1]"
		  )).sendKeys("DLI", Keys.ARROW_DOWN, Keys.ENTER);
		 */

		// FROM Station
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@autocomplete='off'])[1]")).sendKeys("DLI");
		List<WebElement> list1 = driver.findElements(
				By.xpath("//span[@class='ui-autocomplete ui-widget']/div/ul/li//span[@class='ng-star-inserted']"));
		int count1 = list1.size();
		for (int i = 0; i < count1; i++) {
			if (list1.get(i).getText().contains("DLI")) {
				list1.get(i).click();
			}
		}

		// TO Station
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]")).sendKeys("PNBE");
		List<WebElement> list2 = driver.findElements(
				By.xpath("//span[@class='ui-autocomplete ui-widget']/div/ul/li//span[@class='ng-star-inserted']"));
		int count2 = list2.size();
		for (int j = 0; j < count2; j++) {
			if (list2.get(j).getText().contains("PNBE")) {
				list2.get(j).click();
			}
		}
		// Month
		driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]")).click();
		while (!driver.findElement(By.xpath("//span[@class='ui-datepicker-month ng-tns-c14-5 ng-star-inserted']"))
				.getText().equalsIgnoreCase("September")) {
			driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
		}
		// DAY
		List<WebElement> day = driver.findElements(By.xpath("//td[@class='ng-tns-c14-5 ng-star-inserted']"));
		int count3 = day.size();
		for (int k = 1; k < count3; k++) {

			if (day.get(k).getText().equalsIgnoreCase("21")) {
				day.get(k).click();
				break;
			}

		}
		
		/*// Ticket Type
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p-dropdown")).click();
		List<WebElement> type = driver.findElements(By.xpath("//span[@class='ng-tns-c13-6 ng-star-inserted']"));
		int count4 = type.size();
		for(int l=0;l<count4;l++) {
			if(type.get(l).getText().contains("(3A)")) {
				type.get(l).click();
			}
		}*/
	   // WebDriverWait wait = new WebDriverWait(driver, 10);so
        
	    //wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@label='Find Trains']"))));
		//driver.findElement(By.xpath("(//button[@class='search_btn'])[1]")).click();
		for(int m=0;m<2;m++) {
			try {
				WebElement w = driver.findElement(By.xpath("(//button[@class='search_btn'])[1]"));
				w.click();
			}
			catch(Exception e){
				System.out.println("Element not found");
			}
		}
		

	}
}