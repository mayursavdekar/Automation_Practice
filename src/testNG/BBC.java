package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BBC {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  driver.findElement(By.linkText("More")).click();
	  driver.findElement(By.linkText("Weather")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("ls-c-search__input-label")).sendKeys("Jalgaon");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@class='ls-c-search__submit' and @type='submit']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("News")).click();
	  Thread.sleep(2000);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
