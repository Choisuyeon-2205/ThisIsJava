package com.kosta.day11;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	//동기화 메소드.. 하나의 스레드가 점유하는 동안에 다른 스레드는 들어올 수 없다.
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //2초 대기
		System.out.println(Thread.currentThread().getName()+"=>"+this.memory);
	}
	
}
