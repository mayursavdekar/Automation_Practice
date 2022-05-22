package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class GetExcelData {
	@Test
	public void f() throws Exception {
		System.out.println("started");
		FileInputStream fi=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\SeleniumAutomation\\TestData\\book.xls");
		System.out.println("file connected");
		Workbook w = Workbook.getWorkbook(fi);
		Sheet sheet1=w.getSheet("SheetOne");
		System.out.println(sheet1.getCell(0, 0).getContents());
		System.out.println(sheet1.getCell(1, 0).getContents());
		System.out.println(sheet1.getCell(0, 1).getContents());
		System.out.println(sheet1.getCell(1, 1).getContents());
	}
}
