package Mouse_KeyBoard_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Double_click {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository7/Leema_Automation/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver(); 
        driver.get("file:///Users/girishg/git/repository7/Leema_Automation/src/main/java/html_folder/Db.html");
        
        
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"demo\"]"));
		
		Actions act = new Actions(driver);
		
		Thread.sleep(3000);
		
		act.doubleClick(ele).perform();

       

        

	}

}
