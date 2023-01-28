package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyData {

	public static String main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./data/config.properties");   // provide the path of property file
		
		Properties prop = new Properties();   
	    prop.load(fis);  // use to read file
	    
	  String data = prop.getProperty("Browser");
	  return data;  
	    
	}


}
