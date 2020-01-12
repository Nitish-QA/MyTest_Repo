package mytest;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
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
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Screenshots.takeScreenshot;

public class Practise {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "path");
		
		WebDriver driver = new ChromeDriver();
		
		driver.findElement(By.xpath("//index[@Attribute='values']"));
		
		Actions act =  new Actions(driver);
		act.moveToElement(driver.findElement(By.id(""))).sendKeys(Keys.DOWN).click().build().perform();
		
		WebElement d = driver.findElement(By.xpath(""));
		
		Select sel = new Select(d);
		driver.switchTo().alert();
		
		
	}

}