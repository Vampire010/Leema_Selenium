package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository7/Leema_Automation/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver(); 
        driver.get("https://parabank.parasoft.com/");
        
       
        WebDriverWait wait = new WebDriverWait(driver, 15);
        
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Regis")));
 

      
        
        
        //partial link text
        driver.findElement(By.partialLinkText("Regis")).click();


	}

}
