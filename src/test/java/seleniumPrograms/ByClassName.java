package seleniumPrograms;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.testng.annotations.*;

 
import io.github.bonigarcia.wdm.WebDriverManager;

public class ByClassName {
	WebDriver driver;

	@Test
	public void openBrowser() throws InterruptedException {
		ChromeOptions ops=  new ChromeOptions();
		ops.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(ops);
		driver.manage().window().fullscreen();
		driver.get("https://www.icicibank.com");

		driver.findElement(By.className("dropbtn")).click();
		Thread.sleep(2000);
		 

	}

	 @AfterTest
	public void closeBrowser() {
		driver.close();
		// driver.quit();

	}
}
