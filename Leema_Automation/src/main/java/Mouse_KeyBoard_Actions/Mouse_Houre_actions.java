package Mouse_KeyBoard_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Houre_actions
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository7/Leema_Automation/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver(); 
        driver.get("https://www.snapdeal.com");
        
        
      
       

        driver.manage().window().fullscreen();
		
        WebElement source = driver.findElement(By.xpath("//*[@id=\'leftNavMenuRevamp\']/div[1]/div[2]/ul/li[1]"));

        Actions action = new Actions(driver);
    	Thread.sleep(8000);

        action.moveToElement(source).perform();

        driver.findElement(By.xpath("//*[@id=\'category1Data\']/div[1]/div/div/p[2]/a")).click();
    	Thread.sleep(10000);
    	
    	driver.quit();

	}

}
