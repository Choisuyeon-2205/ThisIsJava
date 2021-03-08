package com.kosta.day11;

public class SynchronizedTest {

	public static void main(String[] args) {
		Account sung= new Account("112","������",1000);
		Account lee= new Account("223","�̸���",2000);
		
		ShareAccont sa= new ShareAccont(lee,sung);
		Thread t1= new TransferThread(sa);
		Thread t2= new PrintThread(sa);
		t1.start();
		t2.start();

	}

}
