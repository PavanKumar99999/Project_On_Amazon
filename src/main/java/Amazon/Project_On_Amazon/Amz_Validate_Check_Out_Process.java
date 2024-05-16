package Amazon.Project_On_Amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import utility.Fetch_Card_Details;

public class Amz_Validate_Check_Out_Process extends Fetch_Card_Details
{
	
	WebDriver edriver;
	
     //step 1
	@FindBy(xpath="//input[@data-testid='Address_selectShipToThisAddress']")
	WebElement user_address;
	
	@FindBy(xpath="//input[@placeholder='Enter Code']")
	WebElement your_available_balance;
	@FindBy(xpath="//input[@value='Apply']")
	WebElement apply;
	
	@FindBy(xpath="//input[@value='SelectableAddCreditCard']")
	WebElement card;
	
	@FindBy(xpath="(//img[@class='apx-add-pm-trigger-image'])[1]")
	WebElement enter_details;
	
	@FindBy(xpath="//iframe[@name='ApxSecureIframe']")
	WebElement iframe;
	
	@FindBy(xpath="//input[@name='addCreditCardNumber']")
	WebElement enter_card_number;
	
	@FindBy(xpath="//input[@name='ppw-accountHolderName']")
	WebElement nick_name;
	
	@FindBy(xpath="//div[@class='a-popover-wrapper']//i[@class='a-icon a-icon-close']")
    WebElement close;	
	
	@FindBy(xpath="//select[@name='ppw-expirationDate_month']//option[@value='5']")
	WebElement month_date;
	
	@FindBy(xpath="(//div[@class='a-popover-wrapper'])[2]//ul//li[12]")
	WebElement expire_month ;
	
	@FindBy(xpath="//span[@class='a-dropdown-container']//select[@name='ppw-expirationDate_year']//option[@value='2025']")
	WebElement expire_year;
	
	@FindBy(xpath="//input[@name='ppw-widgetEvent:AddCreditCardEvent']")
	WebElement enter_cart_btn;
	
	
	@FindBy(xpath="(//span[.='Enter card details'])[1]")
	WebElement submit_card;
	@FindBy(xpath="//h4[.='There was a problem.']")
	WebElement text;
	@FindBy(xpath="//ul//li//span[.='Card number is not correct.']")
	WebElement text2;
	@FindBy(xpath="//div//ul//li[2]//span[.='Expiration date is not correct.']")
	WebElement text3;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[2]")
	WebElement net_banking;
	@FindBy(xpath="(//span[.='Choose an Option'])[1]")
	WebElement choose_an_option;
	@FindBy(xpath="//select[@name='ppw-bankSelection_dropdown']") //select[@name='ppw-bankSelection_dropdown'] //select[@class='a-native-dropdown']
	WebElement select_1;

	@FindBy(xpath="//span[@class='a-dropdown-container']//select[@name='ppw-expirationDate_month']")
	WebElement exp_date;
	
	@FindBy(xpath="//span[@class='a-dropdown-container']//select[@name='ppw-expirationDate_year']")
	WebElement exp_year;
	

	
	
	@FindBy(xpath="//span[@class='a-dropdown-container']")
	WebElement choose_option;
	
	@FindBy(xpath="//ul//li//a[.='HDFC Bank']")
	WebElement hdfc;
	
	@FindBy(xpath="//li//a[.='HDFC Bank']")
	WebElement bank_name;
	
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[3]")
	WebElement Others_upi;
	@FindBy(xpath="//input[@placeholder='Enter UPI ID']")
	WebElement enter_upi_id;
	@FindBy(xpath="//input[@name='ppw-widgetEvent:ValidateUpiIdEvent']")
	WebElement submit;
	
	@FindBy(xpath ="(//input[@name='ppw-instrumentRowSelection'])[5]")
	WebElement cash;
	
