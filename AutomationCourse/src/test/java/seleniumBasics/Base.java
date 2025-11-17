package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
      public WebDriver driver;
      
      public void initializeBrowser() {
    	  driver = new ChromeDriver();
    	  driver.get("https://selenium.qabible.in/");
    	  driver.manage().window().maximize();     // to maximize window
      }
      public void browserQuitAndClose() {
    	 // driver.close();   // close window
    	 // driver.quit();     // closes all the windows
      }
     
	public static void main(String[] args) {
	                Base base = new Base();
	                base.initializeBrowser();
	                base.browserQuitAndClose();

	}

}
