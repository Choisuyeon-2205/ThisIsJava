package com.kosta.day04;

public class PlayBird {

	public static void main(String[] args) {
		Duck duck= new Duck();
		Sparrow sparrow= new Sparrow();
		
		duck.setName("�в���");
		sparrow.setName("±��");
		
		duck.fly();
		duck.sing();
		System.out.println("������ �̸��� "+duck.name+" �Դϴ�.");
		sparrow.fly();
		sparrow.sing();
		System.out.println("������ �̸��� "+sparrow.name+" �Դϴ�.");
	

	}

}
