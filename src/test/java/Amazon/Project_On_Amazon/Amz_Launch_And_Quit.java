package Amazon.Project_On_Amazon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import listerners.Test_Listing;


@Listeners(Test_Listing.class)
public class Amz_Launch_And_Quit extends Test_Listing
{
	
	@BeforeMethod
//	@Parameters("browser")
	public void launch_and_signIn()//(String browser) 
	{
//		if(browser.equalsIgnoreCase("chrome"))
//		{
//			//ChromeOptions op = new ChromeOptions();
//			//String Browser_name = op.getBrowserName();
//			 edriver = new ChromeDriver();
//			  //Test_Listing.browser_name= Browser_name;
//			Capabilities Browser = ((ChromiumDriver) edriver).getCapabilities();
//		String browser_1 =Browser.toString();
//		
//			String browser_name_1 =browser_1.substring(42,61);
//		                 this.browser_name =	browser_name_1;                       
//			String browser_version_1 =browser_1.substring(63,92);
//			this.browser_version= browser_version_1;
//		}
//		if(browser.equalsIgnoreCase("edge"))
//		{
//			//EdgeOptions ep = new EdgeOptions();
//		  //  String Browser_name =	ep.getBrowserName();
//			edriver = new EdgeDriver();	
//		   //   Test_Listing.browser_name=Browser_name;
//        Capabilities Browser = ((ChromiumDriver) edriver).getCapabilities();
//        String browser_1 =Browser.toString();
//       	String browser_name_1 =browser_1.substring(42,68);		
//        this.browser_name =	browser_name_1;
//          String browser_version_1 =browser_1.substring(70,99);                       		
//			this.browser_version= browser_version_1;
//		}
//		if(browser.equalsIgnoreCase("firefox"))
//		{
//			//FirefoxOptions fp = new FirefoxOptions();
//			// String Browser_name =     fp.getBrowserName();
//			edriver = new FirefoxDriver();	
//			//Test_Listing.browser_name = Browser_name;
//             Capabilities Browser =((ChromiumDriver) edriver).getCapabilities();
//             String browser_1 =Browser.toString();
//		String browser_name_1 =browser_1.substring(41, 61);
//		this.browser_name =	browser_name_1;
//		String browser_version_1 = browser_1.substring(63,86);
//		this.browser_version= browser_version_1;
//		}
       
//		edriver = new FirefoxDriver();

		Capabilities Browser = ((ChromiumDriver) edriver).getCapabilities();
		  String name =      Browser.toString();
			//System.out.println(name);                      //53
			String browser_name_1 =name.substring(42, 49).concat("_").toUpperCase();
			 String chrome =name.substring(55, 61).toUpperCase();
			 String BROWSER_NAME = browser_name_1.concat("_").concat(chrome);
			 Test_Listing.browser_name=BROWSER_NAME; 
			 System.out.println(chrome);
	          String browser_version =    name.substring(63, 77).toUpperCase();
		             //   System.out.println(browser_version);
		              
	          String version=    name.substring(79, 92).toUpperCase();
		                  System.out.println(version);
		            String BROWSER_VERSION = browser_version.concat("_").concat(version);
		                  Test_Listing.browser_version = BROWSER_VERSION;
		  //  System.out.println(browser_version);
		edriver.navigate().to("https://www.amazon.in/");
		edriver.manage().window().maximize();
		edriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String main_title =edriver.getTitle();
		String expected_main_title ="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		Assert.assertEquals(main_title, expected_main_title);
		
		TakesScreenshot ts = (TakesScreenshot)edriver;
		File source = ts.getScreenshotAs(OutputType.FILE);                 //+"_"+browser_name_1
		File destination = new File("C:\\Users\\golip\\eclipse-workspace\\Project_On_Amazon\\screenshots\\before_method\\"+BROWSER_NAME+"_"+pdate+"_"+BROWSER_VERSION+".png");
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
//	@AfterMethod
	public void Signout_and_quit() throws InterruptedException
	{
		Amz_Main_page a = new Amz_Main_page(edriver);
		Thread.sleep(3000);
		System.out.println(a.text.getText());
		Thread.sleep(3000);
		if(a.text.getText().equals("Hello, sign in"))
		{
			edriver.quit();
		}
		else 
		{
		Thread.sleep(5000);	
	WebElement all = edriver.findElement(By.xpath("//a[@id='nav-hamburger-menu']"));
		all.click();
	WebElement sign_out= edriver.findElement(By.xpath("(//a[.='Sign Out'])[2]"));	
		Point p =sign_out.getLocation();
		int x =p.getX();
		int y = p.getY();
	Thread.sleep(5000);	
		System.out.println(x+" "+y);
	JavascriptExecutor jse =	(JavascriptExecutor)edriver;
	jse.executeScript("window.scrollBy("+x+","+y+")");
	sign_out.click();
	
	TakesScreenshot ts = (TakesScreenshot)edriver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\golip\\eclipse-workspace\\Project_On_Amazon\\screenshots\\After_method\\"+"Aftermethod-"+pdate+".png");
	try {
		FileUtils.copyFile(source, destination);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Thread.sleep(5000);	
	String title = edriver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title, "Amazon Sign In");
	
	edriver.manage().window().minimize();
	edriver.close();
		}
	
	}	
}