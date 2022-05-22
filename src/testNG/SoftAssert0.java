package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert0 {
	WebDriver driver;
	@Test
	public void softAss() throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("SRH Tutorials");
		Thread.sleep(5000);
		driver.findElement(By.name("login")).click();
		SoftAssert softAssert=new SoftAssert();
		// title assertion
		String expectedTitle="Facebook – log in or sign up";
		String actualTitle=driver.getTitle();
         softAssert.assertEquals(actualTitle, expectedTitle,"title mismatched...");
		//url assertion
         String actualURL=driver.getCurrentUrl();
         String expectedURL="https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjQ1ODY0MDU3LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D";
         System.out.println(actualURL);
         System.out.println(expectedURL);
         softAssert.assertEquals(actualURL, expectedURL,"URL mismatched");

		//text assertion
		String expectedText="";
		String actualText=driver.findElement(By.id("email")).getAttribute("value");
		softAssert.assertEquals(actualText, expectedText,"text mismathed");

		//border assertion
		String expectedBorder="1px solid rgb(240, 40, 73)"; // must be rgb format
		String actualBorder=driver.findElement(By.id("email")).getCssValue("border");
		Assert.assertEquals(actualBorder, expectedBorder,"border mismathed");

		//error assertion
		String expectedError="The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
		String actualError=driver.findElement(By.xpath("//div[@id='email_container']/div[2]")).getText();
		softAssert.assertEquals(actualError, expectedError,"error mismathed");

		driver.quit();
		softAssert.assertAll(); // this method shows which assertion fails actually throwing exception
	}
}
