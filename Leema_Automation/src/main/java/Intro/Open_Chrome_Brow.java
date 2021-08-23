package Intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Chrome_Brow 
{

	public static void main(String[] args)
	{

		
		
		//Key - Type of the Browser
		//value -  path of the browser driver
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository7/Leema_Automation/Drivers/chromedriver");
		
		
		 // Instantiate a ChromeDriver class.     
        WebDriver driver = new ChromeDriver(); 
        
        
		
	}

}
