package cart;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pages.CartPage;
import services.CartServices;
import utils.BaseTests;
/* Feature: Manage Cart
  As a user, I want to manage my cart so that I am buying the right things
  
  Scenario: Increase Quantity
     Given: product Sauce Labs Backpack is in the cart
     Then its price should be $29.99
     And its total should be 29.99 */

public class CartTests extends BaseTests {

	@Test
	public void testIncreaseQuantity() {
		
		String productName = "Sauce Labs Backpack";
		CartServices.addProductToCart(productName, getWebDriver());
		
		CartPage cartPage = homePage.clickCart();
		
		assertEquals(productName + "'s price","$29.99", cartPage.getPrice(productName));
		assertEquals(productName +  "'s total","$29.99", cartPage.getTotal(productName));
	}
}
