package DSA;

import java.util.Scanner;



public class Greatest_Common_Divisor{

	public static void main(String[] args) {
		// print 1 to 100 evev number;
		String y;
		do {
		
		int a,b,c=1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a  1st number");
		a=s.nextInt();
		System.out.println("Enter a  2st number");
		b=s.nextInt();
		 for(int i=1;i<=a&&i<=b;i++) 
		 {
			if(a%i==0 && b%i==0)
			{
				c=i;
			}
		 }
		 System.out.println(c);
		 System.out.println("do you want to continue press Y otherwise press N");
		 y=s.next();
		}
		
		 while (y.equals("y"));
	}
}
