package video66.HandlingJavaAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Spicejet 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\java\\SeleniumByRahulUdemy\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();// for chrome browser coz usme browser maximise mode me nhi khul rha
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		String text = "Deepak Juneja";
		
		driver.findElement(By.id("name")).sendKeys(text); // Enter into textfield
		driver.findElement(By.id("alertbtn")).click(); // Click on "Alert Button"
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());// Will print text of Alert on console
		Thread.sleep(3000);
		driver.switchTo().alert().accept();// Will click on positive respone ie Yes/Ok
		
		// Notes : We need to switch context from 'driver' to 'alert' to handle the alerts
		// accept method will click on positive respone ie Yes/Ok
		

		driver.findElement(By.id("name")).sendKeys(text);// Enter into textfield
		driver.findElement(By.id("confirmbtn")).click();// Click on "Confirm Button"
		System.out.println(driver.switchTo().alert().getText());// Will print text of Alert on console
		driver.switchTo().alert().dismiss();// Will clicck on positive respone ie No/Cancel
		// Notes : We need to switch context from 'driver' to 'alert' to handle the alerts
		// dismiss method will click on negative respone ie No/Cancel
		
		System.out.println("Task Completed");

		//driver.close();    // will close current tab.
		//driver.quit();		// will close all tabs.
	}
}
