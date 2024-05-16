package Amazon.Project_On_Amazon;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listerners.Test_Listing;
import utility.Fetch_Username_Password;
@Listeners(Test_Listing.class)
public class Tc09_Amz_Add_Product_To_Cart extends Amz_Launch_And_Quit
{

	@Test
	public void tc9_Amz_Add_Product_To_Cart_add_product_into_cart() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Fetch_Username_Password f = new Fetch_Username_Password();
		f.fetch();
		Amz_Main_page main = new Amz_Main_page(edriver);
		main.sign_up();
		Amz_Vaild_Username_Password aup = new Amz_Vaild_Username_Password(edriver);
		aup.valid_username();
		aup.countinue();
		aup.vaild_password();
		aup.signin();
		Amz_Search_Any_Product ap = new Amz_Search_Any_Product(edriver);
		ap.search(edriver, "naruto");
		Amz_Verify_Product_With_Filters af = new Amz_Verify_Product_With_Filters(edriver);
	             af.filters(500, 1000);
	    Amz_Verify_Product_Details apd = new Amz_Verify_Product_Details(edriver);
	    apd.select_product(edriver);
	    
	    Amz_Updating_Quantities_Of_Existing_Product aqup = new Amz_Updating_Quantities_Of_Existing_Product(edriver);
	    aqup.add_extra();
	    
	    apd.product_details(edriver);
	    
	    aqup.add_two_items();
	    
	    Amz_Add_To_Shopping_Cart asc = new Amz_Add_To_Shopping_Cart(edriver);
	    asc.add_to_cart();
	             
	apd.child_to_parent(edriver);
	             
		
	}
}