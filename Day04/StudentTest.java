package com.kosta.day04;

public class StudentTest {

	public static void main(String[] args) {
		method1();

	}
	
	private static void method1() {
		Student s1= new Student();
		System.out.println(s1.name);
		
		Student s2= new Student("������","�����Ͻ��Ϻ���","123",20);
		System.out.println(s2.name);
		
		Student s3= new Student("������","����SW");
		System.out.println(s3.name);
		String major= s3.getMajor();
		System.out.println(major);
		
		Student s4= new Student("����",22);
		System.out.println(s4.name);
		int age= s4.getAge();
		System.out.println(s4.name+"�� ���̴� "+age);
		
		s1.study();
		s2.study();
		s3.study();
		s4.study();
		
	}

}
