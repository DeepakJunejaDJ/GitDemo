package video32.IdentifyElementUsingCSSSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\java\\SeleniumByRahulUdemy\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();// for chrome browser coz usme browser maximise mode me nhi khul rha
		driver.get("https://www.facebook.com");
		driver.findElement(By.cssSelector("#email")).sendKeys("deepakjuneja3210@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("qwertyuiop");//wrong password hai ye
		driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();// can give error. its dynamic
		
		// xpath of Forgotten Account link from firefox
		
		System.out.println("Task completed");
		
		//Notes:1. xpath and css selector values can be different in differnt browsers
		//2. if highlighted element pe right click krne pe copy css selector ka option nhi hai kisi browser me to hum css selector 
		// ki value toolbar me se get kar sakte hai . toolbar sabse niche hta hai
		//3. when value of xpath starts with 'html' in one browser  for example html/body/title/div/div[2] and so on. then dont use 
		// that coz that is not reliable to find the element. copy the value of xpath from other browser for solution to this problem 
		

		//driver.close();    // will close current tab.
		//driver.quit();		// will close all tabs.
		

	}
}
