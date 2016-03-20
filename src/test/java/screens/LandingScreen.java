package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Keyboard;

import framework.TestDriver;
import io.appium.java_client.AppiumDriver;

public class LandingScreen {
	
	public static AppiumDriver driver;
	
	// Not really clear why we need constructor for test to run successfully
	// Read and understand about it
	public LandingScreen (AppiumDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getSearchField() {
		return driver.findElement(By.id("main_search_bar_text"));
	}
	
	public Keyboard keyboard() {
		return driver.getKeyboard();
	}
	
	public WebElement getSearchResultsItem(int articleNumber){
		WebElement pagelistitemcontainer = (WebElement) TestDriver.driver.findElements(By.id("page_list_item_container")).get(articleNumber-1);
		return pagelistitemcontainer;
	}
	
	public WebElement getArticleTitle() {
		return driver.findElement(By.id("page_title_text"));
	}

}
