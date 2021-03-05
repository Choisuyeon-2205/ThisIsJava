package com.kosta.day07;

public class AccountTest {

	public static void main(String[] args) {
		method5();

	}
	
	private static void method5() {
		BonusAccount acc= new BonusAccount("122-999", "È«±æµ¿", 1000,50);
		acc.deposit(2000);
		acc.deposit(2000);
		System.out.println(acc.bonusPoint+"Æ÷ÀÎÆ®");
		System.out.println(acc);
	}

	private static void method4() {
		CreditLineAccount acc= new CreditLineAccount("112-1555","È«±æµ¿",1000,500);
		acc.deposit(2000);
		System.out.println(acc.withdraw(4000)+"Ãâ±Ý");
		System.out.println(acc);
	}

	private static void method3() {
		CheckingAccount acc= new CheckingAccount("112-5555","È«±æµ¿",1000,"5555");
		
		System.out.println(acc instanceof Object);
		System.out.println(acc instanceof Account);
		System.out.println(acc instanceof CheckingAccount);
		
		System.out.println(acc);
		acc.deposit(2000);
		System.out.println(acc.withdraw(500));
		System.out.println(acc.pay("5555",200));
		System.out.println(acc);
		
	}

	private static void method2() {
		CheckingAccount acc= new CheckingAccount();
		acc.setAccNo("112-15555");
		acc.setOwnerName("È«±æµ¿");
		acc.setBalance(1000);
		acc.setCardNo("5555");
		
		System.out.println(acc);
		acc.deposit(2000);
		System.out.println(acc.withdraw(500));
		System.out.println(acc.pay("5555",200));
		System.out.println(acc);
		
	}

	private static void method1() {
		Account acc= new Account();
		acc.setAccNo("112-15555");
		acc.setOwnerName("È«±æµ¿");
		acc.setBalance(1000);
		
		System.out.println(acc);
		acc.deposit(2000);
		System.out.println(acc.withdraw(500));
		System.out.println(acc);
	}

}
