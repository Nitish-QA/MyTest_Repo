/**
 * 
 */
package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Nitish Kaushal
 *This Class Stores all the locators in login page
 */
public class LoginPage
{

	WebDriver driver;

   By username = By.id("usernameOrEmail");
   By continuebutton = By.xpath("//button[@type='submit']");
   By password = By.xpath("//input[@type='password']");
   By loginbutton = By.xpath("//div[@class='login__form-action']");
   
	  // NOW WE NEED TO CREATE "CONSTRUCTOR" SO THAT THIS PAGE CAN BE CALLED FROM OTHER CLASS  
   public LoginPage(WebDriver driver)
   
   {
	   this.driver = driver;
   }
   
   public void typeusername()
   {
	   driver.findElement(username).sendKeys("nitish25j@gmail.com"); 
   }
   
   public void clickcontinue()
   {
	   driver.findElement(continuebutton).click();
   }
   
   public void enterpassword() 
   {
	   driver.findElement(password).sendKeys("n1t1$h2501");	   
   }
   
   public void clickloginbutton()
   {
	   driver.findElement(loginbutton).click();
   }
}
