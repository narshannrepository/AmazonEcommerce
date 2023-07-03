package pomaccount;

import org.apache.commons.math3.analysis.function.Log;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pomaccount.LoginPage;
import basePackage.BaseAmazonClass;

public class YourAccount extends BaseAmazonClass {
	LoginPage Log;
	
	@FindBy(id="ap_email")
	WebElement emailid;
	
	@FindBy(id="continue")
	WebElement continuebtn;
	
	@FindBy(id="ap_password")
	WebElement Password;
	
	@FindBy(id="signInSubmit")
	WebElement Signinbtn;
	
	@FindBy(css="#nav-link-accountList > span")
	WebElement AccountandList;

	//@FindBy(xpath="//*[@id=\"nav-al-your-account\"]/div")
	//WebElement YourAccountopt;//
	
	//@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[1]/h1")
	//WebElement YourAccountpage;//

	public YourAccount() {
		PageFactory.initElements(driver, this); 
	
		Log=new LoginPage();
	}
		
	 public void AccountandList() { 
		 AccountandList.click();
	 }	 
		// public void YourAccountopt() { 
			// YourAccountopt.click();//
	
//}		 
		 //public void YourAccountpage() { 
			// YourAccountpage.click();//
		 //}//
		 
		 public String verify()  {
				return driver.getTitle();
		 }
		 public void accountverify() {
			 AccountandList.click();
			// YourAccountopt.click();//
			// YourAccountpage.click();//
			 //return driver.getTitle();
		 }
		 
			 
			 
			 
}
