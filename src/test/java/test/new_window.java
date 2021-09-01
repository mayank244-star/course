package test;

import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import loodiet.yaml.POM.code;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import access.newtab;

public class new_window extends launch {
@Test
	public static void window() throws IOException, InterruptedException {
	launch.setup();
	
	String arg1 = newtab.locator();
	System.out.println(arg1);
	String arg2 = newtab.locator1();
	System.out.println(arg2);
		driver.findElement(By.xpath(arg1)).click();
 String MainWindow=driver.getWindowHandle();
		 
		 Set<String> s1=driver.getWindowHandles();		
	        Iterator<String>  i1=s1.iterator();		
	        		
	        while(i1.hasNext())			
	        {		
	            String ChildWindow=(String) i1.next();		
	          
	            if(!MainWindow.matches(ChildWindow))			
	            {    		
	            	  
	                    driver.switchTo().window(ChildWindow);
	            }
	        }
              
	        boolean value= driver.findElement(By.xpath(arg2)).isDisplayed();
	        System.out.println(value);
	       String current_url =  driver.getCurrentUrl();
	       assertEquals("https://courses.letskodeit.com/courses",current_url);
	        assertEquals(true,value);
			        driver.findElement(By.xpath(arg2)).click();
			       
			      
	}
	}

