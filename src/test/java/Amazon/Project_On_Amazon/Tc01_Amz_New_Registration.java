package Amazon.Project_On_Amazon;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listerners.Test_Listing;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utility.Fetch_Username_Password;

@Listeners(Test_Listing.class)
public class Tc01_Amz_New_Registration extends Amz_Launch_And_Quit
{

	@Test(retryAnalyzer=listerners.Test_Listing.class) //@Test(retryAnalyzer=listerners.Test_Listing.class)
	public void tc01_Amz_New_Registration_new_user() throws InterruptedException, EncryptedDocumentException, IOException
	{
	Fetch_Username_Password f = new Fetch_Username_Password();
	f.fetch();
		Amz_Main_page amp = new Amz_Main_page(edriver);
            amp.sign_up();		
        Amz_Create_New_Amazon_Account ac = new Amz_Create_New_Amazon_Account(edriver);
        ac.new_user();
        ac.enter_username();
        ac.enter_user_mobile_number();
        ac.enter_user_password();
        Thread.sleep(5000);
        System.out.println(edriver.getTitle());
        amp.sleep();
        amp.navigation_back(edriver);
        amp.navigation_back(edriver);
        amp.navigation_back(edriver);
       //ac.verify_phone_number();// not working so, i gave Keys functionality on line number 18 method
       //Authentication required
	}
	
	
}
