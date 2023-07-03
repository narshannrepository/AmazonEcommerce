package testLayer;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import basePackage.BaseAmazonClass;
import pomaccount.LoginPage;
import pomaccount.YourAccount;
import pomaccount.YourAddress;
import utility.TimeUtils;

public class YourAddressTest extends BaseAmazonClass {

	LoginPage Log;
	YourAccount Account;
	YourAddress Address;
	
	//calling constructor from parent class//
	public YourAddressTest() {
	super();
}
	@BeforeMethod
	public void setup() throws InterruptedException {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(op);
		driver.manage().timeouts().implicitlyWait(TimeUtils.implicitwait, TimeUnit.SECONDS);//
		driver.getWindowHandle();
		//driver.get("url");//
		Thread.sleep(2000);
		initiate();
		screenshots("Address");
		 Log=new LoginPage();
		 Account=new YourAccount();
		 Address=new YourAddress();
		 
		}
	@Test(priority=1)
	public void Title() {
		
		String title = Log.verify();
		System.out.println();
		Assert.assertEquals(title, "Amazon Sign In");
		}
		
		@Test(priority=2) 
  		public void account() throws InterruptedException {
  		Account = Log.Loginmodule(prop.getProperty("email"),prop.getProperty("password"));
  		Account.accountverify();
		Address.addressupdate();
		
		}	
		@AfterMethod
		public void close() {
			driver.close();
			driver.quit();
		}
		
	 
		}

		
		
		
		
		
		
