package DSA;

import java.util.Scanner;

import org.testng.annotations.Test;

import jnr.ffi.Struct.int16_t;

public class demo {

	// @Test
	public void Divsion() {
		double n = 0.0;
		String reS = (n > 0) ? "pos" : (n < 0) ? "nagetive" : "zero";
		System.out.println(reS);

	}

	// @Test
	public void leafYear() {
		int year = 2020;
		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println(year + "  leaf year");
		} else {
			System.out.println(year + " not a leaf year");
		}

	}

	//@Test
	public void inputuser() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter your name");
		String name = s.next();
		System.out.println("enter your age");
		int age = s.nextInt();
		System.out.println("enter your Gender");
		char Gender = s.next().charAt(0);
		System.out.println("enter your Phone Number");
		long phone = s.nextLong();
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("Gender : " + Gender);
		System.out.println("phone : " + phone);

	}
	@Test
	public void calculter()
	{
		String choose;
		do {
			Scanner s= new Scanner(System.in);
			System.out.println("Enter first number");
			int no1=  s.nextInt();
			System.out.println("Enter second number");
			int no2=  s.nextInt();

			System.out.println("Enter which type operation you have perfrom");
			String operation=  s.next();
			int c;
			switch (operation) {
			case "+":
			{
				c=no1+no2;
				System.out.println(c);
				break;
			}
			case "-":
			{
				c=no1-no2;
				System.out.println(c);
				break;
			}
			case "*":
			{
				c=no1*no2;
				System.out.println(c);
				break;
			}
			case "/":
			{
				c=no1/no2;
				System.out.println(c);
				break;
			}

			default:
				System.out.println("Enter correct values");
				break;
			}
			System.out.println("do you want to be a c contine......  if yes press Y no press Nay button");
			choose= s.next();

		} 

		while (choose.equals("y")||choose.equals("Y"));

	}
}