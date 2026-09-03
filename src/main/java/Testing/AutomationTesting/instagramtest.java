package Testing.AutomationTesting;

import org.openqa.selenium.edge.EdgeDriver;

public class instagramtest {

	public static void main(String[] args) throws InterruptedException {
		
		
		EdgeDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/?flo=true");
		Thread.sleep(1000);
		String expected_title="Instagram";
		String actual_title=driver.getTitle();
		
		if(expected_title.equals(actual_title))
		{
			System.out.println("Title is matchihng");
		}
		else
		{
			System.out.println("Title is not matchihng");
		}
		driver.close();
	}
	

}
