package screenshotcapture;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import org.openqa.selenium.*;

public class partialScreenshot {
	public static void main(String[] args) throws IOException {
		partialScreenshot run =new partialScreenshot();
		run.partialSS();
	}
	void partialSS() throws IOException {
		
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.fortunecloudindia.com/");
	driver.manage().window().maximize();
	
	WebElement FCTlogo=driver.findElement(org.openqa.selenium.By.xpath("//*[@id=\"root\"]/div[2]/header/header/div/div/a/img"));
	
	File source=FCTlogo.getScreenshotAs(OutputType.FILE);	
	
	File Destination=new File("C:\\Users\\suraj\\Desktop\\FCTLogo.png");
	
	Files.copy(source,Destination);
	System.out.println("Partial Screenshot captured");
}
}