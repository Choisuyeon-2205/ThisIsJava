package com.kosta.day11;

//�ٸ� class�� ��ӹް� ������ thread����� �Ұ���
//run�޼ҵ带 �����ؾ� ��Ƽ������� ����� �� �ִ�.
public class AlphabetThread2 extends Object implements Runnable{

	@Override
	public void run() {
		System.out.println("�̸�: "+Thread.currentThread().getName());
		for(char c='a'; c<='z'; c++) {
			System.out.print(c+" ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();
	}
		
}
