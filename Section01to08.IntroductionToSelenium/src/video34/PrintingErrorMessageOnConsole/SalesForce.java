package video34.PrintingErrorMessageOnConsole;

import java.util.concurrent.TimeUnit;

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
		//driver.findElement(By.className("button r4 wide primary")).click();// will give error coz compound class not allowed
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());// will print error message on console
		
		System.out.println("Task Completed");
		
		//Note: When this script will click on the login button in line number 22 then it will try to login in salesforce website but 
		// as the password is wrong then error message will pe printed coz of line 24. but some time error message will not get printed
		// Reason is when line number 22 will be executed then on browser it will take some time to error message come on browser.
		// but script will continue to execute as it may or may not wait for error message to be printed on browser.So due to line 
		// number 24 exception will come as below
		
		//Exception in thread "main" org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element:
		//	{"method":"css selector","selector":"#error"}
		
		// so to overcome we may need to apply wait for error message to be printed. we can apply wait as line number 23 in Selenium
		// now exception will not come
		// ye wait udemy vale course me nhi tha . i searched it on Google as i encounter this exception
		

		//driver.close();    // will close current tab.
		//driver.quit();		// will close all tabs.
		

	}
}
