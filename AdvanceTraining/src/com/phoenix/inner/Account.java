package com.phoenix.inner;

public class Account {

	private int accNo;
	private String ownerName;
	private float balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	//parameterized constructor
	public Account(int accNo, String ownerName, float balance) {
		super();
		this.accNo = accNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", ownerName=" + ownerName + ", balance=" + balance + "]";
	}
	
	private void data() {
		System.out.println("Account No: "+accNo);
		System.out.println("Owner Name: "+ownerName );
		System.out.println("Balance: "+balance);
	}
	
	//inner class
	public class Locker{
		private int lockerId;
		private String label;
		
		public Locker() {
			
		}

		//parameterized constructor
		public Locker(int lockerId, String type) {
			super();
			this.lockerId = lockerId;
			this.label = type;
		}
		//toString
		@Override
		public String toString() {
			return "Locker [lockerId=" + lockerId + ", label=" + label + "]";
		}

		public void unlock()
		{
			data();
			System.out.println("Locker unlocked");
		}
		
		public void keepThings()
		{
			System.out.println("Things Kept!");
			
		}
		
		public void lock()
		{
			System.out.println("Locker locked");
		}
	}
	
}
