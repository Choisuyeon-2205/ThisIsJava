package com.kosta.day11;

public class ThreadA extends Thread{
	public boolean stop= false; //���� �÷���
	public boolean work= true; //�۾����࿩�� �÷���
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println(getClass().getSimpleName()+" �۾�����");
			}else {
				Thread.yield();
				
				try {
					sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println(getClass().getSimpleName()+" �۾� ����");
	}

}
