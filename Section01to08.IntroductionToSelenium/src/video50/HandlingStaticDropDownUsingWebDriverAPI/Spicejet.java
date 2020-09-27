package video50.HandlingStaticDropDownUsingWebDriverAPI;


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
		
		Select select = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		
		select.selectByValue("AED");
		select.selectByVisibleText("USD");
		select.selectByIndex(1);  // index starts from zero  . here 0 = Select 1 = INR 2 = AED 3 = USD
		select.selectByIndex(2);
		
		System.out.println("Task Completed");
		
		//driver.close();    // will close current tab.
		//driver.quit();		// will close all tabs.
		

		
		}
}
