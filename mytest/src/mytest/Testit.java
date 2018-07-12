package mytest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testit {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://irctc.co.in");
		// FROM Station
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='From*']")).click();
		// String From ="";
		// driver.findElement(By.xpath(".//*[@id='origin']/span/input")).sendKeys("DLI");
		// driver.findElement(By.xpath(".//*[@id='origin']/span/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//input[@autocomplete='off'])[1]")).sendKeys("DLI");
		List<WebElement> list1 = driver.findElements(
		By.xpath("//span[@class='ui-autocomplete ui-widget']/div/ul/li//span[@class='ng-star-inserted']"));
		int count1 = list1.size();
		for (int i = 0; i < count1; i++) 
		{
		if (list1.get(i).getText().contains("DLI")) 
		{
		      list1.get(i).click();
		}
		}
		// TO Station
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]")).sendKeys("PNBE");
		List<WebElement> list2 = driver.findElements(
		By.xpath("//span[@class='ui-autocomplete ui-widget']/div/ul/li//span[@class='ng-star-inserted']"));
		int count2 = list2.size();
		for (int j = 0; j < count2; j++) 
		{
		if (list2.get(j).getText().contains("PNBE")) 
		{
		list2.get(j).click();
		}
		}
		// Month
		driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]")).click();
		while (!driver.findElement(By.xpath("//span[@class='ui-datepicker-month ng-tns-c14-5 ng-star-inserted']"))
		.getText().equalsIgnoreCase("September")) {
		    driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
		}
		// DAY   //table[@class='ui-datepicker-calendar ng-tns-c14-5 ng-star-inserted']//tr//td
		List <WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar ng-tns-c14-5 ng-star-inserted']//tr//td"));
		// List<WebElement> day = driver.findElements(By.xpath("//td[@class='ng-tns-c14-5 ng-star-inserted']"));
		int count3 =driver.findElements(By.xpath("//td[@class='ng-tns-c14-5 ng-star-inserted']")).size();
		// int count3 = day.size();
		for (int k = 0; k < count3; k++) 
		{
		String date = driver.findElements(By.xpath("//td[@class='ng-tns-c14-5 ng-star-inserted']")).get(k).getText();
		if(date.equalsIgnoreCase("21"))
		{
		driver.findElements(By.xpath("//td[@class='ng-tns-c14-5 ng-star-inserted']")).get(k).click();
		System.out.println(date);
		break;
		}
//		     if (day.get(k).getText().equalsIgnoreCase("21")) {
//		       day.get(k).click();
		// }

		}
		// Find Trains
		driver.findElement(By.xpath("(//button[@class='search_btn'])[1]")).click();
		        

		}

		}

