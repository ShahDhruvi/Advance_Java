package demo;

import java.util.Scanner;

public class Fibonacci {
	public static void fibo(int terms)
	{
		int a=0,b=1,c;
		System.out.print(a+" "+b);
		for(int i=2;i<terms;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of terms: ");
		int n = sc.nextInt();
		fibo(n);
		sc.close();
	}
}
