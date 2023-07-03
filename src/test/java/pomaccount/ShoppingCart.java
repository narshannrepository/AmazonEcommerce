package pomaccount;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class ShoppingCart extends BaseAmazonClass { 

	@FindBy(id="nav-link-accountList")
	WebElement AccountandList;

	@FindBy(xpath="//*[@id=\"nav-al-your-account\"]/a[1]/span")
	WebElement YourAccount;
	
	@FindBy(id="nav-cart-count-container")
	WebElement cart;
	
	@FindBy(xpath="//*[@id=\"sc-active-900d72ac-07fd-4e9f-a371-1f1f27070ade\"]/div[4]/div/div[3]/div[1]/span[2]")
	WebElement delete;
	
	public ShoppingCart() {
		PageFactory.initElements(driver, this); 
}
	public void cart() { 
		 cart.click();
	}
	public void delete() { 
		 delete.click();
	}
	public void shoppingcardmodule() {
		cart.click();
		delete.click();
	}
}
