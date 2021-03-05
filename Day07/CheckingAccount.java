package com.kosta.day07;

public class CheckingAccount extends Account {
	//1.field
	private String cardNo;

	//2.constructor(������) default
	
	public CheckingAccount() {


	}

	public CheckingAccount(String accNo, String ownerName, int balance, String cardNo) {
		//�θ� ���� �����ȴ�.
		super(accNo, ownerName, balance);
		this.cardNo = cardNo;
	}

	//3.method

	public int pay(String cardNo, int amount) {
		if(!cardNo.equals(this.cardNo)) {
			System.out.println("ī���ȣ ����... ���� �Ұ�");
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
		//�θ��� �޼ҵ带 ȣ���Ѵ�.
		String s= super.toString();
		//������ ����
		return s+"\n �ڽ�: CheckingAccount [cardNo=" + cardNo + "]";
	}
	
	
}
