package Mouse_KeyBoard_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_Ex {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository7/Leema_Automation/Drivers/chromedriver");

		String Url = "http://demo.guru99.com/test/drag_drop.html";
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(Url);
		
        driver.manage().window().maximize();

		Thread.sleep(3000);
		 
		WebElement source = driver.findElement(By.xpath("//*[@id='credit2']/a"));
		
		WebElement target = driver.findElement(By.xpath("//*[@id='bank']/li"));
 
		Actions act = new Actions(driver);
		Thread.sleep(3000);

		act.dragAndDrop(source, target).perform();
		Thread.sleep(3000);
		
		driver.quit();

	}

}
