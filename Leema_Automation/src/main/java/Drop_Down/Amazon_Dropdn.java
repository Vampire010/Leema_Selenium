package Drop_Down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Dropdn {

	public static void main(String[] args) throws InterruptedException 
	{
		
		String Url = "https://www.amazon.in";
		

		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository7/Leema_Automation/Drivers/chromedriver");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(Url);

		
		WebElement testDropDown = driver.findElement(By.id("searchDropdownBox"));
		WebElement Search_btn = driver.findElement(By.id("nav-search-submit-button"));

		
		Select dropdown = new Select(testDropDown);
		
		
		 //Navigate To Amazon Pantry using selectByIndex
		/*dropdown.selectByIndex(8);
		
		Search_btn.click();
		
		
		Thread.sleep(3000);*/ 
		
		// Navigate To Computers & Accessories using selectByValue
		
		/*dropdown.selectByValue("search-alias=beauty");
		
		Search_btn.click(); //
		Thread.sleep(3000);*/

		dropdown.selectByVisibleText("Computers & Accessories");
		
		Search_btn.click();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
