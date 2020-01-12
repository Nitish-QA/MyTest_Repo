package mytest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitching {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://accounts.google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@href='https://support.google.com/accounts?hl=en']")).click();

		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentId = it.next();
		String ChildId = it.next();
		driver.switchTo().window(ChildId);

		System.out.println(driver.getTitle());
		Thread.sleep(5000L);
		System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/p")).getText());

	}
}
