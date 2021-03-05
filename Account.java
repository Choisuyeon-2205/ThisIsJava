package com.kosta.day07;

/**
 * final class: ��ӺҰ�
 * final field: �����Ұ�
 * final method: ������(�������̵�)�Ұ�
 * 
 * @author KOSTA
 *
 */
public class Account extends Object {
	
	//1.field
	private String accNo;
	private String ownerName;
	private int balance;
	
	//2.default�����ڴ� ����
	public Account() {
		
		
	}
	
	public Account(String accNo, String ownerName, int balance) {
		super(); //�θ� ���� �����ȴ�.
		this.accNo = accNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	//3.method
	public void deposit(int amount) {
		balance+=amount;
		System.out.println(amount+"�� �ԱݵǾ����ϴ�.");
	}
	
	protected int withdraw(int amount) {
		if(balance<amount) {
			System.out.println("�ܾ��� �����մϴ�.");
			return 0;
		}
		balance-=amount;
		return amount;
	}
	
	
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", ownerName=" + ownerName + ", balance=" + balance + "]";
	}
	
	

}
