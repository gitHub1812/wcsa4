package assertionTestng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert1 {
  @Test
  public void validLogin() {
	  
	  Reporter.log("Launch the Browser", true);
	  Reporter.log("Launch the web app by using URL", true);
	  
	  SoftAssert sa = new SoftAssert(); //soft ASSERT
	  sa.assertEquals(false, true);
	  Reporter.log("log in page will be display!!", true);
	  Reporter.log("Perform the login operation", true);
	  
	  Assert.assertEquals(true, true);  // Hard ASSERT
	  Reporter.log("Homepage will be Display!!", true);
	  Reporter.log("Log out", true);
  }
}
