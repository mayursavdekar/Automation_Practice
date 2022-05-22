package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class Mantra {
	WebDriver driver;
	String log4jpath="./log4j.properties";
	Logger log;
	@Test
	public void f() throws Exception {
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("Men")));
		driver.findElement(By.linkText("T-Shirts")).click();
		log.info("t - shirt clicked...");
		driver.findElement(By.xpath("//ul[@class='results-base']/li[1]")).click();
		log.info("clicked on product...");
		Set<String> windows1 = driver.getWindowHandles();
		Object[] windows2 = windows1.toArray();
		System.out.println("window is :-  "+windows2[0]);
		System.out.println("window is :-  "+windows2[1]);
		driver.switchTo().window(windows2[1].toString());
		log.info("new window opened...");
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("mayur");
		log.info("data entered in search box...");
		driver.findElement(By.xpath("//body[contains(@style,'overflow: auto;')]/div[@id='mountRoot']/div/div[contains(@class,'application-base')]/div/main[contains(@class,'pdp-pdp-container')]/div[contains(@class,'pdp-details common-clearfix')]/div[contains(@class,'pdp-description-container')]/div[@id='sizeButtonsContainer']/div[contains(@class,'size-buttons-size-buttons')]/div[4]/div[1]/button[1]/p[1]")).click();
		log.info("size selected");
		Thread.sleep(3000);
	}
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium library\\geckodriver.exe");
		driver = new FirefoxDriver();	
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);	
		PropertyConfigurator.configure(log4jpath);
		log=Logger.getLogger(Mantra.class.getName());
		log.info("****************test started****************");
	}

	@AfterMethod
	public void afterMethod() {
		log.info("********************test ender*********************");
		driver.quit();
	}
}
