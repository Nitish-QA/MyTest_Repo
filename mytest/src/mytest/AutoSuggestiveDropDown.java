package mytest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","C:\\Testing\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://www.ksrtc.in");
    driver.findElement(By.id("fromPlaceName")).sendKeys("Bang");
    driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
    System.out.println(driver.findElement(By.id("fromPlaceName")).getText());
    
    
 
	JavascriptExecutor js = (JavascriptExecutor)driver;
	String script = "return document.getElementById(\"fromPlaceName\").value;";
	String text = (String) js.executeScript(script);

	int i=0;
	
	while(!text.equalsIgnoreCase("bangalore internation aiport")) {
		i++;
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		text = (String) js.executeScript(script);
		System.out.println(text);
		
		if(i>10) {
			break;
		}
	}
	
	
	
	
	
	
    
    
    
    
    
    
    
	}

}
