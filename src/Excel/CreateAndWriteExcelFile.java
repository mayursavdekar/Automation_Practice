package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.testng.annotations.Test;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class CreateAndWriteExcelFile {
	FileOutputStream fo;
	WritableWorkbook wb;
	WritableSheet ws;
  @Test
  public void f() throws Exception {
	  fo=new FileOutputStream("C:\\Users\\Admin\\eclipse-workspace\\SeleniumAutomation\\Results\\results.xls");
	  wb=Workbook.createWorkbook(fo);
	  ws=wb.createSheet("results", 0);
	 Label l1=new Label(0, 0, "Username");
	 Label l2=new Label(1, 0, "Password");
	 Label l3=new Label(0, 1, "mayur");
	 Label l4=new Label(1, 1, "mayur@12345");
	 ws.addCell(l1);
	 ws.addCell(l2);
	 ws.addCell(l3);
	 ws.addCell(l4);
	 wb.write();
	 wb.close();
  }
}
