package mytest;

import java.util.Scanner;

public class addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st no:");
		a=s.nextInt();
		System.out.println("Enter 2nd no:");
		b=s.nextInt();
		s.close();
		c=a+b;
		System.out.println("Result of addition:"+c);

	}

}
