package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Pages {

	protected WebDriver webDriver;
	
	public Pages(WebDriver webDriver){
		  this.webDriver = webDriver;
	}
	
	By cart = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
	By filter = By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select");
	String menuItem_Format = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]";
	
	public CartPage clickCart() {
		webDriver.findElement(cart).click();;

		return new CartPage(webDriver);
	}
	
	public FilterPage clickOnFilter() {
		webDriver.findElement(filter).click();;

		return new FilterPage(webDriver);
	}
	
	public Pages clickMenuItem(String menuItem) {
		findMenuItem(menuItem).click();
		return new Pages(webDriver);
	}
	
	public Pages clickMenuItem(String menuItem, String submenuItem) {
		Actions actions = new Actions(webDriver);
		actions.moveToElement(findMenuItem(menuItem)).perform();
		return clickMenuItem(submenuItem);
	}
	
	private WebElement findMenuItem(String menuItem) {
		String xpath = String.format(menuItem_Format, menuItem);
		return webDriver.findElement(By.xpath(xpath));
	}

	public Pages goTo(String postUrl) {

		webDriver.get(postUrl);
		return new Pages(webDriver);
	}
}
