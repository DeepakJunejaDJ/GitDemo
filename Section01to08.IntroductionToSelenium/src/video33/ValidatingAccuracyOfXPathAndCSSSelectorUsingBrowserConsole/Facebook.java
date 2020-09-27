package video33.ValidatingAccuracyOfXPathAndCSSSelectorUsingBrowserConsole;

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
		// will click Forgotten Account? text
		// browser generated xpath and css selector(firefox)
		
		System.out.println("Task completed");
		
		// Notes: When we are finding elements as above using css selector and xpath then how can we check that are correct before 
		// running the above script. Answer is go to inspect element or press F12 then go to console tab and 
		// type 'allow' or 'allow pasting' if we are not able to paste the xpath or css selector which we have copied by right 
		// clicking on the element in browsers developer tool
		// now for xpath use $x("paste here the xpath which we copied") for xpath and $("paste here the css selector which we copied")
		// for css selector and then hit enter . if that css selector value or xpath value is correct then after hitting enter no
		// error will come and then hover over the result to check which element or object it is referring to and confirm it .
		// if it is wrong then output will be null means there is no element with this css selector value or xpath value
		// By this we can check the accuracy of xpath or css selector value
		

		//driver.close();    // will close current tab.
		//driver.quit();		// will close all tabs.
		

	}
}
