package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Impicit_wait_ex
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository7/Leema_Automation/Drivers/chromedriver");

		WebDriver driver = new ChromeDriver(); 
        driver.get("https://parabank.parasoft.com/");
        
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        
        //link text
        // driver.findElement(By.linkText("Register")).click();
         
         
         //partial link text
         driver.findElement(By.partialLinkText("Regis")).click();


         //By ID
         driver.findElement(By.id("customer.firstName")).sendKeys("Jacob");
         driver.findElement(By.id("customer.lastName")).sendKeys("Jones");
         driver.findElement(By.id("customer.address.street")).sendKeys("Temple Street, DownTown ");

         //By Name
         driver.findElement(By.name("customer.address.city")).sendKeys("NewYork");
         driver.findElement(By.name("customer.address.state")).sendKeys("Albama");
         driver.findElement(By.name("customer.address.zipCode")).sendKeys("542178");


         
         //cssSelector
         driver.findElement(By.cssSelector("#customer\\.phoneNumber")).sendKeys("5623189211");
         driver.findElement(By.cssSelector("#customer\\.ssn")).sendKeys("5435188");
         
         
         //By xpath
         driver.findElement(By.xpath("//*[@id=\"customer.username\"]")).sendKeys("jony");
         driver.findElement(By.xpath("//*[@id=\"customer.password\"]")).sendKeys("jonry1234");        
         driver.findElement(By.xpath("//*[@id=\"repeatedPassword\"]")).sendKeys("jonry1234");
         
         
         //cssSelector
        // driver.findElement(By.cssSelector("#customerForm > table > tbody > tr:nth-child(13) > td:nth-child(2) > input")).click();
         
         driver.findElement(By.cssSelector("#customerForm > table > tbody > tr:nth-child(13) > td:nth-child(2) > input")).submit();

        
        
        
        
	}

}
