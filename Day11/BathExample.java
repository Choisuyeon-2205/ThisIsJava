package com.kosta.day11;

public class BathExample {

	public static void main(String[] args) {
		BathRoom room= new BathRoom();
		BathThread t1= new BathThread(room, "�达");
		BathThread t2= new BathThread(room, "�ھ�");
		BathThread t3= new BathThread(room, "����");
		BathThread t4= new BathThread(room, "�羾");

		t1.start(); //thread������ �ݵ�� start() -> run() �ڵ�����
		t2.start();
		t3.start();
		t4.start();
	}

}
