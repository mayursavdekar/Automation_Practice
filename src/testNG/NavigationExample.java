package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationExample {
	WebDriver driver;
	@Test
	public void nav()throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		driver.navigate().to("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("mayur");
		Thread.sleep(3000);
		driver.navigate().refresh(); //facebook refresh
		Thread.sleep(3000);
		driver.navigate().back();// back to gmail
		Thread.sleep(3000);
		driver.navigate().forward(); // back to facebook
		Thread.sleep(3000);
		driver.quit();
	}
}
