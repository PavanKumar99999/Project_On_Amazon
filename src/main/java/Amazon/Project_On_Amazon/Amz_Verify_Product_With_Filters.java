package Amazon.Project_On_Amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Amz_Verify_Product_With_Filters 
{
	WebDriver edriver;

	//steps 1
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[4]")
	WebElement filters_1;
	
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[5]")
	WebElement filters_2;
	
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[6]")
	WebElement filters_3;
	
	@FindBy(xpath="//input[@name='low-price']")
	WebElement price_low_range;
	
	@FindBy(xpath="//div[@class='a-section']//span[@data-action='sf-collapsible-left-nav-expand-all-action']//a")
	WebElement expand;
	
	//step 2
	public void filters(int low_price,int high_price) throws InterruptedException
	{
	if(expand.isSelected()==true)
	{
		Thread.sleep(3000);
		filters_1.click();
		Thread.sleep(3000);
		filters_2.click();
		Thread.sleep(3000);
		filters_3.click();
		Thread.sleep(3000);
		price_low_range.sendKeys(low_price+""+Keys.TAB+""+high_price+""+Keys.TAB+""+Keys.ENTER);
		Reporter.log("Successfully filtering the given Product ");
	}
	else if(expand.isDisplayed()==true)
	{
		expand.click();
		Thread.sleep(3000);
		if(filters_1.isDisplayed()==true)
		{
		filters_1.click();
		Thread.sleep(3000);
		}
		if(filters_2.isDisplayed()==true)
		{
		filters_2.click();
		Thread.sleep(3000);
	    }
		if(filters_3.isDisplayed()==true)
		{
		filters_3.click();
		Thread.sleep(3000);
	    }
		expand.click();
		Thread.sleep(3000);
		expand.click();
		price_low_range.sendKeys(low_price+""+Keys.TAB+""+high_price+""+Keys.TAB+""+Keys.ENTER);
		Reporter.log("Successfully filtering the given Product ");
		}
	
		Thread.sleep(3000);
		filters_1.click();
		Thread.sleep(3000);
		filters_2.click();
		Thread.sleep(3000);
		filters_3.click();
		Thread.sleep(3000);
		
		price_low_range.sendKeys(low_price+""+Keys.TAB+""+high_price+""+Keys.TAB+""+Keys.ENTER);
		Reporter.log("Successfully filtering the given Product ");
	
	}
	public void filters1(int low_price,int high_price) throws InterruptedException
	{
		Thread.sleep(3000);
		filters_1.click();
		Thread.sleep(3000);
		filters_2.click();
		Thread.sleep(3000);
		Thread.sleep(3000);
		price_low_range.sendKeys(low_price+""+Keys.TAB+""+high_price+""+Keys.TAB+""+Keys.ENTER);
		Reporter.log("Successfully filtering the given Product ");
	}
	//step 3
	public Amz_Verify_Product_With_Filters(WebDriver edriver)
	{
		PageFactory.initElements(edriver , this);
	}
}