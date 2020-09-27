package video37.XPathAndCSSUsingRegularExpression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"F:\\java\\SeleniumByRahulUdemy\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();// for chrome browser coz usme browser maximise mode me nhi khul rha
		driver.get("https://www.rediff.com");
		
		
		
		// Regular expression syntax/prototype for CSS and Xpath
		// For CSS   ->  1. tagName[attributeName*='substring of valueOfAttribute']    
		// For xPath ->  1. //tagName[contains(@attributeName , 'substring of valueOfAttributewhich is constant')]
		//we use substring for 2 Reason .class one is value of attribute is long and other is that value of attribute is changing but some part remains
		// constant ie username becomes username1 but value "username" is constant 
		
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();// Regular expression for CSS
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("deepakjuneja3210@gmail.com");//customized xpath
		driver.findElement(By.cssSelector("input#password")).sendKeys("qwertyuiop");//customized css   OR
		//driver.findElement(By.cssSelector("#password")).sendKeys("qwertyuiop");//customized css
		driver.findElement(By.xpath("//input[contains(@name,'proc')]")).click();//regular expression for xpath
		
		
		System.out.println("Task Completed");
		
		//driver.close();    // will close current tab.
		//driver.quit();		// will close all tabs.
		

		
		}
}
