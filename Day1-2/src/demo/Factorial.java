package demo;

import java.util.*;

public class Factorial {
  public static int fact(int num)
  {
	  if(num>=0)
	  {
		  if(num==0)
			  return 1;
		  return num*fact(num-1);
	  }
	  return 0;
 }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		if(fact(n)>0)
			System.out.println("Factorial of number " + n + " is " + fact(n));
		else
			System.out.println("Invalid input - Enter Positive number");
		sc.close();
	}

}
