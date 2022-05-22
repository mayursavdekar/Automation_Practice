package testingprojects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class openbrowser {
	 public static WebDriver driver;
	 
	public static void chrome() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium library\\chromedriver.exe");
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setAcceptInsecureCerts(true);
		driver =new ChromeDriver();
		driver.get("http://spicejet.com");	
		driver.manage().window().maximize();
	}
}