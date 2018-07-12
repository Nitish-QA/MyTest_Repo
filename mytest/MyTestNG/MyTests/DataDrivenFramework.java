package MyTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenFramework {
	WebDriver driver;

	@Test(dataProvider = "myData")  //here it will take data from dataprovider
	public void Login(String username, String password) {

		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.wordpress.com");
		driver.findElement(By.xpath("//a[@id='navbar-login-link']")).click();

		driver.findElement(By.xpath("//input[@id='usernameOrEmail']")).sendKeys(username);

		driver.findElement(By.xpath("//button[@class='button form-button is-primary']")).click();

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	@DataProvider(name = "myData")
	public Object[][] passData() { 
		Object[][] data = new Object[3][2]; //here we pass

		data[0][0] = "admin1";
		data[0][1] = "demo1";

		data[1][0] = "admin2";
		data[1][1] = "demo2";

		data[2][0] = "admin3";
		data[2][1] = "demo3";

		return data;

	}

}
