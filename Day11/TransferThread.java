package com.kosta.day11;

public class TransferThread extends Thread{
	
	ShareAccont shareAccount;
	
	public TransferThread(ShareAccont shareAccount) {
		this.shareAccount= shareAccount;
	}

	@Override
	public void run() {
		for(int i=1;i<=12;i++) {
			shareAccount.transfer();
					
		}
	}
	
	
	

}
