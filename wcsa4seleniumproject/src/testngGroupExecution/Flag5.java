package testngGroupExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {
  @Test
  public void login() {
	  
	  Reporter.log("Logged IN!!", true);
  }
  
  
  @Test(dependsOnMethods = "login")
  public void createUser() {
	  
	  Reporter.log("User Created!!", true);
  }
  
  
  @Test(dependsOnMethods = "createUser")
  public void logOut() {
	  
	  Reporter.log("Logged OUT!!", true);
  }
}
