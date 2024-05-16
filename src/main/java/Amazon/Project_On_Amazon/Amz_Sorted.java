package Amazon.Project_On_Amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amz_Sorted 
{
	WebDriver edriver;

	//step 1  
	@FindBy(xpath="//span[@class='a-button-text a-declarative']")
	WebElement sorted_1 ;
	@FindBy(xpath="(//a[@class='a-dropdown-link'])[1]")
	WebElement sorted_2 ;
	
	//step 2
      public void sorted(WebDriver edriver) throws InterruptedException
      {Thread.sleep(3000);
	    sorted_1.click();
	    Thread.sleep(3000);
	    sorted_2.click();
	    Thread.sleep(5000);
      }
      
	//step 3
   public Amz_Sorted(WebDriver edriver)
	{
		PageFactory.initElements(edriver, this);
	}
}