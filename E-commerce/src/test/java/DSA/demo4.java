package DSA;


import java.util.Scanner;

import org.testng.annotations.Test;

import Testcases.d;



public class demo4 {
	
	@Test
	 public void ds()
	 {		
		String d;
		do { int sum= 0;
		 int n;
		
		 Scanner s= new Scanner(System.in);
		 System.out.println("Enter number range");
		n= s.nextInt();
		 System.out.println("---------------------------");
if (n%2==0) {
	for (int i = 0; i <=n; i=i+2) {
	sum=sum+i;
	System.out.println(sum);
	}
	 System.out.println("---------------------------");
	System.out.println("sum of even number = "+ sum);
}
else {
	for (int i = 1; i <=n; i=i+2) {
		sum=sum+i;
		System.out.println(sum);
}
	 System.out.println("---------------------------");
	System.out.println("sum of odd number = "+ sum);
	 }
System.out.println("---------------------------");
System.out.println("Do you what to contnies press other wir press No");
	d=s.next();
		}
		while(d.equals("Y")||d.equals("y"));
}
	
}
