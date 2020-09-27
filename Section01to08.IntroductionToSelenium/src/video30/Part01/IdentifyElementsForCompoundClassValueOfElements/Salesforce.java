package video30.Part01.IdentifyElementsForCompoundClassValueOfElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce 
{
	public static void main(String[] args) {

		 // System.setProperty("webdriver.gecko.driver","F:\\java\\SeleniumByRahulUdemy\\Drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		 // WebDriver driver = new FirefoxDriver();
		 
		 // System.setProperty("webdriver.ie.driver","F:\\java\\SeleniumByRahulUdemy\\Drivers\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
		 // WebDriver driver = new InternetExplorerDriver();
				 
		 // with IE it is not working fine . check out why
				
		
		  System.setProperty("webdriver.chrome.driver","F:\\java\\SeleniumByRahulUdemy\\Drivers\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  
		  
		driver.manage().window().maximize();// for chrome browser coz usme browser maximise mode me nhi khul rha
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("deepakjuneja3210@gmail.com");
		driver.findElement(By.name("pw")).sendKeys("1234");
		//driver.findElement(By.className("button r4 wide primary")).click();// will give exception coz class value cant have spaces 	
																//or compound classes are not allowed. so will not be clicked
		// but if we replace whitespace in compound class value by a dot ie '.' as below then it will 
		// no longer be compound class so it will click the login button. but remember it can be 
		// replaced by a dot in case of css selector only and not by other selectors ie not
		// className selector nor xpath nor anyone else . And in css selector if we do it by way as in 
		// line number 35 then only not for 36
		driver.findElement(By.cssSelector(".button.r4.wide.primary")).click();// will click
		//driver.findElement(By.cssSelector("input[class='button.r4.wide.primary']")).click();// will not
		// so by line number 35 only not 36
		
		//driver.findElement(By.id("Login")).click();// now will be clicked
		
		System.out.println("Task Completed");
		
		// Notes:  Sometimes two fields have same value of "Class" attribute or other attribute like in Fb.com user name and password 
		// and if we write findElement method for password field using Class's value then while running script it will sendKeys ie 
		// enter text in username field coz phle vo milega automation engine ko so usme value input kr dega. so do it wisely
			
		//driver.close();    // will close current tab.
		//driver.quit();		// will close all tabs.
		

	}

}
