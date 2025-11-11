package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlert extends Base {
	  public void VerifySimpleAlert() {
		  driver.navigate().to("https://demoqa.com/alerts");
		  WebElement simplealert = driver.findElement(By.id("alertButton"));
		  simplealert.click();
		  Alert al = driver.switchTo().alert();
		  al.accept();
	  }
	  
	  public void VerifyConfirmAlert() {
		  driver.navigate().to("https://demoqa.com/alerts");
		  WebElement confirmalert = driver.findElement(By.id("confirmButton"));
		  confirmalert.click();
		  Alert al = driver.switchTo().alert();
		  al.dismiss();
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingAlert handling = new HandlingAlert();
		handling.initializeBrowser();
		//handling.VerifySimpleAlert();
		handling.VerifyConfirmAlert();

	}

}
