package mytest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLcerifications {

	public static void main(String[] args) {
		
		
		DesiredCapabilities a = DesiredCapabilities.chrome();
		//a.acceptInsecureCerts();
		a.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ChromeOptions c = new ChromeOptions();
		c.merge(a);
		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);
		driver.get("http://www.cacert.org");
		
	}
	
}
