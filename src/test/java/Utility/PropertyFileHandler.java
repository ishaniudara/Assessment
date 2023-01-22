/**
 * 
 */
package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Udara Vithanage
 *
 */
public class PropertyFileHandler {
	static PropertyFileHandler propertyFileHandler;
	static Properties Prop = new Properties();

	private PropertyFileHandler() {

	}
	public static PropertyFileHandler getPropertyFileHandler() {
		if (propertyFileHandler == null) {
			propertyFileHandler = new PropertyFileHandler();
		}
		return propertyFileHandler;
	}
	
	public static void loadPropertyFile(String path) throws FileNotFoundException, IOException {
		System.out.println("Load Property File");
		Prop.load(new FileInputStream(path));
	}
	public static String readProperty(String key) {
		return Prop.getProperty(key);
	}
	public static void writeProperty(String key, String value) {
		Prop.setProperty(key, value);
		
	}

}
