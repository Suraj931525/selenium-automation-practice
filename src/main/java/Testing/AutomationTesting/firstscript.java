package Testing.AutomationTesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class firstscript {

	public static void main(String[] args) throws InterruptedException {
		
		//configuration of web driver
		System.setProperty("webdriver.edge.driver","C:\\Users\\suraj\\javaprogram\\Automation Testing\\AutomationTesting\\Driverresources\\msedgedriver.exe" );
	
	// browser launch /intialize the edgedriver
	
	WebDriver driver=new EdgeDriver();
	//driver.get("https://www.linkedin.com/login/?trk=guest_homepage-basic_nav-header-signin");
	//driver.close();
	
	
	driver.get("https://web.whatsapp.com/");
	System.out.println("Title of fct id"+driver.getTitle());
	Thread.sleep(1000);
	
	driver.navigate().to("https://github.com/");
	System.out.println("URL of chat gpt"+driver.getCurrentUrl());
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.navigate().forward();
	Thread.sleep(1000);
	driver.close();


	}

}
