package mytest;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyBrokenLinks {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://learningresources.macmillaneducation.in");
		
		List<WebElement> k = driver.findElements(By.tagName("a"));
		System.out.println("Number of links = "+k.size());
		for(int i=0;i<k.size();i++) {
	     WebElement element = k.get(i);
		String url = element.getAttribute("href");		
		System.out.println(url);
		verifyLink(url);
		}
	}
    public static void verifyLink(String urlLink) {
    	try {
    		URL link = new URL(urlLink);
    		
    		HttpURLConnection httpConn = (HttpURLConnection)link.openConnection();
    		httpConn.setConnectTimeout(2000);
    		httpConn.connect();
    		if(httpConn.getResponseCode()== 200) { 
    			 System.out.println(urlLink+" - "+httpConn.getResponseMessage());
    			 }
    			 if(httpConn.getResponseCode()== 404) {
    			 System.out.println(urlLink+" - "+httpConn.getResponseMessage());
    			 }
    			 }
    	catch (Exception e) {
    		e.printStackTrace();
    	}
    }
}
