package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class HMS_login_logout {
	WebDriver driver;
	@Test 
	public void demo() {
		System.out.println("demo test");
	}
  @Test
  public void xyz() {
	  System.out.println("login test");
	  driver.findElement(By.linkText("HMS")).click();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.linkText("Registration")).click();
		driver.findElement(By.linkText("Perminent Registration")).click();
		driver.findElement(By.name("image")).click();
  }
  @Test 
  public void abc() {
	  System.out.println("logout test");
	  driver.findElement(By.linkText("Logout")).click();
  }
  @Test
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://seleniumbymahesh.com");
		driver.manage().window().maximize();
  }

  @Test
  public void afterTest() throws InterruptedException {
   Thread.sleep(5000);
    driver.quit();
		  }
}
