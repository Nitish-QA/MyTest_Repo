package websites;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/* TEST CASES:
 >Open Page "http://www.qaclickacademy.com/practice.php"
 >Verify page title
 >Find number of links in the page.
 >Find number of links present under title "Discount Coupons", Also, click all the links and verify  their titles.
 >Check radio buttons
 >Check text box, list out auto suggestions and print in console, select text from auto suggest list
 >Select From DropDown using KEYBOARD
 >Select From DropDown using SELECT method
 >Select From DropDown using MOUSE
 >Check and UnCheck all the CheckBoxes
 >Print title of new window and switch back to parent window and print title.
 >Print title of new tab and switch back to parent tab and print title.
 >Verify text box
 >Verify Alert message and links on it.
 >Verify Confirm Alert message and links on it.
 >Verify visibility of text box.
 >Verify Mouse Hover
 >Verify WebTable
 >Verify frames and links on it. */



public class QaClickAcademy {

	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		        //Open Page "http://www.qaclickacademy.com/practice.php"
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		        // Verify page title
		    System.out.println(driver.getTitle());
		
		        // Find number of links in the page.
	    	System.out.println(driver.findElements(By.tagName("a")).size());
		
		        // Find number of links present under title "Discount Coupons" Also, click all the links and verify their titles.
		    WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		    WebElement columndriver = footerdriver.findElement(By.xpath("//div/table/tbody/tr/td[1]"));
		    System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		        // open all links in new tab
		    int links = columndriver.findElements(By.tagName("a")).size();		
		    for(int i=1;i<links;i++) {
		    String openinnewtab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(openinnewtab);
			Thread.sleep(5000L);
		    }
		        // get title of all opened tabs
			Set<String>ids=driver.getWindowHandles();
			Iterator<String>it = ids.iterator();
			String ParentID = it.next();
			
			while(it.hasNext()){
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());				
			}  
		        driver.switchTo().window(ParentID);       
		       //Check radio buttons
			System.out.println(driver.findElements(By.xpath("//input[@name='radioButton']")).size());
			
			
			for(int i=0; i<driver.findElements(By.xpath("//input[@name='radioButton']")).size(); i++) {
				driver.findElements(By.xpath("//input[@name='radioButton']")).get(i).click();
			}         
			
			     // Check text box, list out auto suggestions and print in console, select text from auto suggest list
			driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("ind");
			List<WebElement>list = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/div[@class='ui-menu-item-wrapper']"));

			int dcount = list.size();
			for(int i=0;i<dcount;i++){
			System.out.println(list.get(i).getText());
		     if(list.get(i).getText().contains("Indonesia")){
		    	 list.get(i).click();
		     }
		    }			
			     // Select From DropDown using KEYBOARD
			driver.findElement(By.name("dropdown-class-example")).sendKeys(Keys.ENTER, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.RETURN);
		  			
		    driver.navigate().refresh();
		    
			     // Select From DropDown using SELECT method
			driver.findElement(By.name("dropdown-class-example")).click();
			Select dropdown= new Select(driver.findElement(By.name("dropdown-class-example")));
			dropdown.selectByVisibleText("Option2");
			
			driver.navigate().refresh();    
			
		/*	     // Select From DropDown using MOUSE
			
			driver.findElement(By.name("dropdown-class-example")).click();
			Actions a = new Actions(driver);    //not done
			
			a.moveToElement(driver.findElement(By.name("//select[@id='dropdown-class-example']/option[3]"))).click().build().perform();
			WebElement move = driver.findElement(By.xpath("//select[@id='dropdown-class-example']/option[3]"));
			a.moveToElement(move).click(move).build().perform();    */
			
			    // Check and Uncheck all the Checkboxes
			for(int i=0;i<driver.findElements(By.xpath("//input[@type='checkbox']")).size();i++) {
				driver.findElements(By.xpath("//input[@type='checkbox']")).get(i).click();
			}
			Thread.sleep(5000L);
			for(int i=0;i<driver.findElements(By.xpath("//input[@type='checkbox']")).size();i++) {
				driver.findElements(By.xpath("//input[@type='checkbox']")).get(i).click();
			}   
			
		        // Print title of new window and switch back to parent window and print title.
			driver.findElement(By.xpath("//button[@id='openwindow']")).click();
			Set<String>ids1 = driver.getWindowHandles();					
			Iterator<String> w =ids1.iterator();			
			String ParentID1 = w.next();
			String ChildID = w.next();
			System.out.println(driver.switchTo().window(ChildID).getTitle());
			System.out.println(driver.switchTo().window(ParentID1).getTitle());
			
			    // Print title of new tab and switch back to parent tab and print title.
			
			driver.findElement(By.xpath("//a[@id='opentab']")).click();
			Set<String>tabs = driver.getWindowHandles();					
			Iterator<String> t =tabs.iterator();			
			String MainID = t.next();
			String SubID = t.next();
			System.out.println(driver.switchTo().window(SubID).getTitle());
			System.out.println(driver.switchTo().window(MainID).getTitle());    
			
			    // Verify text box
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Nitish Kaushal");
			
			    // Verify Alert message and links on it.
			driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
			
			    // Verify Confirm Alert message and links on it.
			driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().dismiss();   
			
			    // Verify visibility of text box.	
		    driver.findElement(By.id("hide-textbox")).click();
		    Thread.sleep(3000L);
			if(!driver.findElement(By.id("displayed-text")).isDisplayed()) 
			{
				driver.findElement(By.id("show-textbox")).click();
				driver.findElement(By.id("displayed-text")).sendKeys("Nitish Kaushal");
			}
									
			    //Verify Mouse Hover
			Actions d = new Actions(driver);
			WebElement move =driver.findElement(By.id("mousehover"));
			d.moveToElement(move).moveToElement(driver.findElement(By.xpath("//div[@class='mouse-hover-content']/a[2]"))).click().build().perform();
			

		
			
		
		
		
		
		
		
	}
	
}
