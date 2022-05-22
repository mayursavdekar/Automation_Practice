package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FBLogin {
	@Test
	public void f() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("[name^='emai']")).sendKeys("mayu");
		//driver.findElement(By.cssSelector("[name$='mail']")).sendKeys("mayu");
		driver.findElement(By.cssSelector("[name*='mai']")).sendKeys("mayu");
		Thread.sleep(2000);
	}
}
