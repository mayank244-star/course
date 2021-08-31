package loodiet.yaml.POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

import org.yaml.snakeyaml.Yaml;

public class code {
	 
		 //yaml
		 public static String access() throws FileNotFoundException {
		  Yaml yaml1 = new Yaml();
		   InputStream inputStream1 = new FileInputStream("C:\\Users\\user\\project\\loodiet.yaml.POM\\src\\main\\resources\\POM\\url.yaml");
	       // System.out.println(inputStream);

	       HashMap yamlMap1 = yaml1.load(inputStream1);
	       HashMap lets = (HashMap) yamlMap1.get("letskodeiturl");
	      
	  	  
	        HashMap var20 = (HashMap) lets.get("url");
	  
	  	 
	       
	  	String v21 = (String) var20.get("varurl");
	       
	        return v21;
		 }
	        // yaml file
		 public static void locator() throws IOException {
	        Yaml yaml = new Yaml();
	        InputStream inputStream = new FileInputStream("C:\\Users\\user\\project\\loodiet.yaml.POM\\src\\main\\resources\\POM\\locator.yaml");
	       // System.out.println(inputStream);

	       HashMap yamlMap = yaml.load(inputStream);
	       HashMap letskodeit = (HashMap) yamlMap.get("letskodeit");
	        System.out.println(letskodeit);
	  	  
	        HashMap var = (HashMap) letskodeit.get("locator");
	        System.out.println(var);
	  	 
	       
	  	String v1 = (String) var.get("radio_45");
	        System.out.println(v1);
	        String v2 = (String) var.get("selectdropdown_57");
	        System.out.println(v2);
	        String v3 = (String) var.get("clickdropdown_60");
	        System.out.println(v3);
	        String v4 = (String) var.get("var_82");
	        System.out.println(v4);
	        String v5 = (String) var.get("var_95");
	        System.out.println(v5);
	        String v6 = (String) var.get("var_104");
	        System.out.println(v6);
	        String v7 = (String) var.get("var_105");
	        System.out.println(v7);
	        String v8 = (String) var.get("var_115");
	        System.out.println(v8);
	        String v9 = (String) var.get("var_125");
	        System.out.println(v9);
	        String v10 = (String) var.get("var_126");
	        System.out.println(v10);
	        String v11 = (String) var.get("var_133");
	        System.out.println(v11);
	        String v12 = (String) var.get("var_140");
	        System.out.println(v12);
	        String v13 = (String) var.get("var_141");
	        System.out.println(v13);
	        String v14 = (String) var.get("var_162");
	        System.out.println(v14);
	        String v15 = (String) var.get("var_191");
	        System.out.println(v15);
	        String v16 = (String) var.get("var_212");
	        System.out.println(v16);
	        String v17 = (String) var.get("var_216");
	        System.out.println(v17);
	        String v18 = (String) var.get("var_217");
	        System.out.println(v18);
	        String v19 = (String) var.get("var_223");
	        System.out.println(v19);
	        inputStream.close();
		 }
	        //properties
		 public static void text() throws IOException {
	        FileInputStream fis =new FileInputStream("C:\\Users\\user\\project\\loodiet.yaml.POM\\src\\main\\resources\\POM\\text.properties");
			Properties prop = new Properties();
			 prop.load(fis);
			 String v22= prop.getProperty("CarName");
			 System.out.println(v22);
			 String v23= prop.getProperty("CarNameradiotype");
			 System.out.println(v23);
			 String v24= prop.getProperty("Mousehover");
			 System.out.println(v24);
			 String v25= prop.getProperty("CarNameradiotype1");
			 System.out.println(v25);
			 String v26= prop.getProperty("CarNameradiotype2");
			 System.out.println(v26);
			 String v27= prop.getProperty("values");
			 System.out.println(v27);
			 String v28= prop.getProperty("hide-show");
			 System.out.println(v28);
			 String v29= prop.getProperty("alert");
			 System.out.println(v29);

			 
		 }
		 public static String text1() throws IOException {
		        FileInputStream fis =new FileInputStream("C:\\Users\\user\\project\\loodiet.yaml.POM\\src\\main\\resources\\POM\\text.properties");
				Properties prop = new Properties();
				 prop.load(fis);
				 String v22= prop.getProperty("CarNameradiotype");
				 System.out.println(v22);
				 return v22;
	
}
		 public static String text4() throws IOException {
		        FileInputStream fis =new FileInputStream("C:\\Users\\user\\project\\loodiet.yaml.POM\\src\\main\\resources\\POM\\text.properties");
				Properties prop = new Properties();
				 prop.load(fis);
				 String v22= prop.getProperty("CarNameradiotype1");
				 System.out.println(v22);
				 return v22;
	
}
		 public static String text2() throws IOException {
		        FileInputStream fis =new FileInputStream("C:\\Users\\user\\project\\loodiet.yaml.POM\\src\\main\\resources\\POM\\text.properties");
				Properties prop = new Properties();
				 prop.load(fis);
				 String v22= prop.getProperty("CarNameradiotype2");
				 System.out.println(v22);
				 return v22;
	
}
		 public static String text3() throws IOException {
		        FileInputStream fis =new FileInputStream("C:\\Users\\user\\project\\loodiet.yaml.POM\\src\\main\\resources\\POM\\text.properties");
				Properties prop = new Properties();
				 prop.load(fis);
				 String v22= prop.getProperty("CarName");
				 System.out.println(v22);
				 return v22;
	
}
		 
		 public static String text6() throws IOException {
		        FileInputStream fis =new FileInputStream("C:\\Users\\user\\project\\loodiet.yaml.POM\\src\\main\\resources\\POM\\text.properties");
				Properties prop = new Properties();
				 prop.load(fis);
				 String v29= prop.getProperty("values");
				 System.out.println(v29);
				 return v29;
	
}
		 public static String text7() throws IOException {
		        FileInputStream fis =new FileInputStream("C:\\Users\\user\\project\\loodiet.yaml.POM\\src\\main\\resources\\POM\\text.properties");
				Properties prop = new Properties();
				 prop.load(fis);
				 String v30= prop.getProperty("alert");
				 System.out.println(v30);
				 return v30;
	
}
		 public static String text8() throws IOException {
		        FileInputStream fis =new FileInputStream("C:\\Users\\user\\project\\loodiet.yaml.POM\\src\\main\\resources\\POM\\text.properties");
				Properties prop = new Properties();
				 prop.load(fis);
				 String v30= prop.getProperty("hide-show");
				 System.out.println(v30);
				 return v30;
	
}
		 public static String text9() throws IOException {
		        FileInputStream fis =new FileInputStream("C:\\Users\\user\\project\\loodiet.yaml.POM\\src\\main\\resources\\POM\\text.properties");
				Properties prop = new Properties();
				 prop.load(fis);
				 String v30= prop.getProperty("Mousehover");
				 System.out.println(v30);
				 return v30;
	
}
		 public static String text10() throws IOException {
		        FileInputStream fis =new FileInputStream("C:\\Users\\user\\project\\loodiet.yaml.POM\\src\\main\\resources\\POM\\text.properties");
				Properties prop = new Properties();
				 prop.load(fis);
				 String v30= prop.getProperty("frame");
				 System.out.println(v30);
				 return v30;
	
}
		
		 public static String text11() throws IOException {
		        FileInputStream fis =new FileInputStream("C:\\Users\\user\\project\\loodiet.yaml.POM\\src\\main\\resources\\POM\\text.properties");
				Properties prop = new Properties();
				 prop.load(fis);
				 String v30= prop.getProperty("Mousehover2");
				 System.out.println(v30);
				 return v30;
	
}
		
}
