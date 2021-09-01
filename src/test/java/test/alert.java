package test;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import access.alertbox;
import loodiet.yaml.POM.code;

public class alert extends checkbox{
	@Test
	public static void alertwrite() throws IOException, InterruptedException {
		
		checkbox.checkboxselect();
		String arg2 = code.text7();
	  String  arg=  alertbox.locator();
      String  arg1=  alertbox.locator1();
       driver.findElement(By.xpath(arg)).sendKeys(arg2);
	 driver.findElement(By.xpath(arg1)).click();
	 Thread.sleep(3000);
	
		String text3 =  driver.switchTo().alert().getText();
		 driver.switchTo().alert().accept();
		assertEquals("Hello "+arg2+", share this practice page and share your knowledge",text3);

}
}