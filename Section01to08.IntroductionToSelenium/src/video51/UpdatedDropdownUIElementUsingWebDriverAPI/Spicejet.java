package video51.UpdatedDropdownUIElementUsingWebDriverAPI;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Spicejet 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\java\\SeleniumByRahulUdemy\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();// for chrome browser coz usme browser maximise mode me nhi khul rha
		driver.get("https://www.spicejet.com/");
		
		driver.manage().timeouts().implicitlyWait(5l, TimeUnit.SECONDS);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		driver.findElement(By.id("divpaxinfo")).click();
		Select select = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		driver.manage().timeouts().implicitlyWait(5l, TimeUnit.SECONDS);
		select.selectByValue("4");
		
		select = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		select.selectByValue("3");

		select = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		select.selectByValue("2");
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		System.out.println("Task Completed");
		
		//driver.close();    // will close current tab.
		//driver.quit();		// will close all tabs.
		

		
		}
}
