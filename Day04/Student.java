package com.kosta.day04;

//���赵 ....object���� ����� Ư��, ����
public class Student {
	//1. �������(field)
	String name;
	String no;
	String major;
	int age;
	//2. ������ �޼���... ������ �ڵ�ȣ�� ... �ʱ�ȭ ����
	//�������������� default�����ڰ� �����ȴ�.
	//�����ϸ� default �����ڰ� ��������.(���Ұ�)
	
	Student(){
		//default������: argument����
		System.out.println("----------------");
		System.out.println("�л�����");
	}
	
	Student(String name, String major){
		//�����ڰ� �ٸ� ����� �����ڸ� ȣ��
//		System.out.println("----------------");
//		System.out.println("�л�����");
//		this.name= name;
//		this.major=major;
		this(name,major,"��ȣ��",20);
	}
	
	Student(String name, int age){
		//�����ڰ� �ٸ� ����� �����ڸ� ȣ��
		this(name,null,null,age);
	}
	
	
	Student(String name, String major, String no, int age){
		System.out.println("----------------");
		System.out.println("�л�����");
		this.name= name;
		this.major=major;
		this.no=no;
		this.age=age;
	}
	
	//3. �޼���(���)
	void study() {
		System.out.println(name+"�л��� �����Ѵ�.");
		//return; �Լ� ������ �ڵ����� return �ȴ�.
	}
	String getMajor() {
		return name+"�л��� ������ "+major;
	}
	int getAge() {
		return age;
	}
}
