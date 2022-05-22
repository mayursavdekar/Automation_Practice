package testNG;

import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class UploadImageUsingAutoIt {
	WebDriver driver;
	@Test
	public void upload() throws Exception {
		driver.findElement(By.linkText("HMS")).click();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.linkText("Registration")).click();
		driver.findElement(By.linkText("Perminent Registration")).click();
		driver.findElement(By.name("PNT_NAME")).sendKeys("mayur");
		driver.findElement(By.xpath("//input[@class='photo']"));
		Runtime.getRuntime().exec("C:\\Users\\Admin\\Desktop\\autoitFirst");
		driver.quit();
	}
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://seleniumbymahesh.com");
		driver.manage().window().maximize();
	}

}
