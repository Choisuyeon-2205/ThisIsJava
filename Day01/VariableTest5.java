package com.kosta.day01;

public class VariableTest5 {
	public static void test1() {
		System.out.println("test1����");
		System.out.println("----�ڵ�����ȯ---");
		int i;
		byte b= 127;
		i = b;
		System.out.println("i= "+i);
	}
	
	public static void test2() {
		System.out.println("test2����");
		System.out.println("----��������ȯ---");
		int i= 2147483647;
		byte b;
		b= (byte)i;
		System.out.println("b= "+b);
	}
	
	public static void test3() {
		System.out.println("test3����");
		System.out.println("----�ڷ��� �ִ� �˾ƺ���---");
		int a= 10;
		//Wrapper Class
		//�⺻��(�� ����, ����, ��)
		//int + ����߰� -> Integer 
		System.out.println(Integer.MAX_VALUE);
		
	}
	
	public static void test4() {
		System.out.println("test4����");
		System.out.println("----�ڷ��� �ִ� �˾ƺ���---");
		int a= 10;
		double b= 3.14;
		
		double result= a+b;
		System.out.println("result= "+result);
		
		int result2= (int)(a+b);
		System.out.println("result2= "+result2);
		
		char c= '��';
		String s1= "�ڹٹ��ڿ�:";
		System.out.println(s1+20+10);
		System.out.println(s1+(20+10));
		
		int su1=10, su2=20;
		System.out.println("���ϱ�� "+ (su1+su2)); //������ �켱���� ����!!
		System.out.println("����� "+(su1-su2));
		System.out.println("���ϱ�� "+ su1*su2);
		System.out.println("������� "+ su1/su2);
		
	}


	public static void main(String[] args) {
		// main�Լ� ����.. main�� �ڹٰ���ӽ��� �ڵ�ȣ���Ѵ�.
		// ������ �Լ��� ȣ�����
		// �����ڰ� main���� ȣ���ؾ��Ѵ�.
		System.out.println("main����");
		//test1(), test2() ȣ��
		//test1();
		//test2();
		//test3();
		//test4();
		test5();
		System.out.println("main��");

	}

	private static void test5() {
		// TODO Auto-generated method stub
		byte byteValue= 10;
		float floatValue= 2.5F;
		double doubleValue= 2.5;
		
		System.out.println(Byte.MAX_VALUE);
		//byte result5= byteValue+byteValue;
		float result3= 5+floatValue;
		double result4= 5+doubleValue;
		
		System.out.println(result3);
		System.out.println(result4);
		
		
	}

}
