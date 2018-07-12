package mytest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicContent {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://the-internet.herokuapp.com");
		driver.findElement(By.xpath("//a[@href='/dynamic_content']")).click();

		String compare = driver.findElement(By.xpath("(//div[@class='large-10 columns'])[1]")).getText();
		driver.navigate().refresh();
		for (int j = 0; j < 10; j++) {
			List<WebElement> des = driver.findElements(By.xpath("//div[@class='large-10 columns']"));
			int count = des.size();

			for (int i = 0; i < count; i++) {

				System.out.println(des.get(i).getText() + "\n");

				if (des.get(i).getText().contains(compare)) {
					// System.out.println(des.get(i).getText()+"\n");
					driver.close();
				}
			}

			driver.navigate().refresh();
		}

	}
}
