package access;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import org.yaml.snakeyaml.Yaml;

public class alertbox {
	 public static String locator() throws IOException {
	        Yaml yaml = new Yaml();
	        InputStream inputStream = new FileInputStream("C:\\Users\\user\\project\\loodiet.yaml.POM\\src\\main\\resources\\POM\\locator.yaml");
	       // System.out.println(inputStream);

	       HashMap yamlMap = yaml.load(inputStream);
	       HashMap letskodeit = (HashMap) yamlMap.get("letskodeit");
	         HashMap var = (HashMap) letskodeit.get("locator");
	        
	  	String v1 = (String) var.get("var_104");
	        System.out.println(v1);
	        return v1;
	 }
	 public static String locator1() throws IOException {
	        Yaml yaml = new Yaml();
	        InputStream inputStream = new FileInputStream("C:\\Users\\user\\project\\loodiet.yaml.POM\\src\\main\\resources\\POM\\locator.yaml");
	       // System.out.println(inputStream);

	       HashMap yamlMap = yaml.load(inputStream);
	       HashMap letskodeit = (HashMap) yamlMap.get("letskodeit");
	         HashMap var = (HashMap) letskodeit.get("locator");
	        
	  	String v1 = (String) var.get("var_105");
	        System.out.println(v1);
	        return v1;
	 }
}
