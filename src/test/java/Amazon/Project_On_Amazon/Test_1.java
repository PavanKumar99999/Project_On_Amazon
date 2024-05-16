package Amazon.Project_On_Amazon;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listerners.Test_Listing;

@Listeners(Test_Listing.class)
public class Test_1 extends Amz_Launch_And_Quit
{

	@Test(priority=-9,retryAnalyzer=listerners.Test_Listing.class)
	public void test_1_One()
	{
       Assert.assertNotEquals(false,false);	
	}
	
//	@Test(dependsOnMethods="one")
//	public void two()
//	{
	
//	}
	
	
//	@Test(timeOut=1,priority=9)
//	public void one_1()
//	{
//
//	System.out.println("abcd");
//	}
}