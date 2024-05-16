package listerners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.IClass;
import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Test_Listing extends Date_Of_EveryDay implements ITestListener,IRetryAnalyzer//,IHookable,IConfigurationAnnotation
{
     
	
	
	//public static WebDriver edriver = new FirefoxDriver();
	//public static WebDriver edriver = new EdgeDriver();
	public static WebDriver edriver= new ChromeDriver();

	public static 	 String browser_name;
	public static String browser_version;
	
	@Override
	public void onTestStart(ITestResult result) // for test class
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
		Reporter.log("Test case is started");
	
		System.out.println(browser_name);
		Date_Of_EveryDay d = new Date_Of_EveryDay();
		d.date();   
		
		TakesScreenshot ts = (TakesScreenshot)edriver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\golip\\eclipse-workspace\\Project_On_Amazon\\screenshots\\TestStart\\"+browser_name+"_"+result.getName()+"-"+pdate+browser_version+".png");
		try 
		{
			
			FileUtils.copyFile(source, destination);
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSuccess(ITestResult result) // for test class
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Test case is success");
		
		   // 1
		  String name= result.getName(); //getName will give the  @Test "method" name
	      //  System.out.println("name is :- "+name);
	        /* name is :- search */
	         // 2
	        Object name1=     result.getInstance(); // getInstance will give package name and class name 
			//System.err.println(name1 +" name1");
			/* Amazon.Project_On_Amazon.Amz_Launch_And_Quit@618425b5 name1 */
	       
		//3	
		ITestNGMethod im =	result.getMethod(); // this will give combination of package and class name
		//System.out.println(im+"ITestNGMethod"); 
		/* Amz_Launch_And_Quit.search()
		 [pri:0, instance:Amazon.Project_On_Amazon.Amz_Launch_And_Quit@618425b5]ITestNGMethod*/
		
		//4
		String getinstancename =result.getInstanceName(); // this will give combination of package and class name
		//System.out.println(getinstancename+" 9");
		/* Amazon.Project_On_Amazon.Amz_Launch_And_Quit 9 */
		
		//5
		IClass ic=result.getTestClass(); // this will give the combination of package name and class name of @Test
		//System.out.println(ic+ " 999");
		/* [TestClass name=class Amazon.Project_On_Amazon.Amz_Launch_And_Quit] 999 */
		
		//6
		 String host =result.getHost(); // it gives "Null" value
		// System.out.println(host);
		/* null */
		
		//7
	 ITestContext itc =	result.getTestContext(); // it gives package name
	// System.out.println(itc+" itc"); 
	
	 int status_1 =result.getStatus();
	 System.out.println("This is a pass code:- "+status_1);

	//	System.out.println(browser_name);
	 
	 
	 Date_Of_EveryDay d = new Date_Of_EveryDay();
		d.date();
	/* org.testng.TestRunner@22590e3e itc */
		
//		ChromeOptions op = new ChromeOptions();
//		String Browser = op.getBrowserName();
//		         //this.browser_name= Browser;     
		         System.out.println("this is a listerners "+browser_name);
		         System.out.println("this is a listerners "+browser_version);
	  TakesScreenshot  ss=  (TakesScreenshot) edriver ;
      File source_1 = ss.getScreenshotAs(OutputType.FILE);	  
      File destination = new File("C:\\Users\\golip\\eclipse-workspace\\Project_On_Amazon\\screenshots\\TestSuccess\\"+"pass_"+browser_name+"_"+result.getName()+"_"+pdate+"_"+browser_version+".png");
           //FileUtils.copyFile(source, destination);
      try
      {
    	  FileUtils.copyFile(source_1, destination);
	   }
      catch (IOException e) 
      {
		// TODO Auto-generated catch block
		e.printStackTrace();
	  }
	}
	

	@Override
	public void onTestFailure(ITestResult result) // for test class
	{
		
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
      Reporter.log("Test case is failed");
      
      
      int status_1 =result.getStatus();
 	 System.out.println("This is fail code :- "+status_1);
 	 
 	
	System.out.println(browser_name);
	
     Date_Of_EveryDay d = new Date_Of_EveryDay();
             d.date();
	
        TakesScreenshot  ss=  (TakesScreenshot) edriver ;
          File source=   ss.getScreenshotAs(OutputType.FILE); 
          File destination = new File("C:\\Users\\golip\\eclipse-workspace\\Project_On_Amazon\\screenshots\\TestFailure\\"+"Fail-"+browser_name+"_"+result.getName()+pdate+"_"+browser_version+".png");
               try {
				FileUtils.copyFile(source, destination);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        
    }

	@Override
	public void onTestSkipped(ITestResult result) // for test class
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
		Date_Of_EveryDay d = new Date_Of_EveryDay();
		d.date();
		TakesScreenshot ts = (TakesScreenshot)edriver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\golip\\eclipse-workspace\\Project_On_Amazon\\screenshots\\TestSkipped\\"+browser_name+"_"+result.getName()+pdate+"_"+browser_version+".png");
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)// for test class
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);

		Date_Of_EveryDay d = new Date_Of_EveryDay();
		d.date();
		Reporter.log("");
	TakesScreenshot ts = (TakesScreenshot)edriver;
	File source =ts.getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\golip\\eclipse-workspace\\Project_On_Amazon\\screenshots\\TestFailedButWithinSuccessPercentage\\"+browser_name+"_"+result.getName()+pdate+"_"+browser_version+".png");
	try {
		FileUtils.copyFile(source, destination);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) // for test class
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
		Date_Of_EveryDay d = new Date_Of_EveryDay();
		d.date();
		Reporter.log("Test case is failed");
	  TakesScreenshot ts = (TakesScreenshot)edriver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\golip\\eclipse-workspace\\Project_On_Amazon\\screenshots\\TestFailedWithTimeout\\"+browser_name+"_"+result.getName()+browser_version+"_"+pdate+".png");
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}

	@Override
	public void onStart(ITestContext context) // for suite
	{
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
		Reporter.log("Test suite is started");
		Date_Of_EveryDay d = new Date_Of_EveryDay();
		d.date();
		
		  TakesScreenshot ts = (TakesScreenshot)edriver;
			File source =ts.getScreenshotAs(OutputType.FILE); //+context.getName()
			File destination = new File("C:\\Users\\golip\\eclipse-workspace\\Project_On_Amazon\\screenshots\\OnStart\\"+browser_name+"_"+context.getName()+pdate+"_"+browser_version+".png");
			try {
				FileUtils.copyFile(source, destination);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	@Override
	public void onFinish(ITestContext context) //for suite 
	{
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
		Reporter.log("Test suite is finished");
	System.out.println(context.getName());
	Date_Of_EveryDay d = new Date_Of_EveryDay();
	d.date();
		  TakesScreenshot ts = (TakesScreenshot)edriver;
			File source =ts.getScreenshotAs(OutputType.FILE);  //+context.getName()
			File destination = new File("C:\\Users\\golip\\eclipse-workspace\\Project_On_Amazon\\screenshots\\OnFinish\\"+browser_name+"_"+pdate+"_"+browser_version+".png");
			try {
				FileUtils.copyFile(source, destination);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	
	}

	int number_of_times=2;
	int from =0;
		
	@Override
	public boolean retry(ITestResult result) 
	{
		if(from<=number_of_times)
		{
			System.out.println(from);
			from++;
			return true;
		}
		return false;
	}
	
	
	


}
