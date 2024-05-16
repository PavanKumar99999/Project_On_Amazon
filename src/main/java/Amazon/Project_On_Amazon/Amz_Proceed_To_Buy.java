package Amazon.Project_On_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Amz_Proceed_To_Buy 
{
WebDriver edriver;
	
	//step 1
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	WebElement proceed;
	
	//step 2
	public void proceed_to_pay()
	{
		proceed.click();
		Reporter.log("We are proceeding with payment");
	}
	
	//step 3
	public Amz_Proceed_To_Buy(WebDriver edriver)
	{
		PageFactory.initElements(edriver,this);
	}
}