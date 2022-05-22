package testingprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HMS_login_logout {

	public static WebDriver driver ;
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
		String pagesource=driver.getPageSource();
		System.out.println(pagesource); // it will return whole DOM page source code in form of string
		
	}
	public static void logout() {
		driver.findElement(By.linkText("Logout")).click();
	}
	public static void main(String[] args) {
	 openURL();
	 login();
	 logout();
	}

}
