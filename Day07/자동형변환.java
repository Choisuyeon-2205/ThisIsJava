package com.kosta.day07;

class A{
	
}

class B extends A{
	
}

class C extends A{
	
}

class D extends B{
	
}

class E extends C{
	
}

public class 자동형변환 {
	public static void main(String[] args) {
		method8();
	}
	
	private static void method8() {
		//타입에 따라 변수가 보인다.
		Tire t= new KumhoTire();
		System.out.println(t.a);
		System.out.println(((KumhoTire)t).kumho);
		
		printTire(new KumhoTire());
		printTire(new HankookTire());
		
	}

	private static void printTire(Tire t) {
		System.out.println(t.a);
		if(t instanceof KumhoTire)
			System.out.println(((KumhoTire)t).kumho);
		if(t instanceof HankookTire)
			System.out.println(((HankookTire)t).hankook);
		
	}

	private static void method7() {
		Tire t= new KumhoTire();
		if(t instanceof HankookTire) {
		HankookTire h= (HankookTire)t;
		System.out.println(h);
		}
		
	}

	private static void method6() {
		//강제 형 변환은
		//본래의 객체로 casting만 가능하다.
		Account acc= new CheckingAccount();
		CheckingAccount acc2= (CheckingAccount) acc;
		
	}

	private static void method5() {
		Account acc= new Account();
		//잘못... 컴파일 시 오류가 없음
		//실행 오류
		//CheckingAccount acc2= (CheckingAccount) acc;
		
	}

	private static void method4() {
		Account acc= new CheckingAccount();
		CheckingAccount acc2=(CheckingAccount)acc;
		
	}

	private static void method3() {
		//불가능
		//B aa = (B) new E();
		//D dd = (D) new E();
		
	}

	private static void method2() {
		//객체의 자동형변환 => 부모타입= 자식객체
		//객체의 강제형변환=> 자식타입= (자식타입)부모객체
		//*기본형 강제형변환=> 작은 방= (작은방)큰 값
		int a=10;
		double aa= 3.14;
		aa= a;
		//a= aa;
		a= (int)aa;
		Account acc= new CheckingAccount();
		CheckingAccount acc2=(CheckingAccount)acc;
	}

	private static void method1() {
		A a= new B();
		A b2= new C();
		
		A a3= new D();
		B b1= new D();
		
		A a4= new E();
		C c1= new E();
		Object obj = new E();
		
		//불가하다
		//B aa= new E();
		//D dd= new E();
	}
}
