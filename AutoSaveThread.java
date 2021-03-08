package com.kosta.day12;

public class AutoSaveThread extends Thread {

	//생성자
	public AutoSaveThread(String name) {
		setName(name);
	}

	public void save() {
		System.out.println("자동 저장합니다.");
	}
	
	public void run() {
		try {
			while(true) {
				save();
				sleep(1000);
			}
		}catch(InterruptedException e) {
				System.out.println("InterruptedException...");
		}
	}
	
	
}
