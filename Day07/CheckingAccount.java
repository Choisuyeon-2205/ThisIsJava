package com.kosta.day07;

public class CheckingAccount extends Account {
	//1.field
	private String cardNo;

	//2.constructor(생성자) default
	
	public CheckingAccount() {


	}

	public CheckingAccount(String accNo, String ownerName, int balance, String cardNo) {
		//부모가 먼저 생성된다.
		super(accNo, ownerName, balance);
		this.cardNo = cardNo;
	}

	//3.method

	public int pay(String cardNo, int amount) {
		if(!cardNo.equals(this.cardNo)) {
			System.out.println("카드번호 오류... 지불 불가");
			return 0;
		}
		
		return withdraw(amount);
		
	}
	

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	@Override
	public String toString() {
		//부모의 메소드를 호출한다.
		String s= super.toString();
		//재정의 로직
		return s+"\n 자식: CheckingAccount [cardNo=" + cardNo + "]";
	}
	
	
}
