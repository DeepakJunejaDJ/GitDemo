package video01To29.BasicMethods;

import org.openqa.selenium.WebDriver;

public class Test
{
	public static void main(String args[])
	{
		WebDriver driver = null ;
		driver = Config.config();
		driver.get("www.google.com");
	}

	
}