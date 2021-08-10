package demo;

import java.util.*;

public class PrimeNumberCount {
	
	public static void primeCount(int count)
	{
	    int c=0,i=2;
	    while(c!=count)
	    {
	       int flag=1;
	       for(int j=2;j<=i/2;j++)
	       {
	           if(i%j==0)
	           {
	               flag=0;
	               break;
	           }
	       }
	       if(flag==1)
	       {
	           System.out.print(i + " ");
	           c++;
	       }
	       i++;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Count");
		int n = sc.nextInt();
		System.out.print("First " + n + " prime numbers are :");
		primeCount(n);
		sc.close();
	}

}
