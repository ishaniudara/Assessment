/**
 * 
 */
package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import PageFactory.PageFactoryAmazon;
import Utility.Log;
import Utility.WebDriverHelper;

/**
 * @author Udara Vithanage
 *
 */
public class Feature1PageObjects {
	
	private static Feature1PageObjects webPageObjects;

	private Feature1PageObjects() {

	}

	public static Feature1PageObjects getPageObject() {
		if(webPageObjects==null) {
			webPageObjects=new Feature1PageObjects();
		}
		return webPageObjects;

	}

//This method is used to verify amazon logo
	public boolean verifyLogo() {
		Log.info("Amazon logo is displayed");
		return 	PageFactoryAmazon.pf.logo.isDisplayed();
	
	}
	// This method is used to click category drop down and select books
	
	public void clickOnDropDown(String str) throws InterruptedException {
//		PageFactoryAmazon.pf.searchDroDown.click();	
		Select dropDown=new Select(PageFactoryAmazon.pf.searchDroDown);
		dropDown.selectByVisibleText(str);
		Log.info("Select Books category");
		Thread.sleep(3000);
	
	}

	/**
	 * This method is used to search in search bar
	 */
	public void searchItem(String arg1) throws InterruptedException {
		PageFactoryAmazon.pf.serachBar.sendKeys(arg1);
		PageFactoryAmazon.pf.serachIcon.click();
		Log.info("Search Automation books");
		Thread.sleep(2000);
		
	}

	/**
	 * This method is used to click on books above 4 stars
	 */
	public void clickOnFourStars() {
		
		
		JavascriptExecutor js = (JavascriptExecutor) WebDriverHelper.getWebDriver();
		js.executeScript("arguments[0].scrollIntoView();", PageFactoryAmazon.pf.stars);
        PageFactoryAmazon.pf.stars.click();
	}

	/**
	 *This method is used to select language
	 */
	public void selectLanguage(String readProperty) throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) WebDriverHelper.getWebDriver();
		js.executeScript("arguments[0].scrollIntoView();", PageFactoryAmazon.pf.language);
        PageFactoryAmazon.pf.language.click();
        Log.info("Click English books");
        Thread.sleep(3000);
	}

	/**
	 * This method is used to get book name
	 * 
	 */
	public String getName() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println(PageFactoryAmazon.pf.bookName.getText());
		Thread.sleep(3000);
		return PageFactoryAmazon.pf.bookName.getText();
		
	}

	/**
	 * This method is used to click on book
	 * 
	 */
	public void clickOnBook() throws InterruptedException {
		PageFactoryAmazon.pf.secondBook.click();
		Log.info("Click on second book");
		 Thread.sleep(3000);
		
	}

	/**
	 * This method is used to get price
	 */
	public String getPrice() {
		 return PageFactoryAmazon.pf.price.getText();
	}

	/**
	 * This method is used to set quantity
	 * 
	 */
	public void setQty() throws InterruptedException {
		PageFactoryAmazon.pf.qutyDropdown.click();
		Thread.sleep(2000);
		PageFactoryAmazon.pf.quty.click();
	}

	/**
	 * This method is used to get book title
	 */
	public String getBookTitle() {
		
		return PageFactoryAmazon.pf.productTitle.getText();
	}

	/**
	 * This method is used to click on add to cart
	 * 
	 */
	public void clickAddToCrt() throws InterruptedException {
		PageFactoryAmazon.pf.cartBtn.click();
		Log.info("Click on ass to cart");
		Thread.sleep(3000);
	}

	/**
	 * This method is used to click on go to cart button
	 * 
	 */
	public void clickGoToCrt() throws InterruptedException {
		
		PageFactoryAmazon.pf.goToCartBtn.click();
		Log.info("click on go to cart");
		Thread.sleep(3000);
	}

	/**
	 * This method is used to get book title in cart
	 */
	public String getCartProductTitle() {
		
		return PageFactoryAmazon.pf.cartBookTitle.getText();
	}

	/**
	 * This method is used to search in quantity in cart
	 */
	public String getCartQty() {
		
		return PageFactoryAmazon.pf.cartQunty.getText();
	}

	/**
	 * This method is used to get price in cart
	 */
	public String getCartPrice() {
		
		return PageFactoryAmazon.pf.cartPrice.getText();
	}

	/**
	 * This method is used to get cart header
	 */
	public boolean getCartHeader() {
		
		return PageFactoryAmazon.pf.cartHeader.isDisplayed();
	}

	/**
	 *This method is used to delete item in cart
	 * 
	 */
	public void deleteCart() throws InterruptedException {
		
		PageFactoryAmazon.pf.deleteCartBtn.click();
		Log.info("Delete cart");
		Thread.sleep(30000);
		
	}

	/**
	 * This method is used to get price of cart 
	 */
	public String getEmptyCartPrice() throws InterruptedException {
		Thread.sleep(3000);
		
		return PageFactoryAmazon.pf.emptyCartPrice.getText();
	}
}
