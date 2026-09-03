package Testing.AutomationTesting;

import org.openqa.selenium.edge.EdgeDriver;

public class FBurltest {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		
		 driver.get("https://secure.facebook.com/");
		 Thread.sleep(1000);
		
		 String expectedurl="www.facebook.com";
		
	     String Actualurl=driver.getCurrentUrl();
	
		if(expectedurl.equals(Actualurl))
		
		{
		
		System.out.println("Fb login page url is matching");
		
		}
		 else {
		 System.out.println("Fb login page url is not matching");
		
		}
		 driver.close();
		}
	}

