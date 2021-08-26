package Locaters_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Types {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository7/Leema_Automation/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver(); 
        driver.get("https://parabank.parasoft.com/");
        
        
        
        //Native Xpath 
        	driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[1]/input")).sendKeys("jony");
        
        
        //Relative Xpath 
        	driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("jonry1234");
        	
        
        	
        	driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();


	}

}
