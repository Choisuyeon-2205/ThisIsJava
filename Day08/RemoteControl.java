package com.kosta.day08;

public interface RemoteControl {
	//1. 상수
	public int MAX_VAULE= 10;
	int MIN_VAULE= 0;
	
	//2. 추상 메소드... 정의만 있고 구현이 없다.
	public abstract void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//3.default method... 구현 class들이 공통적으로 사용하는 기능 구현
	default void setMute(boolean mute) {
		if(mute)
			System.out.println("무음처리합니다.");
		else
			System.out.println("무음해제합니다.");
	}
	
	//4. static method ... interface method로 구현class 메소드가 아니다. (리모콘 건전지라 생각)
	static void changeBattery() {
		System.out.println("건전지를 교환한다.");
	}

}
