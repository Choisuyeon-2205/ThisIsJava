package com.kosta.day12;

public class AutoSaveThread extends Thread {

	//»ý¼ºÀÚ
	public AutoSaveThread(String name) {
		setName(name);
	}

	public void save() {
		System.out.println("ÀÚµ¿ ÀúÀåÇÕ´Ï´Ù.");
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
