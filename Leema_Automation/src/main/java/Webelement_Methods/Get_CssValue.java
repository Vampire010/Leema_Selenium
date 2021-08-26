package Webelement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_CssValue {

	public static void main(String[] args)
	{
		  System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository7/Leema_Automation/Drivers/chromedriver");
			WebDriver driver = new ChromeDriver(); 
	        driver.get("https://parabank.parasoft.com/");
	        
	        
	       WebElement getcss = driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/p[1]/b")); 
	       
	      
	       //Get Css value
	       String fntclr = getcss.getCssValue("color");
	       String fntsize = getcss.getCssValue("size");
	       String fntstyle = getcss.getCssValue("font");
	       
	       
	       System.out.println( fntclr);
	       System.out.println( fntsize);

	       System.out.println( fntstyle);
	       
	       
	       //Get Location
	       Point loc = getcss.getLocation();
	       System.out.println( "Location of Text is" + loc);

	       //Get Size
	       
	       WebElement getsze = driver.findElement(By.xpath("//*[@id=\"topPanel\"]/a[2]/img")); 
	       
	       Dimension Img_sze = getsze.getSize();
	       System.out.println( "size is - " + Img_sze);
	       
	       
	       
	       //Get TagName
	       String tag_nam = getsze.getTagName();

	       System.out.println( "getTagName is - " + tag_nam);

	       

	       driver.quit();

	       
	        
	}

}
