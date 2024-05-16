package Amazon.Project_On_Amazon;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listerners.Test_Listing;
import utility.Fetch_Username_Password;

@Listeners(Test_Listing.class)
public class Tc07_Amz_Select_Any_Product_And_Its_Details extends Amz_Launch_And_Quit
{

	@Test
	public void tc07_Amz_Select_Any_Product_And_Its_Details_select_product() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Fetch_Username_Password f = new Fetch_Username_Password();
		f.fetch();
		Amz_Main_page main= new Amz_Main_page(edriver);
		main.sign_up();
		Amz_Vaild_Username_Password aup = new Amz_Vaild_Username_Password(edriver);
			aup.valid_username();
			aup.countinue();
			aup.vaild_password();
			aup.signin();
			Amz_Search_Any_Product asp = new Amz_Search_Any_Product(edriver);
			asp.search(edriver, "naruto");
			Amz_Verify_Product_With_Filters af = new Amz_Verify_Product_With_Filters(edriver);
			af.filters1(500, 1000);
			Amz_Verify_Product_Details apd = new Amz_Verify_Product_Details(edriver);
			apd.select_product(edriver);
			apd.product_details(edriver);
	        apd.child_to_parent(edriver);
	}

}








