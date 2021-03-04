package com.kosta.day04;

public class Coffee {
	//field: instance변수-object마다 존재,
	//       class변수-class마다 존재, static예약어!!!!
	String menu_name;
	int price;
	static int count; //instance들이 공유하는 변수이다.
	
	Coffee(String menu){
		this(menu,1000);
	}
	
	Coffee(String menu_name, int price){
		System.out.println("감사합니다.");
		this.menu_name= menu_name;
		this.price= price;
		count++;
	}
	
	
	
	void print() {
		System.out.println("-------주문서------");
		System.out.println("메뉴: "+menu_name);
		System.out.println("가격: "+price);
		System.out.println("-----------------");
	}
	
	//instance 메소드
	int getCount() {
		System.out.println(menu_name);
		return count;
	}
	
	//class 메소드
	static int getCount2() {
		//사용 불가 System.out.println(menu_name); static 변수만 접근가능@@
		return count;
	}
	

}
