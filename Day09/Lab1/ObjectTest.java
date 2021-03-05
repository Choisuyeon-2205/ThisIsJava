package com.kosta.day09.lab1;

import java.util.HashSet;
import java.util.Set;

import com.kosta.day04.Car;

//class Dice {
//	int size;
//	Dice(int size){
//		this.size = size;
//	}
//	int play(){
//		int number = (int)(Math.random() * size) + 1;
//		return number;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		//d2는 Dice-> Object-> Dice
//		Dice d= (Dice)obj;
//
//		return size==d.size;
//	}
//	
//	
//}


public class ObjectTest {

	public static void main(String[] args) {
		method7();

	}

	private static void method7() {
		Car car1= new Car("그랜저",4000);
		Car car2= new Car("그랜저",4000);
		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());
		
		Set<Car> shopping = new HashSet<>();
		shopping.add(car1);
		shopping.add(car2);
		for(Car c: shopping) {
			System.out.println(c.model);
		}
		
	}

	private static void method6() {
		// Collection: List, Set, Map
		// Set: key로 사용된다. 중복안됨, 순서 없음
		Set<String> shopping = new HashSet<>();
		shopping.add("사과");
		shopping.add("바나나");
		shopping.add("오렌지");
		shopping.add("사과");
		shopping.add("사과");
		for(String s: shopping) {
			System.out.println(s);
		}
		String s1= new String("사과");
		String s2= new String("사과");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	}

	private static void method5() {
		Car car1= new Car("그랜저",4000);
		Car car2= new Car("그랜저",4000);
		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());
		
	}

	private static void method4() {
		Car car1= new Car("그랜저",4000);
		Car car2= new Car("그랜저",4000);
		System.out.println(car1==car2); //주소비교
		System.out.println(car1.equals(car2)); //주소비교
		
	}

	private static void method3() {
		//2개의 주사위... 같은지?
//		Dice d1= new Dice(8);
//		Dice d2= new Dice(8);
		System.out.println(d1==d2);
		System.out.println(d1.equals(d2));
		
	}

	private static void method2() {
		//object의 equals(): 주소 비교
		//Stirng이 object의 equals()를 재정의: 값을 비교한다.
		
		String s1= new String("자바");
		String s2= new String("자바");
		String s3= "자바";
		String s4= "자바";
		
		System.out.println(s1==s2?"주소 같다":"주소 다르다.");
		System.out.println(s3==s4?"주소 같다":"주소 다르다.");
		System.out.println(s1.equals(s4)?"내용 같다":"내용 다르다.");
		System.out.println(s3.equals(s4)?"내용 같다":"내용 다르다.");
		
	}

	private static void method1() {
		int a1= 10;
		int a2= 10;
		System.out.println(a1==a2); //기본형=> 값을 비교
		
		Object obj1= new Object();
		Object obj2= new Object();
		System.out.println(obj1==obj2); //객체=> 주소 비교
		System.out.println(obj1.equals(obj2)); //객체=> 주소 비교
		
		Integer a3= 10;
		Integer a4= 10;
		Integer b1= new Integer(10);
		Integer b2= new Integer(10);
		System.out.println(a3==a4); 
		System.out.println(b1==b2); 
		System.out.println(b1.equals(b2)); 
		
		//object: ==은 주소비교, equals도 주소비교
		//Integer
	}

}
