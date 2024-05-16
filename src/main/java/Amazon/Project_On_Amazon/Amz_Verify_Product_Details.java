package Amazon.Project_On_Amazon;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class Amz_Verify_Product_Details 
{
	WebDriver edriver;

	//step 1
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-square-aspect'])[1]")
	WebElement select_first_product;
	
	@FindBy(xpath="//div[@id='productDetails_db_sections']")
	WebElement product_details;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement add_to_cart;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement search;
	
	
	//step 2
	public void select_product(WebDriver edriver)
	{
	
		String title = edriver.getTitle();
		System.out.println(title);
	select_first_product.click();
	String parent_1 =edriver.getWindowHandle();
	Set<String> parent_child_id =edriver.getWindowHandles();
	Iterator <String> i =parent_child_id.iterator();
	
	 String parent =  i.next();
	
	String child = i.next();
	edriver.switchTo().window(child);
	String title_1 = edriver.getTitle();
	System.out.println(title_1);
	Assert.assertNotEquals(title, title_1);
	
	Reporter.log("We are selecting a filter product and going into child window");
	}
	
	public void child_to_parent(WebDriver edriver)
	{
		edriver.close();
		Set<String> parent_child_id =edriver.getWindowHandles();
		Iterator <String> i =parent_child_id.iterator();
		 String parent =  i.next();

		edriver.switchTo().window(parent);
		Reporter.log("We are going back from child window to parent window");
	
	}
	
	
	public void product_details(WebDriver edriver) throws InterruptedException
	{
		Point p =product_details.getLocation();
		int x =p.getX();
		int y = p.getY();
		System.out.println(x+","+y);
		JavascriptExecutor jse = (JavascriptExecutor)edriver;
		jse.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(10000);
		Point lp= search.getLocation();
	     int lx =lp.getX();
		int ly = lp.getY();
		System.out.println(lx+","+ly);
		jse.executeScript("window.scrollTo("+lx+","+ly+")");
	Reporter.log("we can see prodcut details or prodcut description ");
	}
	
	//step 3
	public  Amz_Verify_Product_Details(WebDriver edriver)
	{
		PageFactory.initElements(edriver,this);
	}
}