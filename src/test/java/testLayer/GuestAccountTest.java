package testLayer;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClass;
import pomaccount.GuestAccount;

public class GuestAccountTest extends BaseAmazonClass {

	//reference of LoginPage class
	GuestAccount Guest;


		//calling constructor from parent class
	      public GuestAccountTest() {
			super();
	      }
	      
		@BeforeMethod
			public void setup() throws InterruptedException {
				
				ChromeOptions op=new ChromeOptions();
				op.addArguments("--remote-allow-origins=*");
				driver=new ChromeDriver(op);
				driver.get("https://www.amazon.ca/");
				//driver.manage().timeouts().pageLoadTimeout(TimeUtils.timepage,TimeUnit.SECONDS);//
				//driver.get("https://www.amazon.ca/");//
				Thread.sleep(2000);
				initiate();
				screenshots("Guest");
	       Guest=new GuestAccount();
	       
				
	}	
			@Test(priority=1)
			public void User() {
				driver.get("https://www.amazon.ca/");
				//Guest.Searchbox(prop.getProperty("product"));
				Guest.user();
				
				
}
		
			@AfterMethod
			public void close() {
				driver.close();
				driver.quit();
			}
			
		}
			

