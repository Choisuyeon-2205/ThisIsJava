package com.kosta.day11;

public class Account {
	String accNo; //���¹�ȣ
	String ownerName; //���̸�
	int balance; //�ܾ�
	
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
			System.out.println("�ܰ����");
			return 0;
		}
		balance-= amount;
		return amount;
	}
}
