package pomaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pomaccount.YourAccount;
import basePackage.BaseAmazonClass;

public class AddPaymentMethod extends BaseAmazonClass {
	YourAccount Account;

	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[3]/div[2]/a/div")
	WebElement yourpayment;
	
	@FindBy(xpath="//*[@id=\"pp-2iY6Oh-14\"]/span/input")
	WebElement addpayment;
	
	@FindBy(xpath="//*[@id=\"pp-h3yu0r-26\"]/span/input")
	WebElement addcard;
	
	@FindBy(id="pp-L1W7Nn-16")
	WebElement cardnumber;
	
	@FindBy(id="pp-L1W7Nn-18")
	WebElement nameoncard;

	@FindBy(xpath="//*[@id=\"pp-L1W7Nn-22\"]")
	WebElement expirationdate;
	
	@FindBy(xpath="//*[@id=\"pp-mxCnsA-26\"]/span/input")
	WebElement addyourcard;

		public AddPaymentMethod() {
		PageFactory.initElements(driver, this); 
		}
		
		public void yourpayment()  {
			yourpayment.click();
		}
		
		public String verify()  {
			return driver.getTitle();
		}		
		
			public void addpayment()  {
				driver.findElement(By.xpath("//*[@id=\"pp-2iY6Oh-14\"]/span/input")).click();
				addpayment.click();
		}
			public void addcard()  {
				addcard.click();
		}	
			
			public void cardnumber()  {
				cardnumber.sendKeys();
		}		
			public void nameoncard()  {
				nameoncard.sendKeys("Rachelle Merchant");
		}			
			public void expirationcard()  {
				Select Month = new Select(driver.findElement(By.xpath("//*[@id=\"pp-L1W7Nn-22\"]")));
				Month.selectByIndex(05);
				((WebElement) Month).isSelected();
		}
			public void expirationcard2()  {	
				Select Year = new Select(driver.findElement(By.xpath("//*[@id=\"pp-L1W7Nn-23\"]")));
				Year.selectByIndex(2024);
				((WebElement) Year).isSelected();	
		}
			public void addyourcard() {
				addyourcard.submit();
			}
						
		public void paymentmodule() {
			yourpayment.click();
			/*addpayment.click();
			addcard.click();
			cardnumber.sendKeys("5123456789012346");
			nameoncard.sendKeys("Rachelle Merchant");
			expirationdate.isSelected();
			expirationdate.isSelected();
			addyourcard.submit();*/
			
		}
}