package testNGpack;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Reporter;

public class Demo1 {
  @Test
  public void f() {
	  
	  int a=6;
	  int b=0;
	  int res = a/b;
	  Reporter.log("Hello Brother" +res, true);
  }
  
  @Test
  public void f1() {
	  
	  Reporter.log("How are u?", true);
  }
  
  @Test
  public void f2() {
	  
	  Reporter.log("Have u Breakfast?", true);
  }
}
