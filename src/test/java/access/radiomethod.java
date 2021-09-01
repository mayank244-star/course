package access;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import org.yaml.snakeyaml.Yaml;

public class radiomethod extends intialization{
	 public static String locator() throws IOException {
		 intialization.initial(); 
	  	String v1 = (String) var.get("radio_45");
	        System.out.println(v1);
	        return v1;
	 }
	 
	 public static String locator3() throws IOException {
		 intialization.initial(); 
	  	String v2 = (String) var.get("radio_2");
	        System.out.println(v2);
	        return v2;
	 }
	 
}
