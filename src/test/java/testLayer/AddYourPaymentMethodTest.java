package testLayer;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import basePackage.BaseAmazonClass;
import pomaccount.AddPaymentMethod;
import pomaccount.LoginPage;
import org.openqa.selenium.WebElement;
import pomaccount.YourAccount;
import pomaccount.YourOrder;
import utility.TimeUtils;

import org.openqa.selenium.support.ui.WebDriverWait;

public class AddYourPaymentMethodTest extends BaseAmazonClass { 

//reference of LoginPage class
	LoginPage Log;
	YourAccount Account;
	YourOrder Order;
	AddPaymentMethod Payment;
	//calling constructor from parent class
    public AddYourPaymentMethodTest() {
  	  super();
    }
    
    
    @BeforeMethod
		public void setup() throws InterruptedException {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(op);
		driver.manage().timeouts().pageLoadTimeout(TimeUtils.timepage,TimeUnit.SECONDS);
		driver.getWindowHandle();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(10000);
		/*try{
			driver.switchTo().alert().accept();
			}
			catch (WebDriverException e){
			e.printStackTrace();
			}*/
		initiate();
		screenshots("Payment");
		
  	 Account=new YourAccount();
		 Log=new LoginPage();
		 Order=new YourOrder();
		 Payment=new AddPaymentMethod();
		}
    
    @Test(priority=1)
		public void Title() {
		String header = Order.verify();
		System.out.println();
		Assert.assertEquals(header, "Amazon Sign In");
    }
    @Test(priority=2)
		public void paymentmod() throws InterruptedException {
    	driver.getWindowHandle();
		Account = Log.Loginmodule(prop.getProperty("email"),prop.getProperty("password"));
		driver.manage().timeouts().pageLoadTimeout(TimeUtils.timepage,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(10000);
		Account.accountverify();
		//WebDriverWait wait=new WebDriverWait(driver, 50);
  		//wait.until(ExpectedConditions.e
  		//@SuppressWarnings("unused")
		//WebElement element=driver.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/div"));//
  		//Actions actions=new Actions(driver);//
  		//actions.moveToElement(element).click().build().perform();
	    Payment.paymentmodule();
	
		//WebDriverWait wait1=new WebDriverWait(driver, 50);
  		//wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"pp-2iY6Oh-14\"]/span/input")));
		//WebDriverWait wait1=new WebDriverWait(driver, 50);
  		//wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#pp-dSGNgy-14")));
  		//wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("\"//*[@id=\\\"nav-al-your-account\\\"]/div\"")));*/
  		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
    @AfterMethod
	public void close() {
		driver.close();
		driver.quit();
	}
    }

