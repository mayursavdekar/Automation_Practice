package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class KeyboardActions {
	WebDriver driver;
  @Test
  public void keyboard() throws Exception {
	  WebElement input1 = driver.findElement(By.id("inputText1"));
	  WebElement input2 = driver.findElement(By.id("inputText2"));
	  Actions act=new Actions(driver);
	  input1.sendKeys("welcome...");
	  act.keyDown(Keys.CONTROL);
	  act.sendKeys("a");
	  act.keyUp(Keys.CONTROL);
	  act.build().perform();
	  Thread.sleep(3000);
	  act.keyDown(Keys.CONTROL);
	  act.sendKeys("c");
	  act.keyUp(Keys.CONTROL);
	  act.build().perform();
	  Thread.sleep(3000);
	  act.sendKeys(Keys.TAB);
	  Thread.sleep(3000);
	  act.keyDown(Keys.CONTROL);
	  act.sendKeys("v");
	  act.keyUp(Keys.CONTROL);
	  act.build().perform();
	  Thread.sleep(3000);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.gecko.driver", "D:\\Selenium library\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
