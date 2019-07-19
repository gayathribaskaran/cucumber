package com.tests;

import org.testng.annotations.Test;

public class TestNG {
	
  @Test(priority=1)
  public void testGoogle()
  {
	  System.out.println("Google");
  }
  @Test(priority=2)
  public void testTwitter()
  {
	  System.out.println("Twitter");
  }
  @Test(priority=3)
  public void testFacebook()
  {
	  System.out.println("Facebook");
  }
}
