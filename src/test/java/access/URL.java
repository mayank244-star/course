package access;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import org.yaml.snakeyaml.Yaml;

public class URL {
	public static String locator() throws IOException {
		 Yaml yaml = new Yaml();
	        InputStream inputStream = new FileInputStream("C:\\Users\\user\\project\\loodiet.yaml.POM\\src\\main\\resources\\POM\\url.yaml");
	       // System.out.println(inputStream);

	       HashMap yamlMap = yaml.load(inputStream);
	       HashMap letskodeit = (HashMap) yamlMap.get("letskodeiturl");
	       HashMap var = (HashMap) letskodeit.get("url");
			         
	  	String v1 = (String) var.get("varurl");
	        System.out.println(v1);
	        return v1;
	 }
}
