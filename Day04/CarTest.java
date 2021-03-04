package com.kosta.day04;

public class CarTest {

	public static void main(String[] args) {
		//1.객체참조변수선언
		int[] arr;
		Car c1;
		int i;
		
		//2.객체생성...자동 초기화된다.
		arr=new int[5];
		c1= new Car();
		//c1: object, instance 주소가 들어가있다.
		//new Car(): heap 영역에 instance생성된다.
		
		//3.객체사용
		arr[0]=100;
		i=10;
		System.out.println(arr);
		System.out.println(c1);
		System.out.println("color:"+c1.color);
		System.out.println("model:"+c1.model);
		System.out.println("price:"+c1.price);
		System.out.println("year:"+c1.year);
		
		Car c2= new Car();
		c2.color= "black";
		c2.model="그랜져";
		c2.price= 5000;
		c2.year=2021;
		System.out.println("color:"+c2.color);
		System.out.println("model:"+c2.model);
		System.out.println("price:"+c2.price);
		System.out.println("year:"+c2.year);
		
		//1.객체참조변수 선언
		String s1;
		//2.객체 생성
		s1= new String("자바");
		//3.객체접근
		System.out.println(s1.charAt(0));
		
	}

}
