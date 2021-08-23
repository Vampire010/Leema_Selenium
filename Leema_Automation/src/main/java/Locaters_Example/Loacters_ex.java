package Locaters_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loacters_ex 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository7/Leema_Automation/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver(); 
        driver.get("https://parabank.parasoft.com/");
        
        
        
        
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();

        //By ID
        driver.findElement(By.id("customer.firstName")).sendKeys("Jacob");
        driver.findElement(By.id("customer.lastName")).sendKeys("Jones");
        driver.findElement(By.id("customer.address.street")).sendKeys("Temple Street, DownTown ");

        //By Name
        driver.findElement(By.name("customer.address.city")).sendKeys("NewYork");
        driver.findElement(By.name("customer.address.state")).sendKeys("Albama");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("542178");


        
        
	}

}
