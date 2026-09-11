import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		 
		test sb=new test();
		
	}
	
	void sign_up(){
		WebDriver driver=new ChromeDriver ();
		driver.get("https://www.demoblaze.com/");
		driver.findElement(By.id("signin2")).click();
		
		
	}

}
