//package com.kosta.day04;
//
////class: object를 만드는 틀이다. template, 설계도, 붕어빵틀
////       변수와 메서드들의 묶음이다.
////object: class를 이용해서 만든 독립된 개체이다.
////instance: object 실체
//
//public class Car {
//	//1.특징, 멤버변수, field
//	public String model;
//	int year;
//	int price;
//	String color;
//	String company="현대자동차";
//	
//	//2.생성자 메서드: 생성시(new) 자동수행된다.
//	//반드시 class이름과 같다.
//	//return을 가질수 없다.
//	//목적: 변수 초기화
//	//다형성: Overloading... 이름같고 매개변수가 다르다.
//	//생성자가 여러개 있다. 하나의 생성자가 다른 생성자를 호출하는 경우
//	public Car(){
//		this("모델 미결정",2000);
//		System.out.println("(default)자동차가 생성됩니다.");
//	}
//	
//	public Car(String model, int price){
//		System.out.println("(매개변수2)자동차가 생성됩니다.");
//		this.model=model;
//		this.price=price;
//	}
//	
//	public Car(String model) {
//		this(model,4000);
//		System.out.println("(매개변수1)자동차가 생성됩니다.");
//		
//	}
//	
//	
//	//3.기능,메서드,함수
//	void go() {
//		System.out.println("자동차가 앞으로간다.");
//	}
//	void back() {
//		System.out.println("자동차가 뒤로간다.");
//	}
//
//}
