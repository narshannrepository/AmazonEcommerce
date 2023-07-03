package pomaccount;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class LoginPage extends BaseAmazonClass {
	
	
	@FindBy(id="ap_email")
	WebElement emailid;
	
	@FindBy(id="continue")
	WebElement continuebtn;
	
	@FindBy(id="ap_password")
	WebElement Password;
	
	@FindBy(id="signInSubmit")
	WebElement Signinbtn;

	
	public LoginPage() {
		PageFactory.initElements(driver, this); 
	}
	
	public void typemail(String email) {
		 emailid.sendKeys(email);
		
	}

	 public void continuebtn() { 
		 continuebtn.click();
	 	}
		 
		 public String verify()  {
				return driver.getTitle();
		 }
		
		 public void typepassword(String password) {
			 Password.sendKeys(password);
		}
		 
		 
		public void Signinbtn() { 
			Signinbtn.click();
		}
		
		public YourAccount Loginmodule(String email,String password) {
			 emailid.sendKeys(email);
			 continuebtn.click();
			 Password.sendKeys(password);
			 Signinbtn.click();
			 return new YourAccount();
		}
			
		}
	 


		
	

