package com.kosta.day12;

public class PrintThread2 extends Thread{
	private boolean stop;

	public PrintThread2() {
		setName(this.getClass().getSimpleName()+"������");
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
//		try {
			while(!stop) {
				System.out.println(getName()+"���� ��");
				
				if(Thread.interrupted()) break;
//				sleep(1);
			}
//		}catch(InterruptedException aa) {
//			System.out.println("�ٸ� �����尡 ���ͷ�Ʈ�ɾ ���� �����带 ����");
//
//		}
		System.out.println(getName()+"�ڿ� ����");
		System.out.println(getName()+"���� ����");
	}
	
	
	
}
