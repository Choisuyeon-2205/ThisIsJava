package com.kosta.day07;

class Parent{
	int a=10;
	
	Parent(){
		System.out.println("�θ��� �����ڰ� ���� ����ȴ�.");
	}
	
	Parent(int aa){
		System.out.println("arg1 �θ��� �����ڰ� ���� ����ȴ�.");
	}
	
	void method1() {
		System.out.println("parent�� ���� method1");
	}
}

class Child extends Parent{
	int b=20;
	String a= "�ڹ�"; //������(override)
	
	Child(String s){
		super();     //default ȣ��
		//super(11); ����� ȣ��
		System.out.println("arg1�� �ִ� �������̴�...."+s);
	}
	
	//�߰��޼ҵ�
	void method2() {
		System.out.println("child�� ���� method2");
	}
	//������, �����, �θ� �޼ҵ�� ������
	void method1() {
		//�θ�޼ҵ� ȣ��
		
		super.method1();
		System.out.println("child�� �������� method1");
	}
	
}

public class InheritanceTest {
	public static void main(String[] args) {
		Child c= new Child("�ڽ�");
		System.out.println(c.a + c.b);
		c.method1();
		c.method2();
	}

}
