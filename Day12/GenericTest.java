package com.kosta.day12;

import java.util.*;

public class GenericTest {

	public static void main(String[] args) {
		method8();

	}
	
	private static void method8() {
		int result= Util.compare2(new TV(), new TV());
		System.out.println(result);
		
		//coffee�� machine�� ������� �ʾƼ� �񱳺Ұ���!
//		int result= Util.compare2(new Coffee(), new Coffee());
//		System.out.println(result);
	}

	private static void method7() {
		int result= Util.compare(10, 20); //number�� ���� ��ӹ��� Ÿ�Ը� ����
		System.out.println(result);
	}

	private static void method6() {
		Pair<String, String> p1= new Pair<>();
		p1.setKey("�̸�");
		p1.setVal("���");
		
		Pair<String, String> p2= new Pair<>();
		p1.setKey("�̸�");
		p1.setVal("���");
		
		boolean b1= Util.compare(p1, p2);
		System.out.println(b1);
		
		Pair<String, Integer> p3= new Pair<>();
		p3.setKey("�Ѷ��");
		p3.setVal(1000);
		
		Pair<String, Integer> p4= new Pair<>();
		p4.setKey("�Ѷ��");
		p4.setVal(1000);
		
		boolean b2= Util.compare(p3, p4);
		System.out.println(b2);
		
	}

	private static void method5() {
		Box<Integer> a= Util.boxing(100); //�ΰ��� ���
		Box<Integer> b= Util.<Integer>boxing(100);
		
		Box<String> c= Util.boxing("Hello");
		Box<String> d= Util.<String>boxing("Hello");
		
		Box<TV> e= Util.boxing(new TV());
		Box<TV> f= Util.<TV>boxing(new TV());
		
		System.out.println(a.getObj());
		System.out.println(b.getObj());
		System.out.println(c.getObj());
		System.out.println(d.getObj());
		System.out.println(e.getObj());
		System.out.println(f.getObj());
		
		
	}

	private static void method4() {
		Product<TV,String> p1= new Product<>(new TV(),"S1234",0);
		System.out.println(p1);
		
		Product<NoteBook,String> p2= new Product<>(new NoteBook(),"S1234",0);
		System.out.println(p2);
		
		Product<Coffee,Integer> p3= new Product<>(new Coffee(),1234,0);
		System.out.println(p3);
		
	}

	private static void method3() {
		Box<Integer> b= new Box();
		b.setObj(100);
		int i= b.getObj();
		System.out.println(i);
		
		Box<String> b2= new Box<String>();
		b2.setObj("Hello");
		String s= b2.getObj(); //����ȯ
		System.out.println(s);
	}

	private static void method2() {
		Box b= new Box();
		b.setObj(100);
		int i= (int)b.getObj();
		System.out.println(i);
		
		b.setObj("Hello");
		String s= (String)b.getObj(); //����ȯ
		System.out.println(s);
	}

	private static void method1() {
		// �迭 ... ���� Ÿ��, ���� ���� ���� �����. ������ �ݵ�� ����.
		String[] arr= new String[10];
		//Collection: List, Set, Map
		//�ƹ��ų�, ������(���� ����)
		List aa= new ArrayList();
		aa.add(100);
		aa.add("�ڹ�");
		aa.add(new MailBox());
		
		int i= (Integer)aa.get(0);  //�Ұ��� => ������ object�� ���� 
		String s= (String)aa.get(1);
		
		List<String> aa2 = new ArrayList<String>(2);
		aa2.add("�ڹ�");
		String s2= aa2.get(0);
	}

}
