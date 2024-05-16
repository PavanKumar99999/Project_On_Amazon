package Amazon.Project_On_Amazon;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Form_1099_NEC implements IRetryAnalyzer
{
	
	@Test(groups={"smoke","system","Regrssion"},priority=-99,enabled=true)
	public void for_1099_nec__99()
	{	
		Assert.assertEquals(false, true);
	System.out.println(-99);	
	
	}
	
	
	@Test(groups={"smoke","system","Regrssion"},priority=-1)
	public void for_1099_nec__1()
	{
	System.out.println(-1);	
	}
@Test(groups={"smoke","system","Regrssion"},priority=0,invocationCount=2,description="this is a method",dependsOnMethods="for_1099_nec__99") 
public void for_1099_nec()                       // default priority =0         
{                                                 // enabled =false      
	System.out.println(0);                         // invocationCount =1
}

@Test(groups={"smoke","system","Regrssion"},priority=1)
public void for_1099_nec_1()
{
	System.out.println(1);
}
@Test(groups={"smoke","system","Regrssion"},priority=2)
public void for_1099_nec_2()
{
	System.out.println(2);
}
@Test(groups={"smoke","system","Regrssion"},priority=3)
public void for_1099_nec_3()
{
	System.out.println(3);
}
@Test(groups={"smoke","system","Regrssion"},priority=4)
public void for_1099_nec_4()
{
	System.out.println(4);
}
@Test(groups={"smoke","system","Regrssion"},priority=5)
public void for_1099_nec_5()
{
	System.out.println(5);
}


// retryAnalyzer=Form_1099_NEC.class

@Override
public boolean retry(ITestResult result) 

{
	
	return false;
}

}
