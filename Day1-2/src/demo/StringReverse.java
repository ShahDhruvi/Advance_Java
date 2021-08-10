package demo;

import java.util.*;

public class StringReverse {

	public static String reverse(String str)
	{
		char a[] = str.toCharArray();
		String rev ="";
		for(int i=a.length-1;i>=0;i--)
		{
			rev+=a[i];
		}
		return rev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String to reverse: ");
		String s = sc.next();
		System.out.println(reverse(s));	
		sc.close();
	}

}
