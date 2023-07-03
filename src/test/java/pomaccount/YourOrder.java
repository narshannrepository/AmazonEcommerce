package pomaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import basePackage.BaseAmazonClass;

public class YourOrder extends BaseAmazonClass {

	@FindBy(id="nav-link-accountList")
	WebElement AccountandList;

	@FindBy(xpath="//*[@id=\"nav-al-your-account\"]/a[1]/span")
	WebElement YourAccount;

	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[2]/div[1]/a/div")
	WebElement YourOrders;
	
	@FindBy(xpath="//*[@id=\"time-filter\"]")
	WebElement OrderDropDown;
	
	@FindBy(id="//*[@id=\"a-page\"]/section/div/div[3]/ul/li[2]")
	WebElement BuyAgain;
	
	@FindBy(id="//*[@id=\"orderTypeMenuContainer\"]/ul/li[4]/span/a")
	WebElement NotYetShipped;
	
	@FindBy(id="//*[@id=\"orderTypeMenuContainer\"]/ul/li[5]/span/a")
	WebElement CancelledOrders;
	
	public YourOrder() {
		PageFactory.initElements(driver, this); 
	}
	
	 public String verify()  {
			return driver.getTitle();
	 }
	 public void YourOrders() {
		 YourOrders.click(); 
	 }
	 
	 
	 public void OrderDropDown() {
		 WebElement OrderDropDown =driver.findElement(By.xpath("//*[@id=\"time-filter\"]"));
		 Select select=new Select(OrderDropDown);
		 select.selectByVisibleText("the past 30 days");
		 OrderDropDown.isSelected();
	 }
	 
	 public void Ordermodule()  {
		 YourOrders.click(); 
		 OrderDropDown.isSelected();
		 
	
	
	 }
}
	
	


