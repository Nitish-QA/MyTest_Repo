package javaPractice;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		
		String sr ="payment $100 paid";
		// to print 8th character in the statement
		System.out.println("8th character is " +sr.charAt(8));
		
	   // to find out place count of character $
		System.out.println("place value of $ is " +sr.indexOf("$"));
		
		//to print rest of the characters after $
		System.out.println(sr.substring(8));
	}

}
