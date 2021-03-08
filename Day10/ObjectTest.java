package com.kosta.day10;

import java.util.Arrays;
import java.util.Objects;

public class ObjectTest {

	public static void main(String[] args) {
		sample8();

	}

	private static void sample8() {
		Book[] bookList= new Book[5];
		bookList[0]= new Book("자바",25000,false);
		bookList[1]= new Book("sql",20000,true);
		bookList[2]= new Book("html",23000,false);
		bookList[3]= new Book("javascript",35000,true);
		bookList[4]= new Book("javascript",45000,false);
		
		for(Book b: bookList) {
			System.out.println(b);
		}
		
		Arrays.sort(bookList); //가격으로 asending
		Arrays.sort(bookList, new BookDescendingComparator());
		
	}

	private static void sample7() {
		Car[] carList= new Car[3];
		carList[0]=new Car("C",2000);
		carList[1]=new Car("B",3000);
		carList[2]=new Car("A",1000);
		
		System.out.println("before: "+Arrays.toString(carList));
		Arrays.sort(carList);
		System.out.println("Asending after: "+Arrays.toString(carList));
		Arrays.sort(carList,new CarDesceending());
		System.out.println("Asending after: "+Arrays.toString(carList));
	}

	private static void sample6() {
		Integer[] arr= {10,3,5,8,4}; //정수 5개 배열
		System.out.println("before: "+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("asending after: "+Arrays.toString(arr));
		
		Arrays.sort(arr, new IntegerDescending());
		System.out.println("desending after: "+Arrays.toString(arr));
		
		Car[] carList= new Car[3];
		carList[0]=new Car("C",2000);
		carList[1]=new Car("B",3000);
		carList[2]=new Car("A",1000);
		
		System.out.println("before: "+Arrays.toString(carList));
		Arrays.sort(carList);
		System.out.println("after: "+Arrays.toString(carList));
	}

	private static void sample3() {
		Car car1= new Car("모델1", 2000);
		Car car2= new Car("모델2", 2000);
		
		int result= car1.compareTo(car2);
		System.out.println(result>0?"car1이 크다":"같거나 car2가 크다");
		
	}

	private static void sample2() {
		String s1= "A"; //65
		String s2= "C"; //66
		
		Object o1= new Object();
		Object o2= new Object();
		
		// 같다: 0
		// < = >
		System.out.println(s1.compareTo(s2));
		
	}

	private static void sample1() {
		Car car1= new Car("모델", 1000);
		System.out.println(car1);
		
		car1= null;
		
		System.gc(); //가비지 컬렉터를 수행한다.  finalize() 호출
		
		System.out.println(car1);
	}

}
