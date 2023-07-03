package pomaccount;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class GuestAccount extends BaseAmazonClass {
	
	@FindBy(id="twotabsearchtextbox")
	WebElement Searchbox;
	
	@FindBy(id="nav-search-submit-button")
	WebElement Searchicon;
	
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div/div[2]/span/a/div/img")
	WebElement Productsearch;
	
	@FindBy(id="add-to-cart-button")
	WebElement AddtoCart;
	
	@FindBy(id="attachSiNoCoverage")
	WebElement nocoverage;
	
	@FindBy(xpath="//*[@id=\"sc-buy-box-ptc-button\"]/span/input")
	WebElement checkout;
	
	public GuestAccount() {
		PageFactory.initElements(driver, this); 
	}
	public void Searchbox(String product) {
		// Searchbox.sendKeys(product);
	}

	 public void Searchicon() { 
		 Searchicon.click();
	 }
	 public void Productsearch() {
		 Productsearch.click();
	 }
	 
	 public void AddtoCart() {
		 AddtoCart.click();
	 }
	 public void nocoverage() {
		 nocoverage.click();
	 }
	 public void checkout() {
		 checkout.click();	 
	 }
	 
	 public String verify()  {
			return driver.getTitle();
	 }
	 public void user() {
		 Searchbox.sendKeys(prop.getProperty("product"));
		 Searchicon.click();
		 Productsearch.click();
		 AddtoCart.click();
		 nocoverage.click();
		 checkout.click();
	 
	 }}
