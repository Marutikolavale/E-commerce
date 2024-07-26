package DSA;

import java.util.Scanner;

import org.testng.annotations.Test;

public class factorial {

	@Test
	 public void factorial_Number()
	 {
		 int fact=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number which you hsve factorial");
		int a=sc.nextInt();
		for (int i=1;i<=a;i++) {
			fact= fact*i;
		}
		System.out.println(fact);
	 }
}
