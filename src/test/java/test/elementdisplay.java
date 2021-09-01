package test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import access.confirmbox;
import access.elementdisplaybox;
import loodiet.yaml.POM.code;

public class elementdisplay extends launch {
	@Test
	
	public static void element() throws IOException, InterruptedException {
launch.setup();
		String arg1 = code.text7();
		String arg2 = code.text8();
		 String  arg=  elementdisplaybox.locator();
	      String  arg3=  elementdisplaybox.locator1();
	       String  arg4=  elementdisplaybox.locator2();
	     	if(arg2.equals("hide")) {
		   driver.findElement(By.xpath(arg)).sendKeys(arg1);
		 driver.findElement(By.xpath(arg3)).click();
		 boolean hide = driver.findElement(By.xpath(arg)).isDisplayed();
		assertEquals(false,hide);
		 }
		 else {
		 
		   driver.findElement(By.xpath(arg)).sendKeys(arg1);
		 driver.findElement(By.xpath(arg4)).click();
		 boolean show = driver.findElement(By.xpath(arg)).isDisplayed();
		 assertEquals(true,show);
		 }
}
}
