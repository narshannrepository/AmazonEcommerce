package testLayer;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClass;
import pomaccount.LoginPage;
import pomaccount.ShoppingCart;
import pomaccount.YourAccount;

public class ShoppingCartTest extends BaseAmazonClass{
	
	//reference of LoginPage class
	LoginPage Log;
	YourAccount Account;
	ShoppingCart Cart;
	
	//calling constructor from parent class
      public ShoppingCartTest() {
		super();
      }
      
	@BeforeMethod
	public void setup() throws InterruptedException {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(op);
		//driver.manage().timeouts().pageLoadTimeout(TimeUtils.timepage,TimeUnit.SECONDS);
		//driver.get("url");//
		Thread.sleep(2000);
		initiate();
		screenshots("Cart");
		 Log=new LoginPage();
		 Cart=new ShoppingCart();
		}

	@Test(priority=1)
	public void Title() {
		String title = Log.verify();
		System.out.println();
		Assert.assertEquals(title, "Amazon Sign In");
	}
	
	@Test(priority=2)
	public void Loginmodule() {
		Account = Log.Loginmodule(prop.getProperty("email"),prop.getProperty("password"));
  		Account.accountverify();
  		Cart.shoppingcardmodule();
	}
	
	@AfterMethod
	public void close() {
		driver.close();
		driver.quit();
	}
	
}
