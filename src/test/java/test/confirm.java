package test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;

import org.testng.annotations.Test;
import access.confirmbox;
import loodiet.yaml.POM.code;

public class confirm extends alert {
	@Test
public static void confirmwrite() throws IOException, InterruptedException {
		
		alert.alertwrite();
		String arg2 = code.text7();
	  String  arg=  confirmbox.locator();
      System.out.println(arg);
      String  arg1=  confirmbox.locator1();
      System.out.println(arg1);
	 driver.findElement(By.xpath(arg)).sendKeys(arg2);
	 driver.findElement(By.xpath(arg1)).click();
	 Thread.sleep(3000);
	 
		String text3 =  driver.switchTo().alert().getText();
		System.out.println(text3);
		driver.switchTo().alert().accept();
		assertEquals("Hello "+arg2+", Are you sure you want to confirm?",text3);
	 
}
}
