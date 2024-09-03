package DSA;

import org.testng.annotations.Test;

public class StarPatter {
	@Test
	public void Stat3()
	{

		for(int i =1;i<=5;i++)
		{


			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
