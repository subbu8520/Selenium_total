package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ByID {

	// WebDriver is interface

	WebDriver driver;

	@BeforeTest
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().fullscreen();
		driver.get("https://www.amazon.com");

	}

	@Test
	public void byId() throws InterruptedException {

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung s9",Keys.ENTER);
		
		
		
		Thread.sleep(1000);

	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

}
