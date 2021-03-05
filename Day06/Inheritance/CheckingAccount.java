package com.kosta.day06.inheritance;

public class CheckingAccount extends Account{
	
	String cardNo;
	
	CheckingAccount(String accNo, String ownerName, int balance, String cardNo){
		//1)부모의 default 생성자를 정의한다.
		//super()
		//2)명시적으로 부모의 생성자를 호출한다.
		super(accNo,ownerName,balance);
		this.cardNo= cardNo;
	}
	
	public int pay(String cardNO, int amount) {
		if(this.cardNo.equals(cardNO)) {
			return withdraw(amount);
		}else {
			System.out.println("카드번호 오류");
			return 0;
		}
	}
}
