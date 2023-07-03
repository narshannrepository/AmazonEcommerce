package testLayer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pomaccount.LoginPage;
import pomaccount.YourAccount;
import testdata.ExcelSheet;
import utility.TimeUtils;
import basePackage.BaseAmazonClass;

public class LoginPageTest extends BaseAmazonClass{
	
	//reference of LoginPage class
	LoginPage Log;
	YourAccount Account;
	
	//calling constructor from parent class
      public LoginPageTest() {
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
		screenshots("Login");
		 Log=new LoginPage();
		}

	@Test(priority=1)
	public void Title() {
		String title = Log.verify();
		System.out.println();
		Assert.assertEquals(title, "Amazon Sign In");
	}
	@DataProvider 
	public Object[][] Details(){
		Object result[][]=ExcelSheet.readdata("Sheet1");
		return result;
				
	}
	
	@Test(priority=2, dataProvider="Details")
	public void Loginmodule(String email, String password) {
		Log.typemail(email); //(prop.getProperty("email"));
		Log.continuebtn();
		
		Log.typepassword(password); //prop.getProperty("password"));
		//Log.Signinbtn();
	}
	
	@AfterMethod
	public void close() {
		driver.close();
		driver.quit();
	}
	
}
