package com.kosta.day04;

public class CarTest2 {

	public static void main(String[] args) {
		//method1();
		//test1();
		test2();

	}

	private static void test2() {
		Car c1= new Car("BMW520",7000);
		Car c2= new Car();
		Car c3= new Car("SM7");
		
		System.out.println(c1.model);
		System.out.println(c1.price);
		System.out.println("============");
		System.out.println(c2.model);
		System.out.println(c2.price);
		System.out.println("============");
		System.out.println(c3.model);
		System.out.println(c3.price);
		
		
	}

	private static void test1() {
		Car c1= new Car();
		Car c2= new Car();
		Car c3= new Car("SM7");
		
		System.out.println(c1.company);
		System.out.println(c2.company);
		c1.model="ABC";
		c2.model="DDD";
		c1.company="����ڵ���";
		System.out.println(c1.model);
		System.out.println(c2.model);
		
	}

	//void : return ���� ����.
	void method2() {
		System.out.println("method2����");
	}
	
	private static void method1() {
		
		
	}

}
