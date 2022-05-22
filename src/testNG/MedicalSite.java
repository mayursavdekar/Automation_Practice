package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MedicalSite {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.nmc.org.in/information-desk/indian-medical-register/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default' and @title='Select Year of Admission']")).click();
		WebElement ele = driver.findElement(By.xpath("//div[@class='btn-group open']/ul[@class='multiselect-container dropdown-menu']"));
		List<WebElement> lst = ele.findElements(By.tagName("li"));
		for(int i=0;i<lst.size();i++) {
			 String a = lst.get(i).getText();
			 System.out.println(a);
			 if(lst.get(i).getText().equals("2020")) {
				 lst.get(i).click();
			 }
		}
  }
}
