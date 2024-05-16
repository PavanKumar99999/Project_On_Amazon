package Amazon.Project_On_Amazon;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listerners.Test_Listing;
import utility.Fetch_Card_Details;
import utility.Fetch_Username_Password;

@Listeners(Test_Listing.class)
public class Tc13_Amz_Verify_Coupons extends Amz_Launch_And_Quit//Test_Listing
{

	@Test//(timeOut=200)//ThreadTimeOutException
	public void tc13_Amz_Verify_Coupons_card() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Fetch_Username_Password f = new Fetch_Username_Password();
		f.fetch();
		Fetch_Card_Details  card = new Fetch_Card_Details();
		card.credit_card();
	Amz_Main_page main = new Amz_Main_page(edriver);
			main.sign_up();
	Amz_Vaild_Username_Password aup = new Amz_Vaild_Username_Password(edriver);		
		aup.valid_username();
		aup.countinue();
		aup.vaild_password();
		aup.signin();
		Amz_Search_Any_Product search = new Amz_Search_Any_Product(edriver);
		search.search(edriver, "naruto");
		Amz_Verify_Product_With_Filters apf = new Amz_Verify_Product_With_Filters(edriver);
		apf.filters(5000, 1000);
		Amz_Verify_Product_Details avpd = new Amz_Verify_Product_Details(edriver);
		avpd.select_product(edriver);
		
		Amz_Updating_Quantities_Of_Existing_Product aexp = new Amz_Updating_Quantities_Of_Existing_Product(edriver);
		aexp.add_extra();
		
		avpd.product_details(edriver);
		
		aexp.add_two_items();
		
		Amz_Proceed_To_Buy apb = new Amz_Proceed_To_Buy(edriver);
		apb.proceed_to_pay();
		Amz_Validate_Check_Out_Process acp = new Amz_Validate_Check_Out_Process(edriver);
		
		acp.select_address(edriver);
		acp.available_balance();
	}
}