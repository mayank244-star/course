package loodiet.yaml.POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class properties {
	public static Properties prop;
public static void file() throws IOException {
	
	  FileInputStream fis =new FileInputStream("C:\\Users\\user\\project\\loodiet.yaml.POM\\src\\main\\resources\\POM\\text.properties");
		prop = new Properties();
		 prop.load(fis);
}
}
