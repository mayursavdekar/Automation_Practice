package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class GoogleLanguage {
	public static WebDriver driver;

	public static void changeLang(String str, String str1) {
		System.out.println("language is :- " + str1);
		driver.findElement(By.xpath(str)).click();
		driver.findElement(By.linkText("English")).click();
	}

	@Test
	public void ff() throws Exception {

		changeLang("//div[@id='SIvCob']/a[1]", "lang1");
		changeLang("//div[@id='SIvCob']/a[2]", "lang1");
		changeLang("//div[@id='SIvCob']/a[3]", "lang1");
		changeLang("//div[@id='SIvCob']/a[4]", "lang1");
	}

	@Test
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium library\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
	}

	@Test
	public void afterTest() {
		driver.quit();
	}

}
