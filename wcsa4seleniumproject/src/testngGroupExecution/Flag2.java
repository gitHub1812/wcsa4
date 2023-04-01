package testngGroupExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
  @Test(description = "This is a FTC!!")
  public void search1() {
	  
	  Reporter.log("SQL", true);
  }
}
