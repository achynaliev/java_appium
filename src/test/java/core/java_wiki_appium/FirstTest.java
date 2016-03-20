package core.java_wiki_appium;

import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import framework.BaseTestsClass;
import framework.TestDriver;


public class FirstTest extends BaseTestsClass {
	//public static AppiumDriver driver;
	
	@Test
	public void searchTest() {

		String expectedTitle = "Automation";
		
		TestDriver.driver.findElement(By.id("main_search_bar_text")).click();
		TestDriver.driver.getKeyboard().sendKeys("Automation");
		WebElement pagelistitemcontainer = (WebElement) TestDriver.driver.findElements(By.id("page_list_item_container")).get(0);
		pagelistitemcontainer.click();
		String actualTitle = TestDriver.driver.findElement(By.id("page_title_text")).getText();
		System.out.println("expectedTitle = "+ expectedTitle);
		System.out.println("actualTitle = "+ actualTitle);
       
		//assert(expectedTitle.equalsIgnoreCase(actualTitle));
	}

}