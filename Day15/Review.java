package com.kosta.day15;

import java.util.*;
import java.util.Map.Entry;


public class Review {

	public static void main(String[] args) {
		method5();

	}
	
	private static void method5() {
		//key(�ַ� ���ڷ� ��), value
		Map<Student, Integer> datas = new TreeMap<>();
		datas.put(new Student("ȫ�浿",50), 100);
		datas.put(new Student("��浿",100),101);
		datas.put(new Student("�ڱ浿",50),102);
		datas.put(new Student("���浿",90),103);
		datas.put(new Student("�̱浿",60),104);
		datas.put(new Student("�̱浿",60),105);
	
		System.out.println(datas.size()); //�ߺ� ��ü ����
		
		System.out.println("----------entry���--------");
		for(Entry<Student, Integer> entry: datas.entrySet()) {
			System.out.println("Ű: "+ entry.getKey());
			System.out.println("��: "+ entry.getValue());
		}
		
		System.out.println("--------key���--------");
		
		for(Student st: datas.keySet()) {
			System.out.println("Ű: "+ st);
			System.out.println("��: "+ datas.get(st));
		}
		//JavaScript: JSON(JavaScript Object Notation)
		//JavaScript Object: {"name":"ȫ�浿","score":100}
		//���ڷ� ����: '{"name":"ȫ�浿","score":100}'
		//JAVA, Python: map
	
	}
	
	private static void method4() {
		//key(�ַ� ���ڷ� ��), value
		Map<Student, Integer> datas = new HashMap<>();
		datas.put(new Student("ȫ�浿",50), 100);
		datas.put(new Student("��浿",100),101);
		datas.put(new Student("�ڱ浿",50),102);
		datas.put(new Student("���浿",90),103);
		datas.put(new Student("�̱浿",60),104);
		datas.put(new Student("�̱浿",60),105);
	
		System.out.println(datas.size()); //�ߺ� ��ü ����
		
		System.out.println("----------entry���--------");
		for(Entry<Student, Integer> entry: datas.entrySet()) {
			System.out.println("Ű: "+ entry.getKey());
			System.out.println("��: "+ entry.getValue());
		}
		
		System.out.println("--------key���--------");
		
		for(Student st: datas.keySet()) {
			System.out.println("Ű: "+ st);
			System.out.println("��: "+ datas.get(st));
		}
		//JavaScript: JSON(JavaScript Object Notation)
		//JavaScript Object: {"name":"ȫ�浿","score":100}
		//���ڷ� ����: '{"name":"ȫ�浿","score":100}'
		//JAVA, Python: map
	
	}
	
	private static void method3() {
		//Collection: List, Set, Map
		//List: ����, �ߺ�..... ArrayList, LinkedList, Vector
		//Set: ����x, �ߺ�x, key�� ��� ... HashSet, TreeSet
		//Map: key, value�� ��(entry).... HashMap, TreeMap, Properties
		//Stack(LIFO), Queue(FIFO)... LinkedList
		
		//Set�� ���ϰ�ü���� üũ: hashcode(), equals() ������ �ʼ�!
		//Set<Student> datas = new HashSet<>();
		
		//binary sort: tree������ ����: compareTo() ������ �ʼ�!
		TreeSet<Student> datas = new TreeSet<>();
		datas.add(new Student("ȫ�浿",50));
		datas.add(new Student("��浿",100));
		datas.add(new Student("�ڱ浿",50));
		datas.add(new Student("���浿",90));
		datas.add(new Student("�̱浿",60));
		datas.add(new Student("�̱浿",60));
	
		System.out.println(datas.size()); //�ߺ� ��ü ����
		
		for(Student s: datas) {
			System.out.println(s);
		}
		
		System.out.println("--------descending sort--------");
		
		for(Student s: datas.descendingSet()) { //��ü�� treeset���� �޾������ (set X)
			System.out.println(s);
		}
	
	}
	
	private static void method2() {
		
		Set<String> datas = new TreeSet<>();
		datas.add(new String("�ڹ�2"));
		datas.add(new String("�ڹ�3"));
		datas.add("�ڹ�");
		datas.add("�ڹ�");
		datas.add(new String("�ڹ�"));
		datas.add(new String("�ڹ�"));
	
		System.out.println(datas.size()); //�ߺ� ��ü ����
		for(String s: datas) {
			System.out.println(s);
		}
	}

	private static void method1() {
		//Collection: List, Set, Map
		//List: ����, �ߺ�..... ArrayList, LinkedList, Vector
		//Set: ����x, �ߺ�x, key�� ��� ... HashSet, TreeSet
		//Map: key, value�� ��(entry).... HashMap, TreeMap, Properties
		//Stack(LIFO), Queue(FIFO)... LinkedList
		
		//List<String> datas = new ArrayList<>();
		//List<String> datas = new LinkedList<>();
		List<String> datas = new Vector<>();
		datas.add("�ڹ�");
		datas.add("�ڹ�");
		datas.add(new String("�ڹ�"));
		datas.add(new String("�ڹ�"));
		System.out.println(datas.size()); //4
		for(String s: datas) {
			System.out.println(s);
		}
		
	}

}
