package demo;

import java.util.*;

public class CharCount {
	public static int countChar(String str, char ch)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s = sc.next();
		System.out.print("Enter Character: ");
		char c = sc.next().charAt(0);
		System.out.println("Character count of " + c + " is " + countChar(s,c));
		sc.close();
	}

}
