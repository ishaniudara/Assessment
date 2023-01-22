/**
 * 
 */
package Utility;

import org.apache.log4j.Logger;



/**
 * @author Udara Vithanage
 *
 */
public class Log {
	public static Logger log=Logger.getLogger(Log.class.getName());

	public static void startTestCase(String TestCaseName) {
		log.info("====================="+TestCaseName+"Start testcase");
		
	}
	public static void endTestCase(String TestCaseName) {
		log.info("====================="+TestCaseName+"End testcase");
		
	}

	public static void info(String message) {
		log.info(message);
	}
	public static void warn(String message) {

	    Log.warn(message);

		}

	 public static void error(String message) {

	    Log.error(message);

		}

	 public static void fatal(String message) {

	    Log.fatal(message);

		}

	 public static void debug(String message) {

	    Log.debug(message);

		}


}
