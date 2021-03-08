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
					new Student("ȫ�浿",100),
					new Student("�ſ��",80),
					new Student("���ڹ�",90),
			};
			List<Student> alist= Arrays.asList(arr);
			double avg= alist.stream()
					.mapToInt(Student::getScore)
					.average()
					.getAsDouble();
			System.out.println("�����: "+ avg);
		}

	private static void method7() {
		Student[] arr= { 
				new Student("ȫ�浿",100),
				new Student("�ſ��",80),
				new Student("���ڹ�",90),
		};
		List<Student> alist= Arrays.asList(arr);
		
		//��� ���ϱ� (���� for)
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
				new Student("ȫ�浿",100),
				new Student("�ſ��",80),
				new Student("���ڹ�",90),
		};
		List<Student> alist= Arrays.asList(arr);

		//������ ó��
		Stream<Student> st= alist.stream();
		//Consumer<Student> consumer= aa -> myPrint(aa);
		//Math.random() ==> Math::random
		Consumer<Student> consumer= StreamTest1::myPrint;
		st.forEach(consumer);
		
		//���� ó��
		System.out.println("------------------------------");
		Stream<Student> st2= alist.parallelStream();
		st2.forEach(consumer);
	}

	private static void method5() {
		Student[] arr= { 
				new Student("ȫ�浿",100),
				new Student("�ſ��",80),
				new Student("���ڹ�",90),
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
			System.out.println("������ "+ aa);
		};
		st.forEach(consumer);
	}

	private static  void method3() {
		String[] arr= new String[] {"ȫ�浿", "�ſ��", "���ڹ�"};
		List<String> alist= Arrays.asList(arr);
		
		//stream �̿�
		System.out.println("**********************");
		Stream<String> st= alist.stream();
		st.forEach(s-> System.out.println(s));
		
		//consumer����
		System.out.println("=====consumer=====");
		Consumer<String> consumer = s->{
			System.out.println(s);
			System.out.println("==================");
		};
		
		for(String ss:alist) {
			consumer.accept(ss);
		}
		
		//stream �̿�
		System.out.println("**********************");
		Stream<String> st2= alist.stream();
		st2.forEach(consumer);

	}
	
	private static  void method2() {
		String[] arr= new String[] {"ȫ�浿", "�ſ��", "���ڹ�"};
		List<String> alist= Arrays.asList(arr);
		
		//�ݺ��ڸ� ���� for �̿�
		for(String s: alist) {
			System.out.println(s);
		}
	}
	
	private static  void method1() {
		String[] arr= new String[] {"ȫ�浿", "�ſ��", "���ڹ�"};
		String[] arr2= {"ȫ�浿", "�ſ��", "���ڹ�"}; //new String ���� ����( ����� ���� ����)
		List<String> alist= Arrays.asList(arr);
		
		List<String> alist2= Arrays.asList(new String[]{"ȫ�浿","�ſ��","���ڹ�"}); //new String ���� �Ұ�
		List<String> alist3= Arrays.asList("ȫ�浿","�ſ��","���ڹ�"); 
		
		//�ݺ��ڸ� ���� ���
		Iterator<String> it= alist.iterator();
		while(it.hasNext()) {
			String s= it.next();
			System.out.println(s);
		}
	}

}
