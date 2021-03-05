package com.kosta.day06.inheritance;

public class StudentTest {

	public static void main(String[] args) {
		Person p= new Person("김길동",20,"010-1234-5678");
		Student s= new Student("김학생",25,"010-3333-4444","890101","컴퓨터공학");

		System.out.println(p);
		System.out.println(s);
		
	}

}
