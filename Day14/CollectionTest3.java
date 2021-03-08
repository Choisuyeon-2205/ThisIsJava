package com.kosta.day14;

import java.util.*;

import com.kosta.day13.model.CustomerDTO;

public class CollectionTest3 {
	public static void main(String[] args) {
		method4();
	}

	private static void method4() {
		TreeSet<CustomerDTO> datas= new TreeSet<>();
		datas.add(new CustomerDTO(10,"고객1","12","서울"));
		datas.add(new CustomerDTO(2,"고객2","22","부산"));
		datas.add(new CustomerDTO(13,"고객3","23","서울"));
		datas.add(new CustomerDTO(24,"고객4","88","부산"));
		datas.add(new CustomerDTO(24,"고객4","88","서울"));
		System.out.println(datas.size()+"건");

//		while(!datas.isEmpty()) {
//			CustomerDTO cust= datas.pollFirst();
//			System.out.println(cust);
//			System.out.println(datas.size()+"건");
//		}
		
		//내림차순으로 sorting 하기!
		NavigableSet<CustomerDTO> descendingSet= datas.descendingSet();
		
		for(CustomerDTO s: descendingSet) {
			System.out.println(s);
		}
		System.out.println("===============================");
		//오름차순
		NavigableSet<CustomerDTO> asc= descendingSet.descendingSet();
		for(CustomerDTO s: asc) {
			System.out.println(s);
		}
		
	}

	private static void method3() {
		TreeSet<CustomerDTO> datas= new TreeSet<>();
		datas.add(new CustomerDTO(1,"고객1","12","부산"));
		datas.add(new CustomerDTO(2,"고객2","22","서울"));
		datas.add(new CustomerDTO(3,"고객3","23","서울"));
		datas.add(new CustomerDTO(4,"고객4","88","부산"));
		datas.add(new CustomerDTO(4,"고객4","88","서울"));
		
		//첫번째 item
		System.out.println("첫번째 item: "+datas.first());
		
		//마지막 item
		System.out.println("마지막 item: "+datas.last());
				
		
		for(CustomerDTO s:datas) {
			System.out.println(s);
		}
	}

	private static void method2() {
		//String값이어도 아스키코드 값을 기준으로 정렬한다.
		Set<String> datas= new TreeSet<>();
		datas.add("월");
		datas.add("화");
		datas.add("수");
		datas.add("토");
		datas.add("토");
		for(String s:datas) {
			System.out.println(s);
		}
		
	}

	private static void method1() {
		//TreeSet은 값을 넣을 때 binary tree 이용, 크기 비교, 크면 오른쪽, 작으면 왼쪽에 저장
		// 들어갈때 hashset보다 속도가 느리지만, 정렬된 결과를 출력한다.
		
		TreeSet<Integer> datas= new TreeSet<>();
		datas.add(100);
		datas.add(50);
		datas.add(70);
		datas.add(30);
		datas.add(30);
		
		//첫번째 item
		System.out.println("첫번째 item: "+datas.first());

		//마지막 item
		System.out.println("마지막 item: "+datas.last());

		//기준보다 작은 item
		System.out.println("기준보다 작은 item: "+ datas.lower(50));
		//기준보다 큰 item
		System.out.println("기준보다 큰 item: "+ datas.higher(50));
		
		//floor: 동등하거나 밑
		System.out.println("기준보다 같거나 작은 item: "+ datas.floor(50));
		//ceiling: 동등하거나 위
		System.out.println("기준보다 같거나 큰 item: "+ datas.ceiling(50));
		
		System.out.println("====전체 출력====");
		for(Integer i: datas) {
			System.out.println(i);
		}
	}
}
