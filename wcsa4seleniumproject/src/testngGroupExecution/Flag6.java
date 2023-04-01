package testngGroupExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
 
	@Test(enabled = true)
  public void login() {
	  
	  Reporter.log("Logged in", true);
  }
	
	
	@Test(enabled = true)
	  public void logout() {
		  
		  Reporter.log("Logged out", true);
	  }
}
