package com.kosta.day01;

public class OperaterTest {

	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		//method5();
		//method6();
		//method7();
		method8();
	}
	
	private static void method8() {
		// 연습문제8
		double x= 5.0;
		double y= 0.0;
		
		double z= x%y;

		if(Double.isNaN(z))
			System.out.println("0.0으로 나눌 수 없습니다.");
		else {
			double result= z+10;
			System.out.println("결과: "+ result);
		}
		
	}
	
	private static void method7() {
		// 삼항연산자
		int score=95;
		int limit= 80;
		
		String result= score>=limit?"합격":"불합격";
		
		System.out.println(result);
		
		if(score>=limit)
			result= "합격";
		else
			result="불합격";
		
		System.out.println(result);
		
	}

	private static void method6() {
		// OR연산
		int a=10;
		int b=20;
		
		//||: 하나라도 참이면 참이다. 앞의 결과가 TRUE이면 뒤문장은 실행하지 않는다.
		// |: 하나라도 참이면 참이다. 무조건 모든 문장 수행한다.
		boolean result= a>=10 || ++b>=20; 
		//boolean result= a>=10 | ++b>=20; 
		
		System.out.println("result= "+result);
		System.out.println("b= "+b);
	}

	private static void method5() {
		// AND연산
		int a=10;
		int b=20;
		
		//&&: 모두 참이면 참이다. 앞의 결과가 false이면 뒤문장은 실행하지 않는다.
		// &: 모두 참이면 참이다. 무조건 모든 문장 수행한다.
		boolean result= a>=100 && ++b>=20; 
		System.out.println("result= "+result);
		System.out.println("b= "+b);
	}

	private static void method3() {
		// 전위,후위 연산자
		int a=10;
		int b=20;
		int result= a++ + ++b;
		
		System.out.println("result= "+result);
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		System.out.println(a==b);
		System.out.println(a=b);
		System.out.println(a==b);
		
		System.out.println("자바" instanceof String);
		
	}

	private static void method2() {
		// 증감연산자
		int a=10;
		a++;
		++a;
		a+=1;
		a=a+1;
		//증가하고 출력한다.
		System.out.println("a= "+ ++a); //전위 연산자
		//출력하고 증가한다.
		System.out.println("a= "+ a++); //후위 연산자
		
	}

	private static void method1() {
		// 산술연산자
		int a= 10;
		int b= 3;
		System.out.println(a/b); //몫
		System.out.println(a%b); //나머지
		System.out.println(a/(double)b); //둘다
		System.out.println(1.0*a/b); //둘다
		
		
	}

}
