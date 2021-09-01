package test;
import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import access.radiomethod;
import loodiet.yaml.POM.code;
import test.launch;
public class radio extends launch {
	@Test

    public static void radioselect() throws IOException{
		 
     launch.setup();
     String var = code.text1();
     String var1 = code.text4();
     String var2 = code.text2();
		        String  arg=  radiomethod.locator();
		        String  ar3=  radiomethod.locator3();
		         driver.findElement(By.xpath(arg+"'"+var+"'"+ar3)).click();
		        boolean radio1 =  driver.findElement(By.xpath(arg+"'"+var+"'"+ar3)).isSelected();
		    	assertEquals(true,radio1);
		    	boolean radio2 =  driver.findElement(By.xpath(arg+"'"+var1+"'"+ar3)).isSelected();

		    	assertEquals(false,radio2);
		    	boolean radio3 =  driver.findElement(By.xpath(arg+"'"+var2+"'"+ar3)).isSelected();

		    	assertEquals(false,radio3);
		        
    }
}
