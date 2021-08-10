/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 8-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package assignment2;

public class Account {
	
	//instance variable or non-static variables
	private int accNo;
	private String ownerName;
	private double balance;
	private float durationYears;
	
	//static variables or  class variables
	private static float interestRate;
	private static int count;
	
	//static init block
	static {
		interestRate = 0.05f;
		System.out.println("Static init Block");
	}
	
	//Default constructor
	Account()
	{
		System.out.println("Default Constructor!");
		count++;
	}
	
	//parameterized constructor
	Account(int accNo, String ownerName, double balance, float years)
	{
		this.accNo = accNo;
		this.ownerName = ownerName;
		this.balance = balance;
		this.durationYears = years;	
		count++;
		System.out.println("Parameterized Constructor!");
	}
	
	//Setter and getter Method for AccNo
	public void setAccNo(int a)
	{
		accNo = a;
	}
	
	public int getAccNo()
	{
		return accNo;
	}
	
	//Setter and getter Method for OwnerName
	public void setOwnerName(String o)
	{
		ownerName = o;
	}
	
	public String getOwnerName()
	{
		return ownerName;
	}

	//Setter and getter Method for Balance
	public void setBalance(double b)
	{
		balance = b;
	}
	
	public double getBalance()
	{
		return balance;
	}

	//Setter and getter Method for Duration Year
	public void setDurationYears(int y)
	{
		durationYears = y;
	}
	
	public float getDurationYears()
	{
		return durationYears;
	}
	
	//Setter and getter satic Method for interest rate 
	public static void setInterestRate(float i)
	{
		interestRate = i;
	}
	
	public static float getInterestRate()
	{
		return interestRate;
	}

	// get count method
	public static int getCount()
	{
		return count;
	}
	
	//calculate interest
	public void calculateInterest()
	{
		double interest = (balance*interestRate*durationYears);
		System.out.println("Simple Interest is : " +interest);
	}
	
	//print details method to print all details of account
	public void printDetails()
	{
		System.out.println("Account No: " +accNo);
		System.out.println("Owner Name: " +ownerName);
		System.out.println("Balance: "+balance);
		System.out.println("Duration Year: " +durationYears);
		
	}
}
