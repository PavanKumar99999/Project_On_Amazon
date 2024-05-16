package Amazon.Project_On_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class Amz_Delete_Product_In_Cart 
{
 public	WebDriver edriver;

	//step 1
 @FindBy(xpath="(//input[@value='Delete'])[1]")
 WebElement delete_one_product;
 
 @FindBy(xpath="//div[@class='a-row']//h1")
 WebElement title;
 @FindBy(xpath="(//span[.='1'])[1]")
 WebElement checking_cart;
	
 @FindBy(xpath="//h1[@class='a-spacing-mini a-spacing-top-base']")
 WebElement text;
 
 
 @FindBy(xpath="(//span[@class='a-button-inner'])[18]")
 WebElement cart;
 
	//step 2
	public void delete_product(WebDriver edriver)
	{
		delete_one_product.click();
	Reporter.log("deleted one item");
	}
     public void cart_items(WebDriver edriver)
    {
 cart.click();
    	 
    }
 
 
	//step 3
	public Amz_Delete_Product_In_Cart(WebDriver edriver)
	{
		PageFactory.initElements(edriver,this);
	}
	
}