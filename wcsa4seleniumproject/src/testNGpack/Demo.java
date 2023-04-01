package testNGpack;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Reporter;

public class Demo {
  @Test
  public void d1() {
	  Reporter.log("method1", true);
  }
  
  @Test
  public void d2() {
	  Reporter.log("method2", true);
  }
  
  @Test
  public void d3() {
	  Reporter.log("method3", true);
  }
}
