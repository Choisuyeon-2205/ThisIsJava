package com.kosta.day14;
import java.util.*;

import com.kosta.day13.model.CustomerDTO;

public class CollectionTest {

	public static void main(String[] args) {
		method6();
	}
	
	private static void method6() {
		String s1= "홍길동";
		String s2= "홍길동";
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		//CustomerDTO 타입을 저장할 때 중복인지 감지할 수 없음
		Set<CustomerDTO> datas= new HashSet<>();
		CustomerDTO c1= new CustomerDTO(100,"홍길동","010-7777-8888","서울");
		CustomerDTO c2= new CustomerDTO(100,"이자바"
				+ "","010-7777-8888","서울");
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		
		datas.add(c1);
		datas.add(new CustomerDTO(200,"김길동","010-6666-8888","울산"));
		datas.add(new CustomerDTO(300,"박길동","010-5555-8888","대구"));
		datas.add(new CustomerDTO(400,"정길동","010-4444-8888","부산"));
		datas.add(c2);
		
		for(CustomerDTO cust: datas)
			System.out.println(cust);
	}

	private static void method5() {
		//Set interface를 구현 class: HashSet, TreeSet
		//순서가 없다, 중복 불가, 키로 사용한다.
		//인덱스X
		Set<String> datas= new HashSet<>();
		datas.add("월요일");
		datas.add("화요일");
		datas.add("토요일");
		datas.add("토요일");
		datas.add("일요일");
		System.out.println(datas.size()+"건");
		
		//1. 일반 for로 읽기 ---> X
		//2. 향상된 for ---> O
		for(String s:datas) {
			System.out.println(s);
		}
		//3. iterator이용(반복자)
		Iterator<String> it= datas.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

	private static void method4() {
		String[] days= {"일","월","화","수","목","금","토","토","일"};
		String s = Arrays.toString(days);
		System.out.println(s);
		
		List<String> datas= Arrays.asList(days);
		print(datas);
		
		System.out.println(datas.contains("일")?"ok":"no");
		
		//1. 일반 for 읽기... for(;;)
		//2. 향상된 for 읽기... for(1건 :collection)
		//3. Iterator 반복자 이용해서 읽기
		Iterator<String> it= datas.iterator();
		while(it.hasNext()) {
			String data= it.next();
			System.out.println(data);
		}
	}

	private static void method3() {
		// List 인터페이스를 구현한 class: Vector
		// 순서가 있다.
		// 중복 허용
		List<String> datas= new Vector<String>(); //사이즈를 주지 않으면 10개
		String[] days= {"월","화","수","목","금","토","토","일"};
		for(String d: days) {
			datas.add(d+"요일");
		}
		print(datas);
	}
	
	private static void method2() {
		// List 인터페이스를 구현한 class: LinkedList
		// 순서가 있다.
		// 중복 허용
		List<String> datas= new LinkedList<String>(); //사이즈를 주지 않으면 10개
		String[] days= {"월","화","수","목","금","토","토","일"};
		for(String d: days) {
			datas.add(d+"요일");
		}
		print(datas);

	}

	private static void method1() {
		// List 인터페이스를 구현한 class: ArrayList
		// 순서가 있다.
		// 중복 허용
		List<String> datas= new ArrayList<String>(3); //사이즈를 주지 않으면 10개
		String[] days= {"월","화","수","목","금","토","토","일"};
		for(String d: days) {
			datas.add(d+"요일");
		}
		
		//함수 연습
		String s= datas.get(7);
		System.out.println("7번째 값 가져오기: "+s);
		
		if(datas.contains("화요일")) {
			System.out.println("화요일 존재한다.");
		}
		
		print(datas);
		print2(datas);
		
		//datas.clear();
		
		
	}
	
	private static void print2(List<String> datas) {
		for(int i=0; i<datas.size(); i++)
			System.out.println(i+"번째-->"+datas.get(i));
	}
	
	private static void print(List<String> datas) {
		for(String s: datas)
			System.out.println(s);
	}
}
