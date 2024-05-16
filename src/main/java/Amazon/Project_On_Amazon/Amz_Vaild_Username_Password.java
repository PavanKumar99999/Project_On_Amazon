package Amazon.Project_On_Amazon;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import utility.Fetch_Username_Password;

public class Amz_Vaild_Username_Password extends Fetch_Username_Password
{
	
	WebDriver edriver;
	//step 1 
	@FindBy(xpath="//input[@name='email']")
	WebElement username_1;

	@FindBy(xpath="//input[@id='continue']")
	WebElement countinue;

	@FindBy(xpath="//input[@name='password']")
	WebElement password_1;

	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement sign_in;

	//step 2
	
	public void valid_username() throws EncryptedDocumentException, IOException
	{
//		FileInputStream file = new FileInputStream("C:\\Users\\golip\\eclipse-workspace\\Selenium_Maven\\Excel_Sheet\\Amazon_Username_Password.xlsx");
//		
//		Workbook w = WorkbookFactory.create(file);
//	String Username =	NumberToTextConverter.toText(w.getSheet("Sheet1").getRow(1).getCell(2).getNumericCellValue());
//	String country_code ="+91";
//	String username_1 = country_code.concat(Username);
	username_1.sendKeys(user_name);
	Reporter.log("Entered a Valid User name and Password");
	}
	
	public void countinue()
	{
		countinue.click();
		Reporter.log("clicked on countinue button");
	}
	
	public void vaild_password() throws EncryptedDocumentException, IOException
	{
//	FileInputStream file = new FileInputStream("C:\\Users\\golip\\eclipse-workspace\\Selenium_Maven\\Excel_Sheet\\Amazon_Username_Password.xlsx");
//		
//		Workbook w = WorkbookFactory.create(file);
//	String password_1 =w.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	password_1.sendKeys(password);	
	Reporter.log("Entered a valid Password");
	}
	
	
	public void signin()
	{
		sign_in.click();
         Assert.assertNotEquals("Amazon Sign In", "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	Reporter.log("click on the sign-in button");
	}
	
	
	
	//step 3
	public Amz_Vaild_Username_Password(WebDriver edriver)
	{
		PageFactory.initElements(edriver, this);
	}
	
}