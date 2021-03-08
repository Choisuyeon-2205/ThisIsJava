package com.kosta.day10;

import java.util.Arrays;

public class PersonTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		sample1();

	}

	private static void sample3() {
		
		Car car1= new Car("SM7",4000);
		Car car2= new Car("SM7",4000);
		String[] phone1= new String[] {"010-2222-3333","02-4444-5555"};
		String[] phone2= new String[] {"010-2222-3333","02-4444-5555"};
		
		Person p1= new Person("홍길동", 20, car1, phone1);
		Person p3= new Person("홍길동", 20, car2, phone2);
		
		System.out.println(p1.hashCode());
		System.out.println(p3.hashCode());
		
	}

	private static void sample2() {
		Car car= new Car("SM7",4000);
		
	}

	private static void sample1() throws CloneNotSupportedException {
		Car car1= new Car("SM7",4000);
		Car car2= new Car("SM7",4000);
		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());
		
		String[] phone1= {"010-2222-3333","02-4444-5555"};
		String[] phone2= {"010-2222-3333","02-4444-5555"};
		Person p1= new Person("홍길동", 20, car1, phone1);
		Person p3= new Person("홍길동", 20, car2, phone2);
		Person p4= p3;
		p3.setName("박가산");
		System.out.println(p3);
		System.out.println(p4);
		System.out.println("---------------------");
		
		//복제: 원본이 수정이 복제된 객체에 영향을 미치지 않는다. 각자의 정보를 관리한다.
		//얕은 복제는 implements Cloneable, clone() 메소드 추가
		//깊은 복제는 clone() 메소드에서 코드 추가가 필요된다.
		
		Person p5= (Person) p3.clone();
		p3.setName("김길동");
		p3.setAge(50);
		//신규생성해서 참조하는 곳을 변경한 것
//		p3.setCar(new Car("수정 모델",1000));
//		p3.setPhone(new String[] {"1234","5678"});
		//복제가 아님을 확인
		p3.getCar().setModel("수정모델");
		p3.getPhone()[0]="0000";
		System.out.println(p3);
		System.out.println(p5);
		System.out.println("---------------------");
		
		
		Person p2= new Person("김길동", 30,  new Car("그랜저",5000), new String[] {"010-6666-7777","02-1234-5555"});
		System.out.println(p1.hashCode());
		System.out.println(p3.hashCode());
		System.out.println(p1.equals(p3)?"동명이인,나이같다,차같다,폰":"이름다름");
	}

}
