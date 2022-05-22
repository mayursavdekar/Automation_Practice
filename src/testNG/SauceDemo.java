package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SauceDemo {
	WebDriver driver;
	@Test
	public void Sauce() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

		driver.findElement(By.id("login-button")).click();
	
		new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']"))).selectByVisibleText("Price (low to high)");

		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();

		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

		driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();

		driver.findElement(By.xpath("//button[@id='checkout']")).click();

		driver.findElement(By.id("first-name")).sendKeys("Ram");
		
		driver.findElement(By.id("last-name")).sendKeys("More");
		
		driver.findElement(By.id("postal-code")).sendKeys("425101");

		driver.findElement(By.id("continue")).click();

		driver.findElement(By.id("finish")).click();

		driver.quit();
	}
}
