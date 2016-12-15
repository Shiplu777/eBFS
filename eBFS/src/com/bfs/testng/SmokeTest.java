package com.bfs.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class SmokeTest {
  @Test(priority=1)
  public void Test1() {
	  System.out.println("Search product");
	  Reporter.log("Search Validation");
	  String Text = "Rahman";
	  Assert.assertEquals("Shiplu",Text);
  }
  
  @Test(enabled = false)
  public void Test2() {
	  System.out.println("Add to cart product");
  }
  @Test(priority=0)
  public void Test3() {
	  System.out.println("Enter Billing");
	  Reporter.log("Enter Billing Address Validation");
	  String Text = "Shiplu";
	  Assert.assertEquals("Shiplu",Text);
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("-----------------------Open Browser");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Closing Browser");
  }

}
