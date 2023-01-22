/**
 * 
 */
package Runner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


import Utility.PropertyFileHandler;
import Utility.WebDriverHelper;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Udara Vithanage
 *
 */
@RunWith(Cucumber.class)


@Cucumber.Options(features = {"src/Features/"}, glue = {"StepDefinition"},



format = { "json:target/cucumber.json" }, tags = {"@tag1"})
public class Runner {
	
@BeforeClass
	
	public static void setup() throws FileNotFoundException, IOException {

		PropertyFileHandler.getPropertyFileHandler();
		PropertyFileHandler.loadPropertyFile("src/Data/data.properties");

		
			WebDriverHelper.getWebDriverHelper();
			WebDriverHelper.startUpWebDriver(PropertyFileHandler.readProperty("Browser"),
					PropertyFileHandler.readProperty("path"));
 
		

	}
	
	@AfterClass
	public static void teaDown() throws InterruptedException {
	
			WebDriverHelper.getWebDriver().quit();
		}
		
		
		
}
