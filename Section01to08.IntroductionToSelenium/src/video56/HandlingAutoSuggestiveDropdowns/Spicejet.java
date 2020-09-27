package video56.HandlingAutoSuggestiveDropdowns;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spicejet 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\java\\SeleniumByRahulUdemy\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();// for chrome browser coz usme browser maximise mode me nhi khul rha
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		driver.manage().timeouts().implicitlyWait(5l, TimeUnit.SECONDS);
		
		// Notes: To generate below generic xpath or css  first type anything or ind specifically for india and then do inspect 
		// element by hovering over India . then we will get the idea to create generic css/xpath using li and a tag as below

		
		//List<WebElement> options =  driver.findElements(By.xpath("//*[@class='ui-menu-item']/a"));// using xpath
		// this is generic xpath
		
		 List<WebElement> options =  driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));// using css
		// this is generic css
		
		for(WebElement option : options)
		{
			if(option.getText().equalsIgnoreCase("india"))
			{
				option.click();
				break;
			}
		}
		System.out.println("Task Completed");
		
		//driver.close();    // will close current tab.
		//driver.quit();		// will close all tabs.
		
	}
}
