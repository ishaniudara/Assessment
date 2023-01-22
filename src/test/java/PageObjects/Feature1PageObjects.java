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


	public boolean verifyLogo() {
		Log.info("Amazon logo is displayed");
		return 	PageFactoryAmazon.pf.logo.isDisplayed();
	
	}
	
	public void clickOnDropDown(String str) throws InterruptedException {
//		PageFactoryAmazon.pf.searchDroDown.click();	
		Select dropDown=new Select(PageFactoryAmazon.pf.searchDroDown);
		dropDown.selectByVisibleText(str);
		Log.info("Select Books category");
		Thread.sleep(3000);
	
	}

	/**
	 * @param arg1
	 * @throws InterruptedException 
	 */
	public void searchItem(String arg1) throws InterruptedException {
		PageFactoryAmazon.pf.serachBar.sendKeys(arg1);
		PageFactoryAmazon.pf.serachIcon.click();
		Log.info("Search Automation books");
		Thread.sleep(2000);
		
	}

	/**
	 * 
	 */
	public void clickOnFourStars() {
		
		
		JavascriptExecutor js = (JavascriptExecutor) WebDriverHelper.getWebDriver();
		js.executeScript("arguments[0].scrollIntoView();", PageFactoryAmazon.pf.stars);
        PageFactoryAmazon.pf.stars.click();
	}

	/**
	 * @param readProperty
	 * @throws InterruptedException 
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
	 * @throws InterruptedException 
	 * 
	 */
	public String getName() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println(PageFactoryAmazon.pf.bookName.getText());
		Thread.sleep(3000);
		return PageFactoryAmazon.pf.bookName.getText();
		
	}

	/**
	 * @throws InterruptedException 
	 * 
	 */
	public void clickOnBook() throws InterruptedException {
		PageFactoryAmazon.pf.secondBook.click();
		Log.info("Click on second book");
		 Thread.sleep(3000);
		
	}

	/**
	 * 
	 */
	public String getPrice() {
		 return PageFactoryAmazon.pf.price.getText();
	}

	/**
	 * @throws InterruptedException 
	 * 
	 */
	public void setQty() throws InterruptedException {
		PageFactoryAmazon.pf.qutyDropdown.click();
		Thread.sleep(2000);
		PageFactoryAmazon.pf.quty.click();
	}

	/**
	 * @return
	 */
	public String getBookTitle() {
		
		return PageFactoryAmazon.pf.productTitle.getText();
	}

	/**
	 * @throws InterruptedException 
	 * 
	 */
	public void clickAddToCrt() throws InterruptedException {
		PageFactoryAmazon.pf.cartBtn.click();
		Log.info("Click on ass to cart");
		Thread.sleep(3000);
	}

	/**
	 * @throws InterruptedException 
	 * 
	 */
	public void clickGoToCrt() throws InterruptedException {
		
		PageFactoryAmazon.pf.goToCartBtn.click();
		Log.info("click on go to cart");
		Thread.sleep(3000);
	}

	/**
	 * @return
	 */
	public String getCartProductTitle() {
		
		return PageFactoryAmazon.pf.cartBookTitle.getText();
	}

	/**
	 * @return
	 */
	public String getCartQty() {
		
		return PageFactoryAmazon.pf.cartQunty.getText();
	}

	/**
	 * @return
	 */
	public String getCartPrice() {
		
		return PageFactoryAmazon.pf.cartPrice.getText();
	}

	/**
	 * @return
	 */
	public boolean getCartHeader() {
		
		return PageFactoryAmazon.pf.cartHeader.isDisplayed();
	}

	/**
	 * @throws InterruptedException 
	 * 
	 */
	public void deleteCart() throws InterruptedException {
		
		PageFactoryAmazon.pf.deleteCartBtn.click();
		Log.info("Delete cart");
		Thread.sleep(30000);
		
	}

	/**
	 * @return
	 * @throws InterruptedException 
	 */
	public String getEmptyCartPrice() throws InterruptedException {
		Thread.sleep(3000);
		
		return PageFactoryAmazon.pf.emptyCartPrice.getText();
	}
}
