package test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import loodiet.yaml.POM.code;
import access.iframe;

public class frame extends mousehover{
	@Test
	public static void accessframe() throws IOException, InterruptedException {
	mousehover.mouse();
		String var = code.text10();
			String arg = iframe.locator();
	String arg1 = iframe.locator1();
	String arg2 = iframe.locator2();
	String arg3 = iframe.locator3();
		int size = driver.findElements(By.tagName(arg)).size();
	System.out.println(size);
	WebDriver a = driver.switchTo().frame(var); 
	System.out.println(a);
	String frameelement = driver.findElement(By.xpath(arg1)).getText();
	 System.out.println(frameelement);
	   	assertEquals("All Courses",frameelement);
	   	
	System.out.println(driver.findElement(By.xpath(arg2)).getText());
	driver.findElement(By.xpath(arg3)).click();

}
}