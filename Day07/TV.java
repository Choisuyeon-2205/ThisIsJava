package com.kosta.day07;

//생성 목적이 아니다. (new 안함)
//규격서
//abstract class: 생성자정의 가능
//interface: 생성자 없음, 상수와 추상메소드, 일반메소드 불가
public abstract class TV {

	//1. field
	public static final String CHANEL6= "SBS";
	//2.constructor
	//3. 일바메소드, 추상메소드
	public abstract void powerOn();
	public abstract void powerOff();
	
}
