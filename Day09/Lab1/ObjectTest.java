package com.kosta.day09.lab1;

import java.util.HashSet;
import java.util.Set;

import com.kosta.day04.Car;

//class Dice {
//	int size;
//	Dice(int size){
//		this.size = size;
//	}
//	int play(){
//		int number = (int)(Math.random() * size) + 1;
//		return number;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		//d2�� Dice-> Object-> Dice
//		Dice d= (Dice)obj;
//
//		return size==d.size;
//	}
//	
//	
//}


public class ObjectTest {

	public static void main(String[] args) {
		method7();

	}

	private static void method7() {
		Car car1= new Car("�׷���",4000);
		Car car2= new Car("�׷���",4000);
		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());
		
		Set<Car> shopping = new HashSet<>();
		shopping.add(car1);
		shopping.add(car2);
		for(Car c: shopping) {
			System.out.println(c.model);
		}
		
	}

	private static void method6() {
		// Collection: List, Set, Map
		// Set: key�� ���ȴ�. �ߺ��ȵ�, ���� ����
		Set<String> shopping = new HashSet<>();
		shopping.add("���");
		shopping.add("�ٳ���");
		shopping.add("������");
		shopping.add("���");
		shopping.add("���");
		for(String s: shopping) {
			System.out.println(s);
		}
		String s1= new String("���");
		String s2= new String("���");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	}

	private static void method5() {
		Car car1= new Car("�׷���",4000);
		Car car2= new Car("�׷���",4000);
		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());
		
	}

	private static void method4() {
		Car car1= new Car("�׷���",4000);
		Car car2= new Car("�׷���",4000);
		System.out.println(car1==car2); //�ּҺ�
		System.out.println(car1.equals(car2)); //�ּҺ�
		
	}

	private static void method3() {
		//2���� �ֻ���... ������?
//		Dice d1= new Dice(8);
//		Dice d2= new Dice(8);
		System.out.println(d1==d2);
		System.out.println(d1.equals(d2));
		
	}

	private static void method2() {
		//object�� equals(): �ּ� ��
		//Stirng�� object�� equals()�� ������: ���� ���Ѵ�.
		
		String s1= new String("�ڹ�");
		String s2= new String("�ڹ�");
		String s3= "�ڹ�";
		String s4= "�ڹ�";
		
		System.out.println(s1==s2?"�ּ� ����":"�ּ� �ٸ���.");
		System.out.println(s3==s4?"�ּ� ����":"�ּ� �ٸ���.");
		System.out.println(s1.equals(s4)?"���� ����":"���� �ٸ���.");
		System.out.println(s3.equals(s4)?"���� ����":"���� �ٸ���.");
		
	}

	private static void method1() {
		int a1= 10;
		int a2= 10;
		System.out.println(a1==a2); //�⺻��=> ���� ��
		
		Object obj1= new Object();
		Object obj2= new Object();
		System.out.println(obj1==obj2); //��ü=> �ּ� ��
		System.out.println(obj1.equals(obj2)); //��ü=> �ּ� ��
		
		Integer a3= 10;
		Integer a4= 10;
		Integer b1= new Integer(10);
		Integer b2= new Integer(10);
		System.out.println(a3==a4); 
		System.out.println(b1==b2); 
		System.out.println(b1.equals(b2)); 
		
		//object: ==�� �ּҺ�, equals�� �ּҺ�
		//Integer
	}

}
