package pomaccount;

import basePackage.BaseAmazonClass;

import utility.TimeUtils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchFacility extends BaseAmazonClass { 

	
	@FindBy(id="nav-link-accountList")
	WebElement AccountandList;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement Searchbox;
	
	@FindBy(id="nav-search-submit-button")
	WebElement searchbtn;
	
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[7]/div/div/div/div/div[2]/span/a/div/img")		
	WebElement productsearch;
	
	@FindBy(id="quantity")
	WebElement quantity;
	
	@FindBy(id="add-to-cart-button")
	WebElement addtocart;
	
	@FindBy(css="#attachSiNoCoverage > span > input")
	WebElement nocoverage;
	
	@FindBy(xpath="//*[@id=\"sw-gtc\"]/span/a")
			//"//*[@id=\"sc-buy-box-ptc-button\"]/span/input")
	WebElement gotocart;
	
	public SearchFacility() {
		PageFactory.initElements(driver, this); 	
}
	 public String verify()  {
			return driver.getTitle();
}
	 public void Searchbox(String product) {
		 Searchbox.sendKeys(product);
	 }
	 public void Searchicon() { 
		 searchbtn.click();
	 }
	 public void productsearch() {
		 Select productsearch = new Select(driver.findElement(By.xpath("Select Quantity = new Select(driver.findElement(By.xpath(\"//*[@id=\\\"quantity\\\"]\")));")));
		 productsearch.selectByVisibleText("BLACK+DECKER Programmable Digital Coffeemaker,12-Cup Coffee Machine, Black");
	 }
	 
	 public void Quantity() {
		 Select Quantity = new Select(driver.findElement(By.id("quantity")));
		Quantity.selectByIndex(2);
		quantity.isSelected();
	
	 }
	 public void addtocart() {
		 addtocart.click();
	 }
	 
	 public void nocoverage() {
		 nocoverage.click();
	 }
	 
	 public void gotocart() {
		 Select gotocart=new Select(driver.findElement(By.xpath("//*[@id=\"sw-gtc\"]/span/a")));
		((WebElement) gotocart).click();
	 }
	 
	 public void Searchmodule()  {
			 Searchbox.sendKeys(prop.getProperty("product"));
			 searchbtn.click();
			 productsearch.click();
			 quantity.isSelected();
			 addtocart.click();
			 nocoverage.click();
			 gotocart.click();
			
}}
