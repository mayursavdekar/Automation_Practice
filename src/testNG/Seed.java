package testNG;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
public class Seed {
	WebDriver driver;
	@Ignore
	@Test
	public void googleMethod() throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium library\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (int i = 0; i < links.size(); i++) {
			int no = i + 1;
			System.out.println("Link " + no + " is :- ");
			String text = links.get(i).getText();
			System.out.println(text);
			Thread.sleep(3000);
			driver.quit();
		}
	}

	@Ignore
	@Test
	public void dynamicMenusHandling() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium library\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.istqb.org/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='MenuItemstyles__StyledDiv-sc-1imjvlt-0 xYEXk active open']/img"))
		.click();
		List<WebElement> menus = driver
				.findElements(By.xpath("//ul[@class='SubMenustyles__StyledUl-sc-9jcrc3-1 xaFQA']/li"));
		for (int i = 0; i < menus.size(); i++) {
			int no = i + 1;
			System.out.println("Link " + no + " is :-" + menus.get(i).getText());
		}
		Thread.sleep(3000);
		driver.quit();
	}


	@Ignore
	@Test
	public void dynamicMenusHandling1() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium library\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.istqb.org/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='MenuItemstyles__StyledDiv-sc-1imjvlt-0 xYEXk active open']/img"))
		.click();
		List<WebElement> menus = driver
				.findElements(By.xpath("//ul[@class='SubMenustyles__StyledUl-sc-9jcrc3-1 xaFQA']/li"));
		for (int i = 0; i < menus.size(); i++) {
			int no = i + 1;
			System.out.println("Link " + no + " is :-" + menus.get(i).getText());
		}
		Thread.sleep(3000);
		driver.quit();
	}
	@Ignore
	@Test
	public void webTableHandling() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium library\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();

		// find all the current values in the form of WebElements
		List<WebElement> lst = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		int size = lst.size();
		System.out.println("Total Elements Are :- " + size);
		System.out.println("*****************************************************************************************");

		double arr[] = new double[size];
		double arrOriginal[]=new double[size];

		// storing values in the array
		for (int i = 0; i < arr.length; i++) {
			String data = lst.get(i).getText().replace(",", "");
			arr[i] = Double.valueOf(data);
			arrOriginal[i]=Double.valueOf(data);
		}

		// printing stored data from array
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1)+ " :- " + arr[i]);
		}

		// finding maximum value from array
		double temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		// printing highest current price
		System.out.println("Highest Current Price is :- " + arr[size-1]);
		System.out.println("*****************************************************************************************");	

		// printing lowest current price
		System.out.println("*****************************************************************************************");
		System.out.println("Lowest Current Price is :- " + arr[0]);
		System.out.println("*****************************************************************************************");

		int maxPosition	=0;	
		int minPosition=0;
		for(int i=0;i<arrOriginal.length;i++) {
			if(arrOriginal[i]==arr[size-1]) {
				maxPosition=i+1;
			}
			if(arrOriginal[i]==arr[0]) {
				minPosition=i+1;
			}
		}

		String val = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+ maxPosition +"]/td[1]")).getText();
		System.out.println("Company Name Having Maximum value is :- "+val);
		System.out.println("*****************************************************************************************");	

		String val1 = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+ minPosition +"]/td[1]")).getText();
		System.out.println("Company Name Having Minimum value is :- "+val1);
		System.out.println("*****************************************************************************************");	
	}
	@Ignore
	@Test
	public void radioButton() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium library\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@name='group1'])[position()=1]")).click();
		driver.findElement(By.xpath("(//input[@name='group2'])[position()=2]")).click();
		Thread.sleep(5000);
		driver.quit();	
	}
	@Ignore
	@Test
	public void google() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium library\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("seedinfotech");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[position()=1]")).click();
		Thread.sleep(5000);
		driver.quit();
	}



















	@Test
	public void citiBankMultipleWidows() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium library\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.online.citibank.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@class='appClose']")).click();
		String mainPageTitle1 = driver.getTitle();
		System.out.println("Main Page Title First Time :- "+mainPageTitle1);
		System.out.println("*********************************************");
		String fontWeigth=driver.findElement(By.xpath("//span[text()='Login']")).getCssValue("font-weight");
		System.out.println("Font Weight is :-"+fontWeigth);
		System.out.println("*********************************************");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(3000);
		Set<String> windows = driver.getWindowHandles();
		Object[] windowsArray = windows.toArray();
		driver.switchTo().window(windowsArray[1].toString());
		String childPageTitle=driver.getTitle();
		System.out.println("Child Page Title :- "+childPageTitle);
		System.out.println("*********************************************");
		driver.switchTo().window(windowsArray[0].toString());
		String  mainPageTitle2=driver.getTitle();
		System.out.println("Main Page Title Second Time:- "+mainPageTitle2);
		Thread.sleep(3000);
		driver.quit();

	}
}

