/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 8-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package assignment2;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Interest Rate: " +Account.getInterestRate());
		
		//invoking default constructor
		Account a1 = new Account();
		a1.setAccNo(1234);
		a1.setOwnerName("abc");
		a1.setBalance(10000.00);
		a1.setDurationYears(2);
				
		//displaying values using getter method
		System.out.println("Account No: "+a1.getAccNo());
		System.out.println("Owner Name: "+a1.getOwnerName());
		System.out.println("Balance: "+a1.getBalance());
		System.out.println("Duration Years: "+a1.getDurationYears());
		//calculating interest
		a1.calculateInterest();
		
		System.out.println();
		
		//creating object using parameterized constructor
		Account a2 = new Account(2256,"xyz",20000.00,5);
		a2.printDetails();
		
		//interest rate set using setter method
		Account.setInterestRate(0.07f);
		//accessing interest rate using getter method
		System.out.println("Current Interest Rate: " +Account.getInterestRate());
		//Calculating interest
		a2.calculateInterest();
	
		System.out.println();
		
		//Count of no of objects created
		System.out.println("Total number of objects Created: "+Account.getCount());
	}
}
