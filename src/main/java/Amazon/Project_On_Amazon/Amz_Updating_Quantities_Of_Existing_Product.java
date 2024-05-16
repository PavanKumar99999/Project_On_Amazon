package Amazon.Project_On_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Amz_Updating_Quantities_Of_Existing_Product 
{
WebDriver edriver;
	
	//step 1
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[3]")
	WebElement update;	
	@FindBy(xpath="(//input[@name='submit.addToCart'])[1]")
	WebElement add_two_items;
	
	
	
	//step 2
	public void add_two_items() throws InterruptedException
	{
		Thread.sleep(5000);
		add_two_items.click();
		Thread.sleep(5000);
		Reporter.log("We are adding extra iteam which is related to the Product ");
	}
	
	public void add_extra() throws InterruptedException
	{
	Thread.sleep(5000);
	update.click();	
	
//	Thread.sleep(5000);
//	update.click();
	Reporter.log("We are adding extra items which is related to the product");
	}
	
	//step 3
	public Amz_Updating_Quantities_Of_Existing_Product(WebDriver edriver)
	{
		PageFactory.initElements(edriver, this);
	}
}