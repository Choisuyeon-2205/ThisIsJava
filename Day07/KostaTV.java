package com.kosta.day07.interfacetest;

//interface�� ������ class
//interface���� �߻�޼ҵ带 �ݵ�� ������ �ǹ��� �մ�.
public class KostaTV implements TV{
	
	public void display() {
		System.out.println("KostaTV�� �߰��� �Լ��̴�.");
	}

	@Override
	public void powerOn() {
		System.out.println(getClass().getSimpleName()+" ������ �Ҵ�.");
		System.out.println(CHANNEL6+" ä���� ����.");
	}

	@Override
	public void powerOff() {
		System.out.println(CHANNEL9+" ä���� �����־���.");
		System.out.println(getClass().getSimpleName()+" ������ ����.");
	}
	
	
	

}
