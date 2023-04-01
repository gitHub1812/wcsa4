package testngBatchExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MethodsExe {
@Test
  public void method1() {
	  
	  long threadID = Thread.currentThread().threadId();
	  Reporter.log(threadID+" is the threadID", true);
	  Reporter.log("method1", true);
  }
  
  
  @Test
  public void method2() {
	  
	  long threadID = Thread.currentThread().threadId();
	  Reporter.log(threadID+" is the threadID", true);
	  Reporter.log("method2",true);
  }
}
