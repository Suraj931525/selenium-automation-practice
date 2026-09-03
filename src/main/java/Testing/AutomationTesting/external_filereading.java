package Testing.AutomationTesting;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class external_filereading {

    @Test
    void testfilered() throws IOException {

        FileReader fr = new FileReader(
            "C:\\Users\\suraj\\javaprogram\\Automation Testing\\AutomationTesting\\test.properties"
        );

        Properties pr = new Properties();

        pr.load(fr);
        
        EdgeDriver driver=new EdgeDriver();
        driver.get(pr.getProperty("orangehrm"));

        System.out.println(pr.getProperty("username"));
        System.out.println(pr.getProperty("password"));

        fr.close();
    }
}