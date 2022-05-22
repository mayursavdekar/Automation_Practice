package testNG;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.annotations.Test;

public class CurrentDateTime {
  @Test
  public void f() {
	  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh_mm_ss_dd_MM_hh");
	   LocalDateTime now = LocalDateTime.now();
	   String temp = dtf.format(now);
	   System.out.println(temp);
  }
}
