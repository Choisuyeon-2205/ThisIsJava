package com.kosta.day07;

public class TVUser {

	public static void main(String[] args) {
		method2();

	}
	
	private static void method3() {
		TV tv= new SamsungTV();
		tv.powerOn();
		tv.powerOff();
		
		((SamsungTV)tv).display();
		
	}
	
	private static void method2() {
		LgTV tv= new LgTV();
		tv.powerOn();
		tv.powerOff();
		
	}

	private static void method1() {
		SamsungTV tv= new SamsungTV();
		tv.powerOn();
		tv.powerOff();
	}

}
