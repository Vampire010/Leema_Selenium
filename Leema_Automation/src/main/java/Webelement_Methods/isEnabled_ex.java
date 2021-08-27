package Webelement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled_ex {

	public static void main(String[] args) 
	{

		WebDriver driver = new ChromeDriver(); 
        driver.get("https://parabank.parasoft.com/");
        
        
       WebElement enb = driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")); 
       
       
       
       boolean isEnb = enb.isEnabled();
       
       System.out.print(isEnb);
       driver.quit();
		
	}

}
