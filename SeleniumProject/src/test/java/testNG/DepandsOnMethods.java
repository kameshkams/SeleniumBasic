package testNG;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DepandsOnMethods {
	
	@Test()
	  public void Testcase1() {
		  System.out.println("Testcase1");
	  }
	  @Test(dependsOnMethods="Testcase1")
	  public void Testcase2() {
		  System.out.println("Testcase2");
		  Assert.assertEquals("ABC", "XYZ");
	  }
	
	  @Test(dependsOnMethods="Testcase2",alwaysRun=true)
	  public void Testcase3() {
		  System.out.println("Testcase3");
	  }

}
