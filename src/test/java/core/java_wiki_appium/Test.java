package core.java_wiki_appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;


public class Test {
	public static AppiumDriver driver;
	
	

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		String apkpath = "/Users/Chyna/Documents/java_wiki_appium/java_wiki_appium/apps/wikiapp-alpha-debug.apk";
		File app = new File(apkpath);
		
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"SUMSUNG");

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");

        capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY,"org.wikipedia.page.PageActivity");

        capabilities.setCapability(MobileCapabilityType.APP_PACKAGE,"org.wikipedia.alpha");

        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        
        
        URL serverUrl = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverUrl, capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
    
	}

}
