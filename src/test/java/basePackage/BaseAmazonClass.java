package basePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.TimeUtils;

public class BaseAmazonClass {

	public static Properties prop=new Properties();
	public static WebDriver driver;
	
	public BaseAmazonClass()  {
	
		try {
		FileInputStream file=new FileInputStream("C:\\Users\\shann\\eclipse-workspace\\AmazonEcom\\src\\test\\java\\environmentvariables\\Config.properties");
	prop.load(file);
	
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		catch (IOException a) {
			a.printStackTrace(); }
	
}
	
	public static void initiate() {
		String Browsername=prop.getProperty("browser");	//driver path
		if (Browsername.equals("Firefox")) {
		prop.setProperty("webdriver.gecko.driver", "geckodriver.exe");	
	driver=new FirefoxDriver(); 
		
		}		
	else if (Browsername.contains("chrome")) {	
	prop.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 
	ChromeOptions op=new ChromeOptions();
	op.addArguments("--remote-allow-origins=*");
	driver=new ChromeDriver(op);
	
	driver.get(prop.getProperty("url"));
	driver.get("https://www.amazon.ca/");
	WebDriverWait wait=new WebDriverWait(driver, 50);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_email")));
	String parentHandle = driver.getWindowHandle();
	System.out.println("parent window - "+parentHandle);
	driver.findElement(By.id("continue")).click();
	Set<String> handles=driver.getWindowHandles();
	for (String handle : handles) {
		System.out.println(handle);
	}
	}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TimeUtils.timepage,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TimeUtils.implicitwait, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		}
	
	public static void screenshots(String Filename) {
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(file,new File("C:\\Users\\shann\\eclipse-workspace\\AmazonEcom\\src\\test\\java\\screesnshots\\Screenshots" +Filename+".jpg"));
	
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}}

