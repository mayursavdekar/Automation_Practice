package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RediffAC {
	@Test
	public void f() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//p[@id='signin_info']/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[3]/td[3]/input[1]")).sendKeys("Mayur");
		driver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys("mayursavdekar");
		driver.findElement(By.xpath("//input[contains(@name,'btnchk')]")).click();

		if (!driver.findElement(By.xpath("//b[contains(text(),\"Yippie! The ID you've chosen is available.\")]")).isDisplayed()) {
			Assert.assertTrue(false);
		}
		driver.findElement(By.xpath("//input[contains(@name,'passwd')]")).sendKeys("Mayur@123");
		driver.findElement(By.xpath("//input[contains(@name,'confirm_passwd')]")).sendKeys("Mayur@123");
		driver.findElement(By.xpath("//tbody/tr[11]/td[3]/input[1]")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//input[@id='mobno']")).sendKeys("1234567890");

		//select day of birth
		WebElement DOB_day = driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]"));
		Select sel1=new Select(DOB_day);
		sel1.selectByVisibleText("26");

		//select month of birth
		WebElement DOB_month = driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]"));
		Select sel2=new Select(DOB_month);
		sel2.selectByVisibleText("OCT");

		//select year of birth
		WebElement DOB_year = driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]"));
		Select sel3=new Select(DOB_year);
		sel3.selectByVisibleText("1997");

		//select radio button for gender
		if (!driver.findElement(By.xpath("//input[contains(@name,'gender') and @value='m']")).getAttribute("checked").equalsIgnoreCase("checked")) {
			driver.findElement(By.xpath("//input[contains(@name,'gender') and @value='m']")).click();
		}

		//select country
		WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
		Select ctry=new Select(country);
		ctry.selectByVisibleText("India");

		//select city
		WebElement city=driver.findElement(By.xpath("//select[contains(@name,'city')]"));
		Select ct=new Select(city);
		ct.selectByVisibleText("Pune");
		Thread.sleep(5000);
		driver.quit();
	}
}
