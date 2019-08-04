package seleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllLinks {
	WebDriver driver;

	@Test
	public void openBrowser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("http://newtours.demoaut.com/");

		List<WebElement> tags = driver.findElements(By.tagName("a"));
		System.out.println("Total no of tags: "+tags.size());
		
		for (WebElement webElement : tags) {
			System.out.println(webElement.getText());
			
		}

		driver.close();

	}
}
