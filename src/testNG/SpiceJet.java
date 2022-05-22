package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SpiceJet {
	WebDriver driver;
	@Test
	public void f()throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://spicejet.com");
//		driver.findElement(By.cssSelector(".css-1cwyjr8.r-homxoj.r-ubezar.r-10paoce.r-13qz1uu")).click();
//		driver.findElement(By.cssSelector(".css-1dbjc4n.r-1awozwy.r-1loqt21.r-18u37iz.r-1wtj0ep.r-b5h31w.r-rnv2vh.r-5njf8e.r-1otgn73")).click();
//		String text=driver.findElement(By.cssSelector(".css-1dbjc4n.r-1awozwy.r-1loqt21.r-18u37iz.r-1wtj0ep.r-b5h31w.r-rnv2vh.r-5njf8e.r-1otgn73")).getText();
//		System.out.println("data is :- "+text);
//		Thread.sleep(3000);
	      List<WebElement> lst = driver.findElements(By.tagName("div"));
		 System.out.println(lst.size());
		 driver.quit();
		/*
		 output :-
		 Ajmer
         Kishangarh Airport
         KQH
		*/
	}
}
