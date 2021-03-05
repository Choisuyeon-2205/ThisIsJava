package com.kosta.day06.inheritance;

public class CheckingAccount extends Account{
	
	String cardNo;
	
	CheckingAccount(String accNo, String ownerName, int balance, String cardNo){
		//1)�θ��� default �����ڸ� �����Ѵ�.
		//super()
		//2)��������� �θ��� �����ڸ� ȣ���Ѵ�.
		super(accNo,ownerName,balance);
		this.cardNo= cardNo;
	}
	
	public int pay(String cardNO, int amount) {
		if(this.cardNo.equals(cardNO)) {
			return withdraw(amount);
		}else {
			System.out.println("ī���ȣ ����");
			return 0;
		}
	}
}
