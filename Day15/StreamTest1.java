package com.kosta.day15;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamTest1 {

	public static void main(String[] args) {
		method8();

	}
	
	private static void method8() {
			Student[] arr= { 
					new Student("홍길동",100),
					new Student("신용권",80),
					new Student("김자바",90),
			};
			List<Student> alist= Arrays.asList(arr);
			double avg= alist.stream()
					.mapToInt(Student::getScore)
					.average()
					.getAsDouble();
			System.out.println("평균은: "+ avg);
		}

	private static void method7() {
		Student[] arr= { 
				new Student("홍길동",100),
				new Student("신용권",80),
				new Student("김자바",90),
		};
		List<Student> alist= Arrays.asList(arr);
		
		//평균 구하기 (향상된 for)
		int sum=0;
		for(Student s: alist) {
			sum += s.getScore();
		}
		System.out.println(1.0*sum/alist.size());
	}

	private static void myPrint(Student s) {
		System.out.println(s + ":"+ Thread.currentThread().getName());
	}
	
	private static void method6() {
		Student[] arr= { 
				new Student("홍길동",100),
				new Student("신용권",80),
				new Student("김자바",90),
		};
		List<Student> alist= Arrays.asList(arr);

		//순차적 처리
		Stream<Student> st= alist.stream();
		//Consumer<Student> consumer= aa -> myPrint(aa);
		//Math.random() ==> Math::random
		Consumer<Student> consumer= StreamTest1::myPrint;
		st.forEach(consumer);
		
		//병렬 처리
		System.out.println("------------------------------");
		Stream<Student> st2= alist.parallelStream();
		st2.forEach(consumer);
	}

	private static void method5() {
		Student[] arr= { 
				new Student("홍길동",100),
				new Student("신용권",80),
				new Student("김자바",90),
		};

		List<Student> alist= Arrays.asList(arr);
		Stream<Student> st= alist.stream();
		Consumer<Student> consumer= aa ->{
			System.out.println(aa);
		};
		st.forEach(consumer);
	}

	private static void method4() {
		Integer[] arr= {100,50,20,100,70};
		List<Integer> alist= Arrays.asList(arr);
		Stream<Integer> st= alist.stream();
		Consumer<Integer> consumer= aa ->{
			System.out.println("점수는 "+ aa);
		};
		st.forEach(consumer);
	}

	private static  void method3() {
		String[] arr= new String[] {"홍길동", "신용권", "김자바"};
		List<String> alist= Arrays.asList(arr);
		
		//stream 이용
		System.out.println("**********************");
		Stream<String> st= alist.stream();
		st.forEach(s-> System.out.println(s));
		
		//consumer복습
		System.out.println("=====consumer=====");
		Consumer<String> consumer = s->{
			System.out.println(s);
			System.out.println("==================");
		};
		
		for(String ss:alist) {
			consumer.accept(ss);
		}
		
		//stream 이용
		System.out.println("**********************");
		Stream<String> st2= alist.stream();
		st2.forEach(consumer);

	}
	
	private static  void method2() {
		String[] arr= new String[] {"홍길동", "신용권", "김자바"};
		List<String> alist= Arrays.asList(arr);
		
		//반복자를 향상된 for 이용
		for(String s: alist) {
			System.out.println(s);
		}
	}
	
	private static  void method1() {
		String[] arr= new String[] {"홍길동", "신용권", "김자바"};
		String[] arr2= {"홍길동", "신용권", "김자바"}; //new String 생략 가능( 선언과 생성 동시)
		List<String> alist= Arrays.asList(arr);
		
		List<String> alist2= Arrays.asList(new String[]{"홍길동","신용권","김자바"}); //new String 생략 불가
		List<String> alist3= Arrays.asList("홍길동","신용권","김자바"); 
		
		//반복자를 직접 사용
		Iterator<String> it= alist.iterator();
		while(it.hasNext()) {
			String s= it.next();
			System.out.println(s);
		}
	}

}
