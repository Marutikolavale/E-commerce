package DSA;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Demo8 {

	@Test
	public void datra() {
		String y;
		Scanner r= new Scanner(System.in);
	do {	
	
	System.out.println("Enter the 1 number");
	int a=r.nextInt();
	System.out.println("Enter the 2 number");
	int b=r.nextInt();
	System.out.println("Enter task 1 add 2 sub");
	int t=r.nextInt();
	switch (t) {
	
	case 1:
		System.out.println("add=" + (a+b));
		break;
case 2:
	System.out.println("sub"+(a-b));
		break;
	default:
		System.out.println("Enter carect value");
		break;
	}
	System.out.println("do you want contine----");
	 y=r.next();
	}
	
	while (y.equals("y")); 
	
	
	}
}
