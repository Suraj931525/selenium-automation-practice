package Assertion;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assersion {
	
	@Test
	void hardassersion() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
		String ExpectedResult="whatsapp";
		String ActualResult=driver.getTitle();
		Assert.assertEquals(ExpectedResult,ActualResult);
	}

	
	void softassersion() {
		
	}
}
