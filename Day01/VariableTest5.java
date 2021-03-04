package com.kosta.day01;

public class VariableTest5 {
	public static void test1() {
		System.out.println("test1시작");
		System.out.println("----자동형변환---");
		int i;
		byte b= 127;
		i = b;
		System.out.println("i= "+i);
	}
	
	public static void test2() {
		System.out.println("test2시작");
		System.out.println("----강제형변환---");
		int i= 2147483647;
		byte b;
		b= (byte)i;
		System.out.println("b= "+b);
	}
	
	public static void test3() {
		System.out.println("test3시작");
		System.out.println("----자료형 최댓값 알아보기---");
		int a= 10;
		//Wrapper Class
		//기본형(값 저장, 연산, 비교)
		//int + 기능추가 -> Integer 
		System.out.println(Integer.MAX_VALUE);
		
	}
	
	public static void test4() {
		System.out.println("test4시작");
		System.out.println("----자료형 최댓값 알아보기---");
		int a= 10;
		double b= 3.14;
		
		double result= a+b;
		System.out.println("result= "+result);
		
		int result2= (int)(a+b);
		System.out.println("result2= "+result2);
		
		char c= '가';
		String s1= "자바문자열:";
		System.out.println(s1+20+10);
		System.out.println(s1+(20+10));
		
		int su1=10, su2=20;
		System.out.println("더하기는 "+ (su1+su2)); //연산자 우선순위 주의!!
		System.out.println("빼기는 "+(su1-su2));
		System.out.println("곱하기는 "+ su1*su2);
		System.out.println("나누기는 "+ su1/su2);
		
	}


	public static void main(String[] args) {
		// main함수 정의.. main은 자바가상머신이 자동호출한다.
		// 나머지 함수는 호출안함
		// 개발자가 main에서 호출해야한다.
		System.out.println("main시작");
		//test1(), test2() 호출
		//test1();
		//test2();
		//test3();
		//test4();
		test5();
		System.out.println("main끝");

	}

	private static void test5() {
		// TODO Auto-generated method stub
		byte byteValue= 10;
		float floatValue= 2.5F;
		double doubleValue= 2.5;
		
		System.out.println(Byte.MAX_VALUE);
		//byte result5= byteValue+byteValue;
		float result3= 5+floatValue;
		double result4= 5+doubleValue;
		
		System.out.println(result3);
		System.out.println(result4);
		
		
	}

}
