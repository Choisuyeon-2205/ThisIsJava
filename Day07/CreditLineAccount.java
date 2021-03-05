package com.kosta.day07;

public class CreditLineAccount extends Account {
	int creditLine;

	public CreditLineAccount() {
		
	}

	public CreditLineAccount(String accNo, String ownerName, int balance, int creditLine) {
		//부모의 생성자를 명시적으로 호출한다.
		super(accNo, ownerName, balance);
		this.creditLine= creditLine;
	}
	
	//재정의(override): 부모의 메소드를 수정
	//메소드의 선언부가 같아야한다.
	//(returnType, 메소드 이름, parameter)
	//modifier는 같거나 더 같아야한다.
	
	protected int withdraw(int amount) {
		int b= getBalance();
		if(b+creditLine <amount) {   //잔고가 마이너스가 되도 괜찮음
			System.out.println("잔액이 부족합니다.");
			return 0;
		}
		setBalance(b-=amount);
		return amount;
	}
	

	public int getCreditLine() {
		return creditLine;
	}

	public void setCreditLine(int creditLine) {
		this.creditLine = creditLine;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CreditLineAccount [creditLine=").append(creditLine).append("]");
		return builder.toString();
	}

	

	
	
	
	
	
	

}
