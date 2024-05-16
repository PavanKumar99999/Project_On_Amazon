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

import utility.Fetch_Username_Password;

public class Amz_INVaild_Username_Password extends Fetch_Username_Password
{ 
	WebDriver edriver;
	//step 1 
	@FindBy(xpath="//input[@name='email']")
	WebElement username;

	@FindBy(xpath="//input[@id='continue']")
	WebElement countinue;

	@FindBy(xpath="//h4[@class='a-alert-heading']")
	WebElement warning;
	
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;

	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement sign_in;

	//step 2
	
	public void INvalid_username() throws EncryptedDocumentException, IOException
	{
//		FileInputStream file = new FileInputStream("C:\\Users\\golip\\eclipse-workspace\\Selenium_Maven\\Excel_Sheet\\Amazon_Username_Password.xlsx");
//		
//		Workbook w = WorkbookFactory.create(file);
//	String Username =	w.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	username.sendKeys(Inuser_name);
	}
	
	public void countinue()
	{
		countinue.click();
		String warning_1 =warning.getText();
		System.out.println(warning_1);
	Assert.assertEquals(warning_1, "There was a problem");
	}
	
//	public void vaild_password() throws EncryptedDocumentException, IOException
//	{
//	FileInputStream file = new FileInputStream("C:\\Users\\golip\\eclipse-workspace\\Selenium_Maven\\Excel_Sheet\\Amazon_Username_Password.xlsx");
//		
//		Workbook w = WorkbookFactory.create(file);
//	String password_1 =w.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
//	password.sendKeys(password_1);	
//	}
//	
//	
//	public void signin()
//	{
//		sign_in.click();
//         Assert.assertEquals("Amazon Sign In", "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
//	}
//	


    //step 3
	public Amz_INVaild_Username_Password(WebDriver edriver)
   {
     PageFactory.initElements(edriver, this);	
   }
}