package Iframes_Example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp_Scroll_dwn {

	public static void main(String[] args) throws InterruptedException
	{
		String Url = "https://news.yahoo.com/";
		

		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository7/Leema_Automation/Drivers/chromedriver");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get(Url);
		
		
		
		  //Creating the JavascriptExecutor interface object by Typecasting
        JavascriptExecutor js = (JavascriptExecutor)driver;
        
      
        Thread.sleep(3000);

        //Vertical scroll down by 500  pixels
        js.executeScript("window.scrollBy(0,500)");
        js.executeScript("window.scrollBy(0,-500)");

        Thread.sleep(3000);
        //Horizontal scroll down by 500  pixels
        js.executeScript("window.scrollBy(500,0)");
        
        js.executeScript("window.scrollBy(-500,0)");


	}

}
