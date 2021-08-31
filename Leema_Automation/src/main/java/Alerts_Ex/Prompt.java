package Alerts_Ex;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Prompt {

	public static void main(String[] args) throws InterruptedException 
	{
String Url = "file:///Users/girishg/git/repository7/Leema_Automation/src/main/java/Alerts_Ex/prompt_ex.html";
		

		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository7/Leema_Automation/Drivers/chromedriver");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(Url);
		
		
		
		//Click the link to activate the alert
		driver.findElement(By.xpath("/html/body/button")).click();

	    WebDriverWait wait = new WebDriverWait(driver, 10);		
		//Wait for the alert to be displayed and store it in a variable
		Alert alrt = wait.until(ExpectedConditions.alertIsPresent());

		Thread.sleep(3000);
		//Store the alert text in a variable
		String text = alrt.getText();
		
		System.out.println(text);
		Thread.sleep(3000);
		
		//Type your message
		
		
		alrt.sendKeys("B");
		Thread.sleep(2000);

		
		
		//Press the OK button
		//alrt.accept();
		alrt.dismiss();
		
		
		Thread.sleep(2000);
		//driver.quit();
	}

}
