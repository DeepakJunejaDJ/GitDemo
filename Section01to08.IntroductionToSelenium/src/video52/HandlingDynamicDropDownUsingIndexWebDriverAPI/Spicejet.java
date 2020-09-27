package video52.HandlingDynamicDropDownUsingIndexWebDriverAPI;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spicejet 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"F:\\java\\SeleniumByRahulUdemy\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();// for chrome browser coz usme browser maximise mode me nhi khul rha
		driver.get("https://www.spicejet.com/");
		
		// Dynamic Dropdown : Here Arrival City Dropdown values are loaded only after selecting
		// value from Departure City Dropdown thats why it is called dynamic.
		driver.manage().timeouts().implicitlyWait(5l, TimeUnit.SECONDS);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.manage().timeouts().implicitlyWait(5l, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		
		// will give error. coz we are selecting MAA ie Chennai
		// in second dropdown ie 'To' city me. but Chennai ie MAA is also available in first ie 'From' city dropdown as well
		// As driver finds an element from left to right so From city's Chennai will come first but as Chennai value is
		// not visible coz dropdown is not active means Banglore has been selected in first dropdown so dropdown will not be
		// active anymore. so to select Chennai from second dropdown do xpath as below.
		// Watch Video Everytime to understand more about dynamic dropdown
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();  // index is used here
		
		System.out.println("Task Completed");
		//Notes:  See video again
		//driver.close();    // will close current tab.
		//driver.quit();		// will close all tabs.
		
		// Notes :  
	}
}
