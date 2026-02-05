package DSA;

import java.util.Scanner;

import org.testng.annotations.Test;



public class demo7 {

	//@Test
	public void name() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Name");
		int name = s.next().charAt(0);
		System.out.println("name =" + name);
	}
@Test
	public void Largest3_number() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1 st number");
		int a = s.nextInt();

		System.out.println("Enter 2nd number");
		int b = s.nextInt();
		System.out.println("Enter 3rdnumber");
		int c=s.nextInt();
		System.out.println("Enter 4rdnumber");
		int d=s.nextInt();
		
		int larange=(a<b&&a<c&&a<d)?a:(b<d&&c<d)?b:(c<d)?c:d;
		System.out.println("largest number is = "+larange);
	}
}
