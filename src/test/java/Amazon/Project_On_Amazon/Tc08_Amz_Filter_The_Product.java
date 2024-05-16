package Amazon.Project_On_Amazon;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listerners.Test_Listing;
import utility.Fetch_Username_Password;
@Listeners(Test_Listing.class)
public class Tc08_Amz_Filter_The_Product extends Amz_Launch_And_Quit
{

	@Test
	public void tc08_Amz_Filter_The_Product_filer_the_product() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Fetch_Username_Password f = new Fetch_Username_Password();
		f.fetch();
		Amz_Main_page main_page = new Amz_Main_page(edriver);
		main_page.sign_up();
		Amz_Vaild_Username_Password a = new Amz_Vaild_Username_Password(edriver);
	a.valid_username();
	a.countinue();
	a.vaild_password();
	a.signin();
	Amz_Search_Any_Product asap =  new Amz_Search_Any_Product(edriver);
	asap.search(edriver, "naruto");
	Amz_Verify_Product_With_Filters avp = new Amz_Verify_Product_With_Filters(edriver);
	avp.filters(500, 1000);
	Amz_Sort_By asb = new Amz_Sort_By(edriver);
	asb.sorted_feature(edriver);
	
	}
}