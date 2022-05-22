package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FBACCreation {
	WebDriver driver;
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("mayur");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("savdekar");
		new Select(driver.findElement(By.name("birthday_day"))).selectByVisibleText("26");
		driver.findElement(By.name("websubmit")).click();
	}
}
