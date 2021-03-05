package com.kosta.day06.inheritance;

public class Student extends Person{
	String studentNo;
	String major;
	

	public Student(String name, int age, String phone, String studentNo, String major) {
		super(name,age,phone);
		this.studentNo = studentNo;
		this.major = major;
	}

	public void study() {
		System.out.println("공부합니다.");
	}
	
	public void exam() {
		System.out.println("시험칩니다.");
	}

	@Override
	public String toString() {
		String a= super.toString();
		return "Student [studentNo=" + studentNo + ", major=" + major + "] ,"+a;
	}
	
	
}
