package listerners;

import java.util.Arrays;
import java.util.Date;

public class Date_Of_EveryDay
{
public static	String day,month,date,full_time,country,year,present_date,pdate,time_1;
	
public void date()
{
	Date d = new Date();
	//long time =d.getTime();
		//System.out.println(time);
	
		Date d2 = new Date(d.getTime()+(1000-60*60*24*1));
		//System.out.println(d2);
	String	 present_date=   d2.toString();
		//System.out.println(present_date);
		String Date[]=present_date.split(" ");
		//System.out.println(Date.length);
//     String	 day=Date[0]; //Tue
//     String	 month =Date[1]; //Mar
//     String	 date=Date[2]; // 26
//     String    full_time = Date[3]; //time 14:22:43
//     String	 country =Date[4]; // IST (Indian Standerd Time)
//     String   year =Date[5]; // 2024
//     String pdate =day.concat("-").concat(month).concat("-").concat(date).concat("-").concat(full_time).concat("-").concat(country).concat("-").concat(year);
	//System.out.println(pdate);
     	 day=Date[0]; //Tue
     	 month =Date[1]; //Mar
     	 date=Date[2]; // 26
         full_time = Date[3]; //time 14:22:43
         String split_time[] =Date[3].split(":");
         String hour =split_time[0];
         String minutes = split_time[1];
         String seconds = split_time[2];
         
     	  time_1 =hour.concat("(Hour)-").concat(minutes).concat("(Minute)-").concat(seconds).concat("(Second)");
     	System.out.println(time_1);
         country =Date[4]; // IST (Indian Standerd Time)
         year =Date[5]; // 2024
         pdate =day.concat("-").concat(month).concat("-").concat(date).concat("-").concat(time_1).concat("-").concat(country).concat("-").concat(year); 
}
public static void main(String args[])
{
	Date_Of_EveryDay d = new Date_Of_EveryDay();
	d.date();
//System.out.println(d.);
	System.out.println(pdate);
	}
}