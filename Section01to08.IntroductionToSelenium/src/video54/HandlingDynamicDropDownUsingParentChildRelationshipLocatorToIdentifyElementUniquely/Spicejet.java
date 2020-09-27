package video54.HandlingDynamicDropDownUsingParentChildRelationshipLocatorToIdentifyElementUniquely;


import java.util.concurrent.TimeUnit;

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
		
		// Dynamic Dropdown : Here Arrival City Dropdown values are loaded only after selecting
		// value from Departure City Dropdown thats why it is called dynamic.
		driver.manage().timeouts().implicitlyWait(5l, TimeUnit.SECONDS);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.manage().timeouts().implicitlyWait(5l, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		// by xpath
		
		// driver.findElement(By.cssSelector("div[id='ctl00_mainContent_ddl_destinationStation1_CTNR'] a[value='MAA']")).click();
		// by css 
		
		// this is Parent ChilD Relationship of xpath/css
		// In last program we were facing issue that Chennai from "From City" dropdown was getting selected but remember we
		// solved that issue using index value but sometimes client says i dont want that index based xpath . in that we can
		// use Parent Child relationship of xpaths/css between xpath/css of Parent and child.
		
		// Below is for Xpath
		// in our case Chennai is the the child and To City dropdown is the parent in which all cities are as child
		// so we first wrote customized xpath of that drop down ie  //div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']
		// then we gave a white space(not mandatory) and then gave the xpath of Chennai value ie //a[@value='MAA'].Now it will never show
		// that 2 elements are found. It will always be unique because xpath of parent is unique. We cross checked in
		// chropath as well that there is only one such element with this xpath which is mentioned in line number 28

		// Below is for CSS
		// in our case Chennai is the the child and To City dropdown is the parent in which all cities are as child
		// so we first wrote customized css of that drop down ie  div[id='ctl00_mainContent_ddl_destinationStation1_CTNR'
		// then we gave a white space(mandatory) and then gave the css of Chennai value ie a[value='MAA'].Now it will never show
		// that 2 elements are found. It will always be unique because css of parent is unique. We cross checked in
		// chropath as well that there is only one such element with this css which is mentioned in line number 31
		
		System.out.println("Task Completed");
		//driver.close();    // will close current tab.
		//driver.quit();		// will close all tabs.
		
		// Notes :  
	}
}
