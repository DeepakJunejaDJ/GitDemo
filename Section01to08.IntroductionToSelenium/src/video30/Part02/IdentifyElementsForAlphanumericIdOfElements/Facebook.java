package video30.Part02.IdentifyElementsForAlphanumericIdOfElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook 
{
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","F:\\java\\SeleniumByRahulUdemy\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		  
		driver.manage().window().maximize();// for chrome browser coz usme browser maximise mode me nhi khul rha
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("deepakjuneja3210@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("1234");
		//driver.findElement(By.id("u_0_b")).click();// alphanumeric id keep getting changed after next hit on fb. so not reliable. 
													//May cause error on next hit . so will take find element by other way as below
		//driver.findElement(By.xpath("//*[@id=\"u_0_4\"]")).click();//In this case also error will come coz xpath contains alphanumeric id which can
																   // be changed after another hit on fb.so will find element by other way 
		// this browser generated xpath
		//driver.findElement(By.cssSelector("#u_0_4")).click();////In this case also error will come coz css contains alphanumeric id which can
																//be changed after another hit on fb.so will find element by other way
		// this browser generated css selector		
		// check all three scenarios one by one.
		
		System.out.println("Task Completed");
			
		//driver.close();    // will close current tab.
		//driver.quit();		// will close all tabs.
		

	}

}
