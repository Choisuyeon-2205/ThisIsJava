package com.kosta.day13;

// 1. interface 구현 class 만들기
class MyRunnableImpl implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println(i);
		}
		
	}
}

//인터페이스 생성
//람다표현식으로 사용이 가능한지 컴파일단계에서 확인
@FunctionalInterface
interface MyInterface{
	//public abstract 생략가능
	void myFunction();
	
}

//인터페이스 구현 class 만들기
class MyInterfaceImplClass implements MyInterface{

	@Override
	public void myFunction() {
		System.out.println("interface 구현 class");
		
	}
	
}

public class LambdaExample {

	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		method4();
		method5();
		method6();
	

	}



	private static void method6() {
		// 3.Lambda 표현식 사용하기
		MyInterface a= ()-> 
			System.out.println("3.Lambda표현식 사용하기");
		
		a.myFunction();
	}



	private static void method5() {
		//2. 익명 class만들기
		(new MyInterface() {

			@Override
			public void myFunction() {
				System.out.println("2. 익명 class만들기");

			}
		}).myFunction();
		
	}



	private static void method4() {
		MyInterface a= new MyInterfaceImplClass(); //상위에 담는게 좋음
		a.myFunction();
		
	}

	private static void method3() {
		// 3. Lambda 표현식
	Runnable a= () -> {
				for(int i=11; i<=15; i++) {
					System.out.println(i);
			
			}
		};
		
		Thread t= new Thread(a);
		t.start();
		System.out.println("method2 END");
		
	}

	private static void method2() {
		//2. 익명 class 사용
		Runnable a= new Runnable() {
			
			@Override
			public void run() {
				for(int i=11; i<=15; i++) {
					System.out.println(i);
				}
			}
		};
		Thread t= new Thread(a);
		t.start();
		System.out.println("method2 END");
		
	}

	private static void method1() {
		MyRunnableImpl a= new MyRunnableImpl();
		Thread t= new Thread(a);
		t.start();
		System.out.println("method1 END");
		
	}

}
