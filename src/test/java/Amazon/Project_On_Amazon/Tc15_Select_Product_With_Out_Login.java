package Amazon.Project_On_Amazon;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listerners.Test_Listing;

@Listeners(Test_Listing.class)
public class Tc15_Select_Product_With_Out_Login extends Amz_Launch_And_Quit
{
	@Test
	public void tc15_Select_Product_With_Out_Login_select_with_out_login() throws InterruptedException
	{
		Amz_Main_page main= new Amz_Main_page(edriver);
		main.search_product("naruto");
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
		
	}
}
