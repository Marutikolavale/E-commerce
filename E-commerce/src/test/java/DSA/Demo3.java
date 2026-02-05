package DSA;

import java.util.Scanner;

import org.testng.annotations.Test;

import jnr.ffi.Struct.int16_t;

public class Demo3 {
	// @Test
	public void updcasting() {
		int a = 10;
		double d = a;
		System.out.println(d);

	}

	// @Test
	public void downcasting() {
		int t = 3;
		int g = 7;

		double c = t % g;

		System.out.println(c);
	}

	//@Test
	public void swaping_varibale() 
	
	{
		  String choice ;
		do {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = s.nextInt();
		System.out.println("Enter 2nd number");
		int b = s.nextInt();
		System.out.println("befor swaping number");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swaping number");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("Do you want to swap again? (y/n)");
         choice  =s.next();
	}
	while(choice.equals("y")||choice.equals("Y"));
	}
	
	//@Test
	
	 public void whillleloop()
	 {
		 int a =1;
		  while (a<10) {
			  System.out.println("maruti kolavale");
			  a++;
			
		}
	 }
	@Test
	 public void dowhilerloop()
	 {
		 int a=1;
		  do {
			  System.out.println("wfeet");
			a++;
		  }
		  while(a<=10);
	 }
	 }
