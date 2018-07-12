package projectSpiceJet;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePage {
	WebDriver driver;
	
	@BeforeTest
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void OpenURl() {
		driver.get("http://www.spicejet.com");
	}

	@Test
	public void PageTitle() {
		System.out.println(driver.getTitle());
	}

	@Test
	public void searchFlight() throws InterruptedException {
		// round way
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		// Departure & Arrival City
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
        //Departure Date
		while (!driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//span[@class='ui-datepicker-month']")).getText().equalsIgnoreCase("september")) {
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		driver.findElement(By.xpath("(//div[@class='ui-datepicker-group ui-datepicker-group-last']//a[@class='ui-state-default'])[27]")).click();
        //Return Date
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='picker-second']//button[@class='ui-datepicker-trigger']")).click();
		while (!driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//span[@class='ui-datepicker-month']")).getText().equalsIgnoreCase("october")) {
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		driver.findElement(By.xpath("(//div[@class='ui-datepicker-group ui-datepicker-group-first']//a[@class='ui-state-default'])[4]")).click();
        //number of person = 2 adults
		Thread.sleep(2000);
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		while(!driver.findElement(By.id("spanAudlt")).getText().equals("2")){
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		//person type for discount = student
		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		
		//currency USD
		Select dropdown= new Select(driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")));
		dropdown.selectByValue("USD");
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		System.out.println(driver.getTitle());
		}
	
	@AfterTest
	public void terminate() {
		driver.close();
	}
}
