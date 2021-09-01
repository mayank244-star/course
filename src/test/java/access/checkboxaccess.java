package access;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import org.yaml.snakeyaml.Yaml;

public class checkboxaccess extends intialization {
	 public static String locator() throws IOException {
		 intialization.initial(); 
	  	String v1 = (String) var.get("radio_45");
	         return v1;
	 }
	 public static String locator1() throws IOException {
		 intialization.initial(); 
	  	String v1 = (String) var.get("var_95");
	        return v1;
	 }
}
