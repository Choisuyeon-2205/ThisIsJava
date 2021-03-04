package com.kosta.day04;

//설계도 ....object들의 공통된 특성, 행위
public class Student {
	//1. 멤버변수(field)
	String name;
	String no;
	String major;
	int age;
	//2. 생성자 메서드... 생성시 자동호출 ... 초기화 목적
	//정의하지않으면 default생성자가 제공된다.
	//정의하면 default 생성자가 없어진다.(사용불가)
	
	Student(){
		//default생성자: argument없음
		System.out.println("----------------");
		System.out.println("학생생성");
	}
	
	Student(String name, String major){
		//생성자가 다른 모양의 생성자를 호출
//		System.out.println("----------------");
//		System.out.println("학생생성");
//		this.name= name;
//		this.major=major;
		this(name,major,"번호모름",20);
	}
	
	Student(String name, int age){
		//생성자가 다른 모양의 생성자를 호출
		this(name,null,null,age);
	}
	
	
	Student(String name, String major, String no, int age){
		System.out.println("----------------");
		System.out.println("학생생성");
		this.name= name;
		this.major=major;
		this.no=no;
		this.age=age;
	}
	
	//3. 메서드(기능)
	void study() {
		System.out.println(name+"학생이 공부한다.");
		//return; 함수 종료후 자동으로 return 된다.
	}
	String getMajor() {
		return name+"학생의 전공은 "+major;
	}
	int getAge() {
		return age;
	}
}
