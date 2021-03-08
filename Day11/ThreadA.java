package com.kosta.day11;

public class ThreadA extends Thread{
	public boolean stop= false; //종료 플래그
	public boolean work= true; //작업진행여부 플래그
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println(getClass().getSimpleName()+" 작업내용");
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
		System.out.println(getClass().getSimpleName()+" 작업 종료");
	}

}
