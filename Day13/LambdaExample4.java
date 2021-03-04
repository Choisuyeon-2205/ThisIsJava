package com.kosta.day13;

import java.util.function.*;

public class LambdaExample4 {

	public static void main(String[] args) {
		method4();

	}
	
	private static void method4() {
		Student s= new Student("ȫ�浿","��",90);
		Function<Student,String> f1= (a)-> a.getName();
		Function<String,Integer> f2= (a)-> a.length();
		
		Function<Student,Integer> f3= f1.andThen(f2);
		System.out.println("�л� �̸��� ����: "+f3.apply(s));
		
		Function<Student,Integer> f4= f2.compose(f1);
		System.out.println("�л� �̸��� ����: "+f4.apply(s));
	}

	private static void method3() {
		Student s= new Student("ȫ�浿","��",90);
		Consumer<Student> consumerA= (a) -> {
			System.out.println("Student�� �Һ��Ѵ�. A");
			System.out.println("�л��̸�: "+a.getName());
		}; 
		Consumer<Student> consumerB= (a) -> {
			System.out.println("Student�� �Һ��Ѵ�. B");
			System.out.println("�л�����: "+a.getScore());
		}; 
		
		Consumer<Student> aa= consumerA.andThen(consumerB);
		aa.accept(s);
		
	}

	private static void method2() {
		int count= 0;
		Student[] arr= {
				new Student("ȫ�浿","��",90),
				new Student("��ä��","��",91),
				new Student("������","��",92),
				new Student("������","��",93),
				new Student("������","��",94)
		};
		
		//���� ���, ���� ���?
		Predicate<Student> p= (s)->{
			if(s.getGender().equals("��")) return true;
			return false;
		};
		
//		boolean aa= p.test(new Student("������","��",94));
//		System.out.println(aa);

		for(Student s: arr) {
			if(p.test(s))
				count++;
		}
		System.out.println("������ ���� "+count);
	}

	private static void method1() {
		Predicate<String> p= a-> {
			if(a.length() >= 3) return true;
			return false;
		};
		System.out.println(p.test("Hello"));
		System.out.println(p.test("Hi"));
	}

}
