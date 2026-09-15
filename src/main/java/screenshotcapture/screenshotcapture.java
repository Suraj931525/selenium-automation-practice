package screenshotcapture;

import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.*;

public class screenshotcapture {

	public static void main(String[] args) throws IOException {
		screenshotcapture ab=new screenshotcapture();
		ab.fullss();
	}
	void fullss() throws IOException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		TakesScreenshot ts=driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\suraj\\Desktop\\Myntra_homepage.png");
		
		Files.copy(src,dest);
	}

}
