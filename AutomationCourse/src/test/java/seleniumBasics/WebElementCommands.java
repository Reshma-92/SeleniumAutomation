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
		  System.out.println(showmessagebutton.isDisplayed());
		  System.out.println(showmessagebutton.isEnabled());
		  WebElement text = driver.findElement(By.id("message-one"));
		  System.out.println(text.getText());
		  System.out.println(text.getTagName());
		  WebElement messageTextBox = null;
		  textbox.clear();
		  System.out.println(showmessagebutton.getCssValue("background-color"));
		  
	  }
	

	public static void main(String[] args) {
		
		WebElementCommands cmd = new WebElementCommands();
		cmd.initializeBrowser();
		cmd.verifyWebElementCommands();

	}

}
