package com.kosta.day06.inheritance;

//�ڽ��� �θ� �����Ѵ�.
public class Child extends Parent{
	//�ڽ��� �߰��� ����
	int b=20;
	//������ 
	String a= "�ڹ�";
	
	//�ڽ��� ������
	Child(){
		//super() �ڵ����� �θ� �����Ѵ�.
	System.out.println("�ڽ��� ������");	
	}
	
	//overriding ������(�����)
	@Override
	void method1() {
		System.out.println("�����ǵ� �޼ҵ�");
	}
	
	//overloading(�̸� ���� �Ű������� �ٸ���.)
		void method1(String s) {
			System.out.println("�����ε� �޼ҵ�");
		}
	
	//�ڽ��� �߰��� �޼ҵ��̴�.
	void parentPrint() {
		//�θ𿡰� �������� ���� ���
		System.out.println("a= "+a);
		//�θ𿡰� �������� �޼ҵ� ���
		method1();
	}

}
