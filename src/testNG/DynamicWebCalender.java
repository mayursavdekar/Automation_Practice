package testNG;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class DynamicWebCalender {
	WebDriver driver;

	@Test
	public void calenderDemo() throws Exception {
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-ubezar r-1ozqkpa' and text()='round trip']"))
				.click();
		driver.findElement(By.xpath("//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar']")).click();
		String date = "20-October 2022";
		String[] splitterDate = date.split("-");
		String data = splitterDate[0];
		String month = splitterDate[1];
		System.out.println("Day is " + date + " and month is " + month);
		String month1 = driver.findElement(By.xpath(
				"//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]"))
				.getText();
		String month2 = driver.findElement(By.xpath(
				"//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1 ]"))
				.getText();
		String combinedMonth = month1.concat(month2);
		System.out.println("Combined month is :- "+combinedMonth);
		while(!combinedMonth.contains(month)){
			System.out.println("Month is :- " + combinedMonth);
			if (combinedMonth.contains(month)) {
				System.out.println("we are in right month...");
				Thread.sleep(3000);
				break;
			} else {

				driver.findElement(By.xpath(
						"//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/div[2]/div[2]/div[1]/*[1]"))
						.click();
				Thread.sleep(2000);
				month1 = driver.findElement(By.xpath(
						"//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]"))
						.getText();
				month2 = driver.findElement(By.xpath(
						"//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1 ]"))
						.getText();
			}
		}
		driver.close();
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium library\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
	}

}
