package com.kosta.day11;

public class BeepPrintExample {

	public static void main(String[] args) {
		
		BeepThread t1= new BeepThread("�ེ����");
		t1.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+"...��");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
