package com.kosta.day01;

public class VariableTest {
	
	static int speed; //���������� �ʱ�ȭ���� �ʾƵ� ������ ���� �ʴ´�.
	static double speed2;

	//main�� ������ ���� ������ �Ұ��ϴ�.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("speed="+ speed);
		System.out.println("speed2="+ speed2);
		
		System.out.println("\n������?");
		System.out.println("�������̸��̴�.");
		
		//10�� �����Ѵ�.
		//1. ���� ����
		int a;
		//2. ������ ���� �Ҵ��Ѵ�.
		a= 10;
		//3. ���� �о ����Ѵ�.
		System.out.println(10);
		System.out.println(a);
		
		//����+ �Ҵ�
		int score= 100; //=�� ���� ������
		score= score+10;
		score+= 10; //���մ��Կ�����
		//����+ ����=> ���� (���Ῥ����)
		System.out.println("\n������ "+score);
		
		int value= 10;
		int result= value+10; //�ʱ�ȭ���� ���� ������ ����� �� ����. =>local variable(��������) �ݵ�� �ʱ�ȭ �ؾ��Ѵ�.
		System.out.println(result);


	}

}
