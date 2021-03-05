package com.kosta.day06.lab;

public class AccountView {
	public void print(AccountDTO account) {
		System.out.println("===�������� ���===");
		System.out.println(account.toString());
	}
	
	public static void print(AccountDTO[] accounts) {
		System.out.println("===�������� ������ ���===");
		for(AccountDTO acc : accounts) {
			if(acc==null) break;
			System.out.println(acc.toString());
		}
	}
	
	public static void print(String message) {
		System.out.println(message);
		
		}
	}
	
	
