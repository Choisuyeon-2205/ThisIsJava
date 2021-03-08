package com.kosta.day11;

public class ShareAccont {
	Account lee;
	Account sung;
	
	public ShareAccont(Account lee, Account sung) {
		this.lee = lee;
		this.sung = sung;
	}
	
	//��ü�ϱ�(lee->sung)
	public synchronized void transfer() {
		int amount = lee.withdraw(100); //���
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sung.deposit(amount); //�Ա�
		System.out.println(amount+" --> ��ü(lee->sung)");
	}
	
	//�ܾ׾��
	public int getTotal() {
		synchronized (this) {
			return lee.balance + sung.balance;	
		}
	}
	
	
}
