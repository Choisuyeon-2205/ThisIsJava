package com.kosta.day12;

public class PrintThread2 extends Thread{
	private boolean stop;

	public PrintThread2() {
		setName(this.getClass().getSimpleName()+"스레드");
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
//		try {
			while(!stop) {
				System.out.println(getName()+"실행 중");
				
				if(Thread.interrupted()) break;
//				sleep(1);
			}
//		}catch(InterruptedException aa) {
//			System.out.println("다른 스레드가 인터럽트걸어서 나의 스레드를 종료");
//
//		}
		System.out.println(getName()+"자원 정리");
		System.out.println(getName()+"실행 종료");
	}
	
	
	
}
