package DSA;


import java.util.Scanner;

import org.python.antlr.PythonParser.for_stmt_return;
import org.testng.annotations.Test;

import jnr.ffi.Struct.int16_t;

public class Demo2 {
	//@Test
	public void table() {
		Scanner c = new Scanner(System.in);
		System.out.println("Enter the number which you have table");
		int number = c.nextInt();
		System.out.println();
		for (int i = 1; i <= 10; i++) {

			System.out.println(number + " * " + i + "  = " + number * i);
		}

		
		 
		 	}
	
	//@Test
	 public void  wholl()
	 {
		  int a=1;
		     while (a<=10) {
		    	 System.out.println(a);
		    	 a++;
		     }
			
	 }
	@Test
	 public void factoerisal()
	 { 
		int fact = 1;
		  int a=3;
	
		  for (int i = a; i >=1; i--) {
			
			  fact=fact*i;
		}
		  System.out.println(fact);
		  
	 }
	
	 public void kolaval()
	 {
		 
	 }
}
