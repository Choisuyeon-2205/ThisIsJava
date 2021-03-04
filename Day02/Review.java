package com.kosta.day02;
/*
 * 2021.02.16 최수연
 * 복습
 * 1. Review.java 소스작성
 * 2. 컴파일(byte code로 변경, binary code가 아님, 중간언어, Assembly 언어 비슷)
 * 3. JVM이 실행 >java Review
 * -> 01110000110
 * 
 */

public class Review {

	public static void main(String[] args) {
		//main은 자바가상머신이 자동시작
		System.out.println("main 시작");
		//dataTypeTest();
		castTest();
		System.out.println("main 끝");
	}

	private static void castTest() {
		int i;
		char c='A';
		i= c;
		System.out.println(i);
		
		c= (char)i;
		c++;
		System.out.println(c);
		
	}

	private static void dataTypeTest() {
		// 기본형: byte(1), short(2), char(2), int(4), long(8)
		//       float(4), double(8)
		//       boolean(1)
		// Wrapper class: 기본형+기능 ==> class
		// 목적: data저장, 연산, 비교
		// 1. 변수선언
		int javaScore;
		long aa= Integer.MAX_VALUE+1L;
		double pi= 3.14;
		float pi2= 3.14f;
		
		// 2. 값 할당(대입)
		javaScore=100;
		// 3. 사용
		System.out.println(javaScore+10);
		System.out.println(aa);
		System.out.println(pi);
		System.out.println(pi2);
		
		
	}

}
