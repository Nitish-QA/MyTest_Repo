package projectSpiceJet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignUp {
	WebDriver driver;

	@BeforeClass
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test(priority=1)
	public void OpenURl() {
		driver.get("http://www.spicejet.com");
	}
	
	@Test(priority=2)
	public void ClickSignUp() {
		Actions act = new Actions(driver);
		WebElement LogSign = driver.findElement(By.xpath("//a[@id='ctl00_HyperLinkLogin']"));
		WebElement Regis = driver.findElement(By.xpath("//a[@id='ctl00_HyperLinkLogin']"));
		act.moveToElement(LogSign).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_LEFT,Keys.ARROW_DOWN,Keys.ENTER).build().perform();
	}
	@AfterClass
	public void CloseBrowser() {
		
	}
	
}
