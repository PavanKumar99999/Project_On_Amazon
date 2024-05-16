package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Footer;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Fetch_Username_Password 
{
public static String user_name;
	public static String password;
	public static  String  Inuser_name;
	
	public int card_number;
	
	public void fetch() throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\golip\\eclipse-workspace\\Selenium_Maven\\Excel_Sheet\\Amazon_Username_Password.xlsx");
	Workbook w = WorkbookFactory.create(file);
	String username =  NumberToTextConverter.toText(w.getSheet("Sheet1").getRow(1).getCell(2).getNumericCellValue());
	    String country_code ="+91";
	     user_name = country_code.concat(username);
	     
	   
	    password =  w.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	   
	   
	Inuser_name =  w.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		    
	}
	

}