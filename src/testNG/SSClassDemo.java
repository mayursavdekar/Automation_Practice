package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SSClassDemo {
	WebDriver driver;
  @Test
  public void SSClass() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.easyhindityping.com/english-to-marathi-translation");
		driver.manage().window().maximize();
	    driver.findElement(By.id("SourceTextarea")).sendKeys("what is your name?");
	    Thread.sleep(2000);
	    driver.findElement(By.id("SubmitTranslation")).click();
	    Thread.sleep(4000);
	   String ele = driver.findElement(By.id("TargetCharacterCounter")).getCssValue("display");
	    System.out.println("Translated characters are :- "+ele);
	    if(ele.equals("block")) {
	    	System.out.println("SUCCESS...");
	    	driver.close();
	    }
	    else
	    {
	    	System.out.println("Test Failed...");
	    }
	    
  }
}
