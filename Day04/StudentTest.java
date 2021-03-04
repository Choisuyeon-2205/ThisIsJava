package com.kosta.day04;

public class StudentTest {

	public static void main(String[] args) {
		method1();

	}
	
	private static void method1() {
		Student s1= new Student();
		System.out.println(s1.name);
		
		Student s2= new Student("현성덕","비지니스일본어","123",20);
		System.out.println(s2.name);
		
		Student s3= new Student("강성빈","복합SW");
		System.out.println(s3.name);
		String major= s3.getMajor();
		System.out.println(major);
		
		Student s4= new Student("고석우",22);
		System.out.println(s4.name);
		int age= s4.getAge();
		System.out.println(s4.name+"의 나이는 "+age);
		
		s1.study();
		s2.study();
		s3.study();
		s4.study();
		
	}

}
