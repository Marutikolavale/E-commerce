package DSA;

public class demo6 {
public static void main(String[] args) {
	demo6 n= new demo6();
	int f=n.largest_number(40, 20);
	
	System.out.println(f);
}
	
	
	 public int largest_number(int a, int b)
	 {
		 if(a>b)
		 {
			 return a; 
		 }
		 else {
		 return b;
		 }
	 }
}
