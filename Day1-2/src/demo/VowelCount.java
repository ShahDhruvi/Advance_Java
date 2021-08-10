/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 8-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */

package demo;

import java.util.*;

public class VowelCount {

	//count vowel method
	public static int countVowels(String str)
	{
		// converting to lowercase
		String s = str.toLowerCase(); 
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
				count++;
		}
		return count; // total count of vowels
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s = sc.nextLine();
		System.out.println("No of vowels in string " + s + " : " + countVowels(s));
		sc.close();
	}

}
