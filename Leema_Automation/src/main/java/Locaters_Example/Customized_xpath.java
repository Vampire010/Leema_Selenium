package Locaters_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customized_xpath {

	public static void main(String[] args)
	{
	
        
        
        System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository7/Leema_Automation/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver(); 
        driver.get("https://parabank.parasoft.com/");
        
        
        
 
        //partial link text
        driver.findElement(By.partialLinkText("Regis")).click();


        //Customized_xpath
        driver.findElement(By.xpath("//*[@name=\"customer.firstName\"]")).sendKeys("Jacob");
        
        
        driver.findElement(By.xpath("//*[@name=\"customer.lastName\"]")).sendKeys("Jones");
        
        
        driver.findElement(By.xpath("//*[@name=\"customer.address.street\"]")).sendKeys("Temple Street, DownTown ");

	}

}
