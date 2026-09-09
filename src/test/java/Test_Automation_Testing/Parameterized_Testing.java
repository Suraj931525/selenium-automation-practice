package Test_Automation_Testing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Testing {
	
	@Parameters({"num1","num2"})
	@Test
	void add(int a,int b) {
		System.out.println("addition:"+(a+b));
	}

}
