package com.kosta.day06.inheritance;

public class Person {
	String name;
	int age;
	String phone;

	
	public Person(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}

	

	public void exercise() {
		System.out.println("��մϴ�.");
	}
	
	public void eat() {
		System.out.println("���� �Խ��ϴ�.");
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", phone=" + phone + "]";
	}
}
