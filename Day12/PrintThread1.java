package com.kosta.day12;

public class PrintThread1 extends Thread{
	private boolean stop;

	public PrintThread1() {
		setName(this.getClass().getSimpleName()+"������");
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {

			while(!stop) {
				System.out.println(getName()+"���� ��");
			}
		
		System.out.println(getName()+"�ڿ� ����");
		System.out.println(getName()+"���� ����");
	}
	
	
	
}
