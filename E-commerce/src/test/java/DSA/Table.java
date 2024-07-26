package DSA;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Table {
	@Test
	public void Table2()
	{
		String decision;
		do
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Number which have Table");
			int a=sc.nextInt();
			for(int i=1;i<=10;i++)
			{
				System.out.println(a+"*"+i+"="+a*i);
			}

			System.out.println(" your  continues  press Y No press N");
			decision=sc.next();
		}
		while(decision.equalsIgnoreCase("Y"));
	}
}
