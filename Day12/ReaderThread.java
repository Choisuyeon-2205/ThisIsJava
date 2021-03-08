package com.kosta.day12;

public class ReaderThread extends Thread{
	private MailBox box;
	int count;

	public ReaderThread(MailBox box, int count) {
		setName("ReaderThread¿”"); //Thread.currentThread().setName("aaa");
		this.box = box;
		this.count= count;
	}

	@Override
	public void run() {
		for(int i=0;i<count;i++) {
			String name= getName();
			String m= box.getMessage();
			System.out.println(name+"--->"+m);
			System.out.println("-----------");
		}
	}
	
	
	
	

}
