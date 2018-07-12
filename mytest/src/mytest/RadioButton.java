package mytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		//driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		
		//System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size());
		int count =driver.findElements(By.xpath("//input[@name='group1']")).size();
		
		for(int i=0;i<count;i++) {
			String text=(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));
			
			if(text.equals("Cheese")) {
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
				}
		}
	}
}
