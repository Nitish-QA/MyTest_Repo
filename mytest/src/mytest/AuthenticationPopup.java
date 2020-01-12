package mytest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		  // To Pass username password in authentication popup we need to pass in url "http://username:password@url"
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	}

}
