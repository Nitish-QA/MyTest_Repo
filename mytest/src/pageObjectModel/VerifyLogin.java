package pageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyLogin {

	@Test
	public void entercredentials() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://wordpress.com/log-in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		LoginPage login = new LoginPage(driver);
		login.typeusername();
		login.clickcontinue();
		Thread.sleep(2000L);
		login.enterpassword();
		login.clickloginbutton();
		
	}
}
