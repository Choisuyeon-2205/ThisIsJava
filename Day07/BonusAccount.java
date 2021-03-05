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
		bonusPoint+= amount*0.001; //�ڵ�����ȯ
	}

	@Override
	public String toString() {
		String s= super.toString();
		//String: �������ڿ�.. ����Ұ� +�����ڷ� ���ᰡ��
		//StringBuilder: �������ڿ�.. ���氡��, +������ �Ұ� (append���)
		
		StringBuilder builder = new StringBuilder();
		builder.append(s);
		builder.append("\nBonusAccount [bonusPoint=").append(bonusPoint).append("]");
		return builder.toString();
	}
	
	
	
	
}
