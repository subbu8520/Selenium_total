package com.browserlaunching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromeBrowserLaunching {
	
	protected WebDriver driver;
	@BeforeTest
	public void launchBw() {// for windows /Users/aravindanathdm/Documents/Aravinda/chromedriver.exe
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
	
	ChromeOptions ops =  new ChromeOptions();
	ops.addArguments("--disable-notifications");
	ops.addArguments("disable-infobars");
	ops.addArguments("--incognito");
	
	
	driver = new  ChromeDriver(ops);
		
	}
	@Test
	public void launchBrowser() throws InterruptedException {
		
		driver.get("https://www.amazon.com");
		Thread.sleep(1000);
		System.err.println("******** Open browser **********");

		System.err.println("******** URL **********");
	}

	@AfterSuite
	@AfterClass
	public void closeBrowser() {
		System.err.println("******** close browser **********");
		driver.quit();
		 
	}

}
