//package com.kosta.day04;
//
////class: object�� ����� Ʋ�̴�. template, ���赵, �ؾƲ
////       ������ �޼������ �����̴�.
////object: class�� �̿��ؼ� ���� ������ ��ü�̴�.
////instance: object ��ü
//
//public class Car {
//	//1.Ư¡, �������, field
//	public String model;
//	int year;
//	int price;
//	String color;
//	String company="�����ڵ���";
//	
//	//2.������ �޼���: ������(new) �ڵ�����ȴ�.
//	//�ݵ�� class�̸��� ����.
//	//return�� ������ ����.
//	//����: ���� �ʱ�ȭ
//	//������: Overloading... �̸����� �Ű������� �ٸ���.
//	//�����ڰ� ������ �ִ�. �ϳ��� �����ڰ� �ٸ� �����ڸ� ȣ���ϴ� ���
//	public Car(){
//		this("�� �̰���",2000);
//		System.out.println("(default)�ڵ����� �����˴ϴ�.");
//	}
//	
//	public Car(String model, int price){
//		System.out.println("(�Ű�����2)�ڵ����� �����˴ϴ�.");
//		this.model=model;
//		this.price=price;
//	}
//	
//	public Car(String model) {
//		this(model,4000);
//		System.out.println("(�Ű�����1)�ڵ����� �����˴ϴ�.");
//		
//	}
//	
//	
//	//3.���,�޼���,�Լ�
//	void go() {
//		System.out.println("�ڵ����� �����ΰ���.");
//	}
//	void back() {
//		System.out.println("�ڵ����� �ڷΰ���.");
//	}
//
//}
