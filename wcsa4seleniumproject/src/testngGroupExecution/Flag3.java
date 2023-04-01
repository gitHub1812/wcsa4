package testngGroupExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3 {
  @Test(priority = 1)
  public void login() {
	  
	  Reporter.log("Logged IN!!", true);
  }
  
  
  @Test(priority = 2)
  public void createUser() {
	  
	  Reporter.log("User Created!!", true);
  }
  
  
  @Test(priority = 3)
  public void logOut() {
	  
	  Reporter.log("Logged OUT!!", true);
  }
}
