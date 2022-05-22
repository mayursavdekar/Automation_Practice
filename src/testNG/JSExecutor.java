package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class JSExecutor {
	WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		// finding and entering data using JS
		//js.executeScript("document.getElementById('email').value='abcd'");
		
		//finding element using driver and entering data using JS
//		WebElement ele = driver.findElement(By.id("email"));
//		js.executeScript("arguments[0].value='abcd@gmail.com'",ele);
//		Thread.sleep(3000);
		
		// finding and clicking using JS
		js.executeScript("document.getElementById('u_0_h_aC').click()");
		Thread.sleep(3000);
  }
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
