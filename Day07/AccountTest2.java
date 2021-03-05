package com.kosta.day07;

public class AccountTest2 {

	public static void main(String[] args) {
		// ���� 4�� �����: account, creditLineAccount
		// BonusAccount, checkingAccount
		Account[] accounts= new Account[4];
		makeAccount(accounts);
		printAccount(accounts);
		System.out.println("--------Casting Account------");
		castingAccount(accounts);

	}
	
	private static void castingAccount(Account[] accounts) {
		for(Account acc: accounts) {
			if(acc instanceof CheckingAccount) {
				CheckingAccount cc= (CheckingAccount)acc;
				System.out.println("ī���ȣ:"+cc.getCardNo());
				int amount = cc.pay("7878", 100);
				System.out.println(amount);
			}else if(acc instanceof BonusAccount) {
				
				BonusAccount bb= (BonusAccount) acc;
				acc.deposit(1000);  //�θ� ���ؼ� ����
				bb.deposit(2000);   //�ڽ��� �޼ҵ忡 ����
				System.out.println(bb.bonusPoint+"����Ʈ");
			}
		}
		
	}

	private static void printAccount(Account[] accounts) {
		for(Account acc: accounts) {
			System.out.println(acc);
			System.out.println("-----------------------");
			
		}
		
	}

	private static void makeAccount(Account[] accounts) {
		//�ڵ�����ȯ==> �θ�Ÿ�� = �ڽ� ��ü
		accounts[0]= new Account("111","kim", 100);
		accounts[1]= new CreditLineAccount("222","park",1000,500);
		accounts[2]= new BonusAccount("333","lee",2000,200);
		accounts[3]= new CheckingAccount("444","jang",3000,"7878");
	}

}
