package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CartPage extends Pages {
	
	private WebElement cart;
	
	private By cartTable= By.className("checkout_cart");
	By productPrice = By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div");
	By productQuantity = By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[1]");
	By productCheckout = By.id("checkout");
	By productTitle = By.xpath("//*[@id=\"item_4_title_link\"]/div");
	By productTotal = By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]");
	By productRow = By.xpath("");

	public CartPage(WebDriver webDriver){
		super(webDriver);
		cart = findCartTable();
	}

	public boolean isProductInCart(String productName){
		return findProduct(productName) != null;
	}

	public String getPrice(String productName) {

		WebElement product = findProduct(productName,true);
		return product.findElement(productPrice).getText();

	}

	public String getTotal(String productName) {
		WebElement product = findProduct(productName,true);
		return product.findElement(productTotal).getText();
	}
	
 private WebElement findProduct(String productName, boolean failIfNotFound) {
	 List<WebElement> products = cart.findElements(productRow);
	 for(WebElement product : products) {
		 if(product.findElement(productTitle).getText().equalsIgnoreCase(productName)) {
			 
			 return product;
		 }
	 }
	 
	 if(failIfNotFound) {
		 System.out.println(productName+ "is not in the cart");
	 }
	 
	 return null;
 }
 
 private WebElement findProduct(String productName) {
	 return findProduct(productName,false);
 }

	private WebElement findCartTable(){
		WebDriverWait wait = new WebDriverWait(webDriver, null);
		return wait.until(ExpectedConditions.visibilityOf(webDriver.findElement(cartTable)));
	}

	public int getNumberOfProducts(){
		return findAllProducts().size();
	}

	private List<WebElement> findAllProducts(){
		return webDriver.findElements(productRow);
	}
}
