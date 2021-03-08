package com.kosta.day12;

import java.util.Arrays;

public class WildcardExample {
	public static void test(Course<?> p) {
		
	}
	public static void main(String[] args) {
		Course<Person> a= makePerson();
		Course<Student> b= makeStudent();
		Course<HighStudent> c= makeHighStudent();
		Course<Worker> d= makeWorker();

		registerPersonCourse(a);
		registerPersonCourse(b);
		registerPersonCourse(c);
		registerPersonCourse(d);
		
		//registerStudentCourse(a);
		registerStudentCourse(b);
		registerStudentCourse(c);
		//registerStudentCourse(d);
		
		 registerWorkerCourse(a);
		//registerWorkerCourse(b);
		//registerWorkerCourse(c);
		 registerWorkerCourse(d);
	}
	
	private static void registerWorkerCourse(Course<? super Worker> cc) {
		System.out.println(cc.getCourseName());
		String s= Arrays.toString(cc.getStudents());
		System.out.println(s);
		System.out.println("---------------------------");
		
	}
	
	private static void registerStudentCourse(Course<? extends Student> cc) {
		System.out.println(cc.getCourseName());
		String s= Arrays.toString(cc.getStudents());
		System.out.println(s);
		System.out.println("---------------------------");
		
	}
	
	private static void registerPersonCourse(Course<?> cc) {
		System.out.println(cc.getCourseName());
		String s= Arrays.toString(cc.getStudents());
		System.out.println(s);
		System.out.println("---------------------------");
		
	}

	private static Course<Worker> makeWorker() {
		Course<Worker> pCourse= new Course<Worker>("�����ΰ���", 8);
//		pCourse.add(new Person("�Ϲ���1"));
//		pCourse.add(new Student("�л�1"));
//		pCourse.add(new HighStudent("����л�1"));
		pCourse.add(new Worker("������1"));
		
//		String s= Arrays.toString(pCourse.getStudents());
//		System.out.println(s);
		
		return pCourse;
	}
	
	private static Course<HighStudent> makeHighStudent() {
		Course<HighStudent> pCourse= new Course<HighStudent>("����л�����", 8);
//		pCourse.add(new Person("�Ϲ���1"));
		pCourse.add(new HighStudent("����л�1"));
//		pCourse.add(new Worker("������1"));
		
//		String s= Arrays.toString(pCourse.getStudents());
//		System.out.println(s);
		
		return pCourse;
	}
	
	private static Course<Student> makeStudent() {
		Course<Student> pCourse= new Course<Student>("�л�����", 8);
//		pCourse.add(new Person("�Ϲ���1"));
		pCourse.add(new Student("�л�1"));
		pCourse.add(new HighStudent("����л�1"));
//		pCourse.add(new Worker("������1"));
		
//		String s= Arrays.toString(pCourse.getStudents());
//		System.out.println(s);
		
		return pCourse;
	}

	private static Course<Person> makePerson() {
		Course<Person> pCourse= new Course<Person>("�Ϲ��ΰ���", 8);
		pCourse.add(new Person("�Ϲ���1"));
		pCourse.add(new Student("�л�1"));
		pCourse.add(new HighStudent("����л�1"));
		pCourse.add(new Worker("������1"));
		
//		String s= Arrays.toString(pCourse.getStudents());
//		System.out.println(s);
		
		return pCourse;
	}

}
