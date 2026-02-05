package DSA;

import java.util.Scanner;

import org.testng.annotations.Test;

import Testcases.d;

public class demo5 {
@Test
	public void evenNumbert10() {
	String e ;
	do {
	Scanner s=new Scanner(System.in);
		int a,b,limit;
		  int count=0;
		System.out.println("Enter 1st number");
		a=s.nextInt();
		System.out.println("Enter 2st number");
		b=s.nextInt();
		System.out.println("Enter  count even  number");
		limit=s.nextInt();
		System.out.println("===============================");
		System.out.println(" Given Rnge even number");
		
		for (int i = a; i <=b; i++) {
			if(i%2==0)
			{
				System.out.println(i);
				count++;
			}
			if(count==limit)
			{
				
				System.out.println("===============================");
				
				break;
			}
			

		}
		System.out.println("Do you want to continue? (yes/no)");
        e = s.next();   // user input घेतला
	} 
	while(e.equalsIgnoreCase("yes"));
	
	
	
	}
}
