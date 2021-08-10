package demo;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void armstrong(int n)
	{
		
		int temp,count=0,sum=0;
		temp=n;
		while(temp!=0)
		{
			count++;
			temp/=10;
		}
		temp=n;
		while(temp!=0)
		{
			int rem = temp%10;
			int r=1;
			for(int i=1;i<=count;i++)
			{
				r=r*rem;
			}
			sum=sum+r;
			temp/=10;
		}
		if(sum==n)
		{
			System.out.println(n + " is an Armstrong Number");
		}
		else
			System.out.println(n + " is not an Armstrong Number");
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		armstrong(n);
		sc.close();
	}

}
