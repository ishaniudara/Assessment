/**
 * 
 */
package Utility;

import java.net.MalformedURLException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Udara Vithanage
 *
 */
public class WebDriverHelper {
	static WebDriverHelper wHelper;
	public static WebDriver Wdriver, driver;
		
	

private WebDriverHelper() {
}

public static WebDriver startUpWebDriver(String Browser,String paths)
		throws MalformedURLException {
	
	System.out.println("Startup Web Driver Method_______________");
	Log.info("Start web driver");
	if (Browser.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", paths);
		Wdriver = new ChromeDriver();
		Wdriver.manage().window().maximize();
		
	}
		return Wdriver;
}

public static WebDriverHelper getWebDriverHelper() {
	if (wHelper == null) {
		wHelper = new WebDriverHelper();
	}
	return wHelper;
}

public void enterUrl(String url) throws InterruptedException {
	Wdriver.navigate().to(url);
	Thread.sleep(3000);
}

public static WebDriver getWebDriver() {
	return Wdriver;
}
}
