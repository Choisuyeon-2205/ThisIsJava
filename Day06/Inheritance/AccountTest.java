package com.kosta.day06.inheritance;

public class AccountTest {

	public static void main(String[] args) {
		method2();

	}
	
	private static void method2() {
		CheckingAccount account= new CheckingAccount("112-1888", "kim", 1000,"7878");
		account.deposit(2000);
		System.out.println(account.withdraw(5000)+"출금");
		System.out.println(account);
		
		System.out.println(account.pay("78789", 500)+"출금");
		System.out.println(account);
		
	}

	private static void method1() {
		Account account= new Account("112-1888", "kim", 1000);
		account.deposit(2000);
		System.out.println(account.withdraw(5000)+"출금");
		
		System.out.println(account);
	}

}
