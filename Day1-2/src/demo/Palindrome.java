/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 8-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
*/
package demo;

import java.util.*;

public class Palindrome {
	public static boolean checkPalindrome(String s)
	{
		char a[] = s.toCharArray();
		String rev ="";
		//Reversing the string
		for(int i=a.length-1;i>=0;i--)
		{
			rev+=a[i];
		}
		// checking if revrse string and original string equals
		if(rev.equals(s))
			return true;
		else 
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to check palindrome: ");
		String str = sc.nextLine();
		if(checkPalindrome(str))
			System.out.println("String "+ str + " is Palindrome");
		else
			System.out.println("String "+ str + " is not Palindrome");
		sc.close();
	}

}
