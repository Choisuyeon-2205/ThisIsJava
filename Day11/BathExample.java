package com.kosta.day11;

public class BathExample {

	public static void main(String[] args) {
		BathRoom room= new BathRoom();
		BathThread t1= new BathThread(room, "±è¾¾");
		BathThread t2= new BathThread(room, "¹Ú¾¾");
		BathThread t3= new BathThread(room, "Á¤¾¾");
		BathThread t4= new BathThread(room, "¾ç¾¾");

		t1.start(); //thread½ÇÇàÀº ¹İµå½Ã start() -> run() ÀÚµ¿½ÇÇà
		t2.start();
		t3.start();
		t4.start();
	}

}
