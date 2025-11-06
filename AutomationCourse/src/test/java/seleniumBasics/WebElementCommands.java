package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base{
	  public void verifyWebElementCommands() {
		  driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php"); 
		  WebElement textbox = driver.findElement(By.id("single-input-field"));
		  textbox.sendKeys("Reshma");
		  WebElement showmessagebutton = driver.findElement(By.id("button-one"));
		  showmessagebutton.click();
	  }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElementCommands cmds = new WebElementCommands();
		cmds.initializeBrowser();
		cmds.verifyWebElementCommands();

	}

}
