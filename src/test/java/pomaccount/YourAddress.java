package pomaccount;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basePackage.BaseAmazonClass;

public class YourAddress extends BaseAmazonClass {
	
	private static final String Canada = null;

	@FindBy(id="nav-link-accountList")
	WebElement AccountandList;

	@FindBy(xpath="//*[@id=\"nav-al-your-account\"]/a[1]/span")
	WebElement YourAccount;

	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[3]/div[1]/a/div")
	WebElement YourAddressopt;
	
	@FindBy(xpath="//*[@id=\"ya-myab-address-add-link\"]/div")
	WebElement AddAddressicon;

	@FindBy(css="#address-ui-widgets-countryCode-dropdown-nativeId > option:nth-child(38)")
	WebElement CountryRegion;
	
	@FindBy(id="address-ui-widgets-enterAddressFullName")
	WebElement Fullname;
	
	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
	WebElement Phonenumber;
	
	@FindBy(id="address-ui-widgets-enterAddressLine1")
	WebElement AddressLine1;
	
	@FindBy(id="address-ui-widgets-enterAddressLine2")
	WebElement AddressLine2;
	
	@FindBy(id="address-ui-widgets-enterAddressCity")
	WebElement City;
	
	@FindBy(id="address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId")
	WebElement Province;
	
	@FindBy(id="address-ui-widgets-enterAddressPostalCode")
	WebElement PostalCode;
	
	@FindBy(css="#address-ui-widgets-use-as-my-default")
	WebElement Defaultclick;
	
	@FindBy(id="address-ui-widgets-form-submit-button-announce")
	WebElement AddAddressbutton;
	
	public YourAddress() {
		PageFactory.initElements(driver, this); 
		
		}
			public void YourAddressopt() { 
			YourAddressopt.click();
		}	
			public void AddAddressicon() {
			 AddAddressicon.click();
		 }
		 	public boolean CountryRegion() {
		 		WebElement CountryRegion =driver.findElement(By.cssSelector("#address-ui-widgets-countryCode-dropdown-nativeId > option:nth-child(38)"));
		 		Select select=new Select(CountryRegion);
		 		CountryRegion.isSelected();
		 		select.selectByVisibleText(Canada);
				return true;
		 	}	
				 public String verify()  {
						return driver.getTitle();
		 }	
			 public void Fullname() {
				 Fullname.sendKeys("Rachelle Merchant");
		 }
			 public void Phonenumber() {
				 Phonenumber.sendKeys("123456789");
		 }
			 public void AddressLine1() {
				 AddressLine1.sendKeys("23 Cherrytree Drive");
		}
			 public void AddressLine2() {
				 AddressLine2.sendKeys("House");
		}
			 public void City() {
				 City.sendKeys("Brampton");
		 }
			 public void Province() {
				 WebElement Province =driver.findElement(By.cssSelector("#address-ui-widgets-enterAddressStateOrRegion > span > i"));
			 		Select selectp=new Select(Province);
			 		Province.isSelected();
			 		String Ontario = null;
					selectp.selectByVisibleText(Ontario);		 	
		 }
			 public void PostalCode() {
				 PostalCode.sendKeys("L6Y 3L6");
		}
			 public void Defaultclick() {
				 Defaultclick.isSelected();
		}
			 public void AddAddressbutton() {
				 AddAddressbutton.click();
			 }
			 public void addressupdate() {
				 YourAddressopt.click();
				 AddAddressicon.click();
				 CountryRegion.isDisplayed();
				 Fullname.sendKeys("Rachelle Merchant");
				 Phonenumber.sendKeys("123456789");
				 AddressLine1.sendKeys("23 Cherrytree Drive");
				 AddressLine2.sendKeys("House");
				 City.sendKeys("Brampton");
				 Province.isDisplayed();	
				 PostalCode.sendKeys("L6Y 3L6");
				 Defaultclick.click();
				 AddAddressbutton.submit();
				
}}

	