package mytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTesting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.setProperty("webdriver.chrome.driver", "C:\\Testing\\chromedriver.exe");
   WebDriver driver = new ChromeDriver();
   driver.get("https://similac.com/contact");
   int number = FindFramenumber(driver,By.className("recaptcha-checkbox-checkmark"));
   driver.switchTo().frame(number);
   driver.findElement(By.className("recaptcha-checkbox-checkmark")).click();
  
	}
	
	public static int FindFramenumber(WebDriver driver, By by)
	{
		int i;
		int framecount = driver.findElements(By.tagName("iframe")).size();
		
		for(i=0;i<framecount;i++) {
			driver.switchTo().frame(i);
			int count = driver.findElements(by).size();
			if(count>0) {
				break;
			}
			else {
				System.out.println("continue looping");
			}
			
		}
		driver.switchTo().defaultContent();
		return i;
		
	}

}
