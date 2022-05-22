package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class ScreenShot {
	FirefoxDriver driver;
	@Test
	public void f() throws Exception {
		driver.findElement(By.id("email")).sendKeys("Savdekar@gmail.com");
		WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(btn));
		btn.click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File f=new File(System.getProperty("user.dir")+"/new/abc.png");
		FileUtils.copyFile(src, f);
	}
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.gecko.driver","D:\\Selenium library\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
