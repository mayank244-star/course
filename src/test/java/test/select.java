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

import access.dropdown;
import loodiet.yaml.POM.code;
import test.launch;
import test.radio;
public class select extends radio{
	
	@Test
	public static void drop() throws IOException{
		 
	     radio.radioselect();
	     String var = code.text3();
			        String  arg=  dropdown.locator();
			         String  arg1=  dropdown.click();
			         WebElement cars = driver.findElement(By.xpath(arg));  
					 Select dropdown = new Select(cars);
					 dropdown.selectByVisibleText(var);
					 driver.findElement(By.xpath(arg1+"'"+var+"']")).click();
					 List<String> Values = new ArrayList<String>();
				        List<WebElement> Elements = dropdown.getOptions();
				        for(WebElement element : Elements) {
				        	Values.add(element.getText());
				        }
				        for(String text1: Values) {
				             boolean selected =  driver.findElement(By.xpath(arg1+"'"+text1+"']")).isSelected();
				    		if(selected) {
				    			assertEquals(true,selected);
				    		}
				    		else {
				    			assertEquals(false,selected);
				    		}
				        }
				        
	    }
}
