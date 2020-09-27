package video40.IdentifyXPathUsingParentChildTraversal;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\java\\SeleniumByRahulUdemy\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();// for chrome browser coz usme browser maximise mode me nhi khul rha
		driver.get("https://www.google.com");
		
		driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("Deepak Juneja");
		// Note : We should write xpath like this when the attributes values are frequently changing OR we are 
		// not sure about values. then go for parent child traversal process
		// to understand inspect element kr k dekh lo.
		// Now we will add ChroPath extension in Chrome browser to get Xpath and css selector instantly which 
		// we did till now but will not use it as it may be not available in future coz it is third party tool 
			
		System.out.println("Task Completed");
		
		//driver.close();    // will close current tab.
		//driver.quit();		// will close all tabs.
		

		
		}
}
