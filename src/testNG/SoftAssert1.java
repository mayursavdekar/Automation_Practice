package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SoftAssert1 {
	WebDriver driver;
	@Test
	public void testURL() throws Exception{
		//code --> 1
		/*System.setProperty("webdriver.chrome.driver", "D:\\Selenium library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://hdfcbank.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav lp-navbar-advanced-root normal-main-header']/li[2]/a[1]")).click();
		String url=driver.getCurrentUrl();
		String expectedURL="https://www.hdfcbank.com/nri-banking";
		System.out.println(url);
		System.out.println(expectedURL);
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(url, expectedURL);
		driver.quit();
		soft.assertAll();
		 -----------------------------------------------------------------------------------
		*/
		
		// code --> 2
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[3]")).click();
		String url=driver.getCurrentUrl();
		String expectedURL="https://www.amazon.com/registries?ref_=nav_cs_registry";
		System.out.println(url);
		System.out.println(expectedURL);
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(url, expectedURL);
		
		//data
		String actualText=driver.findElement(By.xpath("//p[@class='gr-subheader']")).getText();
		String expectedText="Whether you’re celebrating a wedding, a baby, a birthday, or other memorable milestone, our registries and gift lists will help you and your guests find the perfect gifts.";
		System.out.println(actualText);
		driver.quit();
		soft.assertAll();

	}
}
