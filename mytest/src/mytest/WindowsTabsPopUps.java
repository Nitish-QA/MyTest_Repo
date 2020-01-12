package mytest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsTabsPopUps {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "arg1");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		String parent = driver.getWindowHandle();

		Set<String> wins = driver.getWindowHandles();

		/*
		 *IMP NOTE-----Since SET Interface or HashSet Class doesn't provide get() method so
		 * we cannot use 'for' loop. We have to use either an 'Iterator' or adavnced for
		 * loop.
		 */

		// Method 1--- Iterate using iterator
		Iterator<String> itr = wins.iterator();

		// itr.next() will get us window id. First it will give parent window id

		while (itr.hasNext()) {

			String child = itr.next();

			if (!parent.equalsIgnoreCase(child)) {

				driver.switchTo().window(child);
				Thread.sleep(1000);
				System.out.println(driver.getTitle());
			}

			// OR Method 2--Iterate Using advance for loop

			for (String child2 : wins) {

				if (!parent.equalsIgnoreCase(child2)) {

					driver.switchTo().window(child2);

					System.out.println(driver.getTitle());
				}
			}

			// OR Method 3----navigate to particular window using ArrayList

			ArrayList<String> jkey = new ArrayList<>(wins);

			String parent1 = jkey.get(0);

			String child1 = jkey.get(1);
			String child2 = jkey.get(2);
			String child3 = jkey.get(3);

			driver.switchTo().window(child3); // OR
			driver.switchTo().window(jkey.get(3));

		}
	}
}
