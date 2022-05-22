

// This is example of hard asseryion
package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertExample {
	WebDriver driver;
  @Test (groups = "weekly")
  public void assertDemo() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("facebook",Keys.ENTER);
		String expectedResult="facebook - Google Search";
		String actualResult=driver.getTitle();
		Assert.assertEquals(actualResult, expectedResult,"Title is mismatched ");
		driver.quit();
  }
}
