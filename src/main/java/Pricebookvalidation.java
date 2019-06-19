import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.joda.time.DateTimeComparator;

public class Pricebookvalidation {

	
	public int dateCompare(String effectivedate) throws ParseException
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date datecurrent=new Date();
		//String convertcurrentdate= new SimpleDateFormat("yyyy-MM-dd").format(datecurrent);
		Date effectivedateopp=sdf.parse(effectivedate);
		//SimpleDateFormat df = new SimpleDateFormat("yyyy");
		 int year = LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd").format(effectivedateopp)).getYear();
		//year = df.format(date);
		 
	        DateTimeComparator dateTimeComparator = DateTimeComparator.getDateOnlyInstance();
	        int retVal = dateTimeComparator.compare(effectivedateopp, datecurrent);
		if (retVal > 0) 
		{
            System.out.println("effectivedateopp is after datecurrent");
            System.out.println(year);
            //get year put same
        } else if (retVal < 0) 
        {
            System.out.println("effectivedateopp is before datecurrent");
           
            year=year+1;
           System.out.println(year);
            //Code to increase year -get year +1
        } else if (retVal == 0) {
        	
            System.out.println("effectivedateopp is equal to datecurrent");
            System.out.println(year);
            //put same year
        } else {
            System.out.println("How to get here?");
        }
		return year;
	}
	 
	public void pricebookvalidations (String quoteline,String effectivedate,String Salessegment,String LOB) throws ParseException
	{
		
		String Validateyear,ValidateLOB,ValidateSales;
		int year =dateCompare("2019-04-02");
		
		String yearval=String.valueOf(year);
		if (LOB.equals("Medical"))
		{
			if (quoteline.contains(Salessegment)) {
				ValidateSales = "Sales segment value is as expected '" + Salessegment + "'";

			} else {
				ValidateSales = "Sales segment value is not as expected '" + Salessegment + "'";
			}
			System.out.println(ValidateSales);
		}
			if (quoteline.contains(yearval))
			{
				Validateyear= "Year is as expected '"+yearval+"'";
				
			}
			else
			{
				Validateyear="Year is not expected as '"+yearval+"'";
			}
			
			if (quoteline.contains(LOB))
			{
				ValidateLOB= "LOB  value is as expected '"+LOB+"'";
				
			}
			else
			{
				ValidateLOB="LOB  value is not as expected '"+LOB+"'";
			}
			System.out.println(Validateyear);
			
			System.out.println(ValidateLOB);
			//ValidateSales
			
		
		
	}
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		//
		String quoteline="Quote Line Items (2019 Credible Business Medical (51-99))";
		String effctdate="2019-04-05";
		String Salessegment="51-99";
		String LOB="Medical";
		Pricebookvalidation obj=new Pricebookvalidation();
		obj.pricebookvalidations(quoteline,effctdate,Salessegment,LOB);
		
		obj.dateCompare(effctdate);
		//obj.dateComapre(effctdate);
		Date datecurrent=new Date();
		String convertcurrentdate= new SimpleDateFormat("yyyy-MM-dd").format(datecurrent);
		System.out.println(convertcurrentdate);
		/*DateFormat dateformat= new SimpleDateFormat("yyyy-MM-dd",Locale.getDefault());
		Date date=new Date();
		Date effectdate=new Date();
		//effectdate.f
		//return dateformat.format(date);
		Pricebookvalidation pricebookobj=new Pricebookvalidation();
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		 DateFormat dateformat= new SimpleDateFormat("yyyy-MM-dd",Locale.getDefault());
		 Date date=new Date();
			Date date1=dateformat.format(date);
			//Date effectdate=new Date();
	        Date date2 = sdf.parse("2019-04-03");

	        System.out.println("date1 : " + sdf.format(date1));
	        System.out.println("date2 : " + sdf.format(date2));

	        if (date1.compareTo(date2) > 0) {
	            System.out.println("Date1 is after Date2");
	        } else if (date1.compareTo(date2) < 0) {
	            System.out.println("Date1 is before Date2");
	        } else if (date1.compareTo(date2) == 0) {
	            System.out.println("Date1 is equal to Date2");
	        } else {
	            System.out.println("How to get here?");
	        }*/
	        //
	}

}
