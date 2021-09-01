package test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import loodiet.yaml.POM.code;
import access.elementdisplaybox;
import access.mouse_hover;
import access.radiomethod;

public class mousehover extends elementdisplay{
@Test
	
	public static void mouse() throws IOException, InterruptedException {
	elementdisplay.element();
	     String var = code.text1();
	     String arg2 = code.text9();
	     String arg6 = code.text11();
			        String  arg1=  radiomethod.locator();
			         String  arg4=  radiomethod.locator3();
			       
		 String  arg=  mouse_hover.locator();
	      String  arg3=  mouse_hover.locator1();
	      
	      if(arg2.equals("Reload")) {
	  		driver.findElement(By.xpath(arg)).click();
	  		driver.findElement(By.xpath(arg3+"'"+arg2+"']")).click();
	  		 boolean radio1 =  driver.findElement(By.xpath(arg1+"'"+var+"'"+arg4)).isSelected();
		    	assertEquals(false,radio1);
		    	System.out.println("REloaded Sucesssfully");
	  		
	  				}
	  				else {
	  				
	  					driver.findElement(By.xpath(arg)).click();
	  					driver.findElement(By.xpath(arg3+"'"+arg6+"']")).click();
	  					 boolean radio1 =  driver.findElement(By.xpath(arg1+"'"+var+"'"+arg4)).isSelected();
	  			    	assertEquals(true,radio1);
	  			    	
	  					System.out.println("Top mouse hover");
	  					
	  				}
}
}
