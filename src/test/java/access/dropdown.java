package access;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import org.yaml.snakeyaml.Yaml;

public class dropdown extends intialization{
	 public static String locator() throws IOException {
		 intialization.initial(); 
	  	String v1 = (String) var.get("selectdropdown_57");
	        return v1;
	 }
	 public static String click() throws IOException {
		 intialization.initial(); 
	        
	  	String v1 = (String) var.get("clickdropdown_60");
	         return v1;
	 }
}
