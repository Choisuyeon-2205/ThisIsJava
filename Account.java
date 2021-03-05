package com.kosta.day07;

/**
 * final class: 상속불가
 * final field: 수정불가
 * final method: 재정의(오버라이딩)불가
 * 
 * @author KOSTA
 *
 */
public class Account extends Object {
	
	//1.field
	private String accNo;
	private String ownerName;
	private int balance;
	
	//2.default생성자는 제공
	public Account() {
		
		
	}
	
	public Account(String accNo, String ownerName, int balance) {
		super(); //부모가 먼저 생성된다.
		this.accNo = accNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	//3.method
	public void deposit(int amount) {
		balance+=amount;
		System.out.println(amount+"가 입금되었습니다.");
	}
	
	protected int withdraw(int amount) {
		if(balance<amount) {
			System.out.println("잔액이 부족합니다.");
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
