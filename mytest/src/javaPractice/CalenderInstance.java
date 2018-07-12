package javaPractice;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		//We Can use Calendar method to print date and a lot
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.WEEK_OF_MONTH));
		System.out.println(cal.get(Calendar.ALL_STYLES));
		
		
		
	}

}
