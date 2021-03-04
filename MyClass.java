package com.kosta.day01;

/*
 1. .java를 생성한다.
 2. javac.exe로 컴파일한다. (JDK/bin 안에 있다.)
 3. .class 파일이 생성된다.
 4. JVM(자바가상머신..OS마다 다르다)이 java.exe가 .class로 컴파일한다.
 5. java.exe MyClass => main 시작된다.
 */

//MyClass.java 에는 반드시 MyClass가 있다.
//하나의 .java에는 여러 class가 가능하다.
//public class 반드시 하나만 가능하다.

public class MyClass {
	public static void test() {
		System.out.println("MyClass test");
	}

	public static void main(String[] args) {
		ATest aa= new ATest(); //객체 생성
		aa.method1();
		test();
	}
}

class ATest{
	public void method1() {
		System.out.println("ATest에 method1");
		
	}
	
}

class BClass{
	
}

