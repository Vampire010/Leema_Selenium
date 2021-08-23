package WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Text
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository7/Leema_Automation/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver(); 
        driver.get("https://parabank.parasoft.com/");
        
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
        WebElement txt = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p"));
        
        
        String page_text = txt.getText();
        
        System.out.print(page_text);
        
        
        
       driver.findElement(By.xpath("//*[@id=\"customer.firstName\"]")).sendKeys("Jacob");
       driver.findElement(By.xpath("//*[@id=\"customer.lastName\"]")).sendKeys("Jones");

       driver.findElement(By.xpath("//*[@id=\"customer.firstName\"]")).clear();


        
	}

}
