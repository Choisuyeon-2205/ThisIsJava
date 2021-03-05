package com.kosta.day08;

public class InnerClassTest {

	public static void main(String[] args) {
		
		method3();
	
	}

	private static void method3() {
		OuterClass outter= new OuterClass();
		outter.test("가산역","KOSTA");
		
		
	}

	private static void method2() {
		//2. static inner class
		System.out.println(OuterClass.StaticInnerClass.grade);
		OuterClass.StaticInnerClass.printGrade();
		
		OuterClass.StaticInnerClass staticClass = new OuterClass.StaticInnerClass();
		
		System.out.println(staticClass.score);
		staticClass.printScore();
		
	}

	private static void method1() {
		//1.instance Inner class 사용하기
		//객체참조변수선언
		OuterClass.InnerClass inner;
		//객체생성
		inner= new OuterClass().new InnerClass();
		//객체사용
		System.out.println(inner.a);
		inner.test();
		
	}

}
