package com.kosta.day06.inheritance;

//자식이 부모를 선택한다.
public class Child extends Parent{
	//자식이 추가한 변수
	int b=20;
	//재정의 
	String a= "자바";
	
	//자식의 생성자
	Child(){
		//super() 자동으로 부모를 생성한다.
	System.out.println("자식의 생성자");	
	}
	
	//overriding 재정의(덮어쓰기)
	@Override
	void method1() {
		System.out.println("재정의된 메소드");
	}
	
	//overloading(이름 같고 매개변수가 다르다.)
		void method1(String s) {
			System.out.println("오버로딩 메소드");
		}
	
	//자식이 추가한 메소드이다.
	void parentPrint() {
		//부모에게 물려받은 변수 사용
		System.out.println("a= "+a);
		//부모에게 물려받은 메소드 사용
		method1();
	}

}
