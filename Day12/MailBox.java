package com.kosta.day12;

public class MailBox {
	private String message;

	public synchronized String getMessage() {
		//System.out.println("메시지 읽음: "+ message);
		if(this.message==null) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String returnValue= message;
			message= null;
			notify(); //wait상태를 깨우기
			return returnValue;
		}
		return message;
	}

	public synchronized void setMessage(String message) {
		if(this.message!=null) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.message = message;
		notify();
		//System.out.println("메시지변경: "+message);
	}
	
	

}
