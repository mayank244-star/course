package test;

import static org.testng.Assert.assertEquals;
import java.io.FileNotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import loodiet.yaml.POM.code;


public class launch {
	
	public static WebDriver driver;
	
	@Test

    public static void setup() throws FileNotFoundException{

		 System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		 		 
		 driver = new ChromeDriver();	
				    
				        driver.manage().window().maximize();
		       
		        String  url=  code.access();
		        driver.get(url);
		        String actualurl = driver.getCurrentUrl();
		        System.out.println(actualurl);
		        assertEquals(url,actualurl);
		        
    }
	
}
