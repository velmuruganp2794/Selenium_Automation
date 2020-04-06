package selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		
		ChromeDriver driver = new ChromeDriver();
		//execute driver command maximize to current window
		driver.manage().window().maximize();
		driver.get("http://@leaftaps.com/opentaps");
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Leaftaps Login')]")));
	    driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa",Keys.ENTER);
		
		System.out.println(driver.getSessionId());
		
	/*	//get tile
		String title = driver.getTitle();
		System.out.println(title);
		
		//get current url
		
		System.out.println(driver.getCurrentUrl()); 
		
		System.out.println(driver.getPageSource());*/
		
		//Pass the username and pasword to URl directly
		
		https://username:Password@url
		
		Thread.sleep(5000);
		
		
		
		 
		driver.close();
		
		

	}

}
