package com.kosta.day01;

public class VariableTest2 {

	//1.�������..... �ڵ��ʱ�ȭ�ȴ�.
	static int speed;
	//2.�޼ҵ� (��)���� �Լ�
	//3.static block
	//4.instance block
	//5.inner class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���������� �ݵ�� �ʱ�ȭ �ؾ��Ѵ�.
		int speed2;
		System.out.println("aaaaaa");
		speed ++; //1 �����Ѵ�.
		speed = speed +1;
		speed += 1;
		speed2= 100;
		
		System.out.println(speed);
		System.out.println(speed2);
	
		int a=100;
		{
			//int a=10;
			System.out.println("a="+ a);
		}
		// System.out.println("a="+ a);
		//a�� ���ȿ����� �� �� �ִ�.! ��������

		
	}

}
