package Amazon.Project_On_Amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Amz_Main_page 
{
	WebDriver edriver;
	
	//Step 1
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	WebElement sign;

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement search;

	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	WebElement text;

	
    //step 2
	public void sign_up()
	{
		
		
	sign.click(); 
Assert.assertNotEquals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", "Amazon Sign In");
	}
	
	public void search_product(String product_name)
	{
		search.sendKeys(product_name+Keys.ENTER);
	}
	public void navigation_back(WebDriver edriver)
	{
		edriver.navigate().back();
	}
	public void navigation_forword(WebDriver edriver)
	{
		edriver.navigate().forward();
	}
	
	public void navigation_refresh(WebDriver edriver)
	{
		edriver.navigate().refresh();;
	}
	public void sleep() throws InterruptedException
	{
		Thread.sleep(5000);
	}
	
	//step 3
public 	Amz_Main_page(WebDriver edriver)
	{
		PageFactory.initElements(edriver ,this);
	}
}
