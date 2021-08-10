package demo;

import java.util.*;

public class MultiplicationTable {
	public static void mulTable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n + " * " + i + " = " + (n*i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner sc = new Scanner(System.in);
		    System.out.print("Enter Number: ");
		    int n = sc.nextInt();
			mulTable(n);
			sc.close();
	}

}
