package GroupingTestCases;

import org.testng.annotations.Test;

public class group2 {
	@Test(groups="RegressionTest")
	void runing() {
		System.out.println("Suraj");
	}
	
	@Test(groups="RegressionTest")
	void going() {
		System.out.println("Ritesh");
	}
	
	
	@Test(groups="Smoketest")
	void fastest() {
		System.out.println("Akash");

}
}
