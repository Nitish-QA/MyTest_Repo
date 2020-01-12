package mytest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessTesting {

	public static void main(String[] args) {
		
		// METHOD-1  Using Headless Browser, First add jars of HtmlUnitDriver 

		HtmlUnitDriver driver = new HtmlUnitDriver(); // Just create object of HTMLUnitDriver Class
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());

		
		
//-------------For Browser specific Headless Browser Testing-------------------------------------------------------		
		
	// CHROME- Using Headless browser for Chrome
		
		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions(); // First create object of ChromeOptions Class
		options.setHeadless(true); // set headless to true

		WebDriver driver1 = new ChromeDriver(options); // Pass the object reference here

		driver1.get("http://www.google.com");
		System.out.println(driver1.getTitle());

	// FIREFOX- Using Headless browser for Firefox
		
		System.setProperty("webdriver.geckodriver.driver", "C:\\Testing\\geckodriver.exe");

		FirefoxOptions options2 = new FirefoxOptions(); // First create object of FirefoxOptions Class
		options2.setHeadless(true); // set headless to true

		WebDriver driver2 = new FirefoxDriver(options2); // Pass the object reference here

		driver2.get("http://www.google.com");
		System.out.println(driver2.getTitle());

	}

}
