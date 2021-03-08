package com.kosta.day15;

import java.util.*;
import java.util.Map.Entry;


public class Review {

	public static void main(String[] args) {
		method5();

	}
	
	private static void method5() {
		//key(주로 문자로 줌), value
		Map<Student, Integer> datas = new TreeMap<>();
		datas.put(new Student("홍길동",50), 100);
		datas.put(new Student("김길동",100),101);
		datas.put(new Student("박길동",50),102);
		datas.put(new Student("정길동",90),103);
		datas.put(new Student("이길동",60),104);
		datas.put(new Student("이길동",60),105);
	
		System.out.println(datas.size()); //중복 객체 제거
		
		System.out.println("----------entry얻기--------");
		for(Entry<Student, Integer> entry: datas.entrySet()) {
			System.out.println("키: "+ entry.getKey());
			System.out.println("값: "+ entry.getValue());
		}
		
		System.out.println("--------key얻기--------");
		
		for(Student st: datas.keySet()) {
			System.out.println("키: "+ st);
			System.out.println("값: "+ datas.get(st));
		}
		//JavaScript: JSON(JavaScript Object Notation)
		//JavaScript Object: {"name":"홍길동","score":100}
		//문자로 변경: '{"name":"홍길동","score":100}'
		//JAVA, Python: map
	
	}
	
	private static void method4() {
		//key(주로 문자로 줌), value
		Map<Student, Integer> datas = new HashMap<>();
		datas.put(new Student("홍길동",50), 100);
		datas.put(new Student("김길동",100),101);
		datas.put(new Student("박길동",50),102);
		datas.put(new Student("정길동",90),103);
		datas.put(new Student("이길동",60),104);
		datas.put(new Student("이길동",60),105);
	
		System.out.println(datas.size()); //중복 객체 제거
		
		System.out.println("----------entry얻기--------");
		for(Entry<Student, Integer> entry: datas.entrySet()) {
			System.out.println("키: "+ entry.getKey());
			System.out.println("값: "+ entry.getValue());
		}
		
		System.out.println("--------key얻기--------");
		
		for(Student st: datas.keySet()) {
			System.out.println("키: "+ st);
			System.out.println("값: "+ datas.get(st));
		}
		//JavaScript: JSON(JavaScript Object Notation)
		//JavaScript Object: {"name":"홍길동","score":100}
		//문자로 변경: '{"name":"홍길동","score":100}'
		//JAVA, Python: map
	
	}
	
	private static void method3() {
		//Collection: List, Set, Map
		//List: 순서, 중복..... ArrayList, LinkedList, Vector
		//Set: 순서x, 중복x, key로 사용 ... HashSet, TreeSet
		//Map: key, value의 쌍(entry).... HashMap, TreeMap, Properties
		//Stack(LIFO), Queue(FIFO)... LinkedList
		
		//Set은 동일객체인지 체크: hashcode(), equals() 재정의 필수!
		//Set<Student> datas = new HashSet<>();
		
		//binary sort: tree구조로 정렬: compareTo() 재정의 필수!
		TreeSet<Student> datas = new TreeSet<>();
		datas.add(new Student("홍길동",50));
		datas.add(new Student("김길동",100));
		datas.add(new Student("박길동",50));
		datas.add(new Student("정길동",90));
		datas.add(new Student("이길동",60));
		datas.add(new Student("이길동",60));
	
		System.out.println(datas.size()); //중복 객체 제거
		
		for(Student s: datas) {
			System.out.println(s);
		}
		
		System.out.println("--------descending sort--------");
		
		for(Student s: datas.descendingSet()) { //객체를 treeset으로 받아줘야함 (set X)
			System.out.println(s);
		}
	
	}
	
	private static void method2() {
		
		Set<String> datas = new TreeSet<>();
		datas.add(new String("자바2"));
		datas.add(new String("자바3"));
		datas.add("자바");
		datas.add("자바");
		datas.add(new String("자바"));
		datas.add(new String("자바"));
	
		System.out.println(datas.size()); //중복 객체 제거
		for(String s: datas) {
			System.out.println(s);
		}
	}

	private static void method1() {
		//Collection: List, Set, Map
		//List: 순서, 중복..... ArrayList, LinkedList, Vector
		//Set: 순서x, 중복x, key로 사용 ... HashSet, TreeSet
		//Map: key, value의 쌍(entry).... HashMap, TreeMap, Properties
		//Stack(LIFO), Queue(FIFO)... LinkedList
		
		//List<String> datas = new ArrayList<>();
		//List<String> datas = new LinkedList<>();
		List<String> datas = new Vector<>();
		datas.add("자바");
		datas.add("자바");
		datas.add(new String("자바"));
		datas.add(new String("자바"));
		System.out.println(datas.size()); //4
		for(String s: datas) {
			System.out.println(s);
		}
		
	}

}
