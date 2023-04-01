package testngBatchExecution;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class testngClass3 extends BaseTest {
  @Test
  public void search3() {
	  
	  driver.switchTo().activeElement().sendKeys("API",Keys.ENTER);
  }
}
