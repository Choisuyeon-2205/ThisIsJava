package com.kosta.day11;

public class BathRoom {
	
	boolean first= true;
	
	public synchronized void use(String name) {
		
		
		if(first && name.equals("�ھ�")) {
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
		System.out.println(name+" �����մϴ�.");
		System.out.println(name+" ����մϴ�.");
		System.out.println(name+" �����մϴ�.");
		//}

		notifyAll();
	}

}
