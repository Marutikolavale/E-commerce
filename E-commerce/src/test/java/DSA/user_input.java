package DSA;

import java.util.Scanner;

import org.testng.annotations.Test;

public class user_input {
@Test
	public void Getting_User_Input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String  name=sc.next();
		System.out.println("enter your age");
		int age=sc.nextInt();
		System.out.println("Enter your Number");
		long number=sc.nextLong();
		System.out.println("Enter your Gendar");
		char gendar= sc.next().charAt(0);
		System.out.println(name);
		System.out.println(age);
		System.out.println(number);
		System.out.println(gendar);
		
	}
}
