package com.kosta.day07;

public class SamsungTV extends TV {
	
	@Override
	public void powerOn() {
		System.out.println(getClass().getSimpleName()+" ������ �Ҵ�.");

	}


	@Override
	public void powerOff() {
		System.out.println(getClass().getSimpleName()+" ������ ����.");

	}
	
	public void display() {
		System.out.println(getClass().getSimpleName()+" display �߰�����̴�.");
	}

}
