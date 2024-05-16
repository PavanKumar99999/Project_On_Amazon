package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Fetch_Card_Details 
{
public 	String card_number; //null

public 	String cvv;
	public void credit_card() throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\golip\\eclipse-workspace\\Project_On_Amazon\\Excel\\Amazon_Username_Password.xlsx");
		Workbook w = WorkbookFactory.create(file);
	  card_number =  NumberToTextConverter.toText(w.getSheet("Sheet1").getRow(1).getCell(3).getNumericCellValue());
	  cvv =  NumberToTextConverter.toText(w.getSheet("Sheet1").getRow(1).getCell(4).getNumericCellValue());
	System.out.println(card_number);
	System.out.println(cvv);
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		Fetch_Card_Details f = new Fetch_Card_Details();
		f.credit_card();
		
		
		
		// Goibio
		//(//div[@class='DayPicker-Week']//div[@role='gridcell']//p[@class='fsw__date'])[22] --> Departure date 
		//(div[@class='DayPicker-Week']//div[@role='gridcell']//p[@class='fsw__date'])[41] --> Return date
	}
}