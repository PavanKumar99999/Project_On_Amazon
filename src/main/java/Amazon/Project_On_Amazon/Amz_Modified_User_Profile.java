package Amazon.Project_On_Amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Amz_Modified_User_Profile 
{
	WebDriver edriver;

	//step 1
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	WebElement hover_over_1;
	
	@FindBy(xpath="(//div[@class='a-column a-span9 a-span-last'])[2]")
	WebElement login_and_security_1 ;
	
	@FindBy(xpath="(//div[@class='a-column a-span9 a-span-last'])[1]")
	WebElement your_order;
	
	@FindBy(xpath="(//div[@class='a-column a-span9 a-span-last']//h2)[1]")
	WebElement your_order_text;
	
	
	@FindBy(xpath="(//a[.='Edit'])[1]")
	WebElement edit_username;
	
	@FindBy(xpath="//input[@name='customerName']")
    WebElement username;	
	
	@FindBy(xpath="//input[@id='cnep_1C_submit_button']")
	WebElement save_changes;
	
	@FindBy(xpath="(//div[@class='a-alert-content'])[7]")
	WebElement update_status;
	
	@FindBy(xpath="//a[contains(@id,'Write-a-product') or contains(text(),'Write a product review')]")
	WebElement write_a_product_review;
	
	@FindBy(xpath="(//div[@class='a-section']//span[.='Clear'])[2]")
	WebElement clear;
	
	@FindBy(xpath="//div[@data-hook='ryp-star-rating-card']//img[@alt='select to rate item four star.']")
     WebElement rateing_1;	
	
	@FindBy(xpath="//span//button[.='Submit']")
	WebElement submit;
	
	
	//step 2
	public void hover_over(WebDriver edriver)
	{
		String title = edriver.getTitle();
		Actions a = new Actions(edriver);
		a.click(hover_over_1).perform(); 
		Assert.assertNotEquals(title,"Your Account");
	}
	
	public void login_and_security(WebDriver edriver)
	{
		String title = edriver.getTitle();
		login_and_security_1.click();
		System.out.println(title);
	    Assert.assertNotEquals(title, "Login and Security");
	}
	public void your_order(WebDriver edriver)
	{
		String title = edriver.getTitle();
		System.out.println(title);
		String text =your_order_text.getText();
		System.out.println(text);
		Assert.assertNotEquals(title, text);
		your_order.click();
	}
	public void review(WebDriver edriver)
	{
		String title = edriver.getTitle();
		System.out.println(title);
		String text = write_a_product_review.getText();
		System.out.println(text);
		Assert.assertNotEquals(title, text);
		write_a_product_review.click();
	}
	public void rateing() throws InterruptedException
	{
		clear.click();
		Thread.sleep(3000);
		rateing_1.click();
		Thread.sleep(5000);
	//	submit.click();
	}
	public void edit_user_name(WebDriver edriver) throws InterruptedException
	{
		Thread.sleep(3000);
		edit_username.click();
		Thread.sleep(3000);
	String title = edriver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title, "Amazon Change Name, E-mail, Password");
	username.sendKeys(Keys.CONTROL+"a"+" "+Keys.BACK_SPACE);
	username.sendKeys("PAVAN KUMAR G");
	save_changes.click();
	
//	String status =update_status.getText();
//	System.out.println("p "+status);
//	Assert.assertEquals(status, "Name updated.");
	
	Thread.sleep(5000);
	}
	
	
	
	//step 3
	public Amz_Modified_User_Profile(WebDriver edriver)
	{
		PageFactory.initElements(edriver, this);
	}
}
