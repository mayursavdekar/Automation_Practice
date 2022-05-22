package Excel;

import java.io.FileInputStream;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class OrangeHRM_Excel {
	public WebDriver driver;
	@Test
	public void orangeMethod()throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		FileInputStream fi=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\SeleniumAutomation\\TestData\\HRM.xls");
		System.out.println("Connected with Excel...");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet sheet1=wb.getSheet("Sheet1");
		driver.findElement(By.id("linkadd")).click();
		driver.findElement(By.id(sheet1.getCell(0, 1).getContents())).sendKeys(sheet1.getCell(1, 1).getContents());
		driver.findElement(By.id(sheet1.getCell(0, 2).getContents())).sendKeys(sheet1.getCell(1, 2).getContents());
		driver.findElement(By.id(sheet1.getCell(0, 3).getContents())).sendKeys(sheet1.getCell(1, 3).getContents());
		driver.findElement(By.id(sheet1.getCell(0, 4).getContents())).sendKeys(sheet1.getCell(1, 4).getContents());
//		List<WebElement> ele = new Select(driver.findElement(By.id(sheet1.getCell(0, 5).getContents()))).getOptions();
//		for(int i=0;i<ele.size();i++) {
//			if(ele.get(i).getText().equalsIgnoreCase(sheet1.getCell(1, 5).getContents()))
//			{
//				ele.get(i).click();
//			}
//		}
		// below single line we can use instead of commented code 
		   new Select(driver.findElement(By.id(sheet1.getCell(0,5).getContents()))).selectByVisibleText("India");
		Thread.sleep(3000);
		List<WebElement> opt = new Select(driver.findElement(By.id(sheet1.getCell(0, 6).getContents()))).getOptions();
		for(int i=0;i<opt.size();i++) {
			if(opt.get(i).getText().equalsIgnoreCase(sheet1.getCell(1, 6).getContents()))
			{
				opt.get(i).click();
			}
			else
			{
				System.out.println(sheet1.getCell(1, 6).getContents()+" not found...");
			}

		}

	}
}
