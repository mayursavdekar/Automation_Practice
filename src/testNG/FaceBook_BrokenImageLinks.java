package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class FaceBook_BrokenImageLinks {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  List<WebElement> images = driver.findElements(By.tagName("img"));
	  int count=0;
	  for(WebElement image:images) {
		  String imageSrc = image.getAttribute("src");
		  count++;
		  System.out.println(" Image "+count+" is : "+imageSrc);
		  
		  URL url=new URL(imageSrc);
		  URLConnection URLConnection = url.openConnection();
		  HttpURLConnection httpURLConnection = (HttpURLConnection) URLConnection;
		  httpURLConnection.connect();
		  if(httpURLConnection.getResponseCode()!=200) {
			  System.err.println(imageSrc+""+httpURLConnection.getResponseCode()+""+httpURLConnection.getResponseMessage());
		  }
	  }
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.gecko.driver", "D:\\Selenium library\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
