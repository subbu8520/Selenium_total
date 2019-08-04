package seleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropDownSelection {
	private static final String INDIA = null;
	WebDriver driver;
	
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
	public void test() throws InterruptedException {
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(2000);
		Select select=new Select(driver.findElement(By.name("country")));
		List<WebElement> elements=driver.findElements(By.name("country"));
		//System.out.println("Total no of tags: "+elements.size());
		
		select.selectByVisibleText("INDIA");
		Thread.sleep(2000);
	}
	
	

	@AfterTest
	public void close() {
		driver.close();
	}

}
