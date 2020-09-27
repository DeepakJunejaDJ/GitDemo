package video01To29.BasicMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config
{
	public static WebDriver config()
	{
		System.setProperty("webdriver.chrome.driver" , "F:\\\\java\\\\SeleniumByRahulUdemy\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
}