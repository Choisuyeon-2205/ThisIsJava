package com.kosta.day13;

import java.util.function.*;

public class LambdaExample4 {

	public static void main(String[] args) {
		method4();

	}
	
	private static void method4() {
		Student s= new Student("홍길동","남",90);
		Function<Student,String> f1= (a)-> a.getName();
		Function<String,Integer> f2= (a)-> a.length();
		
		Function<Student,Integer> f3= f1.andThen(f2);
		System.out.println("학생 이름의 길이: "+f3.apply(s));
		
		Function<Student,Integer> f4= f2.compose(f1);
		System.out.println("학생 이름의 길이: "+f4.apply(s));
	}

	private static void method3() {
		Student s= new Student("홍길동","남",90);
		Consumer<Student> consumerA= (a) -> {
			System.out.println("Student를 소비한다. A");
			System.out.println("학생이름: "+a.getName());
		}; 
		Consumer<Student> consumerB= (a) -> {
			System.out.println("Student를 소비한다. B");
			System.out.println("학생점수: "+a.getScore());
		}; 
		
		Consumer<Student> aa= consumerA.andThen(consumerB);
		aa.accept(s);
		
	}

	private static void method2() {
		int count= 0;
		Student[] arr= {
				new Student("홍길동","남",90),
				new Student("김채연","여",91),
				new Student("김현빈","여",92),
				new Student("오정훈","남",93),
				new Student("윤종무","남",94)
		};
		
		//남자 몇명, 여자 몇명?
		Predicate<Student> p= (s)->{
			if(s.getGender().equals("남")) return true;
			return false;
		};
		
//		boolean aa= p.test(new Student("윤종무","남",94));
//		System.out.println(aa);

		for(Student s: arr) {
			if(p.test(s))
				count++;
		}
		System.out.println("남자의 수는 "+count);
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
