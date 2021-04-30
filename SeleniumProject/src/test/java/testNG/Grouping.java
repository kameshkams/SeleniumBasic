package testNG;

import org.testng.annotations.Test;

public class Grouping {

	@Test(groups={"Smoke Testing", "Regression Testing"})
	  public void Testcase1() {
		  System.out.println("Testcase1");
	  }
	  @Test(groups={"Positive Testing", "Integration Testing"})
	  public void Testcase2() {
		  System.out.println("Testcase2");
	  }
	  @Test(groups={"System Testing", "Regression Testing"})
	  public void Testcase3() {
		  System.out.println("Testcase3");
	  }
	
}
