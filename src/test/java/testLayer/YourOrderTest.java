package testLayer;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClass;
import pomaccount.LoginPage;
import pomaccount.YourAccount;
import pomaccount.YourOrder;

public class YourOrderTest extends BaseAmazonClass{{
}
//reference of LoginPage class
	LoginPage Log;
	YourAccount Account;
	YourOrder Order;

	//calling constructor from parent class
    public YourOrderTest() {
  	  super();
    }
    
    @BeforeMethod
		public void setup() throws InterruptedException {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(op);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(10000);
		initiate();
		screenshots("Order");
		
  	 Account=new YourAccount();
		 Log=new LoginPage();
		 Order=new YourOrder();
		}
    
    @Test(priority=1)
		public void Title() {
		String header = Order.verify();
		System.out.println();
		Assert.assertEquals(header, "Amazon Sign In");
    
    }
    @Test(priority=2)
		public void account() {
		Account = Log.Loginmodule(prop.getProperty("email"),prop.getProperty("password"));
		Account.accountverify();
		Order.Ordermodule();
    }
    
    @AfterMethod
	public void close() {
		driver.close();
		
		driver.quit();
		
		
}
	

}