package video61.HandlingCalenderAndSelectingCurrentDate;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Spicejet 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\java\\SeleniumByRahulUdemy\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();// for chrome browser coz usme browser maximise mode me nhi khul rha
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();

		driver.manage().timeouts().implicitlyWait(5l, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("its disabled");
			Assert.assertTrue(true);
		}
		else
			Assert.assertTrue(false);

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		driver.findElement(By.id("divpaxinfo")).click();// Click on passanger dropdown
		
		driver.manage().timeouts().implicitlyWait(5l, TimeUnit.SECONDS);
		
		driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		driver.findElement(By.cssSelector("input[value='Search']")).click();				//OR
		// driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();//OR
		// driver.findElement(By.xpath("//input[@value='Search']")).click();				//OR
		// driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();		//OR
		
		
		System.out.println("Task Completed");

		//driver.close();    // will close current tab.
		//driver.quit();		// will close all tabs.
	}
}
