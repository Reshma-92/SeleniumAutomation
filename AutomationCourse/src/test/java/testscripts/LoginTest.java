package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTest extends DemoBase{
	 /*   @Test
    public void verifyWhetherUserIsAbleToLoginWithValidCredentials() {
    	   WebElement username = driver.findElement(By.id("user-name"));
    	   username.sendKeys("standard_user");
    	   
    	   WebElement password = driver.findElement(By.id("password"));
    	   password.sendKeys("secret_sauce");
    	   
    	   WebElement loginbutton = driver.findElement(By.id("login-button"));
    	   loginbutton.click();
    	   }*/
	   
	 /*  @Test
	   public void verifyWhetherUserIsAbleToLoginWithInvalidUsernameAndValidPassword() {
		   WebElement username = driver.findElement(By.id("user-name"));
    	   username.sendKeys("standarduser");
    	   
    	   WebElement password = driver.findElement(By.id("password"));
    	   password.sendKeys("secret_sauce");
    	   
    	   WebElement loginbutton = driver.findElement(By.id("login-button"));
    	   loginbutton.click();
	   }*/
	
	  /* @Test
	   public void verifyWhetherUserIsAbleToLoginWithValidUsernameAndInvalidPassword() {
		   WebElement username = driver.findElement(By.id("user-name"));
    	   username.sendKeys("standard_user");
    	   
    	   WebElement password = driver.findElement(By.id("password"));
    	   password.sendKeys("secretsauce");
    	   
    	   WebElement loginbutton = driver.findElement(By.id("login-button"));
    	   loginbutton.click();
	   }*/
	   
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
