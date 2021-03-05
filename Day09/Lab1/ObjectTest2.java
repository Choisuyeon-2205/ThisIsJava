package com.kosta.day09.lab1;

import java.util.Arrays;
import java.util.Date;

public class ObjectTest2 {


	public static void main(String[] args) {
		method10();
	}

	private static void method10() {
		String[] arr= {"네비게이터","전방카메라"};
		Car car= new Car("그랜저", 5000, arr);
		
		Car car2= null;
		try {
			car2 = (Car) car.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		car.model="SM7";
		car.악세사리[0]="자바책";
		car.price= 6000;
		System.out.println(car);
		System.out.println(car2);
		
	}

	private static void method9() {
		Car car= new Car("그랜저", 5000);
		
		Car car2= null;
		try {
			car2 = (Car) car.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		car.model="SM7";
		System.out.println(car);
		System.out.println(car2);
		
	}

	private static void method8() {
		Car car= new Car("그랜저", 5000);
		Car car2= car;
		car.model="SM7";
		System.out.println(car);
		System.out.println(car2);
		
	}

	private static void method7() {
		// 복제... 주소의 복사
		int[] a= {1,2,3,4,5};
		int[] b= a; //복제되지 않음
		a[0]= 99;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(a);
		
		
	}

	private static void method6() {
		//복제... 값의 복사
		int a= 10;
		int b= a;
		a++;
		System.out.println(a);
		System.out.println(b);
		
	}

	private static void method5() {
		//복제
		String s= new String("자바");
		String s2= s;
		s= new String("DB");
		System.out.println(s);
		System.out.println(s2);
	}

	private static void method4() {
		Date d1= new Date();
		System.out.println(d1);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Date d2= new Date();
		System.out.println(d2);
		System.out.println(d2.toLocaleString());
		
	}

	private static void method3() {
		Car obj1= new Car("자바",1000);
		Car obj2= new Car("자바",1000);
		
		//car의 toString() 재정의 안됨 .... object와 같다.
		System.out.println(obj1);
		System.out.println(obj1.toString());
		System.out.println(obj2);
		System.out.println(obj2.toString());
		
		
	}

	private static void method2() {
		String obj1= new String("자바");
		String obj2= new String("자바");
		//string의 내용자체
		System.out.println(obj1);
		System.out.println(obj1.toString());
		System.out.println(obj2);
		System.out.println(obj2.toString());
		
	}

	private static void method1() {
		Object obj1= new Object();
		Object obj2= new Object();
		//class이름@hax(hashcode) -object의 경우
		System.out.println(obj1);
		System.out.println(obj1.toString());
		System.out.println(obj2);
		System.out.println(obj2.toString());
	}
}
