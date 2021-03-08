package com.kosta.day11;

public class Account {
	String accNo; //°èÁÂ¹øÈ£
	String ownerName; //°í°´ÀÌ¸§
	int balance; //ÀÜ¾×
	
	public Account(String accNo, String ownerName, int balance) {
		super();
		this.accNo = accNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public void deposit(int amount) {
		balance+=amount;
	}
	
	public int withdraw(int amount) {
		if(balance < amount) {
			System.out.println("ÀÜ°íºÎÁ·");
			return 0;
		}
		balance-= amount;
		return amount;
	}
}
