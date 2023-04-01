package testngGroupExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag7 {
	@Test
	public void login() {
		
		int res = 2/0;
		Reporter.log("login method", true);
	}

	@Test(dependsOnMethods = "login", alwaysRun = true)
	public void createUser() {

		Reporter.log("createuser method", true);
	}

	@Test
	public void logout() {

		Reporter.log("logout method", true);
	}
}
