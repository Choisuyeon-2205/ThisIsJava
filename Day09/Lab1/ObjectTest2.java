package com.kosta.day09.lab1;

import java.util.Arrays;
import java.util.Date;

public class ObjectTest2 {


	public static void main(String[] args) {
		method10();
	}

	private static void method10() {
		String[] arr= {"�׺������","����ī�޶�"};
		Car car= new Car("�׷���", 5000, arr);
		
		Car car2= null;
		try {
			car2 = (Car) car.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		car.model="SM7";
		car.�Ǽ��縮[0]="�ڹ�å";
		car.price= 6000;
		System.out.println(car);
		System.out.println(car2);
		
	}

	private static void method9() {
		Car car= new Car("�׷���", 5000);
		
		Car car2= null;
		try {
			car2 = (Car) car.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		car.model="SM7";
		System.out.println(car);
		System.out.println(car2);
		
	}

	private static void method8() {
		Car car= new Car("�׷���", 5000);
		Car car2= car;
		car.model="SM7";
		System.out.println(car);
		System.out.println(car2);
		
	}

	private static void method7() {
		// ����... �ּ��� ����
		int[] a= {1,2,3,4,5};
		int[] b= a; //�������� ����
		a[0]= 99;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(a);
		
		
	}

	private static void method6() {
		//����... ���� ����
		int a= 10;
		int b= a;
		a++;
		System.out.println(a);
		System.out.println(b);
		
	}

	private static void method5() {
		//����
		String s= new String("�ڹ�");
		String s2= s;
		s= new String("DB");
		System.out.println(s);
		System.out.println(s2);
	}

	private static void method4() {
		Date d1= new Date();
		System.out.println(d1);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Date d2= new Date();
		System.out.println(d2);
		System.out.println(d2.toLocaleString());
		
	}

	private static void method3() {
		Car obj1= new Car("�ڹ�",1000);
		Car obj2= new Car("�ڹ�",1000);
		
		//car�� toString() ������ �ȵ� .... object�� ����.
		System.out.println(obj1);
		System.out.println(obj1.toString());
		System.out.println(obj2);
		System.out.println(obj2.toString());
		
		
	}

	private static void method2() {
		String obj1= new String("�ڹ�");
		String obj2= new String("�ڹ�");
		//string�� ������ü
		System.out.println(obj1);
		System.out.println(obj1.toString());
		System.out.println(obj2);
		System.out.println(obj2.toString());
		
	}

	private static void method1() {
		Object obj1= new Object();
		Object obj2= new Object();
		//class�̸�@hax(hashcode) -object�� ���
		System.out.println(obj1);
		System.out.println(obj1.toString());
		System.out.println(obj2);
		System.out.println(obj2.toString());
	}
}
