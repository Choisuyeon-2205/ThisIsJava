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
		System.out.println("내 이름은 "+name+"이며, 나이는 "+age+"살 입니다.");
	}
	
	static int getPopulation(){
		return numberOfPersons;
	}
	
	
	public static void main(String[] args) {
		Person person= new Person();
		Person person2= new Person(3,"철수");
		
		person.selfIntroduce();
		person2.selfIntroduce();
		
		System.out.println("전체 인구 수는 "+Person.getPopulation()+"명 입니다.");
		
	}

}
