package com.kosta.day11;

public class ProducerThread extends Thread{
	private DataBox dataBox;
	String[] message;

	public ProducerThread(DataBox dataBox, String[] message) {
		this.dataBox = dataBox;
		this.message= message;
	}

	@Override
	public void run() {
		for(int i=0; i<message.length; i++) {
			dataBox.setData(message[i]);
		}
	}
	
	

}
