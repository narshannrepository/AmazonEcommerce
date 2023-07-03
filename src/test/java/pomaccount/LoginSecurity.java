package pomaccount;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class LoginSecurity extends BaseAmazonClass { 

	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[2]/div[2]/a/div")
	WebElement loginsecurity;
	
	@FindBy(css="#a-autoid-2")
	WebElement addphone;
	
	@FindBy(css="#ap_phone_number")
	WebElement number;
	
	@FindBy(id="auth-continue")
	WebElement Conitnuebtn;
	
	public LoginSecurity() {
		PageFactory.initElements(driver, this); 
}
	public void loginsecurity() {
		loginsecurity.click();
	}
	public void addphone() {
		addphone.click();
	}
	public void number() {
		number.sendKeys("647-989-0013");
	}
	public void Conitnuebtn() {
		Conitnuebtn.click();
	}
	public void logsecmodule() {
		loginsecurity.click();
		addphone.click();
		number.sendKeys("647-989-0013");
		Conitnuebtn.click();
	}
}