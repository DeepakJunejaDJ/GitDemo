package video35.GeneratingCustomizedXPathUsingHTMLAttribute;

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
		

		// Notes: Blue print to make customized xpath is as below
        //					//tagName[@attributeName="valueOfTheAttribute"]
		// First of all copy the Outer HTML(Mozila Browser) by right click on element we are inspecting or Copy Element(ChromeBrowser)
		// by right click on element we are inspecting and paste it as below
		
		// <input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="royal_email">
		
		// similarly do this for all the elements for which we want to generate customized XPath.
		// now use above blue print to make customized XPath. But remember take that attribute which is unique for each element
		// so customized XPath for email will be as below
		//					//input[@type="email"]   or input[@id="email"]
		// Similarly XPath for Password element and Log in element will be as below
		//					//input[@type="pass"]   or input[@id="pass"]
		// we can use * instead of input ie tag name  as below
		//					//*[@type="email"]   or //*[@id="email"]
		// which means it will click on any element which has id as email.
		// means generalized ho gya ye. but if we write tag name ie input here then it will not be generalised
		
		// Also if we want to make customized xpath of an element which have some text like 'Forgotten Account?'
		// then we can also generate with this blue print as below
		//        //tagName[text()='Value of text']
		// so customized xpath will be //a[text()='Forgotten account?'] 
		
		
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("deepakjuneja3210@gmail.com");
		 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("qwertyuiop");//wrong password hai ye
		 driver.findElement(By.xpath("//input[@value='Log In']")).click();
		 
		 /*
		 driver.findElement(By.xpath("//*[@id='email']")).sendKeys("deepakjuneja3210@gmail.com");
		 driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("qwertyuiop");//wrong password hai ye 
		 driver.findElement(By.xpath("//*[@value='Log In']")).click();
			//These three and above three are same.
		*/		
		
		 
		/*
		 Browser Generated XPaths
		 driver.findElement(By.xpath("//*[@id='email']")).sendKeys("deepakjuneja3210@gmail.com");
		 driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("qwertyuiop");//wrong password hai ye 
		 driver.findElement(By.xpath("//*[@id='u_0_b']")).click();//will give error sometimes because of alphanumeric id are not reliable coz they vary
		*/
		 
		System.out.println("Task completed");
		

		//driver.close();    // will close current tab.
		//driver.quit();		// will close all tabs.
		

		}
}
