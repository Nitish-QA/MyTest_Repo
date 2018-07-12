package javaPractice;
/* > Single Dimensional Array
   > Multi Dimensional Array
   > Print matrix
   > Find Smallest number among the matrix
*/
public class ArrayDeclaration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//>>>>>>>>>>>>>SINGLE DIMENTIONAL ARRAY<<<<<<<<<<<<<<<<<<<<
		
		// Method I
		int a[] = new int[5];
		a[0] = 3;
		a[1] = 5;
		a[2] = 4;
		a[3] = 2;
		a[4] = 9;
		
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
		}	
			
		// Method II
			int b[] = {3,5,4,2,9} ;  //Here we need to use "{"
			for(int j=0;j<5;j++) {
				System.out.println(b[j]);
			}
//>>>>>>>>>>>>>MULTI DIMENSIONAL ARRAY<<<<<<<<<<<<<<<<<<<<<<<
//MATRIX 
	/*	|2  4  5|
		|3  4  7|
		|1  2  6|    */
			
		// Method I
			int c[][] = new int[3][3];
			c[0][0] = 2;
			c[0][1] = 4;
			c[0][2] = 5;
			c[1][0] = 3;
			c[1][1] = 4;
			c[1][2] = 7;
			c[2][0] = 1;
			c[2][1] = 2;
			c[2][2] = 6;
	   // OR Method II
			int d[][] = {{2,4,5},{3,4,7},{1,2,6}};
			
//>>>>>>>>>>>>>PRINT MATRIX<<<<<<<<<<<<<<<<<<<<<<<
			
			for(int k=0;k<3;k++) {
				for(int l=0;l<3;l++) {
					System.out.println(c[k][l]);
				}
			}
//>>>>>>>>>>>>>FIND SMALLEST NUMBER IN MATRIX<<<<<<<<<<<<<<<<<<<<<<<			
			int min = d[0][0];  //here we considered d[][] as min value i.e "2"
			for(int m=0;m<3;m++) {
				for(int n=0;n<3;n++) {
					if(min>d[m][n]) {   //Now while iterating, if min i.e- 2 is less than next value than min will acquire that value.
						min = d[m][n];
					}
				}
			}
			System.out.println("minimum value is "+min);
			
	}
}
