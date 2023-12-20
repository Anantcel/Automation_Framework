package cucumber.stepdefs;

import cucumber.api.java.en.Given;
import pages.Pages;
import utils.BaseTests;

public class BaseStepDefs {

	protected String productName;
	protected String category;
	protected Pages currentPage;

	public BaseStepDefs() {
		currentPage = new Pages(BaseTests.getWebDriver());
	}

	@Given("^there is a product named (.*)$")
	public void setProduct(String productName) {
		this.productName = productName;
	}
}