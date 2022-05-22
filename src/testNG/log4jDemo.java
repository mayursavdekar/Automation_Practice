package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class log4jDemo {
	WebDriver driver;
	  Logger log;
  @Test
  public void f() {
	  driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
	  log.info("Username Entered...");
	  driver.findElement(By.id("pass")).sendKeys("abcd1234");
	  log.info("Password Entered...");
	  driver.findElement(By.name("login")).click();
  log.info("Login Button Clicked....");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.gecko.driver", "D:\\Selenium library\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  String log4jFilePath="./log4j.properties";
	  PropertyConfigurator.configure(log4jFilePath);
	  log = Logger.getLogger(log4jDemo.class.getName());
	  driver.get("https://facebook.com");
	  log.info("*************************\n Test Case Started \n Facebook URL opened...");
	  driver.manage().window().maximize();
	  log.info("Window Maximized..");
  }
	 

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
	  log.info("Test Case Finished...\n     ****************************");
	  
  }

}
