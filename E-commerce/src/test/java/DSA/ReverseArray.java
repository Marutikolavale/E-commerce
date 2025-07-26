package DSA;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

import org.testng.annotations.Test;

public class ReverseArray {
	@Test
	public void revar()
	{
 int a[]= {10,20,30,40,50};
		 
 for(int b=a.length-1;b>=0;b--)
 {
	System.out.printf(a[b]+" "); 
 }
 Collections.reverse(Arrays.asList(a));
for (int i :a) {
	System.out.println(i+" ");
}
}
	
	
}

