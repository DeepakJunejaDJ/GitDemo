package video59.UsingAssertions;



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
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		//  if driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected() will return true then test case will
		// be failed because we are expecting it to return false using assertFalse method
		
		//System.out.println("Checkbox is checked? "+driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		// as we used assertFalse method to check whether it is returning false so we do not need to check it in console by printing it 
		// in console. so remove sysout vali statement
		
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		// if driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected() will return false then test case will
		// be failed because we are expecting it to return true using assertTrue method
		
		//System.out.println("Checkbox is checked? "+driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		// as we used assertTrue method to check whether it is returning True so we do not need to check it in console by printing it 
		// in console. so remove sysout vali statement
				
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 6);
		// if driver.findElements(By.cssSelector("input[type='checkbox']")).size() does not return then test will fails
		System.out.println("Number/size of checkboxes are "+driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		System.out.println("Task Completed");
		
		//driver.close();    // will close current tab.
		//driver.quit();		// will close all tabs.
		
	}
}
