package com.kosta.day01;

/*
 1. .java�� �����Ѵ�.
 2. javac.exe�� �������Ѵ�. (JDK/bin �ȿ� �ִ�.)
 3. .class ������ �����ȴ�.
 4. JVM(�ڹٰ���ӽ�..OS���� �ٸ���)�� java.exe�� .class�� �������Ѵ�.
 5. java.exe MyClass => main ���۵ȴ�.
 */

//MyClass.java ���� �ݵ�� MyClass�� �ִ�.
//�ϳ��� .java���� ���� class�� �����ϴ�.
//public class �ݵ�� �ϳ��� �����ϴ�.

public class MyClass {
	public static void test() {
		System.out.println("MyClass test");
	}

	public static void main(String[] args) {
		ATest aa= new ATest(); //��ü ����
		aa.method1();
		test();
	}
}

class ATest{
	public void method1() {
		System.out.println("ATest�� method1");
		
	}
	
}

class BClass{
	
}

