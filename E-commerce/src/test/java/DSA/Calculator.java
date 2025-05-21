package DSA;

import java.util.Scanner;

import org.testng.annotations.Test;

import com.tigervnc.rfb.screenTypes;

public class Calculator {
	@Test
	public void calculator_userInput()
	{
		String t;
		do {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter 1st Number");
			int a =sc.nextInt();
			System.out.println("Enter 2st Number");
			int b =sc.nextInt();
			System.out.println("Enter Action you cholce(+,-,*,%)");
			String action= sc.next();
			int res;
			switch (action) {
			case "+":
				res=a+b;
				System.out.println("addtion="+res);
				break;
			case "-":
				res=a-b;
				System.out.println("sub="+res);
				break;
			case "*":
				res=a*b;
				System.out.println("multi="+res);
				break;
			case "/":
				res=a/b;
				System.out.println("div="+res);
				break;

			default:

				System.out.println("Enter Correct value");
				break;
			}

			System.out.print("Continus press Y not press N");
			t=sc.next();
		}
		while(t.equalsIgnoreCase("Y")||t.equalsIgnoreCase("y"));

	}
}
