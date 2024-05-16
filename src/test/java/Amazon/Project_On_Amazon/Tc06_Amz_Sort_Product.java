package Amazon.Project_On_Amazon;


import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listerners.Test_Listing;
import utility.Fetch_Username_Password;
@Listeners(Test_Listing.class)
public class Tc06_Amz_Sort_Product extends Amz_Launch_And_Quit
{
@Test
public void tc06_Amz_Sort_Product_sort() throws EncryptedDocumentException, IOException, InterruptedException
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
	Amz_Search_Any_Product as = new Amz_Search_Any_Product(edriver);
	as.search(edriver, "nartuo");
	Amz_Sorted sort = new Amz_Sorted(edriver);
	sort.sorted(edriver);
}
}