package testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testng.annotations.Test;

public class PropertiesFile {
  @Test
  public void f() throws Exception {
	  String propertiesFilePath=System.getProperty("user.dir")+"./config.properties";
	  FileInputStream fi=new FileInputStream(propertiesFilePath);
	  Properties p=new Properties();
	  p.load(fi);
	 String uname= p.getProperty("username");
	  System.out.println("username is :- "+uname);
	  
	  Random random=new Random();
	  for(int i=0;i<100;i++) {
		  int abc = random.nextInt(1000);
		  System.out.println(abc);
	  }
	  
  }
}
