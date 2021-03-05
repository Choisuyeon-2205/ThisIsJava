package com.kosta.day07;

public class BonusAccount extends Account {

	int bonusPoint;

	public BonusAccount(String accNo, String ownerName, int balance, int bonusPoint) {
		super(accNo, ownerName, balance);
		this.bonusPoint = bonusPoint;
	}

	@Override
	public void deposit(int amount) {
		// TODO Auto-generated method stub
		super.deposit(amount);
		bonusPoint+= amount*0.001; //자동형변환
	}

	@Override
	public String toString() {
		String s= super.toString();
		//String: 고정문자열.. 변경불가 +연산자로 연결가능
		//StringBuilder: 가변문자열.. 변경가능, +연산자 불가 (append사용)
		
		StringBuilder builder = new StringBuilder();
		builder.append(s);
		builder.append("\nBonusAccount [bonusPoint=").append(bonusPoint).append("]");
		return builder.toString();
	}
	
	
	
	
}
