package com.kosta.day07.interfacetest;

public class TVUser {

	public static void main(String[] args) {
		// TV tv= new TV();  인터페이스는 new가 불가능, 인스턴스화 할수없다.
		TV tv= new KostaTV();
		tv.powerOn();
		tv.powerOff();
		((KostaTV)tv).display();

	}

}
