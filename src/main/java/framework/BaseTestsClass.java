package framework;

import java.net.MalformedURLException;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import io.appium.java_client.AppiumDriver;

public class BaseTestsClass {
	
	public static AppiumDriver driver = null;
	
	@BeforeClass
	public static void setUp() throws MalformedURLException {
		
		driver = TestDriver.getDriver();
	}
	
	@AfterClass
	public static void tearDown() {
		driver.resetApp();
		// Read about resetApp method
	}

}
