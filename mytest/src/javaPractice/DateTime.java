package javaPractice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   // To print date we need to create date object and import as JAVA util.
		Date d = new Date();
		
		  // We can't directly print "d", first it needs to be converted into String.
		System.out.println(d.toString());
		
		  // NOW to print date into a desired format like DD/MM/YYYY, we need to create object SimpleDateFormat and import it
		SimpleDateFormat sdf = new SimpleDateFormat("d/M/YYYY hh:mm:ss");
		    
		  // Now combine sdf and d to get date in desired format
		System.out.println(sdf.format(d));
		
		
		
		
	}

}
