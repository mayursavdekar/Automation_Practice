
package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DesiredCapabilities {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@Test
	public void DCTest() throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium library\\chromedriver.exe");
		// desired caapabilities
		org.openqa.selenium.remote.DesiredCapabilities dc=new org.openqa.selenium.remote.DesiredCapabilities();
		dc.setAcceptInsecureCerts(true);
		
		// chrome configurations 
		ChromeOptions opt =new ChromeOptions();
		opt.addArguments("--start-maximised");
		opt.addArguments("--incognito");
		
		// merge desired capablities with chrome options 
		opt.merge(dc);
		
		//pass chrome options reference to the chromedriver to apply configurations
		driver=new ChromeDriver(opt);
		driver.get("https://cacert.com/");
		driver.manage().window().maximize(); 
		Thread.sleep(3000);
		driver.quit();
	}

}
