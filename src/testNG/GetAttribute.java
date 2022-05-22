package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetAttribute {
	WebDriver driver;			
  @Test
  public void f() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("mayu");
		System.out.println(" autocomplete  "+element.getAttribute("autocomplete"));
		System.out.println(" class  "+element.getAttribute("class"));
		System.out.println(" size  "+element.getAttribute("size"));
		System.out.println("Title  "+element.getAttribute("title"));
		System.out.println(" value  "+element.getAttribute("value"));
		driver.quit();
		
  }
}
