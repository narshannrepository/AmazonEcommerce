package pomaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basePackage.BaseAmazonClass;

public class SortingProduct extends BaseAmazonClass {
	
	
	@FindBy(id="nav-link-accountList")
	WebElement AccountandList;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement Searchbox;
	
	@FindBy(id="nav-search-submit-button")
	WebElement searchbtn;
	
	@FindBy(xpath="//*[@id=\"a-autoid-0\"]/span/i")
	WebElement Sortby;
	
	@FindBy(xpath="//*[@id=\"a-popover-3\"]/div/div/ul/li[5]")
	WebElement Newestarrival;

		public SortingProduct() {
			PageFactory.initElements(driver, this); 
	}
		 public void Searchbox(String product) {
			 Searchbox.sendKeys(product);
		 }
		 public void Searchicon() { 
			 searchbtn.click();
		 }
		 public void Sortby() {
		 WebElement Sortby =driver.findElement(By.xpath("//*[@id=\"a-autoid-0\"]/span/i"));
	 		Select select=new Select(Sortby);
	 		Sortby.isSelected();
	 		select.selectByVisibleText("Newest arrivals");
		 }
		 public void Sortbyproduct() {
			 Searchbox.sendKeys(prop.getProperty("product"));
			 searchbtn.click();
			 Sortby.isSelected();
			 
}}
