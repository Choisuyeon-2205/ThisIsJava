package com.kosta.day11;

//다른 class를 상속받고 있지 않아서 thread 상속이 가능하다.
//run메소드를 구현해야 멀티스레드로 사용할 수 있다.
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
			} //0.5초 대기
		}
		System.out.println();
	}
	
	
}
