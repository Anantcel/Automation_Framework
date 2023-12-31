package utils;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Pages;

public class BaseTests {

	private static WebDriver webDriver;
	protected static Pages homePage;
	
	@BeforeClass
	public static void launchApplication() {	
		setChromeDriverProperty();
		webDriver = new ChromeDriver();
		webDriver.get(Links.HOME);
		homePage = new Pages(webDriver);
	}
	
	@AfterClass
	public static void closeBrowser() {
		webDriver.quit();
	}
	
	public static WebDriver getWebDriver() {
		return webDriver;
	}
	private static void setChromeDriverProperty() {
		
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
	}
}
