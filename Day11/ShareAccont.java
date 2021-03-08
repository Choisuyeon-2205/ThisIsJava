package com.kosta.day11;

public class ShareAccont {
	Account lee;
	Account sung;
	
	public ShareAccont(Account lee, Account sung) {
		this.lee = lee;
		this.sung = sung;
	}
	
	//이체하기(lee->sung)
	public synchronized void transfer() {
		int amount = lee.withdraw(100); //출금
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sung.deposit(amount); //입금
		System.out.println(amount+" --> 이체(lee->sung)");
	}
	
	//잔액얻기
	public int getTotal() {
		synchronized (this) {
			return lee.balance + sung.balance;	
		}
	}
	
	
}
