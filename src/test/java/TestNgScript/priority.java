package TestNgScript;

import org.testng.annotations.Test;

public class priority {
	
//	@Test(priority=-2)
//	void a() {
//		System.out.println("run");
//	}
//	@Test
//	void b() {
//		System.out.println("go");
//	}
//	@Test(priority=1)
//	void c() {
//		System.out.println("stop");
//	}

	
	
	@Test
	void c() {
		System.out.println("c");
	}
	@Test
	void b() {
		System.out.println("b");
	}
	@Test
	void a() {
		System.out.println("a");
	}
}
