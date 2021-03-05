package com.kosta.day08;

public class InnerClassTest {

	public static void main(String[] args) {
		
		method3();
	
	}

	private static void method3() {
		OuterClass outter= new OuterClass();
		outter.test("���꿪","KOSTA");
		
		
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
		//1.instance Inner class ����ϱ�
		//��ü������������
		OuterClass.InnerClass inner;
		//��ü����
		inner= new OuterClass().new InnerClass();
		//��ü���
		System.out.println(inner.a);
		inner.test();
		
	}

}
