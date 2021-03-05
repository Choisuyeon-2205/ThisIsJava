package com.kosta.day07;

public class 다형성연습 {

	public static void main(String[] args) {
		Account acc= new Account("112","hong",100);
		CheckingAccount acc2= new CheckingAccount("113","kim",1000,"7878");
		CreditLineAccount acc3= new CreditLineAccount("114","park",2000,500);
		BonusAccount acc4= new BonusAccount("114","park",2000,500);
		accountDisplay(acc);
		accountDisplay(acc2);
		accountDisplay(acc3);
		accountDisplay(acc4);

	}
	
	public static void accountDisplay(Account acc) {
		System.out.println(acc);
		System.out.println("===================");
	}

}
