package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumBasics.DemoBase;

public class LoginTest extends DemoBase{
	   @Test
    public void verifyWhetherUserIsAbleToLoginWithValidCredentials() {
		    LoginPage loginPage = new LoginPage(driver);
			loginPage.enterUserNameOnUserNameField();
			loginPage.enterPasswordOnPasswordField();
			loginPage.loginButtonClick();
    	   }
	   
	  @Test
	   public void verifyWhetherUserIsAbleToLoginWithInvalidUsernameAndValidPassword1() {
		   WebElement username = driver.findElement(By.id("user-name"));
    	   username.sendKeys("standarduser");
    	   
    	   WebElement password = driver.findElement(By.id("password"));
    	   password.sendKeys("secret_sauce");
    	   
    	   WebElement loginbutton = driver.findElement(By.id("login-button"));
    	   loginbutton.click();
	   }
	
	   @Test
	   public void verifyWhetherUserIsAbleToLoginWithValidUsernameAndInvalidPassword() {
		   WebElement username = driver.findElement(By.id("user-name"));
    	   username.sendKeys("standard_user");
    	   
    	   WebElement password = driver.findElement(By.id("password"));
    	   password.sendKeys("secretsauce");
    	   
    	   WebElement loginbutton = driver.findElement(By.id("login-button"));
    	   loginbutton.click();
	   }
	   
	   @Test
	   public void verifyWhetherUserIsAbleToLoginWithInvalidUsernameAndValidPassword() {
		   WebElement username = driver.findElement(By.id("user-name"));
    	   username.sendKeys("standarduser");
    	   
    	   WebElement password = driver.findElement(By.id("password"));
    	   password.sendKeys("secretsauce");
    	   
    	   WebElement loginbutton = driver.findElement(By.id("login-button"));
    	   loginbutton.click();
	   }
}
