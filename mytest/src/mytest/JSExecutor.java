package mytest;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutput;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class JSExecutor {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C/dbsdjs/dsds/sdd.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");

		driver.findElement(By.id("")).click();

		driver.switchTo().frame("");

		driver.findElement(By.xpath("")).sendKeys("");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// here we typecasted JavascriptExecutor interface

		js.executeScript("0, 400");
		// now pass the javascript code to scroll vertically by increasing y-axis

		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.id("")));
		// here we passed small javascript code to scroll till the reqd. element is not
		// visible on the screen

	}
}
