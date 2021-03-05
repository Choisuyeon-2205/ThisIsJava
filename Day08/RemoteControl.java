package com.kosta.day08;

public interface RemoteControl {
	//1. ���
	public int MAX_VAULE= 10;
	int MIN_VAULE= 0;
	
	//2. �߻� �޼ҵ�... ���Ǹ� �ְ� ������ ����.
	public abstract void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//3.default method... ���� class���� ���������� ����ϴ� ��� ����
	default void setMute(boolean mute) {
		if(mute)
			System.out.println("����ó���մϴ�.");
		else
			System.out.println("���������մϴ�.");
	}
	
	//4. static method ... interface method�� ����class �޼ҵ尡 �ƴϴ�. (������ �������� ����)
	static void changeBattery() {
		System.out.println("�������� ��ȯ�Ѵ�.");
	}

}
