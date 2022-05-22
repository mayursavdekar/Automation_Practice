package testingprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Hero_search {
	public static WebDriver driver ;
	public static void openURL() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
	}
	public static void search(){
		
		try
		{
			driver.findElement(By.name("q")).sendKeys("salman khan");
		Thread.sleep(5000);
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.cssSelector("span.wUrVib.OSrXXb")).click();
		}
		catch(Exception e)
		{
			System.out.println("Exception is :- "+e);
		}
	}
	public static void main(String[] args) {
		
		openURL();
		search();

	}

}
