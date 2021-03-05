package com.kosta.day06.inheritance;

public class Account {
	String accNo;
	String ownerName;
	int balance;


	//	public Account(){
//		
//	}
//	
	public Account(String accNo, String ownerName, int balance) {
		super();
		this.accNo = accNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
deposit(int amount) {
		balance+=amount;
	public void 
	}
	
	public int withdraw(int amount) {
		if(amount>balance) {
			System.out.println("잔액이 부족합니다. 잔액은 "+balance);
			return 0;
		}
		balance-=amount;
		return amount;
	}
	
	
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", ownerName=" + ownerName + ", balance=" + balance + "]";
	}

}
