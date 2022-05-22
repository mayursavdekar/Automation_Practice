package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iFrameDemo {
	WebDriver driver;
	@Test
	public void iFrame() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium library\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		System.out.println("no of frames :- "+frames.size());
		driver.switchTo().frame(0);
		String data1=driver.findElement(By.linkText("Tooltips")).getAttribute("title");
		System.out.println("tooltip is :- "+data1); 
		String data2=driver.findElement(By.linkText("ThemeRoller")).getAttribute("title");
		System.out.println("tooltip is :- "+data2);
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		String text=driver.findElement(By.xpath("//div[@class='demo-description']")).getText();
		System.out.println("might be not:-"+text);
		driver.quit();
		
	}

}
