package Webelement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed_ex {

	public static void main(String[] args)
	{

		  System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository7/Leema_Automation/Drivers/chromedriver");
			WebDriver driver = new ChromeDriver(); 
	        driver.get("https://parabank.parasoft.com/");
	        
	        
	       WebElement disp = driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")); 
	       
	       
	       
	       boolean isdisp = disp.isDisplayed();
	       
	       System.out.print(isdisp);
	       
	       
	       
	       
	}

}
