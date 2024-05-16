package Amazon.Project_On_Amazon;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listerners.Test_Listing;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import utility.Fetch_Username_Password;
@Listeners(Test_Listing.class)
public class Tc03_Amz_Verify_With_INvalid_Credential extends Amz_Launch_And_Quit
{

     @Test
	public void tc03_Amz_Verify_With_INvalid_Credential_invaild_Credentials() throws EncryptedDocumentException, IOException
	{
    	 
    	 Fetch_Username_Password f = new Fetch_Username_Password();
	     f.fetch();
		Amz_Main_page am= new Amz_Main_page(edriver);
		am.sign_up();
		Amz_INVaild_Username_Password a = new Amz_INVaild_Username_Password(edriver); 
		a.INvalid_username();
		a.countinue();
		am.navigation_back(edriver);
		am.navigation_back(edriver);
	}
}