package Amazon.Project_On_Amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class Amz_Search_Any_Product 
{
	WebDriver edriver;
	//Step 1
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement search_text_filed;
	
	
	//step 2
	public void search(WebDriver edriver ,String text) throws InterruptedException
	{
		String Main_title = edriver.getTitle();
		System.out.println(Main_title);
		String Expected_title ="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		Assert.assertEquals(Main_title, Expected_title);
		search_text_filed.sendKeys(text+Keys.ENTER);
		String title = edriver.getTitle();
		System.out.println(title);
		Assert.assertNotEquals(title, "Amazon.in : shoes");
		Reporter.log("User successfully entering any product names");
		Thread.sleep(7000);
	}
	

	//step 3
	public Amz_Search_Any_Product(WebDriver edriver)
	{
		PageFactory.initElements(edriver,this);
	}
	
}
