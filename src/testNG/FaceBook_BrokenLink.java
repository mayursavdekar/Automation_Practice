package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;

public class FaceBook_BrokenLink {
	WebDriver driver;
	HashSet <String>brokenLinks;
  @Test
  public void f() throws Exception {
	  List<WebElement> links = driver.findElements(By.tagName("a"));
	  brokenLinks = new HashSet<String>();
	  for(WebElement link:links) {
		 String linkURL = link.getAttribute("href"); 
		 URL url=new URL(linkURL);
		 URLConnection urlConnection = url.openConnection();
		 HttpURLConnection httpURLConnection = (HttpURLConnection)urlConnection;
		 httpURLConnection.connect();
		 if(httpURLConnection.getResponseCode()!=200) {
			 brokenLinks.add(linkURL);
		 }
		 httpURLConnection.disconnect();
	  }
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.gecko.driver", "D:\\Selenium library\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
	  for(String brokenLink:brokenLinks) {
		  System.err.println(brokenLink);
	  }
  }

}
