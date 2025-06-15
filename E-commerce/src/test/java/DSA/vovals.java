package DSA;

import java.util.Scanner;

public class vovals {

	public static void main(String[] args) {
		int vowels =0 , consonants =0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your String");
		String  name =s.nextLine();
		name= name.trim();
		String vowels1 ="";
		String consonants1 ="";
		for(int a=0;a<name.length();a++)
		{
			char ch =name.charAt(a);
			if(ch=='A'||ch=='E'||ch=='U'||ch=='O'||ch=='I')
			{
				vowels++;
				vowels1 +=ch +" ";
			}
			else {
				consonants++;
				consonants1 +=ch +" ";
			}
		}
		System.out.println("Total vowels = " +vowels);
		System.out.println("Total consonants = " +consonants);
		System.out.println("vowels = "+vowels1);
		System.out.println("consonants = "+ consonants1);

	}
}
