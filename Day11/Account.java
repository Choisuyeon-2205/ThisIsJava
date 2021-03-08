package com.kosta.day11;

public class Account {
	String accNo; //계좌번호
	String ownerName; //고객이름
	int balance; //잔액
	
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
			System.out.println("잔고부족");
			return 0;
		}
		balance-= amount;
		return amount;
	}
}
