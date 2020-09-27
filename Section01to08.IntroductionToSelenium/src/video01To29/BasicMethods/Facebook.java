package video01To29.BasicMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook 
{
	public static void main(String[] args) 
	{
		// System.setProperty("webdriver.gecko.driver","F:\\java\\SeleniumByRahulUdemy\\Drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();

		// System.setProperty("webdriver.ie.driver","F:\\java\\SeleniumByRahulUdemy\\Drivers\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
		// WebDriver driver = new InternetExplorerDriver();

		// with IE it is not working fine . check out why

		System.setProperty("webdriver.chrome.driver",
				"F:\\java\\SeleniumByRahulUdemy\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); // for chrome browser. coz usme browser maximise mode me nhi khul rha
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.get("https://www.gmail.com");
		// will go to gmail in same tab. dusre tab me agar kholna hai to aage pdenge
		driver.navigate().to("https://www.facebook.com");// will navigate in same tab. dusre tab me agar kholna hai to
															// aage pdenge 
		driver.navigate().back();// will go back to gmail
		driver.navigate().forward();//will come forward to facebook 
		
		driver.findElement(By.id("email")).sendKeys("deepakjuneja3210@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("abcdef");// this is wrong password. enter correct to log in

		// driver.findElement(By.xpath("//*[@id=\'u_0_b\']")).click(); //will log in FB.
		// id se find element nhi kia xpath se //kia kyuki id har baar refresh pe
		// change ho sakti hai Login button ki

		driver.findElement(By.linkText("Forgotten account?")).click();// will click on the link

		System.out.println("Task Completed");
		// driver.close(); // will close current tab.
		// driver.quit(); // will quit the driver object means sb tabs cloe ho jaynge
	}
}
