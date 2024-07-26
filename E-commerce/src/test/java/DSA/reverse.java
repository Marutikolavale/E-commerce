package DSA;

import java.util.Scanner;

import org.testng.annotations.Test;

public class reverse {
	@Test
	public void reverseNumber()
	{
		int rew=0;int rem; 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter NUmber");
		int a1=sc.nextInt();
				while(a1!=0)
				{
					rem = a1%10;//a=456
					rew =rew*10 + rem;
					a1=a1/10;

				}
		System.out.println(rew);
	}
}
