package DSA;


public class Retern_method {

	
	 public void dod(Double a,int b)
	 {
		double c=a+b ;
		 System.out.println(c);
	 }
	 public static void main(String[] args) {
		
		 Retern_method d= new Retern_method();
		// d.dod(10.6, 20);
		String c= d.evenOrOdd(11);
		 System.out.println(c);
	 }
		 
		 

	
	 
	  public String  evenOrOdd(int a)
	  {
		if(a%2==0) {
			return a+"=Even number";
		}
		else {
			return a+"=odd numb";
		}
		  
	  }
}
