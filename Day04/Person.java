package com.kosta.day04;

public class Person {
	static int numberOfPersons;
	int age;
	String name;
	
	public Person(){
		this(12,"Anonymous");
	}
	
	public Person(int age, String name){
		this.age=age;
		this.name=name;
		numberOfPersons++;
	}
	
	void selfIntroduce(){
		System.out.println("�� �̸��� "+name+"�̸�, ���̴� "+age+"�� �Դϴ�.");
	}
	
	static int getPopulation(){
		return numberOfPersons;
	}
	
	
	public static void main(String[] args) {
		Person person= new Person();
		Person person2= new Person(3,"ö��");
		
		person.selfIntroduce();
		person2.selfIntroduce();
		
		System.out.println("��ü �α� ���� "+Person.getPopulation()+"�� �Դϴ�.");
		
	}

}
