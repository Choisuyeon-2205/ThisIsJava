package com.kosta.day10;

import java.util.Objects;

public class ObjectTest2 {

	public static void main(String[] args) {
		Long start1= System.currentTimeMillis();
		Long start2= System.nanoTime();
		System.out.println(start1); //현재시간 출력(밀리세컨드)
		System.out.println(start2);
		
		for(int i=0; i<1000000000; i++) {
			
		}
		
		System.out.println(System.currentTimeMillis()); //현재시간 출력(밀리세컨드)
		System.out.println(System.nanoTime());
		System.out.println("====걸린시간====");
		System.out.println(end1-start1+"밀리세컨드");
		System.out.println(end2-start2+"밀리세컨드");
		
		if(method2()) {
			System.out.println("null이군요");
			//함수 빠지기 return;
			//프로그램 종료
			System.exit(0); //일반적으로 정상종료가 0이다.
		}else{
			System.out.println("null이아니다.");
		}
		
		System.out.println("main END");
	}

	private static boolean method2() {
		Book b1= null;
		System.out.println(b1 == null);
		
		System.out.println(Objects.isNull(b1)); //null이니?
		
		return Objects.isNull(b1);
		
	}

	private static void method1() {
		Book b1= new Book("이것이 자바다.",2000, true);
		Book b2= new Book("이것이 자바다.",2000, true);
		
		//Objects.equals: 객체에 equals수행
		boolean result= Objects.equals(b1, b2);
		System.out.println(result);
	}

}
