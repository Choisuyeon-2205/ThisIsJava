package com.kosta.day08;

public class RemoteControlExample {

	public static void main(String[] args) {
		//method1(new Television());
		
		//�͸��� interface�� ������ class
		//�Ұ�... interface ��ü�����Ұ� ... new RemoteControl();
//		RemoteControl aa= new RemoteControl() {
//
//			public void turnOn() {
//				System.out.println("�͸� class... turn on");
//				
//			}
//
//			public void turnOff() {
//				System.out.println("�͸� class... turn off");
//				
//			}
//
//			public void setVolume(int volume) {
//				System.out.println("�͸� class... setVolume"+volume);
//				
//			}
//			
//		};
//		
//		method1(aa);
		
		method3();
	}

	private static void method4(RemoteControl a) {
		if(a instanceof Searchable)
			((SmartTelevision)a).search("http://www.daum.net");
		a.setMute(false);
		a.setVolume(10);
		a.turnOn();
		a.turnOff();
		System.out.println("=============================");
		
	}

	private static void method3() {
		SmartTelevision a= new SmartTelevision();
		RemoteControl a2= new SmartTelevision();
		RemoteControl a3= new Television();
		
		method4(a);
		method4(a2);
		method4(a3);
		
	}

	private static void method1(RemoteControl remote) {
		remote.turnOn();
		remote.setVolume(20);
		remote.setMute(true);
		remote.setMute(false);
		remote.turnOff();
		
		RemoteControl.changeBattery();
		
	}

}
