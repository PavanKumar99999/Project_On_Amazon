package Amazon.Project_On_Amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Amz_Create_New_Amazon_Account 
{
	WebDriver edriver;
//step 1

	@FindBy(xpath="//a[@id='createAccountSubmit']")
	WebElement new_Account;
	
	@FindBy(xpath="//input[@name='customerName']")
	WebElement name;

    @FindBy(xpath="//input[@placeholder='Mobile number']")
    WebElement mobile_number;

    @FindBy(xpath="//input[@name='password']")
    WebElement password;

    @FindBy(xpath="//span[@id='auth-continue-announce']")
    WebElement verify_Phone_number;
    
    //step 2
    public void new_user()
    {
    	new_Account.click();
    	Assert.assertNotEquals("Amazon Sign In", "Amazon Registration");
    }
    public void enter_username()
    {
    	name.sendKeys("pavan kumar");
    }
    public void enter_user_mobile_number()
    {
    	mobile_number.sendKeys("9182826091");
    }
    public void enter_user_password()
    {
    	password.sendKeys("369874125@Qmp"+Keys.TAB.ENTER);
    	Assert.assertEquals("Authentication required", "Authentication required");
    }
    public void verify_phone_number()
    {
    	verify_Phone_number.click();
    	
    }
    //step 3
public Amz_Create_New_Amazon_Account(WebDriver edriver)
{
	PageFactory.initElements(edriver, this);
	
}

}