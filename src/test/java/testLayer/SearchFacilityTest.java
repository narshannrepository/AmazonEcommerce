package testLayer;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.util.TimeUtils;

import basePackage.BaseAmazonClass;
import pomaccount.LoginPage;
import pomaccount.SearchFacility;
import pomaccount.YourAccount;


public class SearchFacilityTest extends BaseAmazonClass {
	
	//reference of LoginPage class
		LoginPage Log;
		SearchFacility Search;
		YourAccount Account;
		
		//calling constructor from parent class
	      public SearchFacilityTest() {
			super();
	      }
	      
		@BeforeMethod
		public void setup() throws InterruptedException {
			ChromeOptions op=new ChromeOptions();
			op.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(op);
			//driver.manage().timeouts().pageLoadTimeout(TimeUtils.timepage,TimeUnit.SECONDS);//
			//driver.get("url");//
			Thread.sleep(2000);
			initiate();
			screenshots("Search");
			 Log=new LoginPage();
			 Search=new SearchFacility();
			 Account=new YourAccount();
			 
			}

		@Test(priority=1)
		public void Title() {
			String title = Search.verify();
			System.out.println();
			Assert.assertEquals(title, "Amazon Sign In");
		
}
		@Test(priority=2)
  		
  		public void account() {
  		Account = Log.Loginmodule(prop.getProperty("email"),prop.getProperty("password"));
  		Search.Searchmodule();
}
		@AfterMethod
		public void close() {
			driver.close();
			
			driver.quit();
			
}
}