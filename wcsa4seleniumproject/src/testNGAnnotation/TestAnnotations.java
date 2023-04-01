package testNGAnnotation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestAnnotations {
  @Test
  public void f() {
	  Reporter.log("test case 1", true);
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("before method", true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("after method", true);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("before class", true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("after class", true);
  }
  
  @Test
  public void q() {
	  Reporter.log("test case 2", true);
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("before test", true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("after test", true);
  }

  @Test
  public void a() {
	  Reporter.log("3", true);
  }
  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("before suit", true);
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("after suit", true);
  }
 

}
