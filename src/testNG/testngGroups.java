package testNG;

import org.testng.annotations.Test;

public class testngGroups {
  @Test(groups = "daily")
  public void f1() {
	  System.out.println("f1 run");
  }
  @Test(groups = "daily")
  public void f2() {
	  System.out.println("f2 run");
  }
  @Test(groups = "weekly")
  public void f3() {
	  System.out.println("f3 run");
  }
  @Test(groups = "weekly")
  public void f4() {
	  System.out.println("f4 run");
  }
}
