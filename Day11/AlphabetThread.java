package com.kosta.day11;

//�ٸ� class�� ��ӹް� ���� �ʾƼ� thread ����� �����ϴ�.
//run�޼ҵ带 �����ؾ� ��Ƽ������� ����� �� �ִ�.
public class AlphabetThread extends Thread{

	@Override
	public void run() {
		for(char c='A'; c<='Z'; c++) {
			System.out.print(getName()+"->"+c);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //0.5�� ���
		}
		System.out.println();
	}
	
	
}
