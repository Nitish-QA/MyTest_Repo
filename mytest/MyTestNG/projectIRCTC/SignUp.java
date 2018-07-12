package projectIRCTC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SignUp {
	
	WebDriver driver;
	
@BeforeClass
public void OpenURL() {
	System.setProperty("webdrivhaer.chrome.driver", "C:\\Testing\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.irctc.co.in");
}

@Test
public void OpenSignUpWindow() {
	driver.findElement(By.xpath("//div[@class='h_menu_drop_button hidden-xs']//a[@tabindex='0']//i[@class='fa fa-align-justify']")).click();
	driver.findElement(By.xpath("//nav[@class='nav-bar']/div//label[@class='ng-star-inserted']")).click();
}

@AfterClass
public void CloseBrowser() {
	System.out.println("****************");
}

}
