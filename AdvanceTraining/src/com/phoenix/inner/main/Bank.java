package com.phoenix.inner.main;

import com.phoenix.inner.Account;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account ac = new Account(1001,"Dhruvi",25000.00f);
		System.out.println(ac);
		Account.Locker l = ac.new Locker(101,"xyz");
		System.out.println(l);
		//l.data();
		l.unlock();
		l.keepThings();
		l.lock();
	}

}
