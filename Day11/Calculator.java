package com.kosta.day11;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	//����ȭ �޼ҵ�.. �ϳ��� �����尡 �����ϴ� ���ȿ� �ٸ� ������� ���� �� ����.
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //2�� ���
		System.out.println(Thread.currentThread().getName()+"=>"+this.memory);
	}
	
}
