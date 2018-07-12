package javaPractice;
//>>>>>>>>>>>>>>>>>>>>>>>>>>>OVERLOADING<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
//NOTE: For OverRiding Refer GRANDPARENT, PARENT and CHILD 

public class OverLoading {
	
	int a,b;
	
	//Both methods consist same name but different parameters
	
	                         public void mobiles(int x ,int y) {
		                      a=x;b=y;
		                     System.out.println("addition is "+(a+b));
	                         }
 
	                      
	                         public void mobiles(int x) {
		                      a=x;
		                     System.out.println("square is "+(a*a));
	                         }
	                         
	   //Now lets call both the methods below
	  
	    public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoading obl = new OverLoading();
		
          obl.mobiles(10,20); //method 1 called
          obl.mobiles(3);     // method 2 called
	}

}
