package com.kosta.day07;

public class CreditLineAccount extends Account {
	int creditLine;

	public CreditLineAccount() {
		
	}

	public CreditLineAccount(String accNo, String ownerName, int balance, int creditLine) {
		//�θ��� �����ڸ� ��������� ȣ���Ѵ�.
		super(accNo, ownerName, balance);
		this.creditLine= creditLine;
	}
	
	//������(override): �θ��� �޼ҵ带 ����
	//�޼ҵ��� ����ΰ� ���ƾ��Ѵ�.
	//(returnType, �޼ҵ� �̸�, parameter)
	//modifier�� ���ų� �� ���ƾ��Ѵ�.
	
	protected int withdraw(int amount) {
		int b= getBalance();
		if(b+creditLine <amount) {   //�ܰ� ���̳ʽ��� �ǵ� ������
			System.out.println("�ܾ��� �����մϴ�.");
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
