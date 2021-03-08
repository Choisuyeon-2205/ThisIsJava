package com.kosta.day12;

import java.util.*;

public class GenericTest {

	public static void main(String[] args) {
		method8();

	}
	
	private static void method8() {
		int result= Util.compare2(new TV(), new TV());
		System.out.println(result);
		
		//coffee는 machine을 상속하지 않아서 비교불가능!
//		int result= Util.compare2(new Coffee(), new Coffee());
//		System.out.println(result);
	}

	private static void method7() {
		int result= Util.compare(10, 20); //number로 부터 상속받은 타입만 가능
		System.out.println(result);
	}

	private static void method6() {
		Pair<String, String> p1= new Pair<>();
		p1.setKey("이름");
		p1.setVal("사과");
		
		Pair<String, String> p2= new Pair<>();
		p1.setKey("이름");
		p1.setVal("사과");
		
		boolean b1= Util.compare(p1, p2);
		System.out.println(b1);
		
		Pair<String, Integer> p3= new Pair<>();
		p3.setKey("한라봉");
		p3.setVal(1000);
		
		Pair<String, Integer> p4= new Pair<>();
		p4.setKey("한라봉");
		p4.setVal(1000);
		
		boolean b2= Util.compare(p3, p4);
		System.out.println(b2);
		
	}

	private static void method5() {
		Box<Integer> a= Util.boxing(100); //두가지 방법
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
		String s= b2.getObj(); //형변환
		System.out.println(s);
	}

	private static void method2() {
		Box b= new Box();
		b.setObj(100);
		int i= (int)b.getObj();
		System.out.println(i);
		
		b.setObj("Hello");
		String s= (String)b.getObj(); //형변환
		System.out.println(s);
	}

	private static void method1() {
		// 배열 ... 같은 타입, 여러 개의 방을 만든다. 갯수는 반드시 고정.
		String[] arr= new String[10];
		//Collection: List, Set, Map
		//아무거나, 여러개(개수 가변)
		List aa= new ArrayList();
		aa.add(100);
		aa.add("자바");
		aa.add(new MailBox());
		
		int i= (Integer)aa.get(0);  //불가능 => 넣으면 object로 변함 
		String s= (String)aa.get(1);
		
		List<String> aa2 = new ArrayList<String>(2);
		aa2.add("자바");
		String s2= aa2.get(0);
	}

}
