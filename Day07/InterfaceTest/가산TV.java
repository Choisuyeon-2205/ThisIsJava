package com.kosta.day07.interfacetest;

//interface를 구현한 class
//interface내의 추상메소드를 반드시 구현할 의무가 잇다.
public class 가산TV implements TV{
	
	public void display() {
		System.out.println("가산TV에 추가된 함수이다.");
	}

	@Override
	public void powerOn() {
		System.out.println(getClass().getSimpleName()+" 전원을 켠다.");
		System.out.println(CHANNEL6+" 채널을 본다.");
	}

	@Override
	public void powerOff() {
		System.out.println(CHANNEL9+" 채널을 보고있었다.");
		System.out.println(getClass().getSimpleName()+" 전원을 끈다.");
	}
	
	
	

}
