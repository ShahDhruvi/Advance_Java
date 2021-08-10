package demo;

import java.util.*;

public class PrimeNum {
	public static String prime(int num)
	{
		int flag=1;
		String s1 = "Not a Prime Number";
		String s2 = "a Prime Number";
		if(num==0||num==1)
			return s1;
		else
			{
			for(int i=2;i<num/2;i++)
			{
				if(num%i==0)
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
				return s2;
			else
				return s1;
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n=sc.nextInt();
		System.out.println(n + " is " +prime(n));
		sc.close();
	}

}
