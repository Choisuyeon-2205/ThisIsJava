package com.kosta.day07;

public class AccountTest2 {

	public static void main(String[] args) {
		// 계좌 4개 만들기: account, creditLineAccount
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
				System.out.println("카드번호:"+cc.getCardNo());
				int amount = cc.pay("7878", 100);
				System.out.println(amount);
			}else if(acc instanceof BonusAccount) {
				
				BonusAccount bb= (BonusAccount) acc;
				acc.deposit(1000);  //부모를 통해서 접근
				bb.deposit(2000);   //자식의 메소드에 접근
				System.out.println(bb.bonusPoint+"포인트");
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
		//자동형변환==> 부모타입 = 자식 객체
		accounts[0]= new Account("111","kim", 100);
		accounts[1]= new CreditLineAccount("222","park",1000,500);
		accounts[2]= new BonusAccount("333","lee",2000,200);
		accounts[3]= new CheckingAccount("444","jang",3000,"7878");
	}

}
