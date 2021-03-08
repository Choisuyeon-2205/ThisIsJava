package com.kosta.day12;

public class WriterThread implements Runnable{
	private MailBox box;
	String[] messages;
	String myName ="WriterThread";

	public WriterThread(MailBox box, String[] messages) {
		this.box = box;
		this.messages= messages;
		Thread.currentThread().setName(myName);
	}

	@Override
	public void run() {
		for(String s:messages) {
			box.setMessage(s);
			System.out.println(myName+"--->"+s);
			System.out.println("**************");
		}
		
	}
	
	
	

}
