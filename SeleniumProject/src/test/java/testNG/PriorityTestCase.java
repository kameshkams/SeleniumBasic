package testNG;

import org.testng.annotations.Test;

public class PriorityTestCase {

	@Test(priority=3,description="login")
	  public void Testcase1() {
		  System.out.println("Testcase1");
	  }
	  @Test(priority=1,description="Search")
	  public void Testcase2() {
		  System.out.println("Testcase2");
	  }
	  @Test(priority=2,description="Logout")
	  public void Testcase3() {
		  System.out.println("Testcase3");
	  }
}
