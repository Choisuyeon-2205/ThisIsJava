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

public class �ڵ�����ȯ {
	public static void main(String[] args) {
		method8();
	}
	
	private static void method8() {
		//Ÿ�Կ� ���� ������ ���δ�.
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
		//���� �� ��ȯ��
		//������ ��ü�� casting�� �����ϴ�.
		Account acc= new CheckingAccount();
		CheckingAccount acc2= (CheckingAccount) acc;
		
	}

	private static void method5() {
		Account acc= new Account();
		//�߸�... ������ �� ������ ����
		//���� ����
		//CheckingAccount acc2= (CheckingAccount) acc;
		
	}

	private static void method4() {
		Account acc= new CheckingAccount();
		CheckingAccount acc2=(CheckingAccount)acc;
		
	}

	private static void method3() {
		//�Ұ���
		//B aa = (B) new E();
		//D dd = (D) new E();
		
	}

	private static void method2() {
		//��ü�� �ڵ�����ȯ => �θ�Ÿ��= �ڽİ�ü
		//��ü�� ��������ȯ=> �ڽ�Ÿ��= (�ڽ�Ÿ��)�θ�ü
		//*�⺻�� ��������ȯ=> ���� ��= (������)ū ��
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
		
		//�Ұ��ϴ�
		//B aa= new E();
		//D dd= new E();
	}
}
