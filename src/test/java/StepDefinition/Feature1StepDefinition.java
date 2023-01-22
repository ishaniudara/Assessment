/**
 * 
 */
package StepDefinition;

import org.junit.Assert;
import org.junit.runner.Runner;
import org.openqa.selenium.support.ui.Select;

import PageObjects.Feature1PageObjects;
import Utility.PropertyFileHandler;
import Utility.WebDriverHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Udara Vithanage
 *
 */
public class Feature1StepDefinition{
	
	

	@Given("^I open amazon web site$")
	public void I_open_amazon_web_site() throws Throwable {
		
		WebDriverHelper.getWebDriverHelper().enterUrl(PropertyFileHandler.readProperty("url"));
		Thread.sleep(1000);
	}

	@Then("^I verify amazon logo is displayed$")
	public void I_verify_amazon_logo_is_displayed() throws Throwable {
	   Assert.assertTrue(Feature1PageObjects.getPageObject().verifyLogo());
	}

	@When("^I select the category as \"([^\"]*)\"$")
	public void I_select_the_category_as(String arg) throws Throwable {
		Thread.sleep(3000);
		Feature1PageObjects.getPageObject().clickOnDropDown(PropertyFileHandler.readProperty(arg));
		
		
	}

	@When("^I serach in serach bar as \"([^\"]*)\"$")
	public void I_serach_in_serach_bar_as(String arg1) throws Throwable {
		
		Feature1PageObjects.getPageObject().searchItem(PropertyFileHandler.readProperty(arg1));
		Thread.sleep(3000);
		
	}

	@When("^I scroll the page$")
	public void I_scroll_the_page() throws Throwable {
		
		
	}

	@When("^I click on four stars and up$")
	public void I_click_on_four_stars_and_up() throws Throwable {
		Feature1PageObjects.getPageObject().clickOnFourStars();
	}

	@When("^I select language as \"([^\"]*)\"$")
	public void I_select_language_as(String arg1) throws Throwable {
		
		Feature1PageObjects.getPageObject().selectLanguage(PropertyFileHandler.readProperty(arg1));
	}

	@When("^I get the name of second item$")
	public void I_get_the_name_of_second_item() throws Throwable {
		Feature1PageObjects.getPageObject().getName();
	}

	@When("^I click on second item$")
	public void I_click_on_second_item() throws Throwable {
		Feature1PageObjects.getPageObject().clickOnBook();
	}

	@When("^I verify header as \"([^\"]*)\"$")
	public void I_verify_header_as(String arg1) throws Throwable {
		
		Assert.assertEquals(PropertyFileHandler.readProperty(arg1),Feature1PageObjects.getPageObject().getBookTitle());
	   
	}

	@When("^I verify price of product as \"([^\"]*)\"$")
	public void I_verify_price_of_product_as(String arg1) throws Throwable {
		
		Assert.assertEquals(PropertyFileHandler.readProperty(arg1),Feature1PageObjects.getPageObject().getPrice());
	}

	@When("^I scrool the page$")
	public void I_scrool_the_page() throws Throwable {
		
	}

	@When("^I set quantity as \"([^\"]*)\"$")
	public void I_set_quantity_as(String arg1) throws Throwable {
		Feature1PageObjects.getPageObject().setQty();
	}

	@When("^I click on add to cart$")
	public void I_click_on_add_to_cart() throws Throwable {
		Feature1PageObjects.getPageObject().clickAddToCrt();
	}

	@When("^I click on go to cart$")
	public void I_click_on_go_to_cart() throws Throwable {
		Feature1PageObjects.getPageObject().clickGoToCrt();
	}

	@When("^I verify product name as \"([^\"]*)\"$")
	public void I_verify_product_name_as(String arg1) throws Throwable {
		Assert.assertEquals(PropertyFileHandler.readProperty(arg1),Feature1PageObjects.getPageObject().getCartProductTitle());
	}

	@When("^I verify the quantity as \"([^\"]*)\"$")
	public void I_verify_the_quantity_as(String arg1) throws Throwable {
		Assert.assertEquals(PropertyFileHandler.readProperty(arg1),Feature1PageObjects.getPageObject().getCartQty());
	}

	@When("^I verify the price as \"([^\"]*)\"$")
	public void I_verify_the_priceas(String arg1) throws Throwable {
		Assert.assertEquals(PropertyFileHandler.readProperty(arg1),Feature1PageObjects.getPageObject().getCartPrice());
	}

	@When("^I verify the cart$")
	public void I_verify_the_cart() throws Throwable {
	    Assert.assertTrue(Feature1PageObjects.getPageObject().getCartHeader());
	}

	@When("^I verify price is zero as \"([^\"]*)\"$")
	public void I_verify_price_is_zero_as(String arg1) throws Throwable {
		Feature1PageObjects.getPageObject().deleteCart();
		Assert.assertEquals(PropertyFileHandler.readProperty(arg1),Feature1PageObjects.getPageObject().getEmptyCartPrice());
		
	}




}
