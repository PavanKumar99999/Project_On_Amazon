package Amazon.Project_On_Amazon;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listerners.Test_Listing;
import utility.Fetch_Username_Password;
@Listeners(Test_Listing.class)
public class Tc04_Amz_Verify_Updating_User_Profile extends Amz_Launch_And_Quit
{

	@Test
	public void tc04_Amz_Verify_Updating_User_Profile_updating_user_profile() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Fetch_Username_Password f = new Fetch_Username_Password();
		f.fetch();
		Amz_Main_page am = new Amz_Main_page(edriver);
		am.sign_up();
		Amz_Vaild_Username_Password a = new Amz_Vaild_Username_Password(edriver);
		a.valid_username();
		a.countinue();
		a.vaild_password();
		a.signin();
		Amz_Modified_User_Profile amu = new Amz_Modified_User_Profile(edriver);
		amu.hover_over(edriver);
		amu.login_and_security(edriver);
		amu.edit_user_name(edriver);
	
	}
	
	
	
}
