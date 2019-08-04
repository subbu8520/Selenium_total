package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ByLinkText {
	WebDriver driver;

	@Test
	public void openBrowser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.manage().window().fullscreen();
		driver.findElement(By.linkText("Images")).click();
		driver.findElement(By.name("q")).sendKeys("Boston",Keys.ENTER);
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("Selenium automation",Keys.ENTER);
		
		Thread.sleep(3000);

	}

	  @AfterTest
	public void closeBrowser() {
		driver.close();
		// driver.quit();

	}
}
