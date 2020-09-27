package video31.IdentifyElementUsingXPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce 
{
	public static void main(String[] args) 
	{

	    System.setProperty("webdriver.chrome.driver","F:\\java\\SeleniumByRahulUdemy\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		  
		driver.manage().window().maximize();// for chrome browser coz usme browser maximise mode me nhi khul rha
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("deepakjuneja3210@gmail.com");
		driver.findElement(By.name("pw")).sendKeys("1234");
		driver.findElement(By.xpath("//*[@id='Login']")).click();// We can use a plugin "FirePath" and "ChroPath" to find xpath directly. will learn about that later
																// this is browser generated xpath
		System.out.println("Task Completed");
		
		

		//driver.close();    // will close current tab.
		//driver.quit();		// will close all tabs.
		

	}

}
