package tests;

import io.appium.java_client.AppiumDriver;
import screens.LandingScreen;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;

import org.junit.Test;


import framework.BaseTestsClass;
import framework.TestDriver;


public class FirstTest extends BaseTestsClass {
	//public static AppiumDriver driver;
	
	@Test
	public void searchTest() {
		
		LandingScreen landingScreen = new LandingScreen(driver);
		String expectedTitle = "Automation Master";
		
		landingScreen.getSearchField().click();
		landingScreen.keyboard().sendKeys("Automation");
		landingScreen.getSearchResultsItem(2).click();
		
		String actualTitle = landingScreen.getArticleTitle().getText();
		System.out.println("expectedTitle = "+ expectedTitle);
		System.out.println("actualTitle = "+ actualTitle);
       
		assertTrue("Actual title is not equal to expected title", actualTitle.contains(expectedTitle));
	}

}