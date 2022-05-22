package Sikuli;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterMethod;

public class ImageUploadHMS {
	WebDriver driver;
  @Test
  public void uploadImage() throws Exception {
	 driver.findElement(By.xpath("//span[text()='Choose Files']")).click();
	 Thread.sleep(3000);
	 String inputImagePath="F:\\Images\\Walpapers\\dark.jpg";
	 Screen sc=new Screen();
	 Pattern inputBox=new Pattern("C:\\Users\\Admin\\eclipse-workspace\\SikuliImages\\inputBox.png");
	 Pattern openbtn=new Pattern("C:\\Users\\Admin\\eclipse-workspace\\SikuliImages\\openBtn.png");
	 sc.wait(inputBox,10);
	 sc.type(inputBox,inputImagePath);
	 sc.click(openbtn);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium library\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://smallpdf.com/jpg-to-pdf");
			driver.manage().window().maximize();
		
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
