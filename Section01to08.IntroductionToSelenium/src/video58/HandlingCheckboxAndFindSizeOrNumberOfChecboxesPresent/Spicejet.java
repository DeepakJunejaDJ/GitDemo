package video58.HandlingCheckboxAndFindSizeOrNumberOfChecboxesPresent;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spicejet 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\java\\SeleniumByRahulUdemy\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();// for chrome browser coz usme browser maximise mode me nhi khul rha
		driver.get("https://www.spicejet.com/");
		
		System.out.println("Checkbox is checked? "+driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		// we used regular exp in css selector coz value of id is very large. This is the benefit to use regular exp.
		// means when value of any attribute is large and we do not want to use complete value but some part of it then we can use 
		// regular expression in css selector or xpath. means select that input tag which contains "SeniorCitizenDiscount" as substring 
		// in the value of id attribute
		System.out.println("Checkbox is checked? "+driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		System.out.println("Number/size of checkboxes are "+driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		System.out.println("Task Completed");
		
		//driver.close();    // will close current tab.
		//driver.quit();		// will close all tabs.
		
	}
}
