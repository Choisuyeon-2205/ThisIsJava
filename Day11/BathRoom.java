package com.kosta.day11;

public class BathRoom {
	
	boolean first= true;
	
	public synchronized void use(String name) {
		
		
		if(first && name.equals("박씨")) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		first= false;
		
		//synchronized(this) {
		System.out.println("===============");
		System.out.println(name+" 입장합니다.");
		System.out.println(name+" 사용합니다.");
		System.out.println(name+" 퇴장합니다.");
		//}

		notifyAll();
	}

}
