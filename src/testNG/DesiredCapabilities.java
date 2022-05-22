package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DesiredCapabilities {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@Test
	public void DCTest() throws Exception {
   System.setProperty("webdriver.chrome.driver", "D:\\Selenium library\\chromedriver1.exe");
  org.openqa.selenium.remote.DesiredCapabilities dc=new org.openqa.selenium.remote.DesiredCapabilities();
  dc.setAcceptInsecureCerts(true);
   driver=new ChromeDriver(dc);
   driver.get("https://cacert.com/");
   driver.manage().window().maximize();
   Thread.sleep(3000);
   driver.quit();
	}

}
