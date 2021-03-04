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
		// ��������8
		double x= 5.0;
		double y= 0.0;
		
		double z= x%y;

		if(Double.isNaN(z))
			System.out.println("0.0���� ���� �� �����ϴ�.");
		else {
			double result= z+10;
			System.out.println("���: "+ result);
		}
		
	}
	
	private static void method7() {
		// ���׿�����
		int score=95;
		int limit= 80;
		
		String result= score>=limit?"�հ�":"���հ�";
		
		System.out.println(result);
		
		if(score>=limit)
			result= "�հ�";
		else
			result="���հ�";
		
		System.out.println(result);
		
	}

	private static void method6() {
		// OR����
		int a=10;
		int b=20;
		
		//||: �ϳ��� ���̸� ���̴�. ���� ����� TRUE�̸� �ڹ����� �������� �ʴ´�.
		// |: �ϳ��� ���̸� ���̴�. ������ ��� ���� �����Ѵ�.
		boolean result= a>=10 || ++b>=20; 
		//boolean result= a>=10 | ++b>=20; 
		
		System.out.println("result= "+result);
		System.out.println("b= "+b);
	}

	private static void method5() {
		// AND����
		int a=10;
		int b=20;
		
		//&&: ��� ���̸� ���̴�. ���� ����� false�̸� �ڹ����� �������� �ʴ´�.
		// &: ��� ���̸� ���̴�. ������ ��� ���� �����Ѵ�.
		boolean result= a>=100 && ++b>=20; 
		System.out.println("result= "+result);
		System.out.println("b= "+b);
	}

	private static void method3() {
		// ����,���� ������
		int a=10;
		int b=20;
		int result= a++ + ++b;
		
		System.out.println("result= "+result);
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		System.out.println(a==b);
		System.out.println(a=b);
		System.out.println(a==b);
		
		System.out.println("�ڹ�" instanceof String);
		
	}

	private static void method2() {
		// ����������
		int a=10;
		a++;
		++a;
		a+=1;
		a=a+1;
		//�����ϰ� ����Ѵ�.
		System.out.println("a= "+ ++a); //���� ������
		//����ϰ� �����Ѵ�.
		System.out.println("a= "+ a++); //���� ������
		
	}

	private static void method1() {
		// ���������
		int a= 10;
		int b= 3;
		System.out.println(a/b); //��
		System.out.println(a%b); //������
		System.out.println(a/(double)b); //�Ѵ�
		System.out.println(1.0*a/b); //�Ѵ�
		
		
	}

}
