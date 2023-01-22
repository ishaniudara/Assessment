/**
 * 
 */
package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



import Utility.WebDriverHelper;

/**
 * @author Udara Vithanage
 *
 */
public class PageFactoryAmazon {
	
	public static PageFactoryAmazon pf = PageFactory.initElements(WebDriverHelper.getWebDriver(),
			PageFactoryAmazon.class);
	
	@FindBy(how = How.ID, using = "nav-logo-sprites")
	public WebElement logo;
	
	@FindBy(how = How.ID, using = "searchDropdownBox")
	public WebElement searchDroDown;
	
	@FindBy(how = How.ID, using = "twotabsearchtextbox")
	public WebElement serachBar;
	
	@FindBy(how = How.ID, using = "nav-search-submit-button")
	public WebElement serachIcon;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"p_72/1250221011\"]/span/a/section/i")
	
	public WebElement stars;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"p_n_feature_nine_browse-bin/3291437011\"]/span/a/div/label/i")
	public WebElement language;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Mastering Python Networking: Utilize Python packages and frameworks for network automation, monitoring, cloud, and management, 4th Edition']")
	public WebElement bookName;
	
	@FindBy(how = How.XPATH, using = "//img[@data-image-index=\"2\"]")
	public WebElement secondBook;
	
	@FindBy(how = How.ID, using = "price")
	public WebElement price;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"quantity_1\"]")
	public WebElement quty;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"a-autoid-0-announce\"]/span[2]")
	public WebElement qutyDropdown;
	
	@FindBy(how = How.ID, using = "productTitle")
	public WebElement productTitle;
	
	@FindBy(how = How.ID, using ="add-to-cart-button")
	public WebElement cartBtn;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"sw-gtc\"]/span/a")
	public WebElement goToCartBtn;
	
	@FindBy(how = How.XPATH, using = "//span[@class='a-truncate-cut']")
	public WebElement cartBookTitle;
	
	@FindBy(how = How.XPATH, using = "//span[@class='a-dropdown-prompt']")
	public WebElement cartQunty;

	@FindBy(how = How.XPATH, using = "//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']")
	public WebElement cartPrice;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"sc-active-cart\"]/div/div/div/h1")
	public WebElement cartHeader;
	
	@FindBy(how = How.XPATH, using = "//input[@value='Delete']")
	public WebElement deleteCartBtn;
	
	@FindBy(how = How.XPATH, using = "//span[@class=\"a-size-medium a-color-base sc-price sc-white-space-nowrap\"]")
	public WebElement emptyCartPrice;
	
	
}
	
