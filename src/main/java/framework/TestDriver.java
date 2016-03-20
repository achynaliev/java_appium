package framework;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestDriver {
	
	// Figure out why AppiumDriver is underlined
	
	public static AppiumDriver driver = null;
	
	
	public static AppiumDriver getDriver() throws MalformedURLException {
		if(driver == null) 
			driver = initializeDriver();
		return driver;
	}
	
	public static AppiumDriver initializeDriver() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		String apkpath = System.getProperty("user.dir") + "/apps/wiki/app-alpha-debug.apk";
		File app = new File(apkpath);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"SUMSUNG");

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");

        capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY,"org.wikipedia.page.PageActivity");

        capabilities.setCapability(MobileCapabilityType.APP_PACKAGE,"org.wikipedia.alpha");

        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        
        
        URL serverUrl = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverUrl, capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        return driver;
	}

}
