package Intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Open_Firefox_Brow {

	public static void main(String[] args)
	{
				//Key - Type of the Browser
				//value -  path of the browser driver
				System.setProperty("webdriver.gecko.driver", "/Users/girishg/eclipse-workspace/Leema_Automation/Drivers/geckodriver");
				
				
				 // Instantiate a ChromeDriver class.     
		        WebDriver driver = new FirefoxDriver();
		        
	}

}