	@FindBy(xpath="(//input[@name='ppw-widgetEvent:SetPaymentPlanSelectContinueEvent'])[1]")
	WebElement use_this_payment;
	
	
	//step 2
	public void select_address(WebDriver edriver) throws InterruptedException
	{
		Thread.sleep(5000);
		String page_title = edriver.getTitle();
		System.out.println(page_title);
		String expected ="Select a delivery address";
		Assert.assertEquals(page_title, expected);
		
		boolean b =user_address.isDisplayed();
		System.out.println(b);
		Assert.assertTrue(b);
		boolean b1=user_address.isEnabled();
		System.out.println(b1);
	    Assert.assertTrue(b1);
	    user_address.click();
	    Thread.sleep(5000);
	    Reporter.log("We are adding default Address");
	 }
	
	
	public void available_balance() throws InterruptedException
	{ 
		your_available_balance.click();
		your_available_balance.sendKeys("CZ1M7O4@");
		apply.click();
		Thread.sleep(5000);
		Reporter.log("We are checking the balance through coupons ");
	}
	
	
	public void select_card(WebDriver edriver) throws InterruptedException
	{
		Thread.sleep(5000);
		boolean b =card.isDisplayed();
		System.out.println(b);
		Assert.assertTrue(b);
		card.click();
		Thread.sleep(3000);
		card.click();
		Thread.sleep(3000);
		enter_details.click();
		Reporter.log("We are selecting a Credit card ");
	}
	public void enter_card_number(WebDriver edriver)  throws InterruptedException
	{
		Thread.sleep(4000);
		edriver.switchTo().frame(iframe);
		Thread.sleep(4000);
		//enter_card_number.sendKeys(card_number);
		enter_card_number.sendKeys("963258741256");
		nick_name.sendKeys(Keys.CONTROL+"a"+""+Keys.BACK_SPACE);
		nick_name.sendKeys("Pavan Kumar G");
		
//		Select s = new Select(exp_date);
//		s.selectByIndex(7);
//		
//		Select s1 = new Select(exp_year);
//		s1.selectByIndex(7);
		
		enter_cart_btn.click();
//		Thread.sleep(3000);
//		month_date.click();
//		//expire_month.click();
//		
//		Thread.sleep(3000);
//		expire_year.click();
//		Thread.sleep(3000);
//		
//		submit_card.click();
//		Thread.sleep(3000);
//		
//		String ss= text.getText();
//		System.out.println(ss);
//		Assert.assertEquals(ss,"There was a problem.");
//		Thread.sleep(3000);
//		
//		String sss= text2.getText();
//		System.out.println(sss);
//		Assert.assertEquals(sss, "Card number is not correct.");
//		Thread.sleep(3000);
//		
//		String ssss = text3.getText();
//		System.out.println(ssss);
//		Assert.assertEquals(ssss, "Expiration date is not correct.");
//	Thread.sleep(3000);
		
	   close.click();
	
	   Thread.sleep(3000);
	Reporter.log("We are successfully enter the card number and name of the user");
	}
	
	public void net_banking_all() throws InterruptedException
	{
		Thread.sleep(3000);
		net_banking.click();
		Thread.sleep(3000);
		
		choose_option.click();
		Thread.sleep(3000);
		hdfc.click();
//		choose_an_option.click();
//		Thread.sleep(3000);
//		choose_an_option.sendKeys(Keys.ARROW_UP);
//		choose_an_option.sendKeys(Keys.ARROW_UP);
//		//choose_an_option.sendKeys(Keys.ARROW_DOWN);
//		choose_an_option.sendKeys(Keys.ENTER);
//		Select s = new Select(select_1);
//      s.selectByValue("HDF DIRECT");
//      s.selectByIndex(3);
//      select_1.click();
//      s.selectByVisibleText("HDFC Bank");
//      bank_name.click();
//
		Reporter.log("We are selecting net-banking of specific bank ");
	}
	
	public void upi_option() throws InterruptedException
	{
		Thread.sleep(3000);
	     Others_upi.click();	
	     enter_upi_id.sendKeys("326574@hdfc");
	      submit.click();
	      Reporter.log("entering UPI options");
	}
	public void cash_on_delivery() throws InterruptedException
	{
		Thread.sleep(3000);
		cash.click();
		Reporter.log("clicking on cash on delivery");
	}
	
	
	public void payment()
	{
		use_this_payment.click();
	Reporter.log("clicking on the use this payment");
	}
	
	//step 3
	public Amz_Validate_Check_Out_Process(WebDriver edriver)
	{
		PageFactory.initElements(edriver,this);
	}
}