package Locaters_Example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tag_Name 
{

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository7/Leema_Automation/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver(); 
        driver.get("https://parabank.parasoft.com/");
        
		
        List<WebElement> alllinks = driver.findElements(By.tagName("a"));
        
        for(WebElement link:alllinks )
        {
        	System.out.println(link.getAttribute("href"));
        }
        
        driver.quit();
	}

}
