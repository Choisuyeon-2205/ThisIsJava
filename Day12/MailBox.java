package com.kosta.day12;

public class MailBox {
	private String message;

	public synchronized String getMessage() {
		//System.out.println("�޽��� ����: "+ message);
		if(this.message==null) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String returnValue= message;
			message= null;
			notify(); //wait���¸� �����
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
		//System.out.println("�޽�������: "+message);
	}
	
	

}
