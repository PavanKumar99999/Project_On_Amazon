package Amazon.Project_On_Amazon;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listerners.Test_Listing;
import utility.Fetch_Username_Password;
@Listeners(Test_Listing.class)
public class Tc10_Amz_Delete_Product_From_Cart_Page extends Amz_Launch_And_Quit
{

	@Test
	public void tc10_Amz_Delete_Product_From_Cart_Page_delete_product() throws EncryptedDocumentException, IOException, InterruptedException
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
	          Amz_Search_Any_Product asp = new Amz_Search_Any_Product(edriver);
	          asp.search(edriver, "naruto");
	          Amz_Verify_Product_With_Filters apf = new Amz_Verify_Product_With_Filters(edriver);
	          apf.filters(500, 1000);
	          Amz_Verify_Product_Details avp =new  Amz_Verify_Product_Details(edriver);
	          avp.select_product(edriver);
	          
	          Amz_Updating_Quantities_Of_Existing_Product auqp = new Amz_Updating_Quantities_Of_Existing_Product(edriver);
	          auqp.add_extra();
	          
	          
	          avp.product_details(edriver);
	          
	          auqp.add_two_items();
	          
	          Amz_Add_To_Shopping_Cart  asc = new Amz_Add_To_Shopping_Cart(edriver);
	          asc.add_to_cart();
	        //  asc.check_cart_Number_of_items(edriver);
	          Amz_Delete_Product_In_Cart adpc = new Amz_Delete_Product_In_Cart(edriver);
	          adpc.delete_product(edriver);
	         // adpc.checking_cart_items(edriver);
	          avp.child_to_parent(edriver);

	
	}
}