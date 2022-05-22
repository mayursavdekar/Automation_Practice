package testNG;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;


public class TakeScreenshotDemo {
	WebDriver driver;
  @Test
  public void screenShot() throws IOException {
	 File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("D:\\Software backups\\demoSS.png"));
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://seleniumbymahesh.com");
		driver.manage().window().maximize();

  }

}
