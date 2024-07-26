package DSA;

import org.testng.annotations.Test;
//Two_number Swap using 3rd v
public class Two_number_swap {
	//@Test
	public void Two_number_swap1()
	{
		int a=10,b=20,c;
		c=a;//c=10
		a=b;//a=20
		b=c;//b=10;

		System.out.println("a="+ a);
		System.out.println("b="+ b);
	}

	//Two_number Swap without  3rd veriabal
	@Test
	public void Two_number_swap2()
	{
		int x=50,y=60;
		x=x+y;//x=50+60=110//x=110
		y=x-y;//y=110-60=50//y=50
		x=x-y;//x=110-50;//60
		System.out.println("x="+ x);
		System.out.println("y="+ y);
	}
}
