package com.kosta.day04;

public class CarTest {

	public static void main(String[] args) {
		//1.��ü������������
		int[] arr;
		Car c1;
		int i;
		
		//2.��ü����...�ڵ� �ʱ�ȭ�ȴ�.
		arr=new int[5];
		c1= new Car();
		//c1: object, instance �ּҰ� ���ִ�.
		//new Car(): heap ������ instance�����ȴ�.
		
		//3.��ü���
		arr[0]=100;
		i=10;
		System.out.println(arr);
		System.out.println(c1);
		System.out.println("color:"+c1.color);
		System.out.println("model:"+c1.model);
		System.out.println("price:"+c1.price);
		System.out.println("year:"+c1.year);
		
		Car c2= new Car();
		c2.color= "black";
		c2.model="�׷���";
		c2.price= 5000;
		c2.year=2021;
		System.out.println("color:"+c2.color);
		System.out.println("model:"+c2.model);
		System.out.println("price:"+c2.price);
		System.out.println("year:"+c2.year);
		
		//1.��ü�������� ����
		String s1;
		//2.��ü ����
		s1= new String("�ڹ�");
		//3.��ü����
		System.out.println(s1.charAt(0));
		
	}

}
