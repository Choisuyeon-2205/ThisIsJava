package com.kosta.day11;

public class WaitNotifyExample {

	public static void main(String[] args) {
		DataBox dataBox= new DataBox();
		String[] message= {"ÇÏÀÌ~","È­¿äÀÏ","°ğÅğ±Ù"};
		
		ProducerThread p= new ProducerThread(dataBox, message);
		ConsumerThread c= new ConsumerThread(dataBox, message.length);
		
		p.start();
		c.start();

	}

}
