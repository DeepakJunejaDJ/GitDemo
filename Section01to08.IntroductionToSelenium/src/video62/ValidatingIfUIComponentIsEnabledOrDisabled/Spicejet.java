package video62.ValidatingIfUIComponentIsEnabledOrDisabled;



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
		
		System.out.println("Calender is Enabled ? "+driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());// second calender
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();// Will click radio button of round trip
		System.out.println("Calender is Enabled ? "+driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());// second calender
		
		// Here due to first sysout it should come False because by default the 2nd calender is disabled when spicejet.com is loaded 
		// as by default radio button of 'One way trip' is checked. when we click Round trip radio button then the 2nd calender should
		// be enabled but it is not the case. Answer is selenium was not able to recognise that it should come false for first sysout
		// ie calender should be disabled . it happens sometimes
		
		// now we will see what is happening. Comment all three lines above ie 2 sysouts and one radio button click of Round Trip
		// and uncomment below statements to understand
		// we will see before clicking on radio button of Round Trip the value of style attibute of Second calender is different and 
		// after clicking its value is different
		/*
		 * System.out.println("Second Calender is enabled? "+driver.findElement(By.name(
		 * "ctl00$mainContent$view_date2")).isEnabled());// second calendar
		 * System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));/
		 * / style attribute of second calender
		 * driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();// second
		 * calendar
		 * System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));/
		 * / style attribute of second calender
		 * if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
		 * System.out.
		 * println("Yes Second Calender is enabled because we have clicked on Round Trip Radio button which enables it"
		 * ); Assert.assertTrue(true); } else Assert.assertTrue(false);
		 * 
		 */		
		System.out.println("Task Completed");

		//driver.close();    // will close current tab.
		//driver.quit();		// will close all tabs.
	}
}
