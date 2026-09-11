package GroupingTestCases;

import org.testng.annotations.Test;

public class group1 {

	@Test(groups="Smoketest")
	void run() {
		System.out.println("hello");
	}
	
	@Test(groups="RegressionTest")
	void go() {
		System.out.println("hi");
	}
	
	
	@Test(groups="Smoketest")
	void fast() {
		System.out.println("by");
	}
}
