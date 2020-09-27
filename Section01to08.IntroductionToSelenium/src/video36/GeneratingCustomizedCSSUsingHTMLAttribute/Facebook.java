package video36.GeneratingCustomizedCSSUsingHTMLAttribute;

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
		
		/* Browser generated CSS
		driver.findElement(By.cssSelector("#email")).sendKeys("deepakjuneja3210@gmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("qwertyuiop");//wrong password
		driver.findElement(By.cssSelector("#u_0_b")).click();
		*/
		
		
		//Note : Blue print to make customized css is as below
        //	tagName[attributeName="valueOfTheAttribute"] or tagname#attributevalue  or tagname.classattributevalue
		//  or  .classattributevalue   or #id
		// First of all copy the Outer HTML(Mozila Browser) by right click on element we are inspecting or Copy Element(ChromeBrowser)
		// by right click on element we are inspecting and paste it as below
		
		// <input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="royal_email">
		
		// similarly do this for all the elements for which we want to generate customized css.
		// now use above blue print to make customized css. But remember take that attribute which is unique for each element
		// so customized css for email will be as below
		//					input[type="email"]  or  input#email      or input.email
		// Similarly css for Password element and Log in element will be as below
		
		
		// Above 2nd prototype is tagname#attributevalue. when we copy browser generated css selector then it comes out as #email which is similar to
		// this second prototype ie we can skip tagname as well
				 
		/*  First Prototype
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("deepakjuneja3210@gmail.com");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("qwertyuiop");//wrong password
		driver.findElement(By.cssSelector("input[id='u_0_4']")).click();//will give error sometimes coz of alphanumeric id are not reliable coz they vary
		*/
		
		
		/* Second Prototype(2 variants)
		driver.findElement(By.cssSelector("input#email")).sendKeys("deepakjuneja3210@gmail.com");
		// or driver.findElement(By.cssSelector("#email")).sendKeys("deepakjuneja3210@gmail.com");// skipping tag name
		driver.findElement(By.cssSelector("input#pass")).sendKeys("qwertyuiop");//wrong password
		// or driver.findElement(By.cssSelector("#pass")).sendKeys("qwertyuiop");// skipping tag name
		driver.findElement(By.cssSelector("input#u_0_4")).click();//will give error sometimes coz of alphanumeric id are not reliable coz they vary
		// or driver.findElement(By.cssSelector("#u_0_4")).click();// skipping tag name
		*/
			
		
		// Third  Prototype
		//driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy")).sendKeys("deepakjuneja3210@gmail.com");//compound class will not work
		//driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy")).sendKeys("qwertyuiop");//wrong password//compound class will not work
		//driver.findElement(By.cssSelector("input#u_0_4")).click();//will give error sometimes coz of alphanumeric id are not reliable coz they vary
		
		
		driver.findElement(By.cssSelector(".inputtext._55r1._6luy")).sendKeys("deepakjuneja3210@gmail.com");//Now will work
		driver.findElement(By.cssSelector(".inputtext._55r1._6luy")).sendKeys("qwertyuiop");//wrong password//Now will work
		driver.findElement(By.cssSelector("input#u_0_4")).click();//will give error sometimes coz of alphanumeric id are not reliable coz they vary
		
		System.out.println("Task completed");
		

		//driver.close();    // will close current tab.
		//driver.quit();		// will close all tabs.
		

		
		}
}
