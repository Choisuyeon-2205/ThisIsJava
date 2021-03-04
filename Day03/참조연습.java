package com.kosta.day03;

public class 참조연습 {

	public static void main(String[] args) {
		//sample();
		//sample2();
		sample3();

	}
	
	private static void sample3() {
		// 참조형은 일반적으로 null로 초기화
		// null: 정의된 바가 없다. 참조된 값이 없다.
		String s= null;
		System.out.println(s);
		
		System.out.println(s==null);
		System.out.println(s.length());
		
	}

	private static void sample2() {
		//지역변수는 반드시 초기화하고 사용한다.
		int a=0;
		double d= 0.0;
		boolean b;
		
		System.out.println(a+d);
		
	}

	private static void sample() {
		String s1="홍길동"; //컴파일시 생성 => 1~2는 주소가 같음
		String s2="홍길동";
		String s3= new String("홍길동");//실행시 생성=> 3-4는 다름
		String s4= new String("홍길동"); 
		
		System.out.println(s1==s2); //주소가 같다.
		System.out.println(s3==s4); //주소가 다르다.
		System.out.println(s1.equals(s4)); //내용이 같다.
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		
		
	}

}
