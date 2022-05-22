package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AjaxHandling {
	WebDriver driver;

	@Test
	public void f() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium library\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("salman");
		Thread.sleep(2000);
		 String txt = driver.findElement(By.xpath("(//ul[@class='G43f7e'])[position()=1]")).getText();
		 System.out.println(txt);
		 String[] lst = txt.split("\n");
		 int len=lst.length;
		 for(int i=0;i<len;i++) {
			 if(lst[i].equals("salman khan height")) {
				 ele.clear();
				 ele.sendKeys(lst[i]);
				 driver.findElement(By.name("btnK")).click();
			 }
		 }
		driver.close();
	}
}
