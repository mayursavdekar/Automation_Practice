package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.asserts.SoftAssert;
import org.testng.asserts.Assertion;

public class DataProviderDemo {
	WebDriver driver;
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://seleniumbymahesh.com");
		driver.manage().window().maximize();
  }
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }
  @Test(dataProvider = "loginData")
  public void login(String username,String password) {
	  driver.findElement(By.linkText("HMS")).click();
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("submit")).click();
		WebElement element = driver.findElement(By.linkText("Logout"));
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(element.isDisplayed());
  }
  //this @dataprovider inject data into test method
  @DataProvider(name="loginData")
  public String[][] loginData() {
	  
	  String[][] str=new String[4][2];
	  //login data set1
	  str[0][0]= "admin";
	  str[0][1]="admin";
	  
	  //login data set2
	  str[1][0]="mayur";
	  str[1][1]="myur";
	  
	//login data set3
	  str[2][0]="myur";
	  str[2][1]="mur";
	  
	//login data set4
	  str[3][0]="ma";
	  str[3][1]="ma";
	return str;
  }
}
