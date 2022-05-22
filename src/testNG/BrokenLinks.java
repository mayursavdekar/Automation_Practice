package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class BrokenLinks {
	WebDriver driver;
	Set<String> brokenLinksURL;
	@Test
	public void f() throws Exception {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		brokenLinksURL=new HashSet<String>();
		int size = links.size();
		System.out.println(size);
		for(WebElement link:links) {
			String linkURL = link.getAttribute("href");
			URL url =new URL(linkURL);
			URLConnection urlConnection = url.openConnection();
			HttpURLConnection httpurlconnnection=(HttpURLConnection) urlConnection;
			httpurlconnnection.setConnectTimeout(5000);
			httpurlconnnection.connect();
			if(httpurlconnnection.getResponseCode()!=200) {
				brokenLinksURL.add(linkURL);
			}
			httpurlconnnection.disconnect();
		}
	}
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium library\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.hyrtutorials.com/");
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
		System.out.println("Number of broken links are :- "+brokenLinksURL.size());
		for( String brokenLink : brokenLinksURL) {
			System.err.println(brokenLink);
		}
		
	}

}
