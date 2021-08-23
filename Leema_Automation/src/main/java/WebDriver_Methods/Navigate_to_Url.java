package WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_to_Url 
{

	public static void main(String[] args) throws InterruptedException 
	{
				System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository7/Leema_Automation/Drivers/chromedriver");
				WebDriver driver = new ChromeDriver(); 
	            driver.get("https://parabank.parasoft.com/");
	            
	            driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
	            driver.findElement(By.xpath("//*[@id=\"customer.firstName\"]")).sendKeys("Jacob");
	            driver.findElement(By.xpath("//*[@id=\"customer.lastName\"]")).sendKeys("Jones");

	            
	            Thread.sleep(2000);
	            driver.close();

	            

	}

}
