package testNG;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Redbus {
	WebDriver driver;
	@Test
	public void red() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://redbus.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Accept All']")).click();
		driver.findElement(By.xpath("//i[@id='i-icon-profile']")).click();
		driver.findElement(By.id("signInLink")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='modalIframe']")));
		driver.findElement(By.xpath("//div[@class='facebook-text'][text()='Facebook']")).click();
		driver.quit();
	}
}
