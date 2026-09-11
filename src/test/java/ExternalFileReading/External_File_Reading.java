package ExternalFileReading;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

public class External_File_Reading {

	@test
      void test() throws IOException {

        FileReader fr = new FileReader(
            "C:\\Users\\suraj\\Desktop\\testdata.txt"
        );
        
        Properties pr= new Properties();
        pr.load(fr);
        ChromeDriver driver=new ChromeDriver();
        driver.get(pr.getProperty("orangeHRM"));
        
    }
}
