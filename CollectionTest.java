package com.kosta.day13;

import java.util.*;

public class CollectionTest {

	public static void main(String[] args) {
		method4();

	}
	
	private static void method4() {
		//Collection�� �迭�� ������: ���� Ÿ�� ����, ������ �ڵ�
		//List interface: ���� ����, �ߺ� ���
		//���� class: ArrayList, LinkedList, Vector
		
		List<String> datas= new Vector<String>();
		datas.add(0, "Hello0");
		datas.add(1, new String("Hello1"));
		datas.add("Hello2");
		datas.add("Hello3");
		datas.add("JAVA");

		System.out.println(datas.size()+"��");
		datas.remove(2);
		for(String s: datas) {
			System.out.println(s);
		}
		System.out.println(datas.size()+"��");

	}

	private static void method3() {
		List<String> datas= new LinkedList<String>();
		datas.add(0, "Hello0");
		datas.add(1, new String("Hello1"));
		datas.add("Hello2");
		datas.add("Hello3");
		datas.add("JAVA");
		
		System.out.println(datas.size()+"��");
		datas.remove(2);
		for(String s: datas) {
			System.out.println(s);
		}
		System.out.println(datas.size()+"��");
		
	}

	private static void method2() {
		ArrayList<String> datas= new ArrayList<String>();
		datas.add(0, "Hello0");
		datas.add(1, new String("Hello1"));
		datas.add("Hello2");
		datas.add("Hello3");
		datas.add("JAVA");
		
		System.out.println(datas.size()+"��");
		datas.remove(2);
		for(String s: datas) {
			System.out.println(s);
		}
		System.out.println(datas.size()+"��");
		
	}

	private static void method1() {
		//Collection�� �迭�� ������: ���� Ÿ�� ����, ������ �ڵ�
		//List interface: ���� ����, �ߺ� ���
		//���� class: ArrayList, LinkedList, Vector
		
		ArrayList datas = new ArrayList();
		datas.add(100); //AutoBoxing
		datas.add(new Integer(100));
		datas.add(2,"Hello");
		datas.add(3,new String("Hello"));
		datas.add(new Student("ȫ�浿","��",20));
		
		//����: ���� Ÿ�Ժ�ȯ�� �ʿ��ϴ�.
		Student s= (Student)datas.get(4);
		System.out.println(s);
	}

}
