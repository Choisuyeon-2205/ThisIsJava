package com.kosta.day07.interfacetest;

//interface : 규격서 
public interface TV {
	//1.상수(변경불가)...public static final 생략가능
	public static final String CHANNEL6= "SBS";
	String CHANNEL9= "KBS"; 
	
	//2.추상메소드... public abstract 생략가능
	public abstract void powerOn();
	void powerOff();
	//3.default 메소드
	//4.static 메소드

}
