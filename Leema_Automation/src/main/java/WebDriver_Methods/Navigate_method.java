package WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_method {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository7/Leema_Automation/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver(); 
        driver.get("https://parabank.parasoft.com/");
        
        //navigate to the URL
        driver.navigate().to("https://parabank.parasoft.com/");
      
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
        
        driver.navigate().back();

        Thread.sleep(2000);

        driver.navigate().forward();


        Thread.sleep(2000);

        driver.navigate().refresh();
        
        
	}

}
