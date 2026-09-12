package KeyboardAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyboardaction {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.navigate().to("https://demo.automationtesting.in/Register.html#google_vignette");

		WebElement firstname=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
		firstname.sendKeys("Suraj");
		firstname.sendKeys(Keys.CONTROL+"A");
		
		firstname.sendKeys(Keys.CONTROL+"C");
		
		
		WebElement lastname=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
		lastname.sendKeys(Keys.CONTROL+"V");
	}

}
