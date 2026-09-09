package Test_Automation_Testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotations {
	
	@Test
	void a() {
		System.out.println("Test");
	}
	
	@BeforeTest
	void b() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	void C() {
		System.out.println("After Test");
	}
	
	@BeforeMethod
	void d() {
		System.out.println("Before method");
	}
	
	@AfterMethod
	void e() {
		System.out.println("After method");
	}
	
	@AfterSuite
	void f() {
		System.out.println("After suite");

	}
	
	
	@AfterClass
	void g() {
		System.out.println("After Class");

	}
	
	
	@BeforeClass
	void h() {
		System.out.println("Before Class");

	}
	
	@BeforeSuite
	void i() {
		System.out.println("Before Suite");

	}
	
	

}
