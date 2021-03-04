package com.kosta.day13;

// 1. interface ���� class �����
class MyRunnableImpl implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println(i);
		}
		
	}
}

//�������̽� ����
//����ǥ�������� ����� �������� �����ϴܰ迡�� Ȯ��
@FunctionalInterface
interface MyInterface{
	//public abstract ��������
	void myFunction();
	
}

//�������̽� ���� class �����
class MyInterfaceImplClass implements MyInterface{

	@Override
	public void myFunction() {
		System.out.println("interface ���� class");
		
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
		// 3.Lambda ǥ���� ����ϱ�
		MyInterface a= ()-> 
			System.out.println("3.Lambdaǥ���� ����ϱ�");
		
		a.myFunction();
	}



	private static void method5() {
		//2. �͸� class�����
		(new MyInterface() {

			@Override
			public void myFunction() {
				System.out.println("2. �͸� class�����");

			}
		}).myFunction();
		
	}



	private static void method4() {
		MyInterface a= new MyInterfaceImplClass(); //������ ��°� ����
		a.myFunction();
		
	}

	private static void method3() {
		// 3. Lambda ǥ����
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
		//2. �͸� class ���
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
