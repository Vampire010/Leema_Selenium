package Webelement_Methods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Take_ScreenShot
{

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository7/Leema_Automation/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver(); 
        driver.get("https://parabank.parasoft.com/");
        
        
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        Files.copy(scrFile, new File("/Users/girishg/git/repository7/Leema_Automation/TakeScreenshot/image.png"));
        
        driver.quit();
        
	}

}
