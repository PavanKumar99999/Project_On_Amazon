package Amazon.Project_On_Amazon;

import org.testng.annotations.Test;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listerners.Test_Listing;
import utility.Fetch_Username_Password;

@Listeners(Test_Listing.class)
public class Tc02_Amz_Verify_Valid_Credential extends Amz_Launch_And_Quit
{ 

	@Test
	public void tc02_Amz_Verify_Valid_Credential_vaild_username_and_password() throws EncryptedDocumentException, IOException
	{
		
		Fetch_Username_Password f = new Fetch_Username_Password();
		f.fetch();
	      Amz_Main_page amp = new Amz_Main_page(edriver);
	      amp.sign_up();
	      Amz_Vaild_Username_Password a= new Amz_Vaild_Username_Password(edriver);
			a.valid_username();
			a.countinue();
			a.vaild_password();
			a.signin();
	}
}