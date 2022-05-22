package testNG;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

public class MouserActions {
	WebDriver driver;


	@Test(enabled = false, description = "drag and drop operation")
	public void dragAndDrop() throws Exception {
		// driver.switchTo().frame(0);
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement drag = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		// act.clickAndHold(drag).moveToElement(drop).build().perform();
		Thread.sleep(3000);
		driver.quit();
	}
   @Ignore
	@Test(description = "resize operation")
	public void resize() throws Exception {
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement res = driver.findElement(By.xpath("//body/div[@id='resizable']/div[3]"));
		Actions act = new Actions(driver);
		// act.dragAndDropBy(res, 200, 200).perform();
		act.clickAndHold(res).moveByOffset(100, 100).build().perform();
		Thread.sleep(3000);
		driver.quit();
	}

	@Test(description = "slider operation")
	public void slide() throws Exception {
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement slider = driver.findElement(By.xpath("//body/div[@id='slider']/span[1]"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(slider, 100, 0).perform();
		//act.clickAndHold(slider).moveByOffset(50, 0).build().perform();
		Thread.sleep(3000);
		driver.quit();
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium library\\geckodriver.exe");
		driver = new FirefoxDriver();
		// driver.get("https://jqueryui.com/droppable/");
		//driver.get("https://jqueryui.com/resizable/");
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
	}

}
