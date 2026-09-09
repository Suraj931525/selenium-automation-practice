package TestNgScript;

import org.testng.annotations.Test;

public class demopriority {
	
	@Test(priority=-1)
	void c() {
		System.out.println("c");
	}
	@Test(priority=0)
	void b() {
		System.out.println("b");
	}
	@Test
	void a() {
		System.out.println("a");

}
}
