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
		System.out.println("운동합니다.");
	}
	
	public void eat() {
		System.out.println("밥을 먹습니다.");
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", phone=" + phone + "]";
	}
}
