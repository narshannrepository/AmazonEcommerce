package testLayer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClass;
import pomaccount.LoginPage;
import pomaccount.YourAccount;

public class YourAccountTest extends BaseAmazonClass{
	
	//reference of LoginPage class
	LoginPage Log;
	YourAccount Account;

	//calling constructor from parent class
      public YourAccountTest() {
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
  		screenshots("Account");
  		
    	 Account=new YourAccount();
  		 Log=new LoginPage();
  		}
      @Test(priority=1)
  		public void Title() {
  		String header = Log.verify();
  		System.out.println();
  		Assert.assertEquals(header, "Amazon Sign In");
  	}
  		
  		@Test(priority=2)
  		public void account() {
  		Account = Log.Loginmodule(prop.getProperty("email"),prop.getProperty("password"));
  		Account.accountverify();
  		//WebDriverWait wait=new WebDriverWait(driver, 50);
  		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nav-al-your-account\"]/div")));//
  		/* WebElement element=driver.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/div"));
  		 */
  		/*Actions actions=new Actions(driver);
  		actions.moveToElement(element).click().build().perform();*/
  		}  
		@AfterMethod
		public void close() {
			driver.close();
			driver.quit();
			 
}
}

