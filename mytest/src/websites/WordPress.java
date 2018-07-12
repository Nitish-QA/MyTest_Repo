package websites;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WordPress {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.wordpress.com");

		driver.findElement(By.id("navbar-login-link")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/a[1]/span[1]")).click();
		driver.findElement(By.className("about__checkbox-label")).click();
		driver.findElement(By.xpath("//div[@class='about__submit-wrapper']/button")).click();
		driver.findElement(By.id("search-component-1")).sendKeys("ajitahulwalia");
		Thread.sleep(3000L);

		List<WebElement> k = driver
				.findElements(By.xpath("//div[@class='domain-suggestion card is-compact is-clickable']"));

		int s = k.size();
		for (int i = 0; i < s; i++) {
			System.out.println(k.get(i).getText());

			if (k.get(i).getText().contains("ajitahulwalia.wordpress.com")) {
				k.get(i).click();
			}
		}
	}
}