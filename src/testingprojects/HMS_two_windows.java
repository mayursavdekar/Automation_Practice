package testingprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class HMS_two_windows {

	 public static WebDriver driver;
	 public static void openURL() {
		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium library\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://seleniumbymahesh.com");
			driver.manage().window().maximize();
	 }
	 public static void login() {
			driver.findElement(By.linkText("HMS")).click();
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("password")).sendKeys("admin");
			driver.findElement(By.name("submit")).click();
		}
	 public static void regisetr() {
		 try {
		 driver.findElement(By.linkText("Registration")).click();
		 driver.findElement(By.linkText("Feedback")).click();
		 Set<String> window= driver.getWindowHandles();
		 System.out.println(window);
         Object[] obj=window.toArray();
		 driver.switchTo().window(obj[1].toString());
		 driver.findElement(By.id("name")).sendKeys("mayur");
		 Thread.sleep(5000);
		 driver.switchTo().window(obj[0].toString());
		 Thread.sleep(3000);
		 driver.quit();
		 }
		 catch(Exception e) {
			 System.out.println("Exception is :- "+e);
		 }
	 }
	public static void main(String[] args) {
		openURL();
		login();
		regisetr();
	}

}
