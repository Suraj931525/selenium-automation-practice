package GroupingTestCases;

import org.testng.annotations.Test;

public class Testdependency {
	
	@Test
	void launch() {
		System.out.println("Launch fct website");
	}
	
	@Test(dependsOnMethods="launch")
	void dashboard() {
		System.out.println("dashboard of fct website");
	}

}
