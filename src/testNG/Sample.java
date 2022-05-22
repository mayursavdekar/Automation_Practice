package testNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;


public class Sample {
	WebDriver driver;
	@Parameters({"facebookURL","gmailURL"})
	@Test (groups = "daily")
	public void SampleMethod(String facebookURL,String gmailURL)throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium library\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();

		//driver.get(facebookURL);
		driver.navigate().to(facebookURL);// we can use driver.get(facebookURL)l also
		Thread.sleep(3000);
		driver.get(gmailURL);
		System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());
		driver.navigate().to("http://orangehrm.com");
		Thread.sleep(3000);
		driver.navigate().to("http://automationpractice.com");
		Thread.sleep(3000);
		
//		List<WebElement> ele= driver.findElements(By.tagName("input"));
//		Object[] obj= ele.toArray();
//		for(int i=0;i<obj.length;i++) {
//			System.out.println(obj[1]);
//		}
		driver.quit();
	}
	@Test (groups = "daily")
	public void dataTest() {
		System.out.println("Data Test Successful...");
	}
}
