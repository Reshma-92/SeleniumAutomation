package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Handlingdropdown extends Base{
	public void verifyDropdown() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown1 = driver.findElement(By.id("dropdowm-menu-1"));
		Select select = new Select(dropdown1);
		//select.selectByIndex(1);
		//select.selectByValue("python");
		select.selectByVisibleText("SQL");
	}
	
	public void VerifyCheckbox() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkBox = driver.findElement(By.xpath("//input[@value='option-2']"));
		checkBox.click();
	}
	
	public void VerifyRadiobutton() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radioButton = driver.findElement(By.xpath("//input[@value=\"blue\"]")); 
		radioButton.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Handlingdropdown handlingdropdown=new Handlingdropdown();
		handlingdropdown.initializeBrowser();
		//handlingdropdown.verifyDropdown(); 	
		handlingdropdown.VerifyCheckbox();
		handlingdropdown.VerifyRadiobutton();
				
	}

}
