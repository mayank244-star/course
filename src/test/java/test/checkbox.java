package test;

import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import test.launch;
import access.multipleselectoption;

import access.checkboxaccess;
import loodiet.yaml.POM.code;
public class checkbox extends multipleselect {
@Test
	 public static void checkboxselect() throws IOException{
		 
	     multipleselect.multipledrop();
	     String var = code.text1();
	     String var1 = code.text4();
	     String var2 = code.text2();
			        String  arg=  checkboxaccess.locator();
			        System.out.println(arg);
			        String  ar3=  checkboxaccess.locator1();
			        System.out.println(ar3);
			        driver.findElement(By.xpath(arg+"'"+var+"'"+ar3)).click();
			        boolean radio1 =  driver.findElement(By.xpath(arg+"'"+var+"'"+ar3)).isSelected();
			    	assertEquals(true,radio1);
			    	boolean radio2 =  driver.findElement(By.xpath(arg+"'"+var1+"'"+ar3)).isSelected();

			    	assertEquals(false,radio2);
			    	boolean radio3 =  driver.findElement(By.xpath(arg+"'"+var2+"'"+ar3)).isSelected();

			    	assertEquals(false,radio3);
			        
	    }
}
