package com.kosta.day07.interfacetest;

public class TVUser {

	public static void main(String[] args) {
		// TV tv= new TV();  �������̽��� new�� �Ұ���, �ν��Ͻ�ȭ �Ҽ�����.
		TV tv= new KostaTV();
		tv.powerOn();
		tv.powerOff();
		((KostaTV)tv).display();

	}

}
