package Amazon.Project_On_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Amz_Add_To_Shopping_Cart 
{
	WebDriver edriver;

	//step 1
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement add_item_to_cart;
	
	@FindBy(xpath="//a[@class='a-button-text']")
	WebElement cart;
	
	@FindBy(xpath="(//span[.='1'])[1]")
	WebElement check_number;
	
	//step 2
	public void add_to_cart() throws InterruptedException
	{
	//String name =	add_item_to_cart.getAttribute("value");
	//System.out.println(name);	
	//add_item_to_cart.click();
		cart.click();
		Thread.sleep(5000);
	}
	
	public void check_cart_Number_of_items(WebDriver edriver)
	{
		String items =check_number.getText();
		System.out.println(items);
		Assert.assertNotEquals(items, 1);
	}
	////span[@class='a-size-medium sc-number-of-items']//span[.='Subtotal (0 items):']
	
	//step 3
	public Amz_Add_To_Shopping_Cart(WebDriver edriver)
	{
		PageFactory.initElements(edriver,this);
	}
}