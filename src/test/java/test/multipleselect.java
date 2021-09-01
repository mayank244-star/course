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

import loodiet.yaml.POM.code;
import access.multipleselectoption;
public class multipleselect extends select {
	@Test
	public static void multipledrop() throws IOException{
		 
	 
select.drop();
			        String  arg=  multipleselectoption.multidrop();
			        String  arg1=  multipleselectoption.locator2();
			        Select s=new Select(driver.findElement(By.xpath(arg)));
				     for(int j=0;j< 2;j++) {
				        s.selectByIndex(j);
				        s.selectByIndex(j);
				     }
				        Boolean b=s.isMultiple();
				         List<String> selectedValues = new ArrayList<String>();
				        List<WebElement> selectedElements = s.getOptions();

				        for(WebElement element : selectedElements) {
				            selectedValues.add(element.getText());
				        }

				        for(String text1: selectedValues) {
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
	

